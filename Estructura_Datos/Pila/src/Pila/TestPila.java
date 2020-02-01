package Pila;

/*
Elaboró:
Ramos López Lizbeth
Vargas Arenas Pedro
*/
import Pila.Pila;
import java.util.*;
import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TestPila {
    
    public static void main(String []args)throws NumeroException{
        int opcion = 0; 
        char valor, aux;
        Pila pila = new Pila();
        Scanner in = new Scanner(System.in);
        
        while(opcion != 5){
            
                System.out.println("\t\t-- Menú --");
                System.out.println("\t1.- Apilar Elemento.\n\t2.- Desapilar Elemento.\n\t3.- Mostrar Elemento del Tope.");
                System.out.print("\t4.- Mostrar Pila.\n\t5.- Salir.\n\t---> ");
                opcion = in.nextInt();
                 
            switch(opcion){
                
                case 1:
                    System.out.println("Ingrese el valor: ");
                    try{  
                        valor = in.next().charAt(0); 
                        if(valor < 0)
                            throw new NumeroException(); 
                        else
                            pila.push(valor);
                    }catch(NumeroException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case 2:
                    try {
                        aux = pila.pop();
                        System.out.println("El elemento " +aux+" fue eliminado exitosamente");
                    } catch (ArrayException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                
                case 3:
                    aux = pila.peek();
                    if(aux!=-1)                        
                        System.out.println("El elemento tope es: " + aux);
                    break;
                
                case 4:
                    pila.mostrar();
                    break;
                
                case 5:
                    break;
                
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
