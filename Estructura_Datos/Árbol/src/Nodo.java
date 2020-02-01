
public class Nodo {
    
    private String dato;
    private Nodo hijo;
    private Nodo hermano;
    private Nodo anterior;
    private boolean visitado;
    
    public Nodo(String dato){
        this.dato = dato;
        this.visitado = false;
        this.hijo = null;
        this.hermano = null;
    }
    
    public void setDato(String dato){
        this.dato = dato;
    }
    
    public void setHijo(Nodo hijo){
        this.hijo = hijo;
    }
    
    public void setHermano(Nodo hermano){
        this.hermano = hermano;
    }
    
    public void setVisitado(boolean visitado){
        this.visitado = visitado;
    }
    
    public void setAnterior(Nodo anterior){
        this.anterior = anterior;
    }
    
    public boolean isVisitado(){
        return visitado;
    }
    
    public String getDato(){
        return dato;
    }
    
    public Nodo getHijo(){
        return hijo;
    }
    
    public Nodo getHermano(){
        return hermano;
    }
    
    public Nodo getAnterior(){
        return anterior;
    }

}
