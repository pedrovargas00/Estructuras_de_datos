/*
Estructuras de datos
García Cruz Ricardo Emmanuel 
Vargas Arenas Pedro
*/
public class Operadores {
    
    public Operadores(){}
    
    public int prioridad(String c){
        
        switch(c){
            case "+": // +
                return 1;
            case "-": // -
                return 1;
            case "*":
                return 2;
            case "/":
                return 2;
            default:
                return 0;
        }
    }
    
    public static int operar(String op, String n2, String n1) {
    int num1 = Integer.parseInt(n1);
    int num2 = Integer.parseInt(n2);
    
    switch(op){
        case "+":
            return (num1 + num2);
        case "-":
            return (num1 - num2);
        case "/":
            return (num1 / num2);
        case "*":
            return (num1 * num2);
        default : 
            return 0;
    }
  }
    
}
