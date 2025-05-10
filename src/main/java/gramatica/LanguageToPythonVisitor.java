package gramatica;

import java.util.List;

public class LanguageToPythonVisitor extends LanguageBaseVisitor<String> {

    private final StringBuilder output = new StringBuilder();
    private int indentLevel = 0;

    private String indent() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indentLevel; i++) {
            sb.append("    ");
        }
        return sb.toString();
    }

    @Override
    public String visitProgram(LanguageParser.ProgramContext ctx) {
        for (LanguageParser.StatementContext stmt : ctx.statement()) {
            String result = visit(stmt);
            if (result != null && !result.trim().isEmpty()) {
                output.append(result).append("\n");
            }
        }
        return output.toString();
    }

    @Override
    public String visitStatement(LanguageParser.StatementContext ctx) {
        if (ctx.variableDecl() != null) {
            return indent() + visit(ctx.variableDecl());
        } else if (ctx.assignment() != null) {
            return indent() + visit(ctx.assignment());
        } else if (ctx.printStmt() != null) {
            return indent() + visit(ctx.printStmt());
        } else if (ctx.incrementStmt() != null) {
            return indent() + visit(ctx.incrementStmt());
        } else if (ctx.ifStmt() != null) {
            return visit(ctx.ifStmt());
        } else if (ctx.forStmt() != null) {
            return visit(ctx.forStmt());
        } else if (ctx.block() != null) {
            return visit(ctx.block());
        }
        return "";
    }

    @Override
    public String visitVariableDecl(LanguageParser.VariableDeclContext ctx) {
        String id = ctx.ID().getText();
        String tipo = ctx.type().getText();
        String valor = ctx.expr() != null ? visit(ctx.expr()) : defaultValue(tipo);
        return id + " = " + valor;
    }

    private String defaultValue(String tipo) {
        switch (tipo) {
            case "entero": return "0";
            case "flotante": return "0.0";
            case "booleano": return "False";
            case "cadena": return "\"\"";
            default: return "None";
        }
    }

    @Override
    public String visitAssignment(LanguageParser.AssignmentContext ctx) {
        return ctx.ID().getText() + " = " + visit(ctx.expr());
    }

    @Override
    public String visitPrintStmt(LanguageParser.PrintStmtContext ctx) {
        return "print(" + visit(ctx.expr()) + ")";
    }

    @Override
    public String visitIncrementStmt(LanguageParser.IncrementStmtContext ctx) {
        String var = ctx.ID() != null ? ctx.ID().getText() : ctx.ID().getText();
        return var + " += 1";
    }

    @Override
    public String visitIfStmt(LanguageParser.IfStmtContext ctx) {
        StringBuilder sb = new StringBuilder();
        List<LanguageParser.ExprContext> conds = ctx.expr();
        List<LanguageParser.BlockContext> blks = ctx.block();

        sb.append(indent()).append("if ").append(visit(conds.get(0))).append(":\n");
        indentLevel++;
        sb.append(visit(blks.get(0)));
        indentLevel--;

        for (int i = 1; i < conds.size(); i++) {
            sb.append(indent()).append("elif ").append(visit(conds.get(i))).append(":\n");
            indentLevel++;
            sb.append(visit(blks.get(i)));
            indentLevel--;
        }

        if (blks.size() > conds.size()) {
            sb.append(indent()).append("else:\n");
            indentLevel++;
            sb.append(visit(blks.get(blks.size() - 1)));
            indentLevel--;
        }

        return sb.toString();
    }

    @Override
    public String visitForStmt(LanguageParser.ForStmtContext ctx) {
        String init = ctx.getChild(2) != null ? visit(ctx.getChild(2)) : "";
        String cond = ctx.getChild(4) != null ? visit(ctx.getChild(4)) : "True";
        String update = ctx.getChild(6) != null ? visit(ctx.getChild(6)) : "";
        StringBuilder sb = new StringBuilder();

        if (!init.isEmpty()) {
            sb.append(indent()).append(init).append("\n");
        }
        sb.append(indent()).append("while ").append(cond).append(":\n");
        indentLevel++;
        if (ctx.block() != null) {
            sb.append(visit(ctx.block()));
        }
        if (!update.isEmpty()) {
            sb.append(indent()).append(update).append("\n");
        }
        indentLevel--;

        return sb.toString();
    }

    @Override
    public String visitBlock(LanguageParser.BlockContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (LanguageParser.StatementContext stmt : ctx.statement()) {
            String line = visit(stmt);
            if (!line.trim().isEmpty()) {
                sb.append(indent()).append(line.trim()).append("\n");
            }
        }
        return sb.toString();
    }

    // ---- Expresiones ----

    @Override
    public String visitLiteralExpr(LanguageParser.LiteralExprContext ctx) {
        return visit(ctx.literal());
    }

    @Override
    public String visitVarExpr(LanguageParser.VarExprContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitLiteral(LanguageParser.LiteralContext ctx) {
        if (ctx.INT_LITERAL() != null) return ctx.INT_LITERAL().getText();
        if (ctx.FLOAT_LITERAL() != null) return ctx.FLOAT_LITERAL().getText();
        if (ctx.STRING_LITERAL() != null) return ctx.STRING_LITERAL().getText();
        if (ctx.BOOLEAN_LITERAL() != null) {
            return ctx.BOOLEAN_LITERAL().getText().equals("true") ? "True" : "False";
        }
        return "";
    }

    @Override
    public String visitAdditiveExpr(LanguageParser.AdditiveExprContext ctx) {
        return visit(ctx.expr(0)) + " " + ctx.getChild(1).getText() + " " + visit(ctx.expr(1));
    }

    @Override
    public String visitMultiplicativeExpr(LanguageParser.MultiplicativeExprContext ctx) {
        return visit(ctx.expr(0)) + " " + ctx.getChild(1).getText() + " " + visit(ctx.expr(1));
    }

    @Override
    public String visitRelationalExpr(LanguageParser.RelationalExprContext ctx) {
        String op;
        switch (ctx.getChild(1).getText()) {
            case "<<": op = "<"; break;
            case ">>": op = ">"; break;
            case "<<=": op = "<="; break;
            case ">>=": op = ">="; break;
            default: op = ctx.getChild(1).getText();
        }
        return visit(ctx.expr(0)) + " " + op + " " + visit(ctx.expr(1));
    }

    @Override
    public String visitEqualityExpr(LanguageParser.EqualityExprContext ctx) {
        return visit(ctx.expr(0)) + " " + ctx.getChild(1).getText() + " " + visit(ctx.expr(1));
    }

    @Override
    public String visitParenExpr(LanguageParser.ParenExprContext ctx) {
        return "(" + visit(ctx.expr()) + ")";
    }
}
