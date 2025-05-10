package gramatica;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class MainToJS {
    public static void main(String[] args) throws Exception {
        String inputFile = "src/test/resources/test.atleticoMorelia";
        CharStream input = CharStreams.fromFileName(inputFile);
        LanguageLexer lexer = new LanguageLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LanguageParser parser = new LanguageParser(tokens);
        ParseTree tree = parser.program();

        LanguageToJSVisitor visitor = new LanguageToJSVisitor();
        String jsCode = visitor.visit(tree);

        try (PrintWriter writer = new PrintWriter(inputFile.replace(".atleticoMorelia", ".js"))) {
            writer.write(jsCode);
        }

        System.out.println("Traducción completada.");
    }
}
