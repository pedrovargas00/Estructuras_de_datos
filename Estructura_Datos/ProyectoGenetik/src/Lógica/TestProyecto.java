package Lógica;

import Interfaces.*;
import Archivo.*;
import Controlador.*;
import java.io.IOException;
import Árbol.*;
import javax.swing.*;

public class TestProyecto {
    public static void main(String []args) throws IOException{
         
        DibujarArbol arbolUI = new DibujarArbol(); 
        ArbolUI frame = new ArbolUI(arbolUI);
        Controlador controlador = new Controlador();
        PortadaUI principal=new PortadaUI();
        Archivo archivo = new Archivo();
        AbrirArchivoGUI abrir = new AbrirArchivoGUI();
        Arbol arbol = new Arbol();
        
        Datos datos = new Datos();
        
        principal.setVisible(true);
        principal.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        abrir.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        controlador.setDibujaArbol(arbolUI);
        controlador.setArchivo(archivo);
        controlador.setAbrirArchivosGUI(abrir);
    
        controlador.setDatos(datos);
        controlador.setArbol(arbol);
        controlador.setPortada(principal);
        controlador.setArbolUI(frame);
        
        frame.setControlador(controlador);
        arbol.setControlador(controlador);
        archivo.setControlador(controlador);
        abrir.setControlador(controlador);
   
        datos.setControlador(controlador);
        arbolUI.setControlador(controlador);
        principal.setControlador(controlador);
    }
}