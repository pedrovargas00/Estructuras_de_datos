import javax.swing.*;

/**
 *
 * @author Yalu Galicia Hdez.
 *	Estructuras 2011
 */
public class GrafoTest{

    public static void main(String[] args) {
        
        Grafo grafo = new Grafo(); //instanciamos el grafo
        GrafoUI frame = new GrafoUI(grafo);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
