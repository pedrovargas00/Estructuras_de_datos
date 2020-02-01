package lab1_vargas.arenas.pedro;
import java.util.*;

public class Lab1_VargasArenasPedro {

    public static void main(String[] args) {
       
        double lar, an, x1, x2, x3, y1, y2, y3;
        double x, y, z, p = 2;
        Scanner in = new Scanner(System.in);
        
        //Ingreso de datos.
        System.out.println("Ingrese las primeras coordenadas: ");
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        System.out.println("Ingrese las segundas coordenadas: ");
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        System.out.println("Ingrese las terceras coordenadas: ");
        x3 = in.nextDouble();
        y3 = in.nextDouble();
        
        //Resta de los mismos.
        x = x1 - y1;
        y = x2 - y2;
        z = x3 - y3;
        
        //Cálculo de distancia y muestra de datos.
        lar = Math.sqrt(Math.pow(y, p) + Math.pow(x, p));
        an = Math.sqrt(Math.pow(y, p) + Math.pow(z, p));
        System.out.println("El largo es: " + lar + "\nEl ancho es: " + an);
    }
}
