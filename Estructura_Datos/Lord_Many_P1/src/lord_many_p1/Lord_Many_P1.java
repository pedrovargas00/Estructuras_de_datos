package lord_many_p1;
import java.util.*;

public class Lord_Many_P1 {

    /*int arr[] = new int[10];
    int arr1[][] = new int[10][10];
    arr.length();
    Hacer arreglo de objetos
    Modificar métodos
    Cambiar color de texto de salida
    String black="\033[30m"; 
    String red="\033[31m"; 
    String green="\033[32m"; 
    String yellow="\033[33m"; 
    String blue="\033[34m"; 
    String purple="\033[35m"; 
    String cyan="\033[36m"; 
    String white="\033[37m";
    String reset="\u001B[0m";
    Aparte Generar colores en un rango rojo de 1-10 (RGB, hexadecimal)*/
    
    public static void main(String[] args) {

        float res;
        int n, m, rep = 1;
        
        
        Frectángulo r1 = new Frectángulo();
        FCubo r2 = new FCubo();
        FCírculo r3 = new FCírculo();
        Scanner in = new Scanner(System.in);
        
        do{
            System.out.println("\033[32m Seleccione la figura:\n[1] Rectángulo.\n[2] Cubo.\n[3] Círculo.");
            n = in.nextInt();
            switch(n){
                //Rectángulo.
                case 1: 
                    r1.ingreC();
                    do{
                        System.out.println("\nSeleccione la acción:\n[1] Calcular área.");
                        System.out.println("[2] Calcular perímetro.\n[3] Mostrar medidas.");
                        m = in.nextInt();
                        switch(m){
                             //Cálculos.
                             case 1: 
                                  res = r1.calArea(r1.getAncho(), r1.getLargo());
                                  System.out.println("El área es: "+ res);
                                  break;
                             case 2: 
                                  res = r1.calPerimetro(r1.getAncho(), r1.getLargo());
                                  System.out.println("El perímetro es: "+ res);
                                  break;
                             case 3: 
                                  r1.imprimirDatos(r1.getAncho(), r1.getLargo());
                                  break;
                          }
                          System.out.println("Si desea elegir otra operación, presione 1, en caso contrario, presione 0: ");
                          rep = in.nextInt();
                    }
                    while(rep == 1);
                        break;
                //Cubo.
                case 2: 
                    r2.ingreC();
                    do{
                        System.out.println("\nSeleccione la acción:\n[1] Calcular área lateral.");
                        System.out.println("[2] Calcular volumen.\n[3] Mostrar medidas");
                        m = in.nextInt();
                        switch(m){
                            case 1: 
                                res = r2.calArea(r2.getLargo());
                                System.out.println("El área es: "+ res);
                                break;
                            case 2: 
                                 res = r2.calPerimetro(r2.getLargo());
                                 System.out.println("El volumen es: "+ res);
                                 break;
                            case 3: 
                                 r2.imprimirDatos(r2.getLargo());
                                 break;
                        }
                        System.out.println("Si desea elegir otra operación, presione 1, en caso contrario, presione 0: ");
                        rep = in.nextInt();
                     }
                     while (rep == 1);
                        break;
                //Círculo.
                case 3: 
                    r3.ingreC();
                    do{
                        System.out.println("\nSeleccione la acción:\n[1] Calcular área.");
                        System.out.println("[2] Calcular perímetro.\n[3] Mostrar medidas.");
                        m = in.nextInt();
                        switch(m){
                            case 1: 
                                res = r3.calAreaCirculo(r3.getRadio());
                                System.out.println("El área es: "+ res);
                                break;
                            case 2: 
                                res = r3.calPerimetroCirculo(r3.getRadio());
                                System.out.println("El perímetro es: "+ res);
                                break;
                            case 3: 
                                r3.imprimirDatosCirculo(r3.getRadio());
                                break;
                        }
                        System.out.println("Si desea elegir otra figura, presione 1, en caso contrario, presione 0: ");
                        rep = in.nextInt();
                    }
                    while (rep == 1);
                        break;
            }
        System.out.println("Si desea elegir otra figura, presione 1, en caso contrario, presione 0: ");
        rep = in.nextInt();
        }
        while(rep == 1);
    }
}