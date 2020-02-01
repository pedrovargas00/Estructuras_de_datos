import java.util.*;

public class Persona {
    
    private String nombre;
    private int edad;
    private char sexo;
    private float peso;
    private float altura;
    Scanner in = new Scanner(System.in);
    //Constructor.
    Persona(){
        nombre = "";
        peso = altura = 0;
        edad = 0;
        sexo = 'X';
    }
    //Constructor dos.
    public void Persona(String nombre, char sexo, int edad, float altura, float peso){
        
        System.out.println("Ingrese el nombre del paciente: ");
        this.nombre = in.nextLine();
        System.out.println("Ingrese la edad del paciente: ");
        this.edad = in.nextInt();
        System.out.println("Ingrese el sexo del paciente [M: Masculino F: Femenino]: ");
        this.sexo = in.next().charAt(0);
        System.out.println("Ingrese el peso del paciente: ");
        this.peso = in.nextFloat();
        System.out.println("Ingrese la altura del paciente en cm: ");
        this.altura = in.nextFloat();
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
     
    public void setPeso(float peso){
        this.peso = peso;
    }
      
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    //Método para calcular IMC.
    public int calcularIMC(){
    
        float IMC;
        int r = 0;
        
        IMC = peso/altura;
        if(IMC >= 18.5 && IMC <= 24.9)
            r = 0;
        if(IMC < 18.5)
            r = -1;
        if(IMC > 24.9 && IMC <= 29.9)
            r = 1;
        if(IMC > 30)
            r = 2;
        
        return r;
    }
    
    //Verificar edad.
    public boolean esMayorDeEdad(){
        
        boolean b = false;
        if (edad < 18)
            b = false;
        
        if (edad >= 18)
            b = true;
        return b;
    }
    
    //Mostrar atributos.
    public void mostrarEstado(){
        
        System.out.println("\tEl nombre del paciente es: "+ nombre);
        System.out.println("\tLa edad del paciente es: "+ edad);
        System.out.println("\tEl peso del paciente es: "+ peso);
        System.out.println("\tLa altura del paciente es: "+ altura);
    }
    
    //Serie de métodos get.
    public String getNombre(){
        return nombre;
    }
    
    public char getSexo(){
        return sexo;
    }
        
    public int getEdad(){
        return edad;
    }
            
    public float getPeso(){
        return peso;
    }
                
    public float getAltura(){
        return altura;
    }
}