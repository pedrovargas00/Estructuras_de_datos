
public class Cerdo extends Animal{
    
    protected String color;
    
    public Cerdo(String nombre, int edad, int peso, String color){
        super(edad, peso, nombre);
        this.color = color;
    }
    
    public Cerdo(String nombre){
        super(1, 50, nombre);
        this.color = "Rosa";
    }
    
    public Cerdo(){
        super (1, 10, "Porky");
        this.color = "Rosado";
    }
    
    public void hablar(){
        System.out.println("Oink oink :o");
    }
    
    public void mostrarEstado(){
        super.mostrarEstado();
        System.out.println("Color: "+ color);
    }
}
