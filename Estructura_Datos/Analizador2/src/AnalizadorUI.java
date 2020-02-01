import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class AnalizadorUI extends JFrame{
    
    private Controlador controlador;
    private JPanel panel, panelRe;
    private JTextField textoJF;
    private JLabel etiquetaJL, etiqueta1JL, resultadoJL;
    private JButton botonJB;
    
    public AnalizadorUI(){
        super("\t\tAnalizador de símbolos");
        this.setSize(400, 200);
        this.setResizable(false);
        init();
    }
    
    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    
    public void init(){
        
    textoJF = new JTextField(10);
    etiquetaJL = new JLabel("Ingrese la cadena: ");
    etiquetaJL.setFont(new Font("Century Gothic", Font.BOLD, 14));
    etiqueta1JL = new JLabel("El análisis resultó:  ");
    etiqueta1JL.setFont(new Font("Arial Black", Font.BOLD, 20));
    etiqueta1JL.setVisible(false);
    resultadoJL = new JLabel();
    resultadoJL.setFont(new Font("Arial Black", Font.BOLD, 24));
    resultadoJL.setVisible(false);
    botonJB = new JButton("Analizar");
    
    panel = new JPanel();
    panel.setLayout(new FlowLayout(FlowLayout.CENTER));
    panel.setBackground(Color.LIGHT_GRAY);
    panelRe = new JPanel();
    panelRe.setLayout(new FlowLayout(FlowLayout.CENTER));
    panelRe.setBackground(Color.LIGHT_GRAY);
    
    panel.add(etiquetaJL);
    panel.add(textoJF);
    panel.add(botonJB);
    panelRe.add(etiqueta1JL);
    panelRe.add(resultadoJL);
    add(panel, BorderLayout.NORTH);
    add(panelRe, BorderLayout.CENTER);
    
    //Evento.
    botonJB.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String cadena = String.valueOf(controlador.analizarSimbolos(textoJF.getText()));
            resultadoJL.setText(cadena);
            etiqueta1JL.setVisible(true);
            resultadoJL.setVisible(true);
        }
    
    });
    
    
    }
}
