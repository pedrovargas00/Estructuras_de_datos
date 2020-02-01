import java.util.*;

public class Practica_1{
    
    public static void main (String [] args){
        
        Scanner in = new Scanner(System.in);
        Ecuacion con = new Ecuacion();
        String tipo = "", tipo1;
        double dato = 0;
        
           System.out.println("Ingrese el tipo de dato y el dato respectivamente a convertir: ");
        try{
            tipo = in.nextLine();
            dato = in.nextDouble();
        }
        catch(NumberFormatException e){
            e.getStackTrace();
        }
        con.setTipoDato(tipo);
        con.setDatoEntrada(dato);
        tipo1 = tipo.toLowerCase();
        
        switch(tipo1){
            case "byte":
                con.bytes();
                break;
            case "kilobyte":
                con.Kilobyte();
                break;
            case "megabyte":
                con.Megabyte();
                break;
            case "gigabyte":
                con.Gigabyte();
                break;
            case "terabyte":
                con.Terabyte();
                break;
            default:
                System.out.println("Dato incorrecto");
                break;
        }
    }
    
}
