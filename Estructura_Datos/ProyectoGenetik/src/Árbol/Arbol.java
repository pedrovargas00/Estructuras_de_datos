
package Árbol;

import Controlador.*;
import Interfaces.PersonaUI;
import java.util.ArrayList;
import java.util.LinkedList;

public class Arbol {
    
    private Persona raiz;
    private ArrayList<Persona> nodos;
    private Controlador controlador;
    private Persona aux;
    private  ArrayList<PersonaUI> semaforoRojo,semaforoAmarillo,semaforoVerde;
    public Arbol(){
        semaforoRojo = new ArrayList();
        semaforoAmarillo = new ArrayList();
        semaforoVerde = new ArrayList();
        nodos = new ArrayList();
}
    
    
    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    
    public Persona getPersona(String nombre){
        for(Persona p: nodos){
            if(nombre.equalsIgnoreCase(p.getNombre()))
                return p;
        }
        return null;
    }
    
    public Persona getRaiz(){
        return raiz;
    }
    
    public void mostrar(){
        for(Persona n: nodos){
            System.out.println("N: " + n.getDatos().getNombre());
            
        }
    }
     private boolean esVacio(){
        return raiz==null;
    }
     public Persona CrearPersona(){
        Persona miPersona=new Persona();
        return miPersona;
    }
       public void insertar(String per ){
        raiz =new Persona();
        raiz.setNombre(per);
        nodos.add(raiz);
        controlador.mostrarDatosUI(raiz);
    }
    public void insertarD(String hijo, String padre){
        Persona nuevo = new Persona();
        nuevo.setNombre(padre);
        if(!esVacio()){
            buscar(hijo, raiz);
             aux.setPadre(nuevo);
        } else 
            System.out.println("No se ha creado la raiz");
        nodos.add(nuevo);
         controlador.mostrarDatosUI(nuevo);
         System.out.println("Se inserto a la Derecha");
    }
    
    public void insertarI(String hijo, String madre){
        Persona nuevo = new Persona();
        nuevo.setNombre(madre);
        if(!esVacio()){
            buscar(hijo, raiz);
            aux.setMadre(nuevo);
             System.out.println("Madre"+madre);
        } else System.out.println("No se ha creado la raiz");
         nodos.add(nuevo);
         controlador.mostrarDatosUI(nuevo);
        System.out.println("Se inserto a la izquierda");
    }
 public Persona buscar(){
     return aux;
 }
    public void buscar(String padre, Persona n){
        if(n ==null)
            return;
        
        if(n.getNombre().equals(padre))
            aux = n;
        buscar(padre,n.getMadre());
        buscar(padre,n.getPadre());
     }
    
    public Persona insertar(String padre, String dato, Persona inicio){
 
        if(padre.equalsIgnoreCase(inicio.getDatos().getNombre())){
            if(inicio.getMadre() != null && !inicio.getMadre().getVisitado())
                insertar(padre, dato, inicio.getMadre());
            if(inicio.getPadre() != null && !inicio.getPadre().getVisitado())
                insertar(padre, dato, inicio.getPadre());
        }else{
            Persona nuevo = new Persona();
            nuevo.getDatos().setNombre(dato);
            if(inicio.getMadre() == null){
                inicio.setMadre(nuevo);
                nodos.add(nuevo);
            }else{
                inicio.setPadre(nuevo);
                nodos.add(nuevo);
            }   
        }
        return null;
    }
    public int altura(Persona n) //method that will return height of tree
    {
            if(n == null)   //if empty height 0
            {
                    return 0;
            }

            else   
            {
                    return 1 +(Math.max(altura(n.getMadre()),altura(n.getPadre())));   //NO ENTIENDO ESTA PARTE, PORQUE EL MATH ???
            }
    }

    public ArrayList<PersonaUI> getSemaforoRojo() {
        return semaforoRojo;
    }

    public ArrayList<PersonaUI> getSemaforoAmarillo() {
        return semaforoAmarillo;
    }

    public ArrayList<PersonaUI> getSemaforoVerde() {
        return semaforoVerde;
    }
    
      public void  calcularSemaforo(){
          for(Persona p: nodos)
          {
              PersonaUI pUI=controlador.getPersonaUI(p.getNombre());
              System.out.println("persona"+p.getNombre()+"personaUI"+pUI.getNombre());

              if(p.getDatos().getPorcCancerMP()<30 && p.getDatos().getPorcDefectosTN()<30 && p.getDatos().getPorcDiabetes()<30 && p.getDatos().getPorcEsquizofrenia()<30&&p.getDatos().getPorcHemofilia()<30&&p.getDatos().getPorcHipertension()<30&&p.getDatos().getPorcLabioL()<30&&p.getDatos().getPorcObesidad()<30)
                  semaforoVerde.add(pUI);
               if(p.getDatos().getPorcCancerMP()>60 || p.getDatos().getPorcDefectosTN()>60 || p.getDatos().getPorcDiabetes()>60 || p.getDatos().getPorcEsquizofrenia()>60||p.getDatos().getPorcHemofilia()>60||p.getDatos().getPorcHipertension()>60||p.getDatos().getPorcLabioL()>60||p.getDatos().getPorcObesidad()>60)
                  semaforoRojo.add(pUI);
            //   if((p.getDatos().getPorcCancerMP()<30 && p.getDatos().getPorcDefectosTN()<30 && p.getDatos().getPorcDiabetes()<30 && p.getDatos().getPorcEsquizofrenia()<30&&p.getDatos().getPorcHemofilia()<30&&p.getDatos().getPorcHipertension()<30&&p.getDatos().getPorcLabioL()<30&&p.getDatos().getPorcObesidad()<30)
              
                //   semaforoAmarillo.add(pUI);
              
          }
       
    }
    public ArrayList preOrden(ArrayList<String> a, Persona n){
        
        if(!a.contains(n.getDatos().getNombre()))
            a.add(n.getDatos().getNombre());
        if(n.getMadre() != null)
            preOrden(a, n.getMadre());
        if(n.getPadre() != null)
            preOrden(a, n.getPadre());
        return a;
    }
    
    public ArrayList inOrden(ArrayList<String> a, Persona n){
        
        if(n.getMadre() != null)
            inOrden(a, n.getMadre());
        if(!a.contains(n.getDatos().getNombre()))
            a.add(n.getDatos().getNombre());
        if(n.getPadre() != null)
            inOrden(a, n.getPadre());
        
        return a;
    }
    
    public void postOrden( Persona n){
       
        System.out.println("Entra: " + n.getDatos().getSexo());
        if(n.getMadre() != null)
            postOrden(n.getMadre());
        if(n.getPadre() != null)
            postOrden( n.getPadre());
        System.out.println("sigue"+n.getDatos().getPeso());
        n.calcularPorcentaje();
      

    }
    
    public ArrayList niveles(Persona nodo){
    
        Persona aux;
        LinkedList<Persona> cola = new LinkedList();
        ArrayList<Persona> r = new ArrayList();
        
        if(nodo != null){
            cola.add(nodo);
            while(!cola.isEmpty()){
                aux = cola.remove();
                r.add(aux);
                if(aux.getMadre() != null)
                    cola.add(aux.getMadre());
                if(aux.getPadre() != null)
                    cola.add(aux.getPadre());
            }
        }
        return r;
    }
}