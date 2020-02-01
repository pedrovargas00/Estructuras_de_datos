import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AbbTest {
    
    public static void main(String[] args){
        try {
            //1er. Caso de prueba
            Abb arbol = new Abb(8);
            //arbol.insertar(7);
            arbol.insertar(9, arbol.getRaiz());
            arbol.insertar(3, arbol.getRaiz());
            //arbol.insertar(7, arbol.getRaiz());
            arbol.insertar(13, arbol.getRaiz());
            arbol.insertar(15, arbol.getRaiz());
            arbol.insertar(1, arbol.getRaiz());
            arbol.insertar(4, arbol.getRaiz());
            arbol.insertar(6, arbol.getRaiz());
            arbol.insertar(17, arbol.getRaiz());
            arbol.insertar(5, arbol.getRaiz());
            arbol.insertar(11, arbol.getRaiz());
            arbol.insertar(10, arbol.getRaiz());
            arbol.insertar(18, arbol.getRaiz());
            arbol.insertar(21, arbol.getRaiz());
            arbol.insertar(2, arbol.getRaiz());
            arbol.insertar(12, arbol.getRaiz());
            arbol.insertar(19, arbol.getRaiz());
            arbol.insertar(14, arbol.getRaiz());
            arbol.insertar(20, arbol.getRaiz());
            arbol.insertar(16, arbol.getRaiz());
            System.out.println("Datos del arbol InOrden:");
            System.out.println(arbol.inOrden(new ArrayList(), arbol.getRaiz()));
            System.out.println("Datos del arbol PreOrden");
            System.out.println(arbol.preOrden(new ArrayList(), arbol.getRaiz()));
            System.out.println("Datos del arbol PosOrden");
            System.out.println(arbol.postOrden(new ArrayList(), arbol.getRaiz()));
            System.out.println("Funcion --> " + arbol.funcion(arbol.getRaiz()));
        } catch (ClaveDuplicadaException ex) {
                System.out.println(ex.getMessage());
        }
            //2do. Caso de prueba
        System.out.println("2do. caso de prueba");
        /*try {
            Abb arbol = new Abb(5);
            //arbol.insertar(5);
            arbol.insertar(8, arbol.getRaiz());
            arbol.insertar(2, arbol.getRaiz());
            arbol.insertar(10, arbol.getRaiz());
            arbol.insertar(6, arbol.getRaiz());
            arbol.insertar(3, arbol.getRaiz());
            arbol.insertar(1, arbol.getRaiz());
            arbol.insertar(11, arbol.getRaiz());
            arbol.insertar(9, arbol.getRaiz());
            arbol.insertar(7, arbol.getRaiz());
            arbol.insertar(4, arbol.getRaiz());
            System.out.println("Datos del arbol InOrden:");
            System.out.println(arbol.inOrden(new ArrayList(), arbol.getRaiz()));
            System.out.println("Datos del arbol PreOrden");
            System.out.println(arbol.preOrden(new ArrayList(), arbol.getRaiz()));
            System.out.println("Datos del arbol PosOrden");
            System.out.println(arbol.postOrden(new ArrayList(), arbol.getRaiz()));
            System.out.println("3er. caso de prueba");
        } catch (ClaveDuplicadaException ex) {
            System.out.println(ex.getMessage());
        }
        try{
             Abb arbol = new Abb(20);
            //arbol.insertar(20);
            arbol.insertar(8, arbol.getRaiz());
            arbol.insertar(2, arbol.getRaiz());
            arbol.insertar(10, arbol.getRaiz());
            arbol.insertar(2, arbol.getRaiz());
            arbol.insertar(4, arbol.getRaiz());
            System.out.println("Datos del arbol InOrden:");
            System.out.println(arbol.inOrden(new ArrayList(), arbol.getRaiz()));
            System.out.println("Datos del arbol PreOrden");
            System.out.println(arbol.preOrden(new ArrayList(), arbol.getRaiz()));
            System.out.println("Datos del arbol PosOrden");
            System.out.println(arbol.postOrden(new ArrayList(), arbol.getRaiz()));
        } catch (ClaveDuplicadaException ex) {
            Logger.getLogger(AbbTest.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
}
    

