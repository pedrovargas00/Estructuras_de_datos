/*
Elaboró:
Ramos López Lizbeth
Vargas Arenas Pedro
*/

public class ListaLigada {
   private Nodo inicio ;
   private Nodo fin;

    public ListaLigada() {

        this.inicio = null;
        this.fin = null;        
    }
    
    public boolean estaVacia(){
        return inicio == null;
    }
   
    public void insertarAlInicio(int d){
        
        Nodo nuevo = new Nodo(d);
        nuevo.setSgte(null);
        
        if (estaVacia() && fin == null){
            inicio = nuevo;
            fin = nuevo;
        } else{
            nuevo.setSgte(inicio);
            inicio = nuevo;
        }
    }

    public void insertarAlFinal(int d){
        
        Nodo nuevo = new Nodo(d);
        nuevo.setSgte(null);                
        
        if (estaVacia() && fin == null){
            inicio = nuevo;
            fin = nuevo;
        }else{
            fin.setSgte(nuevo);
            fin = nuevo;
        }     
    }    
    
    public void eliminarDelInicio(){

        if(!estaVacia()){
            Nodo nuevo = inicio.getSgte();
            inicio = null;
            inicio = nuevo;       
        }else
            System.out.println(" NO HAY ELEMENTOS PARA ELIMINAR");        
    }
    
    public void eliminarAlFinal(){
        
        if(!estaVacia()){
            Nodo aux = inicio;
            while(aux.getSgte() != fin)
                aux = aux.getSgte();
            aux.setSgte(null);
            fin = aux;
        }else
            System.out.println(" NO HAY ELEMENTOS PARA ELIMINAR");
    }
    
    public void eliminarDato(int d){
       
        if (estaVacia()){
            System.out.println("La lista está vacía, no hay elementos qué eliminar");
            return;
        }
        if(inicio.getDato() == d)
            eliminarDelInicio();
        else if (fin.getDato() == d)
            eliminarAlFinal();
        else{
            Nodo aux = inicio;
            while(aux.getSgte().getDato() != d ){
                if(aux.getSgte()== fin){
                    System.out.println("El elemento " +d + " no existe en la lista");
                    return;
                }
                aux = aux.getSgte();
            }
            aux.setSgte(aux.getSgte().getSgte());
        }       
    }
    
    public void insertarOrdenado(int d){
        
        if(estaVacia())
            insertarAlInicio(d);
        else{
            if(inicio.getDato() >= d)
                insertarAlInicio(d);
            else if (fin.getDato() <= d)
                insertarAlFinal(d);
            else{
                Nodo aux = inicio;
                Nodo nuevo = new Nodo(d);

                while(aux.getSgte() != fin){
                    if(aux.getDato() < d && aux.getSgte().getDato() > d){
                        nuevo.setSgte(aux.getSgte());
                        aux.setSgte(nuevo);
                        break;
                    }
                    aux = aux.getSgte();
                }
            }
        }
            
    }
    
    public void moverMayor(){
        
        int aux = 0;
        Nodo ax = inicio;
        
        while(ax.getSgte() != null){
            if(ax.getDato() > aux)
                aux = ax.getDato();
            ax = ax.getSgte();
        }
        eliminarDato(aux);
        insertarAlFinal(aux);
    }
    
    public void invertir(){
        
        int []a = new int[10];
        int i = 0;
        Nodo apun = inicio;
        Nodo aux = fin;
              
        while(apun != null){
            a[i] = apun.getDato();
            aux = apun.getSgte();
            apun = null;
            apun = aux;
            i++;
        }
        inicio = null;
        fin = null;
        for(int j = i-1; j >= 0; j--)
            insertarAlFinal(a[j]);
    }
    
   
    public String mostrar(){
        
        String st = "";
        Nodo aux = inicio;
        
        while(aux != null){
            st += String.valueOf(aux.getDato());
            st += " ";
            aux = aux.getSgte();
        }
        
        return st;
    }
}