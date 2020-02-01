import javax.swing.*;
/*
Estructuras de datos
García Cruz Ricardo Emmanuel 
Vargas Arenas Pedro
*/
public class TestCalculadora {

    public static void main(String args[]){

        Calculadora cal = new Calculadora();
        Controlador controlador = new Controlador();
        CalculadoraVista vista = new CalculadoraVista();
        
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setVisible(true);
        vista.setResizable(false);
        
        cal.setMiControlador(controlador);
        vista.setControlador(controlador);
        
        controlador.setLogica(cal);
        controlador.setVista(vista);
        
    }
}
