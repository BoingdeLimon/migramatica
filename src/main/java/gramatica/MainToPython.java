package gramatica;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class MainToPython {
    public static void main(String[] args) throws Exception {
        String inputFile = "src/test/resources/test.atleticoMorelia";
        CharStream input = CharStreams.fromFileName(inputFile);
        LanguageLexer lexer = new LanguageLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LanguageParser parser = new LanguageParser(tokens);
        ParseTree tree = parser.program();

        LanguageToPythonVisitor visitor = new LanguageToPythonVisitor();
        String pythonCode = visitor.visit(tree);

        try (PrintWriter writer = new PrintWriter(inputFile.replace(".atleticoMorelia", ".py"))) {
            writer.write(pythonCode);
        }

        System.out.println("Traducción completada.");
    }
}
