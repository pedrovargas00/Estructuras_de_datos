package Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Controlador.Controlador;

public class AbrirArchivoGUI extends JFrame implements ActionListener{
    
    private JButton btCrear, btCargar,btRegresar;
    private Controlador controlador;
    
    public AbrirArchivoGUI(){
        super("Abrir Expediente");
        setLocation(50, 50);
        initComponents();
        this.setSize(450,250);
        this.setVisible(false);
    }
    
    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    
    private void initComponents(){
        Color color = new Color(91,141,231);
        Color color2 = new Color(127,165,234);
        Color colorb = new Color(40,110,225);
        btCrear = new JButton("Crear");
        btCrear.setFont(new Font("Arial",Font.CENTER_BASELINE, 20));
        btCrear.setBackground(colorb);
        btCargar = new JButton("Cargar");
        btCargar.setFont(new Font("Arial",Font.CENTER_BASELINE, 20));
        btCargar.setBackground(colorb);
        btRegresar = new JButton("Regresar");
        btRegresar.setFont(new Font("Arial",Font.CENTER_BASELINE, 20));
        btRegresar.setBackground(colorb);       
        JButton btquestion = new JButton("<html><p>¿Desea agregar un nuevo expediente o crear uno nuevo?</p></html>");
        btquestion.setBackground(color);
        btquestion.setForeground(Color.WHITE);
        btquestion.setFont(new Font("Arial", Font.BOLD, 40));
        btquestion.setEnabled(false);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(1,1));
        panel.setBackground(color2);
        panel.add(btRegresar, BorderLayout.CENTER);
        panel.add(btCrear,BorderLayout.EAST);
        
        //se agregan los paneles al frame, y el boton del texto
        add(btquestion, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);
        
            btCrear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.mostrarArbol();
                controlador.cerrarPortadaUI();
                cerrar();
//Aqui va el evento donde abre el panel donde se dibuja el árbol genealógico
            }   
          });
              
            btCargar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 //Aqui va el evento donde abre el panel donde se carga el archivo
                 controlador.leerArchivo(controlador.ventanaArchivos(), controlador.getArbol());
            }   
          });
            
             btRegresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.mostrarPortadaUI();
                 cerrar();
                 
            }   
          });
    }

    public void mostrar(){
        this.setVisible(true);
    }
    
    public void cerrar(){
        this.setVisible(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
