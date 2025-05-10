package gramatica;

import org.antlr.v4.runtime.Token;
import java.util.HashMap;
import java.util.Stack;

public class LanguageCustomVisitor extends LanguageBaseVisitor<Object> {

    private static class VariableInfo {
        Object value;
        boolean initialized;
        String type;

        VariableInfo(Object value, boolean initialized, String type) {
            this.value = value;
            this.initialized = initialized;
            this.type = type;
        }
    }

    private final Stack<HashMap<String, VariableInfo>> symbolTable = new Stack<>();
    private final HashMap<String, String> variableTypes = new HashMap<>();

    public LanguageCustomVisitor() {
        symbolTable.push(new HashMap<>()); // Ámbito global
    }

    @Override
    public Object visitProgram(LanguageParser.ProgramContext ctx) {
        for (LanguageParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        return null;
    }

    // VARIABLES Y ASIGNACIONES
    @Override
    public Object visitVariableDecl(LanguageParser.VariableDeclContext ctx) {
        String type = ctx.type().getText();
        String varName = ctx.ID().getText();
        HashMap<String, VariableInfo> currentScope = symbolTable.peek();

        if (currentScope.containsKey(varName)) {
            throw new RuntimeException("Variable '" + varName + "' ya está declarada");
        }

        Object value;
        boolean initialized = false;

        if (ctx.expr() != null) {
            value = visit(ctx.expr());
            initialized = true;
        } else {
            // Valores por defecto según tipo
            switch (type) {
                case "int":
                    value = 0;
                    break;
                case "float":
                    value = 0.0f;
                    break;
                case "boolean":
                    value = false;
                    break;
                case "string":
                    value = "";
                    break;
                default:
                    throw new RuntimeException("Tipo desconocido: " + type);
            }
        }

        currentScope.put(varName, new VariableInfo(value, initialized, type));
        // System.out.println("Declarada: " + type + " " + varName + " = " + value);
        return null;
    }

    private Object getDefaultValue(String type) {
        switch (type) {
            case "int":
                return 0;
            case "float":
                return 0.0f;
            case "boolean":
                return false;
            case "string":
                return "";
            default:
                throw new RuntimeException("Tipo desconocido: " + type);
        }
    }

    @Override
    public Object visitAssignment(LanguageParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();
        Object value = visit(ctx.expr());

        VariableInfo info = findVariable(varName);
        checkType(info.type, value);

        info.value = value;
        info.initialized = true;
        return null;
    }

    @Override
    public Object visitLiteral(LanguageParser.LiteralContext ctx) {
        if (ctx.INT_LITERAL() != null) {
            return Integer.parseInt(ctx.INT_LITERAL().getText()); // Asegurar que es Integer
        }
        if (ctx.FLOAT_LITERAL() != null) {
            return Float.parseFloat(ctx.FLOAT_LITERAL().getText());
        }
        if (ctx.STRING_LITERAL() != null) {
            return ctx.STRING_LITERAL().getText().replaceAll("^\"|\"$", "");
        }
        if (ctx.BOOLEAN_LITERAL() != null) {
            return Boolean.parseBoolean(ctx.BOOLEAN_LITERAL().getText());
        }
        throw new RuntimeException("Literal no reconocido");
    }

    @Override
    public Object visitVarExpr(LanguageParser.VarExprContext ctx) {
        String varName = ctx.ID().getText();
        VariableInfo info = findVariable(varName);

        if (!info.initialized) {
            throw new RuntimeException("Variable no inicializada: " + varName);
        }

        return info.value;
    }

    // EXPRESIONES
    @Override
    public Object visitAdditiveExpr(LanguageParser.AdditiveExprContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        int op = ((Token) ctx.getChild(1).getPayload()).getType();

        switch (op) {
            case LanguageParser.PLUS:
                return add(left, right);
            case LanguageParser.MINUS:
                return subtract(left, right);
            default:
                throw new RuntimeException("Operador desconocido");
        }
    }

    @Override
    public Object visitMultiplicativeExpr(LanguageParser.MultiplicativeExprContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        int op = ((Token) ctx.getChild(1).getPayload()).getType();

        switch (op) {
            case LanguageParser.MUL:
                return multiply(left, right);
            case LanguageParser.DIV:
                return divide(left, right);
            default:
                throw new RuntimeException("Operador desconocido");
        }
    }

    @Override
    public Object visitRelationalExpr(LanguageParser.RelationalExprContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        int op = ((Token) ctx.getChild(1).getPayload()).getType();

        switch (op) {
            case LanguageParser.LT:
                return lessThan(left, right);
            case LanguageParser.GT:
                return greaterThan(left, right);
            case LanguageParser.LE:
                return lessOrEqual(left, right);
            case LanguageParser.GE:
                return greaterOrEqual(left, right);
            default:
                throw new RuntimeException("Operador desconocido");
        }
    }

    @Override
    public Object visitEqualityExpr(LanguageParser.EqualityExprContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        int op = ((Token) ctx.getChild(1).getPayload()).getType();

        switch (op) {
            case LanguageParser.EQEQ:
                return equals(left, right);
            case LanguageParser.NEQ:
                return !equals(left, right);
            default:
                throw new RuntimeException("Operador desconocido");
        }
    }

    // CONTROL DE FLUJO
    @Override
    public Object visitIfStmt(LanguageParser.IfStmtContext ctx) {
        // Evaluar condición principal
        if (evalCondition(visit(ctx.expr(0)))) {
            return visit(ctx.block(0));
        }

        // Evaluar else ifs
        int elseIfCount = ctx.expr().size() - 1;
        for (int i = 0; i < elseIfCount; i++) {
            if (evalCondition(visit(ctx.expr(i + 1)))) {
                return visit(ctx.block(i + 1));
            }
        }

        // Evaluar else final
        if (ctx.block().size() > elseIfCount + 1) {
            return visit(ctx.block(ctx.block().size() - 1));
        }

        return null;
    }

    // Ciclo for
    @Override
    public Object visitForStmt(LanguageParser.ForStmtContext ctx) {
        // 1. Nuevo ámbito para variables del for
        symbolTable.push(new HashMap<>());

        // 2. Inicialización
        if (ctx.getChild(2) != null) { // Posición de la inicialización
            visit(ctx.getChild(2));
        }

        // 3. Bucle principal
        while (true) {
            // 3.1 Evaluar condición
            if (ctx.getChild(4) != null) { // Posición de la condición
                Object condResult = visit(ctx.getChild(4));
                if (!(condResult instanceof Boolean)) {
                    throw new RuntimeException("La condición debe ser booleana");
                }
                if (!(Boolean) condResult)
                    break;
            }

            // 3.2 Ejecutar cuerpo del for
            visit(ctx.block());

            // 3.3 Actualización
            if (ctx.getChild(6) != null) { // Posición de la actualización
                visit(ctx.getChild(6));
            }
        }

        // 4. Eliminar ámbito al salir
        symbolTable.pop();
        return null;
    }

    // FUNCIONALIDADES ESPECIALES
    @Override
    public Object visitPrintStmt(LanguageParser.PrintStmtContext ctx) {
        Object value = visit(ctx.expr());
        System.out.println("> " + valueToString(value));
        return null;
    }

    @Override
    public Object visitPostIncrementExpr(LanguageParser.PostIncrementExprContext ctx) {
        String varName = ctx.expr().getText();
        VariableInfo info = findVariable(varName);
        checkNumericType(info.type);

        Object original = info.value;
        info.value = add(info.value, 1);
        return original;
    }

    @Override
    public Object visitPreIncrementExpr(LanguageParser.PreIncrementExprContext ctx) {
        String varName = ctx.expr().getText();
        VariableInfo info = findVariable(varName);
        checkNumericType(info.type);

        info.value = add(info.value, 1);
        return info.value;
    }

    @Override
    public Object visitIncrementStmt(LanguageParser.IncrementStmtContext ctx) {
        String varName;
        boolean isPostfix = ctx.ID() != null; // true para i++, false para ++i

        if (isPostfix) {
            varName = ctx.ID().getText();
        } else {
            varName = ctx.getChild(1).getText();
        }

        VariableInfo info = findVariable(varName);
        checkNumericType(info.type);

        // Actualizar valor
        if (info.value instanceof Integer) {
            int newValue = (Integer) info.value + 1;
            info.value = newValue;
        } else if (info.value instanceof Float) {
            float newValue = (Float) info.value + 1.0f;
            info.value = newValue;
        }

        return null;
    }

    // MÉTODOS AUXILIARES
    private VariableInfo findVariable(String varName) {
        for (int i = symbolTable.size() - 1; i >= 0; i--) {
            if (symbolTable.get(i).containsKey(varName)) {
                return symbolTable.get(i).get(varName);
            }
        }
        throw new RuntimeException("Variable no declarada: " + varName);
    }

    private boolean isTrue(Object value) {
        if (value instanceof Boolean) {
            return (Boolean) value;
        }
        throw new RuntimeException("La condición debe ser booleana");
    }

    private String valueToString(Object value) {
        if (value instanceof Float) {
            return String.format("%.2f", value);
        }
        return value.toString();
    }

    private void checkType(String expectedType, Object value) {
        String actualType = getValueType(value);
        if (!expectedType.equals(actualType)) {
            throw new RuntimeException("Type mismatch: Esperado " + expectedType + ", obtenido " + actualType);
        }
    }

    private String getValueType(Object value) {
        if (value instanceof Integer)
            return "int";
        if (value instanceof Float)
            return "float";
        if (value instanceof Boolean)
            return "boolean";
        if (value instanceof String)
            return "string";
        throw new RuntimeException("Tipo no reconocido para valor: " + value);
    }

    private void checkNumericType(String type) {
        if (!type.equals("entero") && !type.equals("flotante")) {
            throw new RuntimeException("Operación numérica en tipo no numérico: " + type);
        }
    }

    private boolean evalCondition(Object value) {
        if (value instanceof Boolean) {
            return (Boolean) value;
        }
        throw new RuntimeException("La condición debe ser booleana");
    }

    // OPERACIONES ARITMÉTICAS
    private Object add(Object a, Object b) {
        if (a instanceof String || b instanceof String) {
            return a.toString() + b.toString();
        }
        if (a instanceof Float || b instanceof Float) {
            return toFloat(a) + toFloat(b);
        }
        return toInt(a) + toInt(b);
    }

    private Object subtract(Object a, Object b) {
        return toFloat(a) - toFloat(b);
    }

    private Object multiply(Object a, Object b) {
        return toFloat(a) * toFloat(b);
    }

    private Object divide(Object a, Object b) {
        float divisor = toFloat(b);
        if (divisor == 0)
            throw new RuntimeException("División por cero");
        return toFloat(a) / divisor;
    }

    // COMPARACIONES
    private boolean lessThan(Object a, Object b) {
        return compare(a, b) < 0;
    }

    private boolean greaterThan(Object a, Object b) {
        return compare(a, b) > 0;
    }

    private boolean lessOrEqual(Object a, Object b) {
        return compare(a, b) <= 0;
    }

    private boolean greaterOrEqual(Object a, Object b) {
        return compare(a, b) >= 0;
    }

    private boolean equals(Object a, Object b) {
        if (a == null)
            return b == null;
        return a.equals(b);
    }

    private int compare(Object a, Object b) {
        if (a instanceof Float || b instanceof Float) {
            return Float.compare(toFloat(a), toFloat(b));
        }
        return Integer.compare(toInt(a), toInt(b));
    }

    // CONVERSIONES DE TIPO
    private float toFloat(Object value) {
        if (value instanceof Integer)
            return ((Integer) value).floatValue();
        if (value instanceof Float)
            return (Float) value;
        throw new RuntimeException("Valor no numérico");
    }

    private int toInt(Object value) {
        if (value instanceof Integer)
            return (Integer) value;
        throw new RuntimeException("Valor no entero");
    }
}