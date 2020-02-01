//Clase ARCHIVO
//manejo de los metodos que tienen que ver con archivos de acceso secuencial

import javax.swing.*;
import javax.swing.event.*;  
import java.io.*;
import java.util.*;

class Archivo {

	//metodo para usar la ventana de abrir archivo y explorar disco
    public static  String explorarDisco(){
	JFrame frame = new JFrame();
	JFileChooser chArchivo = new JFileChooser();
	chArchivo.setCurrentDirectory(new File(".")); //directorio actual
	int retval = chArchivo.showDialog(frame, null);
   	//en retval regresa el boton que se oprimio:ok o cancelar
	if (retval == JFileChooser.APPROVE_OPTION) {
            File archivo = chArchivo.getSelectedFile();
            if (archivo != null) {
		return (archivo.getPath());
            }
	}
	else 
           if (retval == JFileChooser.CANCEL_OPTION) {
               return null;
            }
	   else
		if (retval == JFileChooser.ERROR_OPTION) {
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

    public static void leerArchivo(String nombreArchivo, Empresa empresa )
    {
    	  	
    	String nombre, apellido; 
    	int id;
    	double sueldo;
        DataInputStream entrada= null;

       //abrir archivo para lectura
        try
        {
            entrada = new DataInputStream( new FileInputStream(nombreArchivo));
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error en apertura de archivo\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        //Leer los datos del  archivo
        try {
            while(true)  //ciclo infinito, se sandrá cuando se acaben los datos
            {
                id = entrada.readInt();
                nombre = entrada.readUTF();
                apellido = entrada.readUTF();
                sueldo = entrada.readDouble();

                Empleado em = new Empleado(id, nombre, apellido, sueldo);
                empresa.agregaEmpleado(em);
            }
        }
        catch (EOFException eof){
           //ya no hay mas registros (datos) -- En este caso no hacemos nada
        }
        catch (IOException e){
              JOptionPane.showMessageDialog(null, "Error en lectura de archivo\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        try {
         entrada.close();
        }
        catch (IOException e){
              JOptionPane.showMessageDialog(null, "Error en el cierre de archivo\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    //escribe en un archivo secuencial
    public static void escribirArchivo(String nombreArchivo, Empresa empresa )
    {
	DataOutputStream salida=null; //habilita salida de datos a un archivo
        int ne = empresa.getNumEmp();

        //abrir archivo para escritura
        try
        {
            salida = new DataOutputStream( new FileOutputStream(nombreArchivo));
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error en apertura de archivo\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        //enviar los datos al archivo
        try {
            for(Empleado e: empresa.empleados){
                salida.writeInt(e.getId());
                salida.writeUTF(e.getNombre());
                salida.writeUTF(e.getApellido());
                salida.writeDouble(e.getSueldo());
            }
        }
       catch (IOException e){
              JOptionPane.showMessageDialog(null, "Error en escritura de archivo\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        try {
         salida.close();
        }
        catch (IOException e){
              JOptionPane.showMessageDialog(null, "Error cierre de archivo\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
   }
} //fin clase
