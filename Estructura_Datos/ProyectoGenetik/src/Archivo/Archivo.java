package Archivo;

import Árbol.*;
import Controlador.*;
import javax.swing.*;  
import java.io.*;
import java.util.*;

public class Archivo{
    
    private Controlador controlador;
    
    public Archivo(){}
    
    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    
    public static  String explorarDisco(){
	
        JFrame frame = new JFrame();
	JFileChooser chArchivo = new JFileChooser();
        int valor;
        
	chArchivo.setCurrentDirectory(new File(".")); //directorio actual
	valor = chArchivo.showDialog(frame, null);
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
	
    public static void leerArchivo(String nombreArchivo, Arbol arbol){
    	  	
    	String hijo, hijo2, madre, padre;
        boolean vivo;
        DataInputStream entrada = null;
        char sexo;
        
        try{
            entrada = new DataInputStream( new FileInputStream(nombreArchivo));
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error en apertura de archivo\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        try {
            hijo = entrada.readUTF();
            arbol.insertar(hijo);
            madre = entrada.readUTF();
            if(madre != null)
                arbol.insertarI(hijo, madre);
            padre = entrada.readUTF();
            if(padre != null)
                arbol.insertarD(hijo, padre);
            sexo = entrada.readChar();
            System.out.println("Sexo--------------> " + arbol.getPersona(madre).getNombre());
            arbol.getPersona(hijo).getDatos().setSexo(sexo);
            vivo = entrada.readBoolean();
            if(vivo){
                arbol.getPersona(hijo).getDatos().setVivo(vivo);
                arbol.getPersona(hijo).getDatos().setEdad(entrada.readInt());
                arbol.getPersona(hijo).getDatos().setNacionalidad(entrada.readUTF());
                arbol.getPersona(hijo).getDatos().setPorcEsquizofrenia(entrada.readFloat());
                arbol.getPersona(hijo).getDatos().setPorcHemofilia(entrada.readFloat());
                arbol.getPersona(hijo).getDatos().setPorcDiabetes(entrada.readFloat());
                arbol.getPersona(hijo).getDatos().setPorcObesidad(entrada.readFloat());
                arbol.getPersona(hijo).getDatos().setPorcLabioL(entrada.readFloat());
                arbol.getPersona(hijo).getDatos().setPorcCancerMP(entrada.readFloat());
                arbol.getPersona(hijo).getDatos().setPorcDefectosTN(entrada.readFloat());
                arbol.getPersona(hijo).getDatos().setPorcHipertension(entrada.readFloat());
            }else{
                arbol.getPersona(hijo).getDatos().setVivo(vivo);
                arbol.getPersona(hijo).getDatos().setPorcEsquizofrenia(entrada.readFloat());
                arbol.getPersona(hijo).getDatos().setPorcHemofilia(entrada.readFloat());
                arbol.getPersona(hijo).getDatos().setPorcDiabetes(entrada.readFloat());
                arbol.getPersona(hijo).getDatos().setPorcObesidad(entrada.readFloat());
                arbol.getPersona(hijo).getDatos().setPorcLabioL(entrada.readFloat());
                arbol.getPersona(hijo).getDatos().setPorcCancerMP(entrada.readFloat());
                arbol.getPersona(hijo).getDatos().setPorcDefectosTN(entrada.readFloat());
                arbol.getPersona(hijo).getDatos().setPorcHipertension(entrada.readFloat());
            }
            System.out.println("Leyó:" + hijo);
            while(true){  
                hijo2 = entrada.readUTF();
                if(!hijo2.equalsIgnoreCase("*")){
                    hijo2 = entrada.readUTF();
                    if(!hijo2.equalsIgnoreCase("/")){
                        //arbol.insertar(hijo);
                        if(arbol.getPersona(hijo2) != null){
                            madre = entrada.readUTF();
                            if(madre != null)
                                arbol.insertarI(hijo2, madre);
                            padre = entrada.readUTF();
                            if(padre != null)
                                arbol.insertarD(hijo2, entrada.readUTF());
                            arbol.getPersona(hijo2).getDatos().setSexo(entrada.readChar());
                            vivo = entrada.readBoolean();
                            if(vivo){
                                arbol.getPersona(hijo2).getDatos().setVivo(vivo);
                                arbol.getPersona(hijo2).getDatos().setEdad(entrada.readInt());
                                arbol.getPersona(hijo2).getDatos().setSexo(entrada.readChar());
                                arbol.getPersona(hijo2).getDatos().setNacionalidad(entrada.readUTF());
                                arbol.getPersona(hijo2).getDatos().setPorcEsquizofrenia(entrada.readFloat());
                                arbol.getPersona(hijo2).getDatos().setPorcHemofilia(entrada.readFloat());
                                arbol.getPersona(hijo2).getDatos().setPorcDiabetes(entrada.readFloat());
                                arbol.getPersona(hijo2).getDatos().setPorcObesidad(entrada.readFloat());
                                arbol.getPersona(hijo2).getDatos().setPorcLabioL(entrada.readFloat());
                                arbol.getPersona(hijo2).getDatos().setPorcCancerMP(entrada.readFloat());
                                arbol.getPersona(hijo2).getDatos().setPorcDefectosTN(entrada.readFloat());
                                arbol.getPersona(hijo2).getDatos().setPorcHipertension(entrada.readFloat());
                            System.out.println("Leyó: " + hijo2);
                            }else{
                                arbol.getPersona(hijo2).getDatos().setVivo(vivo);
                                arbol.getPersona(hijo).getDatos().setPorcEsquizofrenia(entrada.readFloat());
                                arbol.getPersona(hijo).getDatos().setPorcHemofilia(entrada.readFloat());
                                arbol.getPersona(hijo).getDatos().setPorcDiabetes(entrada.readFloat());
                                arbol.getPersona(hijo).getDatos().setPorcObesidad(entrada.readFloat());
                                arbol.getPersona(hijo).getDatos().setPorcLabioL(entrada.readFloat());
                                arbol.getPersona(hijo).getDatos().setPorcCancerMP(entrada.readFloat());
                                arbol.getPersona(hijo).getDatos().setPorcDefectosTN(entrada.readFloat());
                                arbol.getPersona(hijo).getDatos().setPorcHipertension(entrada.readFloat());
                            }
                        }
                    }else
                        break;
                }
            }
        }catch (EOFException eof){
        }catch (IOException e){
              JOptionPane.showMessageDialog(null, "Error en lectura de archivo\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        try {
         entrada.close();
        }catch (IOException e){
              JOptionPane.showMessageDialog(null, "Error en el cierre de archivo\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void escribirArchivo(String nombreArchivo, Arbol arbol) throws IOException{
	
        DataOutputStream salida = null;
        ArrayList<Persona> array = new ArrayList();
        array.addAll(arbol.niveles(arbol.getRaiz()));
        boolean vivo;
        
        try
        {
            salida = new DataOutputStream( new FileOutputStream(nombreArchivo));
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error en apertura de archivo\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("Array----->:" + array);
        System.out.println("Persona------------>: " + array.get(0).getNombre());
        for(Persona p: array){
            salida.writeUTF(p.getNombre());
            if(p.getMadre() != null)
                salida.writeUTF(p.getMadreNombre());
            if(p.getPadre() != null)
                salida.writeUTF(p.getPadreNombre());
            salida.writeChar(p.getDatos().getSexo());
            vivo = p.getDatos().getVivo();
            if(vivo){
                salida.writeBoolean(p.getDatos().getVivo());
                salida.writeInt(p.getDatos().getEdad());
                salida.writeUTF(p.getDatos().getNacionalidad());
                salida.writeFloat(p.getDatos().getPorcEsquizofrenia());
                salida.writeFloat(p.getDatos().getPorcHemofilia());
                salida.writeFloat(p.getDatos().getPorcDiabetes());
                salida.writeFloat(p.getDatos().getPorcObesidad());
                salida.writeFloat(p.getDatos().getPorcLabioL());
                salida.writeFloat(p.getDatos().getPorcCancerMP());
                salida.writeFloat(p.getDatos().getPorcDefectosTN());
                salida.writeFloat(p.getDatos().getPorcHipertension());
                salida.writeUTF("*");
            }else{
                salida.writeBoolean(p.getDatos().getVivo());
                salida.writeFloat(p.getDatos().getPorcEsquizofrenia());
                salida.writeFloat(p.getDatos().getPorcHemofilia());
                salida.writeFloat(p.getDatos().getPorcDiabetes());
                salida.writeFloat(p.getDatos().getPorcObesidad());
                salida.writeFloat(p.getDatos().getPorcLabioL());
                salida.writeFloat(p.getDatos().getPorcCancerMP());
                salida.writeFloat(p.getDatos().getPorcDefectosTN());
                salida.writeFloat(p.getDatos().getPorcHipertension());
                salida.writeUTF("*");
            }
        }
        salida.writeUTF("/");

        try {
         salida.close();
        }
        catch (IOException e){
              JOptionPane.showMessageDialog(null, "Error cierre de archivo\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
   }
    
} //fin clase
