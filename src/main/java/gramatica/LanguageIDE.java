package gramatica;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class LanguageIDE extends JFrame {

    private JTextPane sourceCodeArea;
    private JTextPane outputArea;
    private JButton translateToPythonButton;
    private JButton translateToJSButton;
    private JLabel statusLabel;
    private String lastSavedFilePath = null;
    
    // Colores de VSCode
    private final Color VS_BACKGROUND = new Color(30, 30, 30);
    private final Color VS_FOREGROUND = new Color(212, 212, 212);
    private final Color VS_TOOLBAR = new Color(50, 50, 50);
    private final Color VS_SELECTION = new Color(55, 100, 150);
    private final Color VS_HIGHLIGHT = new Color(40, 40, 40);
    private final Color VS_BORDER = new Color(60, 60, 60);
    private final Color VS_STATUS_BG = new Color(0, 122, 204);
    private final Color VS_PYTHON_COLOR = new Color(65, 184, 131); // Color verde para Python
    private final Color VS_JS_COLOR = new Color(240, 219, 79);     // Color amarillo para JavaScript
    
    public LanguageIDE() {
        setTitle("IDE para .atleticoMorelia");
        setSize(1200, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Inicializa los componentes
        initComponents();
        
        // Inicializa el menú
        initMenu();
        
        // Establece el tema look and feel
        setLookAndFeel();
    }

    private void initComponents() {
        // Panel principal con BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(0, 0));
        mainPanel.setBackground(VS_BACKGROUND);
        
        // Panel superior para botones y controles
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(VS_TOOLBAR);
        
        JToolBar toolbar = new JToolBar();
        toolbar.setFloatable(false);
        toolbar.setBorderPainted(false);
        toolbar.setBackground(VS_TOOLBAR);
        toolbar.setBorder(new EmptyBorder(5, 5, 5, 5));
        
        // Barra de estado
        statusLabel = new JLabel(" Listo");
        statusLabel.setForeground(Color.WHITE);
        statusLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        JPanel statusPanel = new JPanel(new BorderLayout());
        statusPanel.setBackground(VS_STATUS_BG);
        statusPanel.add(statusLabel, BorderLayout.WEST);
        statusPanel.setBorder(new EmptyBorder(3, 10, 3, 10));
        
        // Botones de traducción con iconos y colores
        translateToPythonButton = createStyledButton("Python", "/icons/pyLogo", VS_PYTHON_COLOR, Color.WHITE, e -> translateToPython());
        translateToJSButton = createStyledButton("JavaScript", "/icons/jsLogo", VS_JS_COLOR, Color.BLACK, e -> translateToJS());
        
        // Añade botones a la barra de herramientas
        toolbar.add(translateToPythonButton);
        toolbar.add(Box.createHorizontalStrut(5));
        toolbar.add(translateToJSButton);
        
        topPanel.add(toolbar, BorderLayout.CENTER);
        
        // Text areas
        sourceCodeArea = createStyledTextPane("// Escribe tu código aquí...");
        outputArea = createStyledTextPane("");
        outputArea.setEditable(true);
        
        // Scroll panes 
        JScrollPane sourceScrollPane = createStyledScrollPane(sourceCodeArea);
        JScrollPane outputScrollPane = createStyledScrollPane(outputArea);
        
        // Panel dividido
        JSplitPane splitPane = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT,
                sourceScrollPane,
                outputScrollPane
        );
        splitPane.setResizeWeight(0.5);
        splitPane.setBorder(null);
        splitPane.setDividerSize(5);
        splitPane.setBackground(VS_BACKGROUND);
        splitPane.setDividerLocation(600);
        
        // Añade componentes al panel principal
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(splitPane, BorderLayout.CENTER);
        mainPanel.add(statusPanel, BorderLayout.SOUTH);
        
        // Añade el panel principal al frame
        setContentPane(mainPanel);
    }

    private JButton createStyledButton(String text, String iconPath, Color backgroundColor, Color foregroundColor, java.awt.event.ActionListener action) {
        JButton button = new JButton(text);
        try {
            ImageIcon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource(iconPath)));
            Image img = icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            button.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.err.println("No se pudo cargar el icono: " + iconPath);
        }
        button.addActionListener(action);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setBackground(backgroundColor);
        button.setForeground(foregroundColor);
        button.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        button.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(backgroundColor.darker(), 1),
                BorderFactory.createEmptyBorder(4, 8, 4, 8)
        ));
        
        return button;
    }

    private JTextPane createStyledTextPane(String text) {
        JTextPane textPane = new JTextPane();
        textPane.setText(text);
        textPane.setFont(new Font("Consolas", Font.PLAIN, 14));
        textPane.setBackground(VS_BACKGROUND);
        textPane.setForeground(VS_FOREGROUND);
        textPane.setCaretColor(Color.WHITE);
        textPane.setSelectionColor(VS_SELECTION);
        textPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        
        // Configurar el tabulador para que sea de 4 espacios
        FontMetrics fm = textPane.getFontMetrics(textPane.getFont());
        int charWidth = fm.charWidth(' ');
        int tabWidth = charWidth * 4;
        
        TabStop[] tabs = new TabStop[10];
        for (int i = 0; i < tabs.length; i++) {
            tabs[i] = new TabStop((i + 1) * tabWidth);
        }
        
        TabSet tabSet = new TabSet(tabs);
        SimpleAttributeSet attributes = new SimpleAttributeSet();
        StyleConstants.setTabSet(attributes, tabSet);
        
        StyledDocument doc = textPane.getStyledDocument();
        doc.setParagraphAttributes(0, doc.getLength(), attributes, false);
        
        return textPane;
    }
    
    private JScrollPane createStyledScrollPane(JTextPane textPane) {
        JScrollPane scrollPane = new JScrollPane(textPane);
        scrollPane.setBorder(new MatteBorder(0, 1, 0, 0, VS_BORDER));
        scrollPane.setBackground(VS_BACKGROUND);
        
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.getVerticalScrollBar().setBackground(VS_BACKGROUND);
        scrollPane.getVerticalScrollBar().setForeground(new Color(80, 80, 80));
        
        scrollPane.getHorizontalScrollBar().setUnitIncrement(16);
        scrollPane.getHorizontalScrollBar().setBackground(VS_BACKGROUND);
        scrollPane.getHorizontalScrollBar().setForeground(new Color(80, 80, 80));
        
        return scrollPane;
    }

    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(VS_TOOLBAR);
        menuBar.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, VS_BORDER));
        
        // Menú Archivo
        JMenu fileMenu = createStyledMenu("Archivo", KeyEvent.VK_A);
        
        JMenuItem newItem = createStyledMenuItem("Nuevo", KeyEvent.VK_N);
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        newItem.addActionListener(e -> newFile());
        
        JMenuItem openItem = createStyledMenuItem("Abrir...", KeyEvent.VK_A);
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        openItem.addActionListener(e -> openFile());
        
        JMenuItem saveItem = createStyledMenuItem("Guardar", KeyEvent.VK_G);
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        saveItem.addActionListener(e -> saveFile(false));
        
        JMenuItem saveAsItem = createStyledMenuItem("Guardar como...", KeyEvent.VK_C);
        saveAsItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK | ActionEvent.SHIFT_MASK));
        saveAsItem.addActionListener(e -> saveFile(true));
        
        JMenuItem exitItem = createStyledMenuItem("Salir", KeyEvent.VK_S);
        exitItem.addActionListener(e -> System.exit(0));
        
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        
        // Menú Editar
        JMenu editMenu = createStyledMenu("Editar", KeyEvent.VK_E);
        
        JMenuItem cutItem = createStyledMenuItem("Cortar", KeyEvent.VK_T);
        cutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        cutItem.addActionListener(e -> sourceCodeArea.cut());
        
        JMenuItem copyItem = createStyledMenuItem("Copiar", KeyEvent.VK_C);
        copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        copyItem.addActionListener(e -> sourceCodeArea.copy());
        
        JMenuItem pasteItem = createStyledMenuItem("Pegar", KeyEvent.VK_P);
        pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        pasteItem.addActionListener(e -> sourceCodeArea.paste());
        
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        
        // Menú Traducir
        JMenu translateMenu = createStyledMenu("Traducir", KeyEvent.VK_T);
        
        JMenuItem toPythonItem = createStyledMenuItem("A Python", KeyEvent.VK_P);
        toPythonItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
        toPythonItem.addActionListener(e -> translateToPython());
        
        JMenuItem toJSItem = createStyledMenuItem("A JavaScript", KeyEvent.VK_J);
        toJSItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0));
        toJSItem.addActionListener(e -> translateToJS());
        
        translateMenu.add(toPythonItem);
        translateMenu.add(toJSItem);
        
        // Agregar menús a la barra de menú
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(translateMenu);
        
        setJMenuBar(menuBar);
    }
    
    private JMenu createStyledMenu(String text, int mnemonic) {
        JMenu menu = new JMenu(text);
        menu.setMnemonic(mnemonic);
        menu.setForeground(VS_FOREGROUND);
        menu.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        return menu;
    }
    
    private JMenuItem createStyledMenuItem(String text, int mnemonic) {
        JMenuItem menuItem = new JMenuItem(text);
        menuItem.setMnemonic(mnemonic);
        menuItem.setBackground(VS_BACKGROUND);
        menuItem.setForeground(VS_FOREGROUND);
        menuItem.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        return menuItem;
    }

    private void translateToPython() {
        try {
            String sourceCode = sourceCodeArea.getText();
            
            // Preparar el lexer y parser
            LanguageLexer lexer = new LanguageLexer(CharStreams.fromString(sourceCode));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LanguageParser parser = new LanguageParser(tokens);
            
            // Obtener el árbol sintáctico y visitar con el traductor de Python
            LanguageParser.ProgramContext tree = parser.program();
            LanguageToPythonVisitor visitor = new LanguageToPythonVisitor();
            String pythonCode = visitor.visitProgram(tree);
            
            // Mostrar el resultado en el área de salida
            outputArea.setText(pythonCode);
            statusLabel.setText(" Traducción a Python completada");
        } catch (Exception e) {
            outputArea.setText("Error al traducir a Python: " + e.getMessage());
            statusLabel.setText(" Error en la traducción");
            e.printStackTrace();
        }
    }

    private void translateToJS() {
        try {
            String sourceCode = sourceCodeArea.getText();
            
            // Preparar el lexer y parser
            LanguageLexer lexer = new LanguageLexer(CharStreams.fromString(sourceCode));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LanguageParser parser = new LanguageParser(tokens);
            
            // Obtener el árbol sintáctico y visitar con el traductor de JavaScript
            LanguageParser.ProgramContext tree = parser.program();
            LanguageToJSVisitor visitor = new LanguageToJSVisitor();
            String jsCode = visitor.visitProgram(tree);
            
            // Mostrar el resultado en el área de salida
            outputArea.setText(jsCode);
            statusLabel.setText(" Traducción a JavaScript completada");
        } catch (Exception e) {
            outputArea.setText("Error al traducir a JavaScript: " + e.getMessage());
            statusLabel.setText(" Error en la traducción");
            e.printStackTrace();
        }
    }

    private void newFile() {
        sourceCodeArea.setText("");
        outputArea.setText("");
        lastSavedFilePath = null;
        statusLabel.setText(" Nuevo archivo");
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Abrir Archivo");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de Lenguaje", "atleticoMorelia", "txt"));
        updateFileChooserUI(fileChooser);
        
        int userSelection = fileChooser.showOpenDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToOpen = fileChooser.getSelectedFile();
            try (FileReader reader = new FileReader(fileToOpen)) {
                StringBuilder content = new StringBuilder();
                char[] buffer = new char[1024];
                int bytesRead;
                
                while ((bytesRead = reader.read(buffer)) != -1) {
                    content.append(buffer, 0, bytesRead);
                }
                
                sourceCodeArea.setText(content.toString());
                outputArea.setText("");
                lastSavedFilePath = fileToOpen.getAbsolutePath();
                statusLabel.setText(" Archivo abierto: " + fileToOpen.getName());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this,
                        "Error al abrir el archivo: " + e.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                statusLabel.setText(" Error al abrir el archivo");
            }
        }
    }

    private void saveFile(boolean saveAs) {
        if (lastSavedFilePath == null || saveAs) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar Archivo");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de Lenguaje", "atleticoMorelia"));
            
            // Estilo al file chooser
            updateFileChooserUI(fileChooser);
            
            int userSelection = fileChooser.showSaveDialog(this);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                String path = fileToSave.getAbsolutePath();
                
                // Añadir extensión si no la tiene
                if (!path.endsWith(".atleticoMorelia")) {
                    path += ".atleticoMorelia";
                    fileToSave = new File(path);
                }
                
                saveToFile(fileToSave);
            }
        } else {
            saveToFile(new File(lastSavedFilePath));
        }
    }
    
    private void updateFileChooserUI(JFileChooser fileChooser) {
        LookAndFeel previousLAF = UIManager.getLookAndFeel();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(fileChooser);
        } catch (Exception e) {
            System.err.println("No se pudo aplicar estilo al JFileChooser: " + e.getMessage());
        } finally {
            try {
                UIManager.setLookAndFeel(previousLAF);
            } catch (Exception ignored) {}
        }
    }

    private void saveToFile(File file) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(sourceCodeArea.getText());
            lastSavedFilePath = file.getAbsolutePath();
            statusLabel.setText(" Archivo guardado: " + file.getName());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                    "Error al guardar el archivo: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            statusLabel.setText(" Error al guardar el archivo");
        }
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

            UIManager.put("PopupMenu.background", VS_BACKGROUND);
            UIManager.put("PopupMenu.foreground", VS_FOREGROUND);
            UIManager.put("MenuItem.background", VS_BACKGROUND);
            UIManager.put("MenuItem.foreground", VS_FOREGROUND);
            UIManager.put("Menu.background", VS_BACKGROUND);
            UIManager.put("Menu.foreground", VS_FOREGROUND);
            UIManager.put("Menu.selectionBackground", VS_SELECTION);
            UIManager.put("MenuItem.selectionBackground", VS_SELECTION);
            
            UIManager.put("OptionPane.background", VS_BACKGROUND);
            UIManager.put("OptionPane.messageForeground", VS_FOREGROUND);
            UIManager.put("Panel.background", VS_BACKGROUND);
            
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.err.println("No se pudo establecer el look and feel: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LanguageIDE ide = new LanguageIDE();
            ide.setVisible(true);
        });
    }
}