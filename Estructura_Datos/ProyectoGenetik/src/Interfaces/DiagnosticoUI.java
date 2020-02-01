package Interfaces;

import Controlador.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Árbol.Persona;

/*
private DiagnosticoUI diagnostico;

public void setDiagnostico(DiagnosticoUI diagnostico){
    this.diagnostico = diagnostico;
}
*/

public class DiagnosticoUI extends JFrame{
    
    private JTextArea jtTexto;
    private JButton btSalir;
    private JPanel panel;
    private Controlador controlador;
    
    public DiagnosticoUI(String datos){
        
        super("Diágnostico");
        initComponentes(datos);
        this.setLocation(150, 200);
        this.setSize(350, 450);
        this.setResizable(false);  //para que no se pueda agrandar o achicar
        this.setVisible(false);
    }
    
    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    
    public void initComponentes(String datos){
        
        jtTexto = new JTextArea(datos);
        jtTexto.setEditable(false);
        btSalir = new JButton("Salir");
        panel = new JPanel(new BorderLayout());
        
        panel.add(jtTexto, BorderLayout.CENTER);
        panel.add(btSalir, BorderLayout.SOUTH);
        add(panel);
        
        //Eventos.
        btSalir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    cerrar();
                }
        });
    }
    
    public void mostrar(){
        this.setVisible(true);
    }
    
    public void cerrar(){
        this.dispose();
    }
    
}
