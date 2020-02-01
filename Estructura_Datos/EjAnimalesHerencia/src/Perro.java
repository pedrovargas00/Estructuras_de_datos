/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yalu
 */
public class Perro extends Animal {
    protected String raza;
    
    public Perro(int edad, int peso, String nombre, String raza){
        this.edad = edad;
        this.peso = peso;
        this.nombre = nombre;
        this.raza = raza;
    }
    
    public Perro(String nombre, String raza){
        super(10, 5, nombre);
        this.raza = raza;
    }
    
    public Perro(){
        this(0, 3, "Barbas", "French" );
    }
    
    public void moverCola()  {
        System.out.println(" <- -> ");
    }
    
    public void pedirComida(){
        System.out.println(" :V :V ");
    }
    
    public void hablar(){
        System.out.println(" Guau guau guau ...");
    }
    
    public void mostrarEstado(){
        super.mostrarEstado();
        System.out.println("Raza: "+ raza);
    }
   
}
