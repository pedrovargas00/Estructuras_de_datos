import java.util.*;

public class TestAnalizador {
    
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        Analizador analizador = new Analizador();
        String cadena;
        
        System.out.println("--------");
        cadena = in.nextLine();
        
        analizador.analizarSimbolos(cadena.toCharArray());
        
    }
}
