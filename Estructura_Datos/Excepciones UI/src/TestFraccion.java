
import javax.swing.*;

public class TestFraccion {
    
    public static void main(String []args){
        
        Coordinador coordinador = new Coordinador();
        Fraccion fraccion = new Fraccion();
        FraccionUI fraccionUI = new FraccionUI();
        
        fraccion.setCoordinador(coordinador);
        fraccionUI.setCoordinador(coordinador);
        
        coordinador.setFraccion(fraccion);
        coordinador.setFraccionUI(fraccionUI);
        
        fraccionUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fraccionUI.setLocation(50, 150);
        fraccionUI.setVisible(true);
    }
}
