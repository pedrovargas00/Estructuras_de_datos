import java.util.*;

public class AbbTest {
    
    public static void main(String[] args){
        
        Abb arbol = new Abb(7);

        try {
            //arbol.insertar(7);
            arbol.insertar(5, arbol.getRaiz());
            arbol.insertar(2, arbol.getRaiz());
            arbol.insertar(14, arbol.getRaiz());
            arbol.insertar(12, arbol.getRaiz());
            arbol.insertar(9, arbol.getRaiz());
            arbol.insertar(4, arbol.getRaiz());
            System.out.println("Datos del arbol InOrden:");
            System.out.println(arbol.inOrden(new ArrayList(), arbol.getRaiz()));
            System.out.println("Datos del arbol PreOrden");
            System.out.println(arbol.preOrden(new ArrayList(), arbol.getRaiz()));
            System.out.println("Datos del arbol PosOrden");
            System.out.println(arbol.postOrden(new ArrayList(), arbol.getRaiz()));
            System.out.println("La altura del árbol es:");
            System.out.println(arbol.altura());
            System.out.println("La profundidad de 4 es:");
            System.out.println(arbol.profundidad(4));
            System.out.println("La profundidad de 12 es:");
            System.out.println(arbol.profundidad(12));
            System.out.println("La profundidad de 9 es:");
            System.out.println(arbol.profundidad(9));
            System.out.println("Numero de nodos del arbol:");
            System.out.println(arbol.numNodos());
            System.out.println("Numero de hojas del arbol:");
            System.out.println(arbol.numHojas());
            System.out.println("Numero de nodos internos delarbol:");
            System.out.println(arbol.numInternos(new ArrayList(), arbol.getRaiz()).size());
            if(arbol.esCompleto()){
                System.out.println("El arbol es completo");
            } else{
                System.out.println("El arbol no es completo");
            }
           // arbol.eliminar(10);
           // arbol.mostrar();
        }catch(ClaveDuplicadaException e){
            System.out.println(e.getMessage());
        }/*
        catch(ClaveNoEncontradaException e){
            System.out.println(e.getMessage());
        }*/
            
        
    }
}

