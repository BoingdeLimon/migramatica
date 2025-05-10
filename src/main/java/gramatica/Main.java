package gramatica;

import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    private static final String EXTENSION = "atleticoMorelia";
    private static final String DIRBASE = "src/test/resources/";

    public static void main(String[] args) throws IOException {
        String[] files = args.length == 0
                ? new String[] { "test." + EXTENSION }
                : args;

        for (String file : files) {
            System.out.println("=== PROCESSING: " + file + " ===");

            // Leer y parsear
            CharStream in = CharStreams.fromFileName(DIRBASE + file);
            LanguageLexer lexer = new LanguageLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LanguageParser parser = new LanguageParser(tokens);
            LanguageParser.ProgramContext tree = parser.program();

            // 1) Ejecución/interprete
            LanguageCustomVisitor execVisitor = new LanguageCustomVisitor();
            execVisitor.visit(tree);

            // 2) Traducción a Python
            LanguageToPythonVisitor pyVisitor = new LanguageToPythonVisitor();
            String pythonCode = pyVisitor.visit(tree);
            try (PrintWriter out = new PrintWriter(DIRBASE + file.replace("." + EXTENSION, ".py"))) {
                out.print(pythonCode);
            }
            System.out.println("-> Generated Python: " + file.replace("." + EXTENSION, ".py"));

            // 3) Traducción a JavaScript
            LanguageToJSVisitor jsVisitor = new LanguageToJSVisitor();
            String jsCode = jsVisitor.visit(tree);
            try (PrintWriter out = new PrintWriter(DIRBASE + file.replace("." + EXTENSION, ".js"))) {
                out.print(jsCode);
            }
            System.out.println("-> Generated JavaScript: " + file.replace("." + EXTENSION, ".js"));

            System.out.println("=== DONE: " + file + " ===\n");
        }
    }
}
