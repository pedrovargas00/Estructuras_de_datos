import java.util.*;

public class Abb {
    
    private Nodo raiz;
    private ArrayList<Nodo> nodos;
    
    public Abb(int clave){
        
        raiz = new Nodo(clave);
        nodos = new ArrayList();
        nodos.add(raiz);
    }
    
    public Nodo getRaiz(){
        return raiz;
    }
    
    private Boolean esHoja(Nodo n){
        
        if(n.getHijoIzq() == null && n.getHijoDer() == null)
            return true;
        else
            return false;
    }
    public void mostrar(){
        
        for(Nodo n: nodos){
            System.out.println("N: " + n.getClave());
            if(n.getHijoIzq() != null)
                System.out.println("Izq: " + n.getHijoIzq().getClave());
            if(n.getHijoDer() != null)
                System.out.println("Der: " + n.getHijoDer().getClave());
        }
    }
    
    public Nodo insertar(int clave, Nodo inicio) throws ClaveDuplicadaException{
        
        if(clave < inicio.getClave()){
            if(inicio.getHijoIzq() == null){
                Nodo nuevo = new Nodo(clave);
                inicio.setHijoIzq(nuevo);
                nodos.add(nuevo);
                return null;
            }return insertar(clave, inicio.getHijoIzq());
        }if(clave > inicio.getClave()){
            if(inicio.getHijoDer() == null){
                Nodo nuevo = new Nodo(clave);
                inicio.setHijoDer(nuevo);
                nodos.add(nuevo);
                return null;
            }return insertar(clave, inicio.getHijoDer());
        }else
            throw new ClaveDuplicadaException("Error: La clave " + clave + "  está repetida");
    }
    
    public ArrayList preOrden(ArrayList<Integer> a, Nodo n){
        
        if(!a.contains(n.getClave()))
            a.add(n.getClave());
        if(n.getHijoIzq() != null)
            preOrden(a, n.getHijoIzq());
        if(n.getHijoDer() != null)
            preOrden(a, n.getHijoDer());
        return a;
    }
    
    public ArrayList inOrden(ArrayList<Integer> a, Nodo n){
        
        if(n.getHijoIzq() != null)
            inOrden(a, n.getHijoIzq());
        if(!a.contains(n.getClave()))
            a.add(n.getClave());
        if(n.getHijoDer() != null)
            inOrden(a, n.getHijoDer());
        
        return a;
    }
    
    public ArrayList postOrden(ArrayList a, Nodo n){
        
        if(n.getHijoIzq() != null)
            postOrden(a, n.getHijoIzq());
        if(n.getHijoDer() != null)
            postOrden(a, n.getHijoDer());
        if(!a.contains(n.getClave()))
            a.add(n.getClave());
        return a;
    }
    
    public Nodo busqueda(int n, Nodo inicio)throws ClaveNoEncontradaException{
        
        if(inicio.getClave() == n)
            return inicio;
        else{
            if(n < inicio.getClave() && inicio.getHijoIzq() != null)
                return busqueda(n, inicio.getHijoIzq());
            else{
                if(n < inicio.getClave() && inicio.getHijoIzq() != null)
                   return busqueda(n, inicio.getHijoDer());
                else
                    throw new ClaveNoEncontradaException("la  clave " + n + "  no existe");
            }
        }
    }
    
    public int numNodos(){
        return nodos.size();
    }
    
    public int altura(){
        
        ArrayList<Integer> a = new ArrayList();
        int p = 0, p1;
        
        for(Nodo n: nodos){
            if(esHoja(n))
                a.add(n.getClave());
        } 
        for(int i = 0; i < a.size(); i++){
            p1 = profundidad(a.get(i));
            if(p < p1)
                p = p1;
        }
        return p;
    }
    
    public int profundidad(int clave){
        
        Nodo n = raiz;
        int pr = 0; 
        
        while(clave != n.getClave()){
            if(clave < n.getClave() && n.getHijoIzq() != null){
                n = n.getHijoIzq();
                pr++;
            }else{
                n = n.getHijoDer();
                pr++;
            }
        }
        return pr;
    }
    
    public int numHojas(){
    
        int hojas = 0;
        for(Nodo n: nodos){
            if(esHoja(n))
                hojas++;
        }
        return hojas;
    }
    
    public ArrayList numInternos(ArrayList a, Nodo n){
        
        if(!a.contains(n.getClave()) && (n.getHijoDer() != null || n.getHijoIzq() != null))
            a.add(n.getClave());
        if(n.getHijoIzq() != null)
            numInternos(a, n.getHijoIzq());
        if(n.getHijoDer() != null)
            numInternos(a, n.getHijoDer());
        return a;
    }
    
    public boolean esCompleto(){
        
        Boolean completo = true;
        for(Nodo n: nodos){
            if((n.getHijoIzq() == null && n.getHijoDer()!= null) || (n.getHijoIzq() != null && n.getHijoDer()== null))
                completo = false;
        }
        return completo;
    }
    
    public void eliminar(int clave) throws ClaveNoEncontradaException{
    
        Nodo n = busqueda(clave, raiz);
        if(n == null)
            throw new ClaveNoEncontradaException();
        if(esHoja(n))
            eliminar1(n, raiz);
        if((n.getHijoIzq() == null && n.getHijoDer()!= null) || (n.getHijoIzq() != null && n.getHijoDer()== null))
            eliminar2(n, raiz);
        if((n.getHijoIzq() != null && n.getHijoDer()!= null))
            eliminar3(n);
    }
    
