/*
Estructuras de datos
García Cruz Ricardo Emmanuel 
Vargas Arenas Pedro
*/
public class Pila{
    
    String datos[]; 
    int maximo, tope = -1;
    
    public Pila(){
        
        this.datos = new String[50];
        this.maximo = 10;
    }
    
    public Pila(int tam){
        
        this.datos= new String[tam];
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
    
    public boolean push(String elemento){
            
        if (estaLlena()){
            System.out.println("la memoria está llena");
            return false;
        }else{
            datos[++tope] = elemento;
            return true;
        }
    }
    
    public String pop(){
        
        String aux;
        
        if (estaVacia()){
            System.out.println("La pila esta vacía");
            return "";
        }else{
            aux = datos[tope];
            datos[tope] = "";
            tope--;
            return aux;
        }
    }
    
    public String peek(){
        
        if (estaVacia()){
            System.out.println("Arreglo vacío");
            return " ";
        }else
            return datos[tope];      
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