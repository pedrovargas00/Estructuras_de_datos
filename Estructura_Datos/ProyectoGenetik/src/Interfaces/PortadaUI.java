package Interfaces;

import Controlador.Controlador;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PortadaUI extends JFrame{
    
    private Controlador controlador;
    //private Lienzo lienzo;
    
    private PanelPrincipal lienzo;
    private JPanel pSalir;
    private Boton btSalir, btAgregar;
    private Color color;
    
    public PortadaUI(){
        
        super("G E N E T I K");
        this.setLocation(50, 50);
        this.setSize(700, 500);
        this.setResizable(false);
     //   this.setVisible(true);
        initComponentes();
    }
    
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
    
    private void initComponentes(){
          this.setBackground(Color.blue);
          this.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT, 50));
         ImageIcon icon=new ImageIcon ("genetik_kod.png");
         this.setIconImage(icon.getImage());
        color = new Color(137, 194, 255);
      
        pSalir = new JPanel(new BorderLayout());
        lienzo = new PanelPrincipal();
        lienzo.setBackground(Color.white);
      
        btAgregar = new Boton("Comenzar Diagnóstico", color, Color.BLUE, 20, 20);
        setBoton(btAgregar, 120, 140, 110, 155);
         btAgregar.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT, 20));
         
         btSalir = new Boton("Salir", color, Color.BLUE, 20, 20);
         setBoton(btSalir, 120, 140, 110, 155);
        btSalir.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT, 20));
	btSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }});
        pSalir.add(btAgregar, BorderLayout.WEST);
        pSalir.add(btSalir, BorderLayout.EAST);
      
        add(pSalir, BorderLayout.SOUTH);
        add(lienzo, BorderLayout.CENTER);
        
        //Eventos.
        
        btAgregar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                controlador.mostrarAbrir();
             
            }
        });
        
    }
    
    public void mostrar(){
        this.show(true);
    }
    
    public void cerrar(){
        this.dispose();
    }
  
    
    private static void setBoton(Boton boton, int x, int y, int p ,int p1){ 
        boton.setBounds(x, y, p, p1); 
        boton.setFocusPainted(false); 
        boton.setForeground(Color.white);
    }    
}
