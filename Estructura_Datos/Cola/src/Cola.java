/*Realizado:
    Vargas Arenas Pedro
    García Cruz Ricardo Emmanuel 
*/

public class Cola {
    
    private int cola[], maximo, frente, fondo, numElementos;
    
    public Cola(int tam){
        cola = new int[tam];
        maximo = tam;
        frente = 0; 
        fondo = -1;
        numElementos = 0;
    }
    
    public int getNumElementos(){
        return numElementos;
    }
    
    public int getFrente(){
        return frente;
    }
    
    public void setFrente(int frente){
        this.frente = frente;
    }
    
    public int getFondo(){
        return fondo;
    }
    
    public void setFondo(int fondo){
        this.fondo = fondo;
    }
    
    public boolean estaVacia(){
        
        if(numElementos == 0){
            frente = -1;
            return true;
        }else
            return false;
    }
    
    public boolean estaLlena(){
        
        if(numElementos == maximo)
            return true;
        else
            return false;
    }
    
    public void encolar(int dato){
        
        if(estaLlena()){
            System.out.println("La cola está llena");
            return;
        }else{
            fondo = (fondo+1) % maximo;
            cola[fondo] = dato;
            System.out.println("Fondo: " + fondo + " Encolado: " + cola[fondo]);
            numElementos++;
            //System.out.println("Fondo: " + fondo);
        }
    }
    
    public void desencolar(){
        
        if(estaVacia()){
            System.out.println("La cola está vacía");
            return;
        } else{
            System.out.println("Frente: " + frente + " Desencolado: " + cola[frente]);
            cola[frente] = 0;
            frente = (frente+1) % maximo;
            numElementos--;
            //System.out.println("numElementos: " + numElementos);
        }
    }
    
    public int espiar(){
        
        if(estaVacia()){
            System.out.println("La cola está vacía");
            return 0;
        } else{
            if(frente == -1){
                frente += 1;
                return cola[frente];
            }
            return cola[frente];
        }
    }
    
    public void mostrar(){
        
        System.out.println("\n");
        if(frente == -1){
            for(int i = frente+1; i < numElementos; i++)
                System.out.println("Valor: " + cola[i]);
        } else{
            //System.out.println("Entro a mostrar sin -1  " + frente + " Elementos " + numElementos);
            for(int i = frente; i < numElementos; i++)
                System.out.println("Valor: " + cola[i]);
        }
    }
    
        
}