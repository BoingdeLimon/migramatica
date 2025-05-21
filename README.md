# ATLETICO MORELIA

ATLETICO MORELIA es una interfaz gráfica (GUI) creada en Java que simula un editor de texto especializado para escribir y ejecutar código en un lenguaje personalizado desarrollado con ANTLR.

## 📋 Características

- Editor de texto donde se puede escribir código en el lenguaje personalizado.
- Consola de salida para mostrar resultados y errores.
- Integración con un intérprete basado en ANTLR.
- Ejecución del código directamente desde la interfaz.

## 🚀 Requisitos

- Java 11 o superior
- ANTLR 4 (ya compilado el lenguaje en clases `.java`)
- Visual Studio Code con la extensión Java instalada (o cualquier IDE compatible con Java)

## ▶️ Ejecución

1. Abre el proyecto en **Visual Studio Code**.
2. Asegúrate de que los archivos generados por ANTLR (`Lexer`, `Parser`, `Visitor`, etc.) están en el mismo paquete.
3. Ejecuta el archivo `Main.java` (presiona `Run` o usa `F5`).
4. Escribe tu código en el área superior y presiona **Archivo → Ejecutar** para analizar y ejecutar el programa.
5. Observa la salida o errores en el panel de consola inferior.

## ⚙️ Estructura General

- `LanguageIDE.java`: Contiene la interfaz gráfica principal y la lógica de ejecución.
- `LanguageLexer.java`, `LanguageParser.java`, `LanguageCustomVisitor.java`: Archivos generados por ANTLR o implementados para ejecutar el lenguaje.
- `consoleArea`: Muestra resultados de ejecución y errores (con colores).
- `codeArea`: Donde se escribe el código fuente.
- `outputArea`: Panel para visualizar la traduccion.

## 🧠 ¿Cómo funciona?

1. El usuario escribe código en el área de edición.
2. Al ejecutar, el código se procesa usando ANTLR:
   - Se analiza con el lexer y parser del lenguaje.
   - Se construye el árbol de análisis (AST).
   - Se recorre con un visitor para interpretar el código.
3. Toda la salida del visitor se redirige al panel de consola.

## 📦 Notas adicionales

- El código fuente debe estar escrito en el lenguaje definido en la gramática `.g4`.
- Se recomienda que los archivos generados por ANTLR estén actualizados si se modifica la gramática.

---

¡Contribuciones o sugerencias son bienvenidas!
