import java.util.*;

public class TestAnimalesHerencia {
    
    public static void main(String args[]){
        
       // Animal a1;
        //= new Animal();
        //a1.mostrarEstado();
        
        Scanner in = new Scanner(System.in);/*
        Perro firulais = new Perro("firulais", "chihuahua");
        Gato conBotas = new Gato("conBotas", "naranja");
        PerroDomestico bethoven = new PerroDomestico("Bethoven");
        
        
        firulais.mostrarEstado();
        firulais.hablar();
        firulais.moverCola();
        firulais.pedirComida();
        
        conBotas.mostrarEstado();
        conBotas.cazarRatones();
        conBotas.hablar();
        
        bethoven.mostrarEstado();
        bethoven.moverCola();
        bethoven.hablar();
        bethoven.traerPeriodico();
        
        Cerdo porky = new Cerdo("Porky");
        porky.hablar();
        porky.mostrarEstado();
        
        System.out.println("Revisando variables polimorficas");
        
        Animal a;
        a = new Gato("Nombre", "Color");
        a.hablar();
        a.mostrarEstado();
        
        a = new Cerdo("Nombre1");
        a.hablar();
        a.mostrarEstado();
        
        a = new Perro("Nombre2", "Raza1");
        a.hablar();
        a.mostrarEstado();
 
        // Comportamiento polimorfico.
        */
        Animal a;
        System.out.println("Implementando polimorfismo");
        Animal array[] = new Animal[10];
        
        int opc, i = 0;
        int edad, peso;
        String raza, nombre;
        
        do{
            
            System.out.println("Selecciona la opcion deseada: ");
            System.out.println("1.- Perro.\n2.- Gato.\n3.- Cerdo.\n0.- Salir");
            opc = in.nextInt();
            
            switch(opc){
                case 1: //Perro.
                    try{
                        in.nextLine();
                        System.out.println("Ingrese el nombre del perro: ");
                        nombre = in.nextLine();
                        System.out.println("Ingrese la raza del perro: ");
                        raza = in.nextLine();
                        System.out.println("Ingrese la edad del perro: ");
                        edad = in.nextInt();
                        System.out.println("Ingrese el peso del perro: ");
                        peso = in.nextInt();
                    }
                    catch(Exception e){
                        System.out.println("Datos ingresados incorrectamente");
                        break;
                    }
                    a = new Perro(edad, peso, nombre, raza);
                    array[i] = new Perro(edad, peso, nombre, raza);
                    break;
                case 2: // Gato
                    try{
                        in.nextLine();
                        System.out.println("Ingrese el nombre del gato: ");
                        nombre = in.nextLine();
                        System.out.println("Ingrese el color del gato: ");
                        raza = in.nextLine();
                        System.out.println("Ingrese la edad del gato: ");
                        edad = in.nextInt();
                        System.out.println("Ingrese el peso del gato: ");
                        peso = in.nextInt();
                    }
                    catch(Exception e){
                        System.out.println("Datos ingresados incorrectamente");
                        break;
                    }
                    a = new Gato(raza, edad, peso, nombre);
                    array[i++] = new Gato(raza, edad, peso, nombre);
                    break;
                case 3: // Cerdo.
                    try{
                        in.nextLine();
                        System.out.println("Ingrese el nombre del cerdo: ");
                        nombre = in.nextLine();
                        System.out.println("Ingrese el color del cerdo: ");
                        raza = in.nextLine();
                        System.out.println("Ingrese la edad del cerdo: ");
                        edad = in.nextInt();
                        System.out.println("Ingrese el peso del cerdo: ");
                        peso = in.nextInt();
                    }
                    catch(Exception e){
                        System.out.println("Datos ingresados incorrectamente");
                        break;
                    }
                    a = new Cerdo(nombre, edad, peso, raza);
                    array[i++] = new Cerdo(nombre, edad, peso, raza);
                    break;
                case 0: // Salir.
                    break;
            }
             
        } while(opc != 0);
        
        for (int j = 0; j <= i; j++){
            array[j].hablar();
            array[j].mostrarEstado();
        }
    }
}
