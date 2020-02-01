import Pila.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Analizador {
    
    Pila miPila;
    
    public Analizador(){
        
        miPila = new Pila();
    }
    
    //Excepcion de cadena vacia
    public boolean analizarSimbolos(char cad[]){
        
        boolean b;
        
        System.out.println("Analizar");
        for(int i = 0; i < cad.length; i++){
            System.out.println(cad[i] + "i: " + i);
            if (esSimApertura(cad[i])){
                miPila.push(cad[i]);
                System.out.println("Entro push");
            }
            if (esSimTerminacion(cad[i])){
                System.out.println("if terminacion");
                if (!miPila.estaVacia())
                    try {
                        b = estanEmparejados(miPila.pop(), cad[i]);
                } catch (ArrayException ex) {
                    Logger.getLogger(Analizador.class.getName()).log(Level.SEVERE, null, ex);
                }
                else
                    b = false;
            }else
                b = false;
         }
        return true;
    }
    
    public boolean esSimApertura(char simbolo){
        
        System.out.println("Apertura");
        if (simbolo == '(' || simbolo == '{' || simbolo == '[' || simbolo == '<' || simbolo == '"')
            return true;
        else
            return false;
    }

    public boolean esSimTerminacion(char simbolo){
        
        System.out.println("Terminación");
        if (simbolo == ')' || simbolo == '}' || simbolo == ']' || simbolo == '>' || simbolo == '"')
            return true;
        else
            return false;
    }

    public boolean estanEmparejados(char sa, char st){
       
        System.out.println("Emparejar");
        if (st == sa+2 || st == sa+1){
            System.out.println(sa + "---->" + st);
            return true;
        }else
            return false;
    }
}