    private Nodo buscarPadre(Nodo elimina, Nodo padre){
        
        System.out.println("Ingresa eli: " + elimina.getClave() + " pa: " + padre.getClave());
        if(padre == raiz)
            return raiz;
        if((padre.getHijoIzq() != null && padre.getHijoIzq().getClave() == elimina.getClave()) || (padre.getHijoDer() != null && padre.getHijoDer().getClave() == elimina.getClave()))
            return padre;            
        else{
            if(elimina.getClave() < padre.getClave() && padre.getHijoIzq() != null)
                return buscarPadre(elimina, padre.getHijoIzq());
            else
                return buscarPadre(elimina, padre.getHijoDer());
        }
    }
    private Nodo eliminar1(Nodo n, Nodo ra){

        Nodo nod = buscarPadre(n, ra);
        if(nod.getHijoIzq() != null && nod.getHijoIzq().getClave() == n.getClave()){
            //System.out.println("Elimina: " + nod.getHijoIzq().getClave());
            nodos.remove(nod.getHijoIzq());
            nod.setHijoIzq(null);
        }else{
            if(nod.getHijoDer() != null && nod.getHijoDer().getClave() == n.getClave()){
                //System.out.println("Elimina: " + nod.getHijoDer().getClave());
                nodos.remove(nod.getHijoDer());
                nod.setHijoDer(null);
            }
        }
        /*else{
            if(n.getClave() < ra.getClave() && ra.getHijoIzq() != null)
                return eliminar1(n, ra.getHijoIzq());
            else
                return eliminar1(n, ra.getHijoDer());
        }*/
        return null;
    }
    
    private Nodo eliminar2(Nodo n,Nodo ra){
    
        Nodo nod = buscarPadre(n, ra);
        if(nod.getHijoIzq() != null && nod.getHijoIzq().getClave() == n.getClave()){
            System.out.println("Elimina: " + nod.getHijoIzq().getClave());
            nodos.remove(nod.getHijoIzq());
            if(n.getHijoIzq() != null)
                nod.setHijoIzq(n.getHijoIzq());
            else
                nod.setHijoIzq(n.getHijoDer());
        }
        if(nod.getHijoDer() != null && nod.getHijoDer().getClave() == n.getClave()){
            System.out.println("Elimina: " + nod.getHijoDer().getClave());
            nodos.remove(nod.getHijoDer());
            if(n.getHijoIzq()!= null)
                ra.setHijoDer(n.getHijoIzq());
            else
                ra.setHijoDer(n.getHijoDer());
        }/*
        else{
            if(n.getClave() < ra.getClave() && ra.getHijoIzq() != null)
                return eliminar2(n, ra.getHijoIzq());
            else
                return eliminar2(n, ra.getHijoDer());
        }*/
        return null;
    }
    
    private ArrayList buscarMayor(ArrayList<String> a, Nodo n){
    
        if(!a.contains(n.getClave()))
            a.add(String.valueOf(n.getClave()));
        if(n.getHijoIzq() != null)
            buscarMayor(a, n.getHijoIzq());
        if(n.getHijoDer() != null)
            buscarMayor(a, n.getHijoDer());
        return a;
    }
    private void eliminar3(Nodo elimina) throws ClaveNoEncontradaException{
        
        ArrayList<String> aux = new ArrayList();
        int mayor;
        Nodo ma, padre;
        
        aux.addAll(buscarMayor(new ArrayList(), elimina.getHijoIzq())); 
        Collections.sort(aux);
        mayor = Integer.parseInt(aux.get(aux.size()-1));
        System.out.println("Aux: " + aux + " Mayor: " + mayor);
        ma = busqueda(mayor, raiz);
        if(elimina == raiz){
            ma.setHijoDer(elimina.getHijoDer());   
            if(elimina.getHijoIzq().getClave() != ma.getClave())
                ma.setHijoIzq(elimina.getHijoIzq());
            System.out.println("elimina: " + elimina.getClave());
            nodos.remove(elimina);
            raiz = ma;
            padre = buscarPadre(ma, elimina);
            if(padre.getHijoIzq() != null && padre.getHijoIzq().getClave() == ma.getClave())
                padre.setHijoIzq(null);
            else
                padre.setHijoDer(null);
            
        }else{
            
            padre = buscarPadre(ma, elimina);
            if(padre.getHijoIzq() != null && padre.getHijoIzq().getClave() == ma.getClave())
                padre.setHijoIzq(null);
            else
                padre.setHijoDer(null);
            System.out.println("1.- Nod: " + ma.getClave() + " No: " + padre.getClave() + " n: " + elimina.getClave());
            ma.setHijoIzq(elimina.getHijoIzq());
            ma.setHijoDer(elimina.getHijoDer());
        
            padre = buscarPadre(elimina, raiz);
            System.out.println("2.- Nod: " + ma.getClave() + " No: " + padre.getClave() + " n: " + elimina.getClave());
            if(padre.getHijoIzq() != null && padre.getHijoIzq().getClave() == elimina.getClave()){
                System.out.println("Elimina: " + padre.getHijoIzq().getClave());
                nodos.remove(padre.getHijoIzq());
                padre.setHijoIzq(ma);
            }else{

                nodos.remove(padre.getHijoDer());
                padre.setHijoDer(ma);
            }
        }
        elimina = null;
    }
}