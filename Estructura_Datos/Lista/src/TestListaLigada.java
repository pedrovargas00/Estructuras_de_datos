/*
Elaboró:
Ramos López Lizbeth
Vargas Arenas Pedro
*/
import java.util.*;
public class TestListaLigada {
    
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        ListaLigada ll = new ListaLigada();
        int opcion = -1, dato = 0;
        
        do{
            System.out.print("MENÚ\n\t1.- Insertar al inicio.\n\t2.- Insertar al final.\n\t3.- Eliminar al inicio."
                    + "\n\t4.- Eliminar al final.\n\t5.- Eliminar dato.\n\t6.- Ordenar.\n\t7.- Mover mayor.\n\t8.- Invertir."
                    + "\n\t9.- Mostrar.\n\t0.- Salir.\n---> ");
            opcion = in.nextInt();
            switch(opcion){
                case 1: 
                    System.out.println("Ingrese el elemento: ");
                    dato = in.nextInt();
                    ll.insertarAlInicio(dato);
                    System.out.println(ll.mostrar());
                    break;
                case 2:
                    System.out.println("Ingrese el elemento: ");
                    dato = in.nextInt();
                    ll.insertarAlFinal(dato);
                    System.out.println(ll.mostrar());
                    break;
                case 3:
                    ll.eliminarDelInicio();
                    System.out.println(ll.mostrar());
                    break;
                case 4:
                    ll.eliminarAlFinal();
                    System.out.println(ll.mostrar());
                    break;
                case 5:
                    System.out.println("Ingrese el elemento: ");
                    dato = in.nextInt();
                    ll.eliminarDato(dato);
                    System.out.println(ll.mostrar());
                    break;
                case 6:
                    System.out.println("Ingrese el elemento: ");
                    dato = in.nextInt();
                    ll.insertarOrdenado(dato);
                    System.out.println(ll.mostrar());
                    break;
                case 7:
                    ll.moverMayor();
                    System.out.println(ll.mostrar());
                    break;
                case 8:
                    ll.invertir();
                    System.out.println(ll.mostrar());
                    break;
                case 9:
                    System.out.println(ll.mostrar());
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }while(opcion != 0);
        /*System.out.println("Insertando Ordenado");
        for(int i = 0; i < 5; i++){
            dato = (int)(Math.random()*100)+1;
            ll.insertarOrdenado(dato);
            System.out.println(ll.mostrar());
        }
    
        System.out.println("Inviertiendo la lista");
        ll.invertir();
        System.out.println(ll.mostrar());

        System.out.println("Pasando Mayor al final");
        ll.moverMayor();
        System.out.println(ll.mostrar());

        System.out.println("Eliminando último dato");
        ll.eliminarAlFinal ();
        System.out.println(ll.mostrar());
        
        
        System.out.println("Ingrese el dato a eliminar: ");
        dato = in.nextInt();
        System.out.println("Eliminando nodo específico: " + dato);
        ll.eliminarDato(dato);
        System.out.println(ll.mostrar());*/
    }
}
