package Memorama;

import Coordinador.*;
import javax.swing.*;
import java.awt.*;

public class Memorama2 extends JFrame{
    
    private Coordinador coordinador;
    //se declaran los componentes de la ventana o Frame
    private JPanel base, lateral, inferior, centro, superior;
    private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8,bt9,bt10,bt11,bt12, salir, mostrar;
    private JLabel nivel,instrucciones;
    private JProgressBar barra;
    private JTextArea area;
    
    //Constructor de la clase Memorama, segundo nivel
    public Memorama2(){
        
        super();
        this.setSize(600, 600);
        this.setLocation(100, 100);
        this.setResizable(false);
        
        //se llama al método, para iniciar los componentes del Frame y agregarlos al mismo
        iniComponentes();
    }
    
    public void setCoordinador(Coordinador coordinador){
        this.coordinador = coordinador;
    }
    
    public void iniComponentes(){
        Color color = new Color(152,251,152);
        Dimension d = new Dimension(150,150);
        ImageIcon imagen = new ImageIcon("Back.jpg");
        
        bt1 = new JButton();
        bt1.setSize(d);
        bt1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(bt1.getWidth(), bt1.getHeight(), Image.SCALE_SMOOTH)));
        bt1.setBackground(Color.WHITE);
        bt2 = new JButton();
        bt2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(bt1.getWidth(), bt1.getHeight(), Image.SCALE_SMOOTH)));
        bt2.setBackground(Color.WHITE);
        bt3 = new JButton();
        bt3.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(bt1.getWidth(), bt1.getHeight(), Image.SCALE_SMOOTH)));
        bt3.setBackground(Color.WHITE);
        bt4 = new JButton();
        bt4.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(bt1.getWidth(), bt1.getHeight(), Image.SCALE_SMOOTH)));
        bt4.setBackground(Color.WHITE);
        bt5 = new JButton();
        bt5.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(bt1.getWidth(), bt1.getHeight(), Image.SCALE_SMOOTH)));
        bt5.setBackground(Color.WHITE);
        bt6 = new JButton();
        bt6.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(bt1.getWidth(), bt1.getHeight(), Image.SCALE_SMOOTH)));
        bt6.setBackground(Color.WHITE);
        bt7 = new JButton();
        bt7.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(bt1.getWidth(), bt1.getHeight(), Image.SCALE_SMOOTH)));
        bt7.setBackground(Color.WHITE);
        bt8 = new JButton();
        bt8.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(bt1.getWidth(), bt1.getHeight(), Image.SCALE_SMOOTH)));
        bt8.setBackground(Color.WHITE);
        bt9 = new JButton();
        bt9.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(bt1.getWidth(), bt1.getHeight(), Image.SCALE_SMOOTH)));
        bt9.setBackground(Color.WHITE);
        bt10 = new JButton();
        bt10.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(bt1.getWidth(), bt1.getHeight(), Image.SCALE_SMOOTH)));
        bt10.setBackground(Color.WHITE);
        bt11 = new JButton();
        bt11.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(bt1.getWidth(), bt1.getHeight(), Image.SCALE_SMOOTH)));
        bt11.setBackground(Color.WHITE);
        bt12 = new JButton();
        bt12.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(bt1.getWidth(), bt1.getHeight(), Image.SCALE_SMOOTH)));
        bt12.setBackground(Color.WHITE);
        
        salir = new JButton("Salir");
        salir.setFont(new Font("Arial",Font.BOLD,20));
        
        nivel = new JLabel("Nivel 2");
        nivel.setFont(new Font("Arial",Font.BOLD,20));
        
        instrucciones = new JLabel("Instrucciones");
        instrucciones.setFont(new Font("Arial",Font.PLAIN,20));
        
        area = new JTextArea("Prueba");
        area.setFont(new Font("Arial",Font.PLAIN,15));
        area.setEditable(false);
        area.setBackground(color);
        
        mostrar = new JButton("Mostrar");
        mostrar.setFont(new Font("Arial",Font.BOLD,20));
        
        
        barra = new JProgressBar(1,6); //son los limites de la barra de progreso
        barra.setValue(0); //va incrementando el porcentaje de la barra de progreso
        barra.setStringPainted(true); //hace que muestre el porcentaje en la barra
        
        centro = new JPanel();
        centro.setLayout(new GridLayout(3, 4, 2, 2)); 
        centro.add(bt1);
        centro.add(bt2);
        centro.add(bt3);
        centro.add(bt4);
        centro.add(bt5);
        centro.add(bt6);
        centro.add(bt7);
        centro.add(bt8);
        centro.add(bt9);
        centro.add(bt10);
        centro.add(bt11);
        centro.add(bt12);
        centro.setBackground(color);
        
        inferior = new JPanel();
        inferior.setLayout(new BorderLayout(2,1));
        inferior.add(mostrar, BorderLayout.WEST);
        inferior.add(salir,BorderLayout.EAST);
        inferior.setBackground(color);
        
        superior =new JPanel();
        superior.setLayout(new FlowLayout());
        superior.add(this.nivel);
        superior.add(this.barra);
        superior.setBackground(color);
        
        lateral = new JPanel();
        lateral.setLayout(new BorderLayout());
        lateral.add(instrucciones, BorderLayout.NORTH);
        lateral.add(area, BorderLayout.CENTER);
        lateral.setVisible(false);
        lateral.setBackground(color);
        
        base = new JPanel();
        base.setLayout(new BorderLayout());
        base.setBackground(color);
        base.add(superior, BorderLayout.NORTH);
        base.add(centro, BorderLayout.CENTER);
        base.add(inferior, BorderLayout.SOUTH);
        base.add(lateral, BorderLayout.WEST);
        add(base, BorderLayout.CENTER);
    }
}
