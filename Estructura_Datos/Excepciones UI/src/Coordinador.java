
public class Coordinador {
    
    private Fraccion fraccion;
    private FraccionUI fraccionUI;
    
    public Coordinador(){
        
    }
    
    public Fraccion cons(String n, String d){
        
        return new Fraccion(n, d);
    }
    
    public void setFraccion(Fraccion fraccion){
        this.fraccion = fraccion;
    }
    
    public void setFraccionUI(FraccionUI fraccionUI){
        this.fraccionUI = fraccionUI;
    }
    
    public Fraccion sumar(Fraccion fraccion, Fraccion fraccion1) throws ValorNoValidoException{
        
        Fraccion fr = null;
            fr = fraccion.sumar(fraccion, fraccion1);
        return fr;
    }
    
    public Fraccion restar(Fraccion fraccion, Fraccion fraccion1)throws ValorNoValidoException{
        
        Fraccion fr = null;

            fr = fraccion.restar(fraccion, fraccion1);
        return fr;
    }
    
    public Fraccion multiplicar(Fraccion fraccion, Fraccion fraccion1)throws ValorNoValidoException{
        
        Fraccion fr = null;

            fr = fraccion.multiplicar(fraccion, fraccion1);
        return fr;
    }
    
    public Fraccion dividir(Fraccion fraccion, Fraccion fraccion1)throws ValorNoValidoException{
        
        Fraccion fr = null;
        
            fr = fraccion.dividir(fraccion, fraccion1);
        return fr;
    }
    
    public String mostrar(Fraccion fr1){
        
        String s = fraccion.mostrar(fr1);
        
        return s;
    }
    
}
