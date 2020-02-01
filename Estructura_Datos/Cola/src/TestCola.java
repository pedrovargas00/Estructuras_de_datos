/*Realizado:
    Vargas Arenas Pedro
    García Cruz Ricardo Emmanuel 

    El código que se usó para hacer las pruebas está comentado, se hizo
    un menú para mayor comodidad y se creó el método para la busqueda
    y sustitución de un elemento,
*/

import java.util.*;

public class TestCola {
    
    public static void busqueda(int elemento, int auxiliar, Cola cola){
        
        int aux = cola.getFondo();
        int aux1 = cola.getFrente();
        
        while(cola.espiar() != auxiliar){
            cola.setFrente((cola.getFrente()+1)%cola.getNumElementos());
            if(cola.getFrente() == ((cola.getFondo()+1)%cola.getNumElementos())){
                System.out.println("Elemento no existe");
                return;
            }
        }
        cola.desencolar();
        cola.setFondo(cola.getFrente()-2);
        cola.encolar(elemento);
        cola.setFondo(aux);
        cola.setFrente(aux1);
        cola.mostrar();
    }
    
    public static void main(String []args){
        
        Cola cola = new Cola(6);
        Scanner in = new Scanner(System.in);
        int elemento = 2, auxiliar, aux, aux1, opcion = -1;
        
        while (opcion != 0){
            System.out.print("\nMENÚ\n\t1.- Encolar elemento.\n\t2.- Desencolar elemento.\n\t3.- Ver primer elemento"
            +"\n\t4.- Mostrar cola.\n\t5.- Buscar elemento.\n\t0.- Salir.\n---> ");
            opcion = in.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Ingrese el elemento a agregar: ");
                    auxiliar = in.nextInt();
                    cola.encolar(auxiliar);
                    break;
                case 2:
                    System.out.println("Elemento desencolado: " + cola.espiar());
                    cola.desencolar();
                    break;
                case 3:
                    System.out.println("Elemento: " + cola.espiar());
                    break;
                case 4:
                    cola.mostrar();
                    break;
                case 5:
                    System.out.println("Ingrese el elemento a sustituir: ");
                    aux = in.nextInt();
                    System.out.println("Ingrese el elemento para agregar: ");
                    aux1 = in.nextInt();
                    busqueda(aux1, aux, cola);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        
        //A.
        /*while(elemento <= 12){
            cola.encolar(elemento);
            elemento += 2;
        }
        
        //B.
        cola.mostrar();
        
        //C.
        System.out.println("\nEl valor en la cola es: " + cola.espiar());
        
        //D.
        for(int i = 0; i < 6; i++){
            System.out.println("\nDesencolar " + cola.espiar() + "\n");
            cola.desencolar();
        }
        
        System.out.println("\n-----\n");
    
        //E.
        elemento = 2;
        while(elemento <= 10){
            cola.encolar(elemento);
            elemento += 2;
        }
        
        //F.
        cola.mostrar();
        
        //G
        elemento = 1;
        auxiliar = 2;
        aux = cola.getFondo();
        aux1 = cola.getFrente();
        while(cola.espiar() != auxiliar){
            cola.setFrente((cola.getFrente()+1)%cola.getNumElementos());
            if(cola.getFrente() == ((cola.getFondo()+1)%cola.getNumElementos())){
                System.out.println("Elemento no existe");
                break;
            }
        }
        cola.desencolar();
        cola.setFondo(cola.getFrente()-2);
        cola.encolar(elemento);
        cola.setFondo(aux);
        cola.setFrente(aux1);
        cola.mostrar();

        //H
        System.out.println("\n--------");
        elemento = 5;
        auxiliar = 10;
        aux = cola.getFondo();
        aux1 = cola.getFrente();
        while(cola.espiar() != auxiliar){
            cola.setFrente((cola.getFrente()+1)%cola.getNumElementos());
            if(cola.getFrente() == ((cola.getFondo()+1)%cola.getNumElementos())){
                System.out.println("Elemento no existe");
                break;
            }
        }
        cola.desencolar();
        cola.setFondo(cola.getFrente()-2);
        cola.encolar(elemento);
        cola.setFondo(aux);
        cola.setFrente(aux1);
        cola.mostrar();
        
        //I
        System.out.println("\n----------");
        elemento = 3;
        auxiliar = 6;
        aux = cola.getFondo();
        aux1 = cola.getFrente();
        while(cola.espiar() != auxiliar){
            cola.setFrente((cola.getFrente()+1)%cola.getNumElementos());
            if(cola.getFrente() == ((cola.getFondo()+1)%cola.getNumElementos())){
                System.out.println("Elemento no existe");
                break;
            }
        }
        cola.desencolar();
        cola.setFondo(cola.getFrente()-2);
        cola.encolar(elemento);
        cola.setFondo(aux);
        cola.setFrente(aux1);
        cola.mostrar();*/
    }
}
