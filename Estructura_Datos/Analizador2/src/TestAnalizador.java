import java.util.*;
import javax.swing.JFrame;

class TestAnalizador {   
    
    public static void main(String []args){
        String cad;
        Pila miPila = new Pila();
        Scanner in =  new Scanner(System.in);
        AnalizadorUI analizadorUI = new AnalizadorUI();
        Analizador analizador = new Analizador(miPila);
        Controlador controlador = new Controlador();
    
        analizador.setControlador(controlador);
        analizadorUI.setControlador(controlador);
    
        controlador.setAnalizador(analizador);
        controlador.setAnalizadorUI(analizadorUI);
        
        analizadorUI.setVisible(true);
        analizadorUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        System.out.println("ingrese una cadena");
        cad = in.next();
        if(analizador.analizarSimbolos(cad))
            System.out.println("símbolos Equilibrados");
        else
            System.out.println("Símbolos No Equilibrados");
        
        
    }
    
}
