/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yalu
 */
public class PerroDomestico extends Perro {
    protected String direccion;

    public PerroDomestico(String direccion, int edad, int peso, String nombre, String raza) {
        super(edad, peso, nombre, raza);
        this.direccion = direccion;
    }

    public PerroDomestico(String direccion, String nombre, String raza) {
        super(nombre, raza);
        this.direccion = direccion;
    }
    
    public PerroDomestico(String nombre){
        super(nombre, "San Bernardo");
        this.direccion = "FCC";
    }
    
    public PerroDomestico(){
        this("Fcc", 2, 20, "Calambres", "Dalmata");
    }
    
    public void traerPeriodico(){
        System.out.println(" :p ");
    }
    
    public void mostrarEstado(){
     /*  System.out.println("Nombre: "+nombre);
       System.out.println("Edad: "+edad);
       System.out.println("Peso: "+peso);
       System.out.println("Raza: "+raza);
             */
       super.mostrarEstado();
       System.out.println("Raza: "+raza);
       System.out.println("Direccion: "+direccion);
    }
}
