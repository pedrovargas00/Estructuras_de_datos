import java.util.*;

public class Abb {
    
    private Nodo raiz;
    private ArrayList<Nodo> nodos;
    
    public Abb(int dato){
        
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
            if(n.getHijoIzq() != null)
                System.out.println("Izq: " + n.getHijoIzq().getDato());
            if(n.getHijoDer() != null)
                System.out.println("Der: " + n.getHijoDer().getDato());
        }
    }
    
    public Nodo insertar(int dato, Nodo inicio) throws ClaveDuplicadaException{
 
        if(dato < inicio.getDato()){
            if(inicio.getHijoIzq() == null){
                Nodo nuevo = new Nodo(dato);
                inicio.setHijoIzq(nuevo);
                nodos.add(nuevo);
                return null;
            }
            return insertar(dato, inicio.getHijoIzq());
        }if(dato > inicio.getDato()){
            if(inicio.getHijoDer() == null){
                Nodo nuevo = new Nodo(dato);
                inicio.setHijoDer(nuevo);
                nodos.add(nuevo);
                return null;
            }
            return insertar(dato, inicio.getHijoDer());
        }else
            throw new ClaveDuplicadaException();
            
        /*
        if(!padre.equalsIgnoreCase(inicio.getDato())){
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
        }*/
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
        
        if(n.getHijoIzq() != null)
            postOrden(a, n.getHijoIzq());
        if(n.getHijoDer() != null)
            postOrden(a, n.getHijoDer());
        if(!a.contains(n.getDato()))
            a.add(n.getDato());
        return a;
    }
    
    public ArrayList inOrdenConverso(ArrayList a, Nodo n){
        
        if(n.getHijoDer() != null)
            inOrden(a, n.getHijoDer());
        if(!a.contains(n.getDato()))
            a.add(n.getDato());
        if(n.getHijoIzq() != null)
            inOrden(a, n.getHijoIzq());
        
        return a;
    }
    
    public ArrayList preOrdenConverso(ArrayList a, Nodo n){
        
        if(!a.contains(n.getDato()))
            a.add(n.getDato());
        if(n.getHijoDer() != null)
            preOrden(a, n.getHijoDer());
        if(n.getHijoIzq() != null)
            preOrden(a, n.getHijoIzq());
        return a;
    }
    
    public ArrayList postOrdenConverso(ArrayList a, Nodo n){
        
        if(n.getHijoDer() != null)
            postOrden(a, n.getHijoDer());
        if(n.getHijoIzq() != null)
            postOrden(a, n.getHijoIzq());
        if(!a.contains(n.getDato()))
            a.add(n.getDato());
        return a;
    }
    
    private int valor(int a, int b){
        System.out.println("Valor --> " + a + ", " + b);
        return ((a < b) ? b : a);
    }
    
    public int funcion(Nodo raiz){
        
        if(raiz == null)
            return -1;
        else{
            System.out.println("Recibe: " + raiz.getDato());
            return (1 + valor(funcion(raiz.getHijoIzq()), funcion(raiz.getHijoDer())));
        }
    }
}
