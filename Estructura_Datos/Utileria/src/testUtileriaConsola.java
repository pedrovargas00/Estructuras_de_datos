import java.util.Scanner;

public class testUtileriaConsola {
    
    public static void main(String [] args){
        int opc, n,m;
        int arr[] = new int[5];
        Scanner in = new Scanner(System.in);
        
        do {
            System.out.println("Selecciona una opcion: ");
            System.out.println("1. Factorial(n) ");
            System.out.println("2. Suma de los primeros N numeros ");
            System.out.println("3. MCD(n,m)");
            System.out.println("4. Obtener maximo del arreglo ");
            System.out.println("5. Exponente");
            System.out.println("6. Resta de dos números");
            System.out.println("7. Dividir mediante resta");
            System.out.println("8. Obtener mínimo de un arreglo");
            System.out.println("9. Obtener posición de un elemento");
            System.out.println("10. Sumatoria recursiva");
            System.out.println("0. Salir ");
            System.out.print("Opcion: ");         
            opc = in.nextInt();
            switch(opc){
                case 1: 
                    System.out.println("Ingresa valor de n ");
                    n = in.nextInt();
                    System.out.println("Fact(n) = "+Utileria.fact(n) +"\n");
                    break;
                case 2: 
                    System.out.println("Ingresa valor de n ");
                    n = in.nextInt();
                    System.out.println("Suma(n) = "+Utileria.suma(n) +"\n");
                    break;
                case 3: 
                    System.out.println("Ingresa valores de n y m");
                    n = in.nextInt();
                    m = in.nextInt();
                    System.out.println("MCD(n,m) = "+ Utileria.MCD(m, n) +"\n");
                    break;
                case 4:
                    System.out.println("Ingrese el arreglo de 5 elementos: ");
                    for (int i = 0; i < 5; i++){
                        n = in.nextInt();
                        arr[i] = n;
                    }
                    System.out.println("El elemento maximo es: "+ Utileria.maximo(arr, 0));
                    break;
                case 5:
                    System.out.println("Ingrese la base y la potencia: ");
                    n = in.nextInt();
                    m = in.nextInt();
                    System.out.println("Exponente: "+ Utileria.exponente(n, m)+ "\n");
                    break;
                case 6:
                    System.out.println("Ingrese los numeros a restar: ");
                    n = in.nextInt();
                    m = in.nextInt();
                    System.out.println("La resta es: "+ Utileria.resta(n, m) +"\n");
                    break;
                case 7:
                    System.out.println("Ingrese los numeros a dividir: ");
                    n = in.nextInt();
                    m = in.nextInt();
                    System.out.println("La resta es: "+ Utileria.division(n, m, 0) + "\n");
                    break;
                case 8:
                    System.out.println("Ingrese el arreglo de 5 elementos: ");
                    for (int i = 0; i < 5; i++){
                        n = in.nextInt();
                        arr[i] = n;
                    }
                    System.out.println("El elemento minimo es: "+ Utileria.minimo(arr, 0) +"\n");
                    break;
                case 9:
                    System.out.println("Ingrese el arreglo de 5 elementos: ");
                    for (int i = 0; i < 5; i++){
                        n = in.nextInt();
                        arr[i] = n;
                    }
                    System.out.println("Ingrese el elemento a buscar: ");
                    n = in.nextInt();
                    System.out.println("La posicion del elemento es: "+ Utileria.posicion(arr, n, 0) +"\n");
                    break;
                case 10:
                    System.out.println("Sumatoria de un número con potencia entre n");
                    System.out.println("Ingrese el número: ");
                    n = in.nextInt();
                    System.out.println("Ingrese las veces que se hará la sumatoria: ");
                    m = in.nextInt();
                    System.out.println("Sumatoria: "+ Utileria.sumatoria(m, n, 0) +"/"+ m +"\n");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion no valida\n");
                    break;
            }
        } while(opc != 0);
        
    }
}