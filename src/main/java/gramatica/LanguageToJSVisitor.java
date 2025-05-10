package gramatica;

import java.util.List;

public class LanguageToJSVisitor extends LanguageBaseVisitor<String> {

    private final StringBuilder output = new StringBuilder();
    private int indentLevel = 0;

private String indent() {
        return "    ".repeat(indentLevel);
    }

    private void appendIndentedLine(StringBuilder sb, String content) {
        sb.append(indent()).append(content).append("\n");
    }

    @Override
    public String visitProgram(LanguageParser.ProgramContext ctx) {
        for (LanguageParser.StatementContext stmt : ctx.statement()) {
            String line = visit(stmt);
            if (line != null && !line.trim().isEmpty()) {
                output.append(line).append("\n");
            }
        }
        return output.toString().trim();
    }

    @Override
    public String visitStatement(LanguageParser.StatementContext ctx) {
        String result = "";
        if (ctx.variableDecl() != null) {
            result = visit(ctx.variableDecl()) + ";";
        } else if (ctx.assignment() != null) {
            result = visit(ctx.assignment()) + ";";
        } else if (ctx.printStmt() != null) {
            result = visit(ctx.printStmt()) + ";";
        } else if (ctx.incrementStmt() != null) {
            result = visit(ctx.incrementStmt()) + ";";
        } else if (ctx.ifStmt() != null) {
            result = visit(ctx.ifStmt());
        } else if (ctx.forStmt() != null) {
            result = visit(ctx.forStmt());
        } else if (ctx.block() != null) {
            result = visit(ctx.block());
        }
        return result;
    }

    @Override
    public String visitVariableDecl(LanguageParser.VariableDeclContext ctx) {
        String value = ctx.expr() != null ? visit(ctx.expr()) : defaultValue(ctx.type().getText());
        return "let " + ctx.ID().getText() + " = " + value;
    }

    private String defaultValue(String type) {
        return switch (type) {
            case "entero", "flotante" -> "0";
            case "booleano" -> "false";
            case "cadena" -> "\"\"";
            default -> "null";
        };
    }

    @Override
    public String visitAssignment(LanguageParser.AssignmentContext ctx) {
        return ctx.ID().getText() + " = " + visit(ctx.expr());
    }

    @Override
    public String visitPrintStmt(LanguageParser.PrintStmtContext ctx) {
        return "console.log(" + visit(ctx.expr()) + ")";
    }

    @Override
    public String visitIncrementStmt(LanguageParser.IncrementStmtContext ctx) {
        return ctx.ID().getText() + "++";
    }

    @Override
    public String visitIfStmt(LanguageParser.IfStmtContext ctx) {
        StringBuilder sb = new StringBuilder();
        List<LanguageParser.ExprContext> conds = ctx.expr();
        List<LanguageParser.BlockContext> blks = ctx.block();

        // If principal
        appendIndentedLine(sb, "if (" + visit(conds.get(0)) + ") {");
        indentLevel++;
        sb.append(visit(blks.get(0)));
        indentLevel--;
        appendIndentedLine(sb, "}");

        // Else if
        for (int i = 1; i < conds.size(); i++) {
            appendIndentedLine(sb, "else if (" + visit(conds.get(i)) + ") {");
            indentLevel++;
            sb.append(visit(blks.get(i)));
            indentLevel--;
            appendIndentedLine(sb, "}");
        }

        // Else
        if (blks.size() > conds.size()) {
            appendIndentedLine(sb, "else {");
            indentLevel++;
            sb.append(visit(blks.get(blks.size() - 1)));
            indentLevel--;
            appendIndentedLine(sb, "}");
        }

        return sb.toString();
    }

    @Override
    public String visitForStmt(LanguageParser.ForStmtContext ctx) {
        String init = ctx.getChild(2) != null ? visit(ctx.getChild(2)) : "";
        String cond = ctx.getChild(4) != null ? visit(ctx.getChild(4)) : "true";
        String update = ctx.getChild(6) != null ? visit(ctx.getChild(6)) : "";

        StringBuilder sb = new StringBuilder();
        appendIndentedLine(sb, "for (" + init + "; " + cond + "; " + update + ") {");
        indentLevel++;
        sb.append(visit(ctx.block()));
        indentLevel--;
        appendIndentedLine(sb, "}");

        return sb.toString();
    }

    @Override
    public String visitBlock(LanguageParser.BlockContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (LanguageParser.StatementContext stmt : ctx.statement()) {
            String line = visit(stmt);
            if (!line.isEmpty()) {
                appendIndentedLine(sb, line);
            }
        }
        return sb.toString();
    }

    // Exprs
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
        if (ctx.INT_LITERAL() != null)
            return ctx.INT_LITERAL().getText();
        if (ctx.FLOAT_LITERAL() != null)
            return ctx.FLOAT_LITERAL().getText();
        if (ctx.STRING_LITERAL() != null)
            return ctx.STRING_LITERAL().getText();
        if (ctx.BOOLEAN_LITERAL() != null)
            return ctx.BOOLEAN_LITERAL().getText();
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
        String op = switch (ctx.getChild(1).getText()) {
            case "<<" -> "<";
            case ">>" -> ">";
            case "<<=" -> "<=";
            case ">>=" -> ">=";
            default -> ctx.getChild(1).getText();
        };
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
