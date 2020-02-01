/*
Estructuras de datos
García Cruz Ricardo Emmanuel 
Vargas Arenas Pedro
*/
public class Controlador {
    
    private Calculadora logica;
    private CalculadoraVista vista;
    
    public Controlador(){}
    
    public void setLogica(Calculadora logica){
        this.logica = logica;
    }
    
    public void setVista(CalculadoraVista vista){
        this.vista = vista;
    }
    
    public String convertirPostFijo(String cad){
        
        return logica.convertirPosFijo(cad);
    }
    
    public String igual(String cad){
        return logica.evaluar(cad);
    }
}
