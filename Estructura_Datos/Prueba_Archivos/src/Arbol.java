import java.util.*;

public class Arbol {
    
    private Nodo raiz;
    private ArrayList<Nodo> nodos;
    
    public Arbol(int dato){
        
        raiz = new Nodo(dato);
        nodos = new ArrayList();
        nodos.add(raiz);
    }
    
    public Nodo getRaiz(){
        return raiz;
    }
    
    public void mostrar(){
        for(Nodo n: nodos){
            System.out.println("N: " + n.getDato());
            /*if(n.getHijoIzq() != null)
                System.out.println("Izq: " + n.getHijoIzq().getDato());
            if(n.getHijoDer() != null)
                System.out.println("Der: " + n.getHijoDer().getDato());*/
        }
    }
    
    public Nodo insertar(int padre, int dato, Nodo inicio){
 
        if(padre != inicio.getDato()){
            if(inicio.getHijoIzq() != null && !inicio.getHijoIzq().isVisitado())
                insertar(padre, dato, inicio.getHijoIzq());
            if(inicio.getHijoDer() != null && !inicio.getHijoDer().isVisitado())
                insertar(padre, dato, inicio.getHijoDer());
        }else{
            Nodo nuevo = new Nodo(dato);
            if(inicio.getHijoIzq() == null){
                inicio.setHijoIzq(nuevo);
                nodos.add(nuevo);
            }else{
                inicio.setHijoDer(nuevo);
                nodos.add(nuevo);
            }   
        }
        return null;
    }
    
    public ArrayList preOrden(ArrayList<Integer> a, Nodo n){
        
        if(!a.contains(n.getDato()))
            a.add(n.getDato());
        if(n.getHijoIzq() != null)
            preOrden(a, n.getHijoIzq());
        if(n.getHijoDer() != null)
            preOrden(a, n.getHijoDer());
        return a;
    }
    
    public ArrayList inOrden(ArrayList<Integer> a, Nodo n){
        
        if(n.getHijoIzq() != null)
            inOrden(a, n.getHijoIzq());
        if(!a.contains(n.getDato()))
            a.add(n.getDato());
        if(n.getHijoDer() != null)
            inOrden(a, n.getHijoDer());
        
        return a;
    }
    
    public ArrayList postOrden(ArrayList a, Nodo n){
        
        System.out.println("Entra: " + n.getDato());
        if(n.getHijoIzq() != null)
            postOrden(a, n.getHijoIzq());
        if(n.getHijoDer() != null)
            postOrden(a, n.getHijoDer());
        if(!a.contains(n.getDato()))
            a.add(n.getDato());
        /*if(n.getHijoDer() != null && n.getHijoIzq() != null)
            n.setDato(n.getDato() + n.getHijoIzq().getDato() + n.getHijoDer().getDato());
        if(n.getHijoDer() != null && n.getHijoIzq() == null)
            n.setDato(n.getDato() + n.getHijoDer().getDato());
        if(n.getHijoDer() == null && n.getHijoIzq() != null)
            n.setDato(n.getDato() + n.getHijoIzq().getDato());
        System.out.println("Sale: " + n.getDato());*/
        return a;
    }
    
    public ArrayList niveles(Nodo nodo){
    
        Nodo aux;
        LinkedList<Nodo> cola = new LinkedList();
        ArrayList<Nodo> r = new ArrayList();
        
        if(nodo != null){
            cola.add(nodo);
            while(!cola.isEmpty()){
                aux = cola.remove();
                r.add(aux);
                if(aux.getHijoIzq() != null)
                    cola.add(aux.getHijoIzq());
                if(aux.getHijoDer() != null)
                    cola.add(aux.getHijoDer());
            }
        }
        return r;
    }
}