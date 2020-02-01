package Interfaces;

import Interfaces.DibujarArbol;
import Interfaces.ThreadColores;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;
import java.util.*;
import Controlador.Controlador;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArbolUI extends JFrame {
        
    private PersonaUI v;
        DibujarArbol grafo;
        JPanel pBotones, pLetrero;
        JButton  btSalir, btAñadir, btTerminar;
        Lienzo lienzo; //panel de dibujo
        ArrayList <PersonaUI> vertices,verti;
        ThreadColores hilo;
         private Controlador controlador;
    
    //constructor
    public ArbolUI(DibujarArbol grafo) {
        
        super("A R B O L   G E N E A L Ó G I C O");
	setLocation(50, 50);
	setSize(500, 400);
	this.grafo = grafo; //Se conoce el grafo
	lienzo = new Lienzo(this.grafo,this); 
                lienzo.setPreferredSize(new Dimension(900, 600));
                lienzo.setVertices(grafo.getArrayVertices());
                this.setVisible(false);
                initComponentes();
                
        pack();
      }
    
    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    private void initComponentes(){
        btAñadir=new JButton("Añadir");
        btTerminar = new JButton("Terminar");
        btSalir = new JButton("Salir");
        btSalir.setEnabled(false);
        
        lienzo.addMouseListener(new MouseAdapter(){
        public void mouseReleased(MouseEvent Me){
            Point2D p = Me.getPoint();
            if(Me.isPopupTrigger())
                lienzo.mostrarMenu(p, Me);
        }
        });
        pBotones = new JPanel();
        pLetrero = new JPanel();
      

        btAñadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Point2D x = null; 
                x = new Point2D.Double(400, 40);
                lienzo.pintarNodoP(x);
                btAñadir.setVisible(false);
          }});
        
	
	btTerminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            btSalir.setEnabled(true);
            controlador.calcularPorcentaje();
            controlador.calcularSemaforo();
            colorear(controlador.getSemaforoRojo(),0);
            colorear(controlador.getSemaforoAmarillo(),1);
            colorear(controlador.getSemaforoVerde(),2);
            try {
                    controlador.escribirArchivo("Datos.txt", controlador.getArbol());
                } catch (IOException ex) {
                    Logger.getLogger(ArbolUI.class.getName()).log(Level.SEVERE, null, ex);
                }
        }});
        
        
	btSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.mostrarPortadaUI();
                cerrar();
        }});
        
        pBotones.add(btAñadir);
        pBotones.add(btTerminar);
        pBotones.add(btSalir);         
        add(pLetrero, BorderLayout.NORTH);
        add(lienzo,BorderLayout.CENTER );
        add(pBotones, BorderLayout.SOUTH);
        
        
    }
    
    public void mostrar(){
        this.setVisible(true);
    }
    
    public void cerrar(){
        this.dispose();
    }
    
    public void colorear(ArrayList <PersonaUI> ver,int i){
            hilo = new ThreadColores(lienzo,  ver, this.grafo,i );
            hilo.start(); //ver clase ThreadColores
    }
  
}
