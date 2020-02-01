/*
Elaboró:
Ramos López Lizbeth
Vargas Arenas Pedro
*/
public class Nodo {
    
    private int dato;
    private Nodo sgte;

    
    public Nodo(int x) {
        this.dato = x;
    }
    
    public Nodo() {
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }    
}
