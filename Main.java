import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

import javax.swing.JFrame;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        /**
         * Guarda el nombre de archivo pasado como argumento en la consola.
         * Si ejecutas: java Main archivo.plata
         * entonces args[0] = "archivo.plata"
         */
        String inputFile = null;

        // Si hay argumentos (args.length > 0), el primer argumento se toma como el
        // archivo de entrada. 
        if (args.length > 0)
            inputFile = args[0];

        // 'is' será la fuente de datos. Por defecto, System.in (leer del teclado).
        InputStream is = System.in;

        // Si SÍ se pasó un archivo por argumento, entonces en vez de leer del teclado
        // leemos el archivo usando FileInputStream.
        if (inputFile != null)
            is = new FileInputStream(inputFile);

    
        // ANTLR lee el contenido del InputStream y crea un flujo de caracteres.
        CharStream input = CharStreams.fromStream(is);

        // El lexer convierte los caracteres en tokens.
        PLATALexer lexer = new PLATALexer(input);
        // El parser recibirá estos tokens.
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Crea el parser con los tokens obtenidos del lexer.
        PLATAParser parser = new PLATAParser(tokens);

        // Comienza el análisis sintáctico invocando la regla inicial 'programa'
        // (debería ser la regla raíz de la gramatica .g4)
        ParseTree tree = parser.programa();

        // Crea tu visitor que recorrerá el árbol.
        MiVisitor v = new MiVisitor();
        // Ejecuta el visitor sobre el árbol generado.
        v.visit(tree);
        // Imprime el árbol parseado en formato de texto (útil para depuración).
        System.out.println(tree.toStringTree(parser));

        // ----------------------------
        JFrame frame = new JFrame("Árbol de Parseo PLATA");
        TreeViewer viewer = new TreeViewer(
                Arrays.asList(parser.getRuleNames()), // nombres de reglas
                tree // el árbol
        );
        viewer.setScale(1.5); // zoom
        frame.add(viewer);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

        // ----------------------------

    }
}
