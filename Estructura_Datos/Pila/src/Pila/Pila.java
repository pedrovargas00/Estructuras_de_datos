package Pila;

/*
Elaboró:
Ramos López Lizbeth
Vargas Arenas Pedro
*/
import java.util.InputMismatchException;


public class Pila{
    
    char datos[]; 
    int maximo;
    int  tope = -1;
    
    public Pila(){
        
        this.datos = new char[10];
        this.maximo = 10;
    }
    
    public Pila(int tam){
        
        this.datos= new char[tam];
        this.maximo = tam;
    }
    
    public boolean estaVacia(){
        
        if (tope == -1)
            return true;
        else
            return false;
    }
    
    public boolean estaLlena(){
        
        if (tope == (maximo-1))         
            return true;
        else
            return false;
    }
    
    public boolean push(char elemento){
            
        if (estaLlena()){
            System.out.println("la memoria está llena");
            return false;
        }else{
            datos[++tope] = elemento;
            System.out.println("Elemento agregado");
            return true;
        }
    }
    
    public char pop()throws ArrayException{
        
        char aux;
        //System.out.println("tope pop: "+ tope);
        if (estaVacia()){
            throw new ArrayException("El Arreglo está vacío");
        }else{
            aux = datos[tope];
            datos[tope] = 0;
            //System.out.println("TOPE: "+ tope);
            tope--;
            return aux;
        }
    }
    
    public char peek(){
        
        char aux;
        
        if (estaVacia()){
            System.out.println("Arreglo vacío");
            return 0;
        }else{
            aux = datos[tope];
            //System.out.println("-----" + tope);
            return aux;
        }        
    }
    
    public void mostrar(){
        
        System.out.println("\n");
        if (estaVacia())
            System.out.println("El arreglo está vacío");
        else{
            System.out.println("tope -->"+(tope)+"\t"+datos[tope]);
            for(int i = (tope-1); i >= 0; i--)
                System.out.println( "\t"+i + "\t" + datos[i]);
        }    
    }
}