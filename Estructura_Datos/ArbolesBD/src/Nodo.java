
public class Nodo {

    private Nodo hijoDer;
    private Nodo hijoIzq;
    private String dato;
    private boolean visitado;
    
    public Nodo(String dato){
        
        this.dato = dato;
        this.hijoDer = null;
        this.hijoIzq = null;
        this.visitado = false;
    }
    
    public void setHijoDer(Nodo hijoDer){
        this.hijoDer = hijoDer;
    }
    
    public void setHijoIzq(Nodo hijoIzq){
        this.hijoIzq = hijoIzq;
    }
    
    public void setDato(String dato){
        this.dato = dato;
    }
    
    public void setVisitado(boolean visitado){
        this.visitado = visitado;
    }
    
    public Nodo getHijoDer(){
        return hijoDer;
    }
    
    public Nodo getHijoIzq(){
        return hijoIzq;
    }
    
    public String getDato(){
        return dato;
    }
    
    public boolean isVisitado(){
        return visitado;
    }
}
