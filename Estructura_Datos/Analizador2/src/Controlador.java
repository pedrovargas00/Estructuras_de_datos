
public class Controlador {
    
    private Analizador analizador;
    private AnalizadorUI analizadorUI;
    
    public Controlador(){}
    
    public void setAnalizador(Analizador analizador){
        this.analizador = analizador;
    }
    
    public void setAnalizadorUI(AnalizadorUI analizadorUI){
        this.analizadorUI = analizadorUI;
    }
    
    public boolean analizarSimbolos(String cad){
        return analizador.analizarSimbolos(cad);
    }
}
