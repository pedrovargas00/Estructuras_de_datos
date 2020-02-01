/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yalu
 */
public class Gato extends Animal {
    protected String color;

    public Gato(String color, int edad, int peso, String nombre) {
        super(edad, peso, nombre);
        this.color = color;
    }
    
    public Gato(String nombre, String color){
        super(1, 2, nombre);
        this.color = color;
    }
    
    public Gato(){
        this("Gris", 1, 3, "Michi");
    }
    
    public void cazarRatones(){
        System.out.println(" >:V ");
    }
    
    public void hablar(){
        System.out.println("Miuauu miauu miauu");
    }
    
    public void mostrarEstado(){
        super.mostrarEstado();
        System.out.println("Color: "+ color);
    }
}
