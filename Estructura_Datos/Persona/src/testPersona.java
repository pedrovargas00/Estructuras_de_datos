import java.util.Scanner;

public class testPersona {
    
    public static void main(String[] args){
    
        int i, r, p, n = 1;
        boolean fv;
        Persona pInicial = new Persona();
        Persona pInicial1 = new Persona(); 
        Scanner in = new Scanner(System.in);
        
        System.out.println("Qué proceso desea usar?[1/2]");
        p = in.nextInt();
        if(p == 1){
            do{
                System.out.println("\nSeleccione una opción:\n1.- Ingresar dato.\n2.- Calcular IMC.\n3.- Verificar edad.\n4.- Mostrar datos.");
                p = in.nextInt();
                switch(p){
                  case 1: pInicial.Persona("", 'a', 0, 0, 0);
                    break;
                    case 2: i = pInicial.calcularIMC();
                        switch(i){
                            case 0: System.out.println("El paciente tiene peso adecuado");
                            break;
                            case 1: System.out.println("El paciente padece sobrepeso");
                            break;
                            case -1: System.out.println("El paciente está bajo de peso");
                            break;
                            case -2: System.out.println("El paciente padece obesidad");
                            break;
                        }
                        break;
                        case 3: fv = pInicial.esMayorDeEdad();
                            if (fv == true)
                                System.out.println("El paciente es mayor de edad");
                            if (fv == false)
                                System.out.println("El paciente es menor de edad");
                            break;
                        case 4: pInicial.mostrarEstado();
                        break;
                }
                n++;
            }while(n < 5);
        }
        if (p == 2){
            do{
                System.out.println("\nSeleccione una opción:\n1.- Ingresar dato.\n2.- Calcular IMC.\n3.- Verificar edad.\n4.- Mostrar datos.");
                p = in.nextInt();
                in.nextLine();
                switch (p){
                   //Nombre.
                    case 1:
                        System.out.println("Ingrese el nombre del paciente: ");
                        String nombre = in.nextLine();
                        pInicial1.setNombre(nombre);
                   //Edad.
                        System.out.println("Ingrese la edad del paciente: ");
                        int edad = in.nextInt();
                        pInicial1.setEdad(edad);
                    //Sexo.
                        System.out.println("Ingrese el sexo del paciente [M: Masculino F: Femenino]: ");
                        char sexo = in.next().charAt(0);
                        pInicial1.setSexo(sexo);
                    //Peso.
                        System.out.println("Ingrese el peso del paciente: ");
                        float peso = in.nextFloat();
                        pInicial1.setPeso(peso);
                    //Altura.
                       System.out.println("Ingrese la altura del paciente en cm: ");
                       float altura = in.nextFloat();
                       pInicial1.setAltura(altura);
                       break;
                    case 2: i = pInicial1.calcularIMC();
                        switch(i){
                            case 0: System.out.println("El paciente tiene peso adecuado");
                            break;
                            case 1: System.out.println("El paciente padece sobrepeso");
                            break;
                            case -1: System.out.println("El paciente está bajo de peso");
                            break;
                            case -2: System.out.println("El paciente padece obesidad");
                            break;
                        }
                        break;
                    case 3: fv = pInicial1.esMayorDeEdad();
                        if (fv == true)
                            System.out.println("El paciente es mayor de edad");
                        if (fv == false)
                            System.out.println("El paciente es menor de edad");
                        break;
                    case 4:
                        System.out.println("\tEl nombre es: "+ pInicial1.getNombre());
                        System.out.println("\tLa edad es: "+ pInicial1.getEdad());
                        System.out.println("\tEl sexo es: "+ pInicial1.getSexo());
                        System.out.println("\tLa altura es: "+ pInicial1.getAltura());
                        System.out.println("\tEl peso es: "+ pInicial1.getPeso());
                        break;
                }
                n++;
            }while(n < 5);
        }
    }
}
