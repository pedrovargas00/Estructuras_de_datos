import java.io.IOException;
import java.util.*;

public class TestArbolBD {
    
    public static void main(String []args) throws IOException{
        
        //Arbol a = new Arbol("A");
        int i = 0;
        Arbol a1 = new Arbol(8);
        
  /*      a.insertar("A", "B", a.getRaiz());
        a.insertar("A", "C", a.getRaiz());
        a.insertar("B", "E", a.getRaiz());
        a.insertar("B", "F", a.getRaiz());
        a.insertar("C", "G", a.getRaiz());
        a.insertar("C", "H", a.getRaiz());
        a.insertar("E", "J", a.getRaiz());
        a.insertar("F", "K", a.getRaiz());
        a.insertar("F", "L", a.getRaiz());
        a.insertar("H", "N", a.getRaiz());
        a.insertar("H", "Ñ", a.getRaiz());
        a.insertar("J", "R", a.getRaiz());
        a.insertar("J", "S", a.getRaiz());
        a.insertar("L", "O", a.getRaiz());
        a.insertar("Ñ", "P", a.getRaiz());
        a.insertar("Ñ", "Q", a.getRaiz());*/
  
        //System.out.println("Recorrido preOrden: " + a.preOrden(new ArrayList(), a.getRaiz()));
        //System.out.println("Recorrido inOrden: " + a.inOrden(new ArrayList(), a.getRaiz()));
        //System.out.println("Recorrido postOrden: " + a.postOrden(new ArrayList(), a.getRaiz()));
        //System.out.println("Recorrido niveles: " + a.niveles(a.getRaiz(), new ArrayList(), new LinkedList()));
        
        a1.insertar(8, 3, a1.getRaiz());
        a1.insertar(8, 10, a1.getRaiz());
        a1.insertar(3, 1, a1.getRaiz());
        a1.insertar(3, 6, a1.getRaiz());
        a1.insertar(10, 14, a1.getRaiz());
        a1.insertar(6, 4, a1.getRaiz());
        a1.insertar(6, 7, a1.getRaiz());
        a1.insertar(14, 13, a1.getRaiz());
        
        System.out.println("\n");
        //System.out.println("Recorrido preOrden: " + a1.preOrden(new ArrayList(), a1.getRaiz()));
        //System.out.println("Recorrido inOrden: " + a1.inOrden(new ArrayList(), a1.getRaiz()));
        //System.out.println("Recorrido postOrden: " + a1.postOrden(new ArrayList(), a1.getRaiz()));
        //a1.mostrar();
        //System.out.println("Recorrido niveles: " + a1.niveles(a1.getRaiz()));
        //System.out.println("Disco: " + Archivo.explorarDisco());
        Archivo.escribirArchivo("Datos "+String.valueOf(i)+".txt", a1);
        i++;
        Archivo.leerArchivo("Datos 0.txt", a1);
    }
}
