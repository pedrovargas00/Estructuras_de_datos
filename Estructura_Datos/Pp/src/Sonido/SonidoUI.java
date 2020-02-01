package Sonido;

import Coordinador.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.*;
import javazoom.jl.decoder.JavaLayerException;

public class SonidoUI extends JFrame{
    
    private Coordinador coordinador;
    
    // Inicialización de los componentes a usar.
    private JPanel pBase, pCentro, pLateral,pSuperior, pInferior;
    private JButton btSalir, btIniciar, btMostrar;
    private JButton boton1, boton2, boton3, boton4;
    private JLabel lbNivel, lbInstrucciones;
    private JTextArea area;
    private JProgressBar pbBarra;
    private ImageIcon imPerro, imGato, imGallo, imBuho;    
    private Dimension dimension;
    private Color color, color1;
    private Icon correcto, incorrecto;
    private int b = 0;
    
    //Constructor de la clase
    public SonidoUI(){
        
        super();
        this.setSize(600, 600);
        this.setResizable(false);
        iniComponentes();
    }
    
    public void setCoordinador(Coordinador coordinador){
        this.coordinador = coordinador;
    }
    
    // Método para instanciar los componentes
    public void iniComponentes(){
        
        correcto = new ImageIcon(getClass().getResource("/Sonidos/Correcto.png"));
        incorrecto = new ImageIcon(getClass().getResource("/Sonidos/Incorrecto.png"));
        
        Font fuente = new Font ("Arial", Font.BOLD, 15); 
        UIManager.put ("OptionPane.messageFont", fuente); 
        UIManager.put ("OptionPane.buttonColor", new Color(100, 149, 237));
        color = new Color(100, 149, 237);
        color1 = new Color(240, 248, 255);
        // Instancia de los botones.
        btSalir = new JButton("Salir");
        btSalir.setFont(new Font("Helvetica", Font.BOLD, 15));
        btSalir.setBackground(color1);
        btIniciar = new JButton("Iniciar");
        btIniciar.setFont(new Font("Arial", Font.BOLD, 18));
        btIniciar.setBackground(color1);
        btMostrar = new JButton("Instrucciones");
        btMostrar.setFont(new Font("Helvetica", Font.BOLD, 15));
        btMostrar.setBackground(color1);
        
        // Instancia de los botones para imágenes.
        dimension =  new Dimension(245, 245);
        boton1 = new JButton("0");
        boton1.setSize(dimension);
        boton1.setFont(new Font("Arial", 1, 1));
        setBoton(boton1);
        boton1.setEnabled(false);
        boton2 = new JButton("1");
        boton2.setSize(dimension);
        boton2.setFont(new Font("Arial", 1, 1));
        setBoton(boton2);
        boton2.setEnabled(false);
        boton3 = new JButton("2");
        boton3.setSize(dimension);
        boton3.setFont(new Font("Arial", 1, 1));
        setBoton(boton3);
        boton3.setEnabled(false);
        boton4 = new JButton("3");
        boton4.setSize(dimension);
        boton4.setFont(new Font("Arial", 1, 1));
        setBoton(boton4);
        boton4.setEnabled(false);
        
        // Se agrega el color a los botones.
        boton1.setBackground(Color.WHITE);
        boton2.setBackground(Color.WHITE);
        boton3.setBackground(Color.WHITE);
        boton4.setBackground(Color.WHITE);
        
        // Se agregan bordes redondeados a los botones,
        boton1.setBorder(new Borde(40));
        boton2.setBorder(new Borde(40));
        boton3.setBorder(new Borde(40));
        boton4.setBorder(new Borde(40));
        
        // Instancia de etiquetas.
        lbNivel = new JLabel("NIVEL 1");
        lbNivel.setFont(new Font("Arial", 1, 20));
        lbInstrucciones = new JLabel("Instrucciones");
        lbInstrucciones.setFont(new Font("Arial", Font.BOLD, 20));
        area = new JTextArea("jgfnjfgnjbngj\nojgorjgoe\nrlkjgnoego\nldrgnteoijg\n");
        area.setFont(new Font("Century", Font.ITALIC, 15));
        area.setEditable(false);
        // Instancia de la barra de progreso
        pbBarra = new JProgressBar(0, 4);
        pbBarra.setValue(0);
        pbBarra.setStringPainted(true);
        
        //Instancia de imágenes.
        imBuho = new ImageIcon("buho.png");
        imGallo = new ImageIcon("gallo.png");
        imPerro = new ImageIcon("perro.png");
        imGato = new ImageIcon("gato.png");
        
        // Se asignan las imágenes a los botones.
        boton1.setIcon(new ImageIcon(imBuho.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        boton2.setIcon(new ImageIcon(imGallo.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        boton3.setIcon(new ImageIcon(imPerro.getImage().getScaledInstance(boton3.getWidth(), boton3.getHeight(), Image.SCALE_SMOOTH)));
        boton4.setIcon(new ImageIcon(imGato.getImage().getScaledInstance(boton4.getWidth(), boton4.getHeight(), Image.SCALE_SMOOTH)));
        
        // Instancia de los paneles.
        pBase = new JPanel();
        pBase.setLayout(new BorderLayout());
        pBase.setBackground(color);
        pLateral = new JPanel();
        pLateral.setLayout(new BorderLayout());
        pLateral.setBackground(color);
        pCentro = new JPanel();
        pCentro.setLayout(new GridLayout(2, 2, 8, 8));
        pCentro.setBackground(color);
        pInferior = new JPanel();
        pInferior.setBackground(color);
        pInferior.setLayout(new BorderLayout());
        pSuperior = new JPanel();
        pSuperior.setBackground(color);
        pSuperior.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        Border borde = new CompoundBorder(new EmptyBorder(10, 10, 10, 10), new SoftBevelBorder(SoftBevelBorder.LOWERED));
        pLateral.setBorder(borde);
        
        // Se agregan los componentes a los paneles correspondientes.
        pLateral.add(lbInstrucciones, BorderLayout.NORTH);
        pLateral.add(area, BorderLayout.CENTER);
        pInferior.add(btIniciar, BorderLayout.CENTER);
        pInferior.add(btSalir, BorderLayout.EAST);
        pInferior.add(btMostrar, BorderLayout.WEST);
        pSuperior.add(lbNivel);
        pSuperior.add(pbBarra);
        pCentro.add(boton1);
        pCentro.add(boton2);
        pCentro.add(boton3);
        pCentro.add(boton4);
        
        // Se agregan los paneles al panel base.
        pBase.add(pLateral, BorderLayout.WEST);
        pBase.add(pInferior, BorderLayout.SOUTH);
        pBase.add(pSuperior, BorderLayout.NORTH);
        pBase.add(pCentro, BorderLayout.CENTER);
        add(pBase, BorderLayout.CENTER);
        
        //Eventos.
        //Todo comienza si el botón de iniciar es presionado
        btIniciar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    //Llama a reproducir un sonido aleatorio.
                    //Está dentro de un try-catch porque tiene excepciones por si el archivo
                    //No se encuentra o falle la reproducción
                  coordinador.reproducirN1();
                } catch (FileNotFoundException ex) {
                    ex.getMessage();
                    System.out.println("Error de posición");    
                } catch (JavaLayerException ex) {
                    ex.getMessage();
                    System.out.println("Error de Layer");
                } catch (Exception ex){
                    ex.getMessage();
                    System.out.println("Error cualquiera");
                }
                habilitarBotonSo();
                btIniciar.setEnabled(false);
               //Evento del botón 1.
                boton1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        //Se envía el "valor" del botón para comparar con la posición del audio.
                        if (coordinador.compararSo(boton1.getText()) == true){
                            JOptionPane.showMessageDialog(null, "Correcto", "....", JOptionPane.DEFAULT_OPTION, correcto);
                            boton1.setEnabled(false);
                            pbBarra.setValue(++b);
                            //Si la barra aún no está llena, entonces reproduce otro audio
                            if (estadoBarra(b) == false){
                                try {
                                    coordinador.reproducirN1();
                                } catch (FileNotFoundException ex) {
                                    ex.getMessage();
                                    System.out.println("Error de posición");
                                } catch (JavaLayerException ex) {
                                    ex.getMessage();
                                    System.out.println("Error de Layer");
                                }
                            }
                            else{
                                //En caso contrario se cierra la ventana.
                                //cerrar ventana
                                System.out.println("Finaliza");
                            }
                        }
                        //Si no son iguales, se reinicia todo y vuelve a empezar el juego.
                        else{
                            JOptionPane.showMessageDialog(null, "Incorrecto", "", JOptionPane.DEFAULT_OPTION, incorrecto);
                            try {
                                coordinador.reproducirN1();
                            } catch (FileNotFoundException ex) {
                                System.out.println("Error de posición");
                                ex.getMessage();
                            } catch (JavaLayerException ex) {
                                ex.getMessage();
                                System.out.println("Error de Layer");
                            }
                        }
                    }
                });
                //Lo mismo es para los siguientes botones.
                boton2.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        if (coordinador.compararSo(boton2.getText()) == true){
                            JOptionPane.showMessageDialog(null, "Correcto");
                            boton2.setEnabled(false);
                            pbBarra.setValue(++b);
                            if (estadoBarra(b) == false){
                                try {
                                    coordinador.reproducirN1();
                                } catch (FileNotFoundException ex) {
                                    System.out.println("Error de posición");
                                    ex.getMessage();
                                } catch (JavaLayerException ex) {
                                    System.out.println("Error de Layer");
                                    ex.getMessage();
                                }
                            }
                            else{
                                //cerrar ventana
                                System.out.println("Finaliza");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Incorrecto");
                            try {
                               coordinador.reproducirN1();
                            } catch (FileNotFoundException ex) {
                                System.out.println("Error de posición");
                                ex.getMessage();
                            } catch (JavaLayerException ex) {
                                System.out.println("Error de Layer");
                                ex.getMessage();
                            }
                        }
                    }
                });               
                
                boton3.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        if (coordinador.compararSo(boton3.getText()) == true){
                            JOptionPane.showMessageDialog(null, "Correcto");
                            boton3.setEnabled(false);
                            pbBarra.setValue(++b);
                            if (estadoBarra(b) == false){
                                try {
                                    coordinador.reproducirN1();
                                } catch (FileNotFoundException ex) {
                                    System.out.println("Error de posición");
                                    ex.getMessage();
                                } catch (JavaLayerException ex) {
                                    ex.getMessage();
                                    System.out.println("Error de Layer");
                                }
                            }
                            else{
                                //cerrar ventana
                                System.out.println("Finaliza");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Incorrecto");
                            try {
                                coordinador.reproducirN1();
                            } catch (FileNotFoundException ex) {
                                System.out.println("Error de posición");
                                ex.getMessage();
                            } catch (JavaLayerException ex) {
                                ex.getMessage();
                                System.out.println("Error de Layer");
                            }
                        }
                    }
                });
                
                boton4.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        if (coordinador.compararSo(boton4.getText()) == true){
                            JOptionPane.showMessageDialog(null, "Correcto");
                            boton4.setEnabled(false);
                            pbBarra.setValue(++b);
                            if (estadoBarra(b) == false){
                                try {
                                    coordinador.reproducirN1();
                                } catch (FileNotFoundException ex) {
                                    System.out.println("Error de posición");
                                    ex.getMessage();
                                } catch (JavaLayerException ex) {
                                    ex.getMessage();
                                    System.out.println("Error de Layer");
                                } 
                            }
                            else{
                                //cerrar ventana
                                System.out.println("Finaliza");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Incorrecto");
                            try {
                                coordinador.reproducirN1();
                            } catch (FileNotFoundException ex) {
                                System.out.println("Error de posición");
                                ex.getMessage();
                            } catch (JavaLayerException ex) {
                                System.out.println("Error de Layer");
                                ex.getMessage();
                            } 
                        }
                    }
                });
            
            }
        });
        
        btMostrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (pLateral.isVisible() == true)
                    pLateral.setVisible(false);
                else
                    pLateral.setVisible(true);
            }
        });
        
        btSalir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Usar dispose y llamar a la ventana anterior
            }
        });
    }
    
    private static void setBoton(JButton boton){
        
        boton.setFocusPainted(false);
        boton.setForeground(Color.GREEN);
    }
    
    //Verificar si la barra está llena.
    private boolean estadoBarra(int b){
        if (b == 4){
            JOptionPane.showMessageDialog(null, "POKÉMON CAPTURADO");
            coordinador.regresarNivelesSonido();
            return true;
        }
        else
            return false;
    }
    
    //Método para habilitar los botones.
    private void habilitarBotonSo(){
        boton1.setEnabled(true);
        boton2.setEnabled(true);
        boton3.setEnabled(true);
        boton4.setEnabled(true);
        
    }
}
