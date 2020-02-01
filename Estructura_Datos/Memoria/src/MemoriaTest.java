import java.util.*;

public class MemoriaTest {
    
    public static void main(String []args){
    
        int fila, columna, dato, direccion, opcion = 0;
        Scanner in = new Scanner(System.in);
        MemoriaEntero entero = null;
        MemoriaFlotante flotante = null;
        MemoriaCaracter caracter = null;
        
        System.out.println("Ingrese las filas y columnas de la matriz: ");
        fila = in.nextInt();
        columna = in.nextInt();
        System.out.print("Ingrese el valor del tipo de dato\nEntero: 4\nFlotante: 8\nCaracter: 2\n---> ");
        dato = in.nextInt();
        System.out.println("Ingrese la dirección base ");
        System.out.print("El límite es 100\n---> ");
        direccion = in.nextInt();
                
        switch(dato){
            case 4:
                entero = new MemoriaEntero(direccion);
                break;
            case 8:
                flotante = new MemoriaFlotante(direccion);
                break;
            case 2:
                caracter = new MemoriaCaracter(direccion);
                break;
            default:
                break;
        }
        
        while (opcion != 5){
            System.out.println("\nSeleccione una opción");
            System.out.println("\t1.- Ingresar valores.\n\t2.- Eliminar valores.\n\t3.- Mostrar matriz.\n\t4.- Mostrar memoria.");
            System.out.print("\t5.- Salir.\n---> ");
            opcion = in.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Ingrese la fila y columna de la posición donde estará el valor: ");
                    int i = in.nextInt();
                    int j = in.nextInt();
                    if (i <= 0 || i > fila || j <= 0 || j > columna){
                        System.out.println("Índices fuera de rango");
                        opcion = 5;
                        break;
                    } else{
                        if (entero != null){
                            System.out.println("Ingrese el valor a ingresar: ");
                            int valor = in.nextInt();
                            entero.ingresar(valor, i, j, columna, dato, direccion);
                            break;
                        } if (flotante != null){
                            System.out.println("Ingrese el valor a ingresar: ");
                            double valor = in.nextDouble();
                            flotante.ingresar((float)valor, i, j, columna, dato, direccion);
                            break;
                        } if (caracter != null){
                            System.out.println("Ingrese el valor a ingresar: ");
                            char valor = in.next().charAt(0);
                            caracter.ingresar(valor, i, j, columna, dato, direccion);
                            break;
                        }
                    }
                case 2:
                    System.out.println("Ingrese la fila y columna del valor a liminar: ");
                    i = in.nextInt();
                    j = in.nextInt();
                    if (i <= 0 || i > fila || j <= 0 || j > columna){
                        System.out.println("Índices fuera de rango");
                        opcion = 5;
                        break;
                    } else{
                        if (entero != null){
                            entero.eliminar(i, j, columna, dato, direccion);
                            break;
                        } if (flotante != null){
                            flotante.eliminar(i, j, columna, dato, direccion);
                            break;
                        } if (caracter != null){
                            caracter.eliminar(i, j, columna, dato, direccion);
                            break;
                        }
                    }
                case 3:
                    System.out.println("\tMatriz");
                    if (entero != null){
                        entero.mostrarMatriz(fila, columna, dato, direccion);
                        break;
                    } if (flotante != null){
                        flotante.mostrarMatriz(fila, columna, dato, direccion);
                        break;
                    } if (caracter != null){
                        caracter.mostrarMatriz(fila, columna, dato, direccion);
                        break;
                    }
                case 4:
                    System.out.println("\tMemoria");
                    if (entero != null){
                        entero.mostrarMemoria(dato, direccion);
                        break;
                    } if (flotante != null){
                        flotante.mostrarMemoria(dato, direccion);
                        break;
                    } if (caracter != null){
                        caracter.mostrarMemoria(dato, direccion);
                        break;
                    }
                case 5:
                    break;
                default:

            }
        }
        
    }
}
