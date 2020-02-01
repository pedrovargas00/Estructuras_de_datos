/*Vargas Arenas Pedro*/

import java.util.*;

public class testHash {

  public static void main(String args[]){

    Hashtable<String, Alumno> tablaAlumnos = new Hashtable<>();

    //creamos algunos alumnos
    Alumno a1 = new Alumno("Carlos", "201812345");

    //almacenamos algunos alumnos en la tabla
    tablaAlumnos.put(a1.getMatricula(), a1);
    tablaAlumnos.put("201812378", new Alumno("Adriana", "201812378"));
    tablaAlumnos.put("201898765", new Alumno("Antonio", "201898765"));

    //Para  buscar un alumno por clave
    if(tablaAlumnos.containsKey("201812378"))
        System.out.println(tablaAlumnos.get("201812378"));

    //mostrar todos los elementos
    //se debe usar una enumeracion
    System.out.println("\nLista de alumnos: ");
    Enumeration <String> claves = tablaAlumnos.keys();
    while(claves.hasMoreElements()){
        String clave = claves.nextElement();
        System.out.println(tablaAlumnos.get(clave));
    }

    //Borrar un alumno x clave
    tablaAlumnos.remove("201898765");

    System.out.println("\nLista de alumnos: ");
    claves = tablaAlumnos.keys();
    while(claves.hasMoreElements()){
        String clave = claves.nextElement();
        System.out.println(tablaAlumnos.get(clave).toString());
    }
  }
}
