
public class Nodo {
    
    private Nodo hijoDer;
    private Nodo hijoIzq;
    private int clave;
    private String dato;
    private boolean visitado;
    
    public Nodo(int clave){
        
        this.clave = clave;
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
    
    public void setClave(int clave){
        this.clave = clave;
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
    
    public int getClave(){
        return clave;
    }
    
    public boolean isVisitado(){
        return visitado;
    }

}
