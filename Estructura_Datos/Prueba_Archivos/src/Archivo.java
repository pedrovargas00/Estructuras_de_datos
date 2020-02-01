//package Archivo;

//import Lógica.Persona;
//import Controlador.*;
import javax.swing.*;  
import java.io.*;
import java.util.*;

public class Archivo{
    
    //private Controlador controlador;
    
    public Archivo(){}
    
    /*public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }*/
    //metodo para usar la ventana de abrir archivo y explorar disco
    public static  String explorarDisco(){
	
        JFrame frame = new JFrame();
	JFileChooser chArchivo = new JFileChooser();
        int valor;
        
	chArchivo.setCurrentDirectory(new File(".")); //directorio actual
	valor = chArchivo.showDialog(frame, null);
   	//en retval regresa el boton que se oprimio:ok o cancelar
	if (valor == JFileChooser.APPROVE_OPTION) {
            File archivo = chArchivo.getSelectedFile();
            if (archivo != null) {
		return (archivo.getPath());
            }
	}
	else 
           if (valor == JFileChooser.CANCEL_OPTION) {
               return null;
            }
	   else
            if (valor == JFileChooser.ERROR_OPTION) {
               JOptionPane.showMessageDialog(frame, "El archivo no fue seleccionado", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } 
            else {
                    JOptionPane.showMessageDialog(frame, "Ocurrio una operaci�n desconocida.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
	return null;
    }
	
  
/*
 *  Este metodo lee un archivo secuencialmente de empleados y los agrega a la empresa
 */

    public static void leerArchivo(String nombreArchivo, Arbol arbol){
    	  	
    	//String nombre, apellido; 
    	//int id;
    	String dato;
        ArrayList<String> entradas = new ArrayList();
        DataInputStream entrada = null;

       //abrir archivo para lectura
        try{
            entrada = new DataInputStream( new FileInputStream(nombreArchivo));
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error en apertura de archivo\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        //Leer los datos del  archivo
        try {
            while(true){  //ciclo infinito, se sandrá cuando se acaben los datos
                /*persona.setEdad(entrada.readInt());
                nombre = entrada.readUTF();
                apellido = entrada.readUTF();*/
                dato = entrada.readUTF();
                if(!dato.equalsIgnoreCase("*"))
                    entradas.add(dato);
                //dato = entrada.readUTF();

                //Persona em = new Empleado(id, nombre, apellido, sueldo);
                //empresa.agregaEmpleado(em);
            }
        }catch (EOFException eof){
           //ya no hay mas registros (datos) -- En este caso no hacemos nada
        }catch (IOException e){
              JOptionPane.showMessageDialog(null, "Error en lectura de archivo\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("Leído: " + entradas);
        try {
         entrada.close();
        }catch (IOException e){
              JOptionPane.showMessageDialog(null, "Error en el cierre de archivo\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    //escribe en un archivo secuencial
    public static void escribirArchivo(String nombreArchivo, Arbol arbol) throws IOException{
	
        DataOutputStream salida = null; //habilita salida de datos a un archivo
        ArrayList<Nodo> array = arbol.niveles(arbol.getRaiz());
        //int ne = empresa.getNumEmp();
//habilita salida de datos a un archivo
        //int ne = empresa.getNumEmp();

        //abrir archivo para escritura
        try{
            salida = new DataOutputStream(new FileOutputStream(nombreArchivo));
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error en apertura de archivo\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        //enviar los datos al archivo
        for(Nodo a: array){
            salida.writeUTF("\nNodo: " + a.getDato());
            salida.writeUTF("*");
        }
        System.out.println("Terminó de escribir");
        /*for(Empleado e: empresa.empleados){
        salida.writeInt(e.getId());
        salida.writeUTF(e.getNombre());
        salida.writeUTF(e.getApellido());
        salida.writeDouble(e.getSueldo());
        }*/

        try {
         salida.close();
        }
        catch (IOException e){
              JOptionPane.showMessageDialog(null, "Error cierre de archivo\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
   }
} //fin clase
  