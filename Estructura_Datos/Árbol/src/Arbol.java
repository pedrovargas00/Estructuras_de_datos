import java.util.*;

public class Arbol {
    
    private Nodo raiz;
    private ArrayList<Nodo> nodos;
    
    public Arbol(){
    
        this.nodos = new ArrayList();
        this.raiz = null;
    }
    
    public void insertarRaiz(String dato){

        if(raiz == null){
            raiz = new Nodo(dato);
            nodos.add(raiz);
        } else
            System.out.println("Ya existe una raíz");
    }

    public Nodo insertar(String padre, String dato, Nodo nodo){
        
        if(nodo.getDato().equalsIgnoreCase(padre)){
            if(nodo.getHijo() == null){
                Nodo a = new Nodo(dato);
                nodo.setHijo(a);
                nodo.getHijo().setAnterior(nodo);
                nodos.add(a);
                return null; 
            }else{
                Nodo a = new Nodo(dato);
                if(nodo.getHijo().getHermano() == null){
                    nodo.getHijo().setHermano(a);
                    nodo.getHijo().getHermano().setAnterior(nodo.getHijo());
                    nodos.add(a);
                    return null;
                }
                    nodo = nodo.getHijo().getHermano();
                    while(nodo.getHermano() != null)
                        nodo =  nodo.getHermano();
                    nodo.setHermano(a);
                    nodo.getHermano().setAnterior(nodo);
                    nodos.add(a);
                    return null;
                
            }
        }
        if(nodo.getHijo() != null && nodo.getHijo().isVisitado() != true){
                return insertar(padre, dato, nodo.getHijo());
        }
        if(nodo.getHermano() != null && nodo.getHermano().isVisitado() != true){
            nodo.setVisitado(true);
            return insertar(padre, dato, nodo.getHermano());
        }
        else{
            nodo.setVisitado(true);
            return insertar(padre, dato, nodo.getAnterior());
        }
    }
    
    public void desVisitar(){
        for(Nodo n: nodos)
            n.setVisitado(false);
    }
    
    public Nodo getRaiz(){
    
        return raiz;
    }
   
    public ArrayList preOrden(Nodo nodo, ArrayList r){
        if(r.size() == nodos.size())
            return r;
        if(nodo.isVisitado() != true){
            nodo.setVisitado(true);
            r.add(nodo.getDato());
        }
        if(nodo.getHijo() != null && nodo.getHijo().isVisitado() != true){
            return preOrden(nodo.getHijo(),r);
        }
        if(nodo.getHermano() != null && nodo.getHermano().isVisitado() != true){
            return preOrden(nodo.getHermano(),r);
        }else{
            return preOrden(nodo.getAnterior(),r);
        }
    }
    
    public ArrayList postOrden(Nodo nodo, ArrayList r){
        
        if(nodos.size()-1 == r.size()){
            r.add(raiz.getDato());
            return r;
        }
        if(nodo.getHijo() != null && nodo.getHijo().isVisitado() != true)
            return postOrden(nodo.getHijo(),r);
        else{
            if (nodo.isVisitado()!=true){
                nodo.setVisitado(true);
                r.add(nodo.getDato());
            }
            if(nodo.getHermano() != null && nodo.getHermano().isVisitado() != true)
                return postOrden(nodo.getHermano(),r);
            else
                return postOrden(nodo.getAnterior(),r);
        }
    }
      
    public ArrayList niveles(Nodo nodo, ArrayList r, LinkedList<Nodo> cola){
    
        Nodo aux;
        if(!cola.contains(nodo))
            cola.add(nodo);
        if(r.size() != nodos.size()){
            aux = cola.remove();
            r.add(aux.getDato());
            aux = aux.getHijo();
            while(aux != null){
                cola.add(aux);
                aux = aux.getHermano();
            }
            return niveles(cola.peek(), r, cola);
        }else
            return r;
    }
}