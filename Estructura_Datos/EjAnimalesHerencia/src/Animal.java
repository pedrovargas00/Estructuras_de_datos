/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yalu
 */
public abstract class Animal {
    protected int peso, edad;
    protected String nombre;
    
    public Animal(int edad, int peso, String nombre){
        this.edad = edad;
        this.peso = peso;
        this.nombre = nombre;        
    }
    
    public Animal(int edad, int peso){
        this(edad, peso, "Sin nombre");
    }
    
    public Animal(){
        this(3, 5, "Boby");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void hablar();
       
    void mostrarEstado(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Peso: "+ peso);
       // System.out.println("Raza/color: "+ raza);
    }
}
