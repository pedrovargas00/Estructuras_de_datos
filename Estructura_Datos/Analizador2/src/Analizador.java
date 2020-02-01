/*

*/

public class Analizador {
    
    private Controlador controlador;
    private Pila miPila;
    
    public Analizador(Pila miPila){
        this.miPila = miPila;
    }
    
    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    
    public boolean analizarSimbolos(String cad){
        
        boolean res = false;
        
        if (cad != null){
            res = false;
            for(int i= 0; i< cad.length(); i++){
                
                System.out.println("i--"+i);
                char aux = cad.charAt(i);
        
                if(esSimApertura(aux))
                    miPila.push(aux);
                else if(esSimTerminacion(aux)){
                    if(miPila.estaVacia())
                        return false;
                    else{
                        char x = miPila.pop();
                        System.out.println("el---"+x);
                        res = estanEmparejados(x,aux);
                    }
                }
            }
            if(miPila.estaVacia())
                return res;
            else 
                return false;
        }
        return res;   
    }
    
    public boolean esSimApertura(char s){
        System.out.println(".................... apertura");
        return s == '(' || s == '[' || s == '{' || s == '<';
    }

    private boolean esSimTerminacion(char s) {
        System.out.println("--------------------- cierre");
        return s == ')' || s == ']' || s == '}' || s == '>';
    }

    private boolean estanEmparejados(char x, char aux) {
        System.out.println("x,aux"+x+aux);
        System.out.println("x+1"+(x+1)+(x+2));
        if(aux==x+2||aux==x+1)
            return true;
        return false;
    }
}
