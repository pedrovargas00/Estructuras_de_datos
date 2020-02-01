package Memorama;

import Coordinador.*;
import javax.swing.*;
import java.awt.*;

public class MemoramaUI extends JFrame{
    
    private Coordinador coordinador;
    //se declaran los componentes de la ventana o Frame
    private JPanel base, lateral, inferior, centro, superior;
    private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, salir, mostrar;
    private JLabel nivel,instrucciones;
    private JProgressBar barra;
    private JTextArea area;
    
    //Constructor de la clase Memorama, primer nivel
    public MemoramaUI(){
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
        Dimension d = new Dimension(200,200);
        
        bt1 = new JButton();
        bt1.setSize(d);
        ImageIcon imagen = new ImageIcon("Back.jpg");
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
        
        salir = new JButton("Salir");
        salir.setFont(new Font("Arial",Font.BOLD,20));
        
        nivel = new JLabel("Nivel 1");
        nivel.setFont(new Font("Arial",Font.BOLD,20));
        
        instrucciones = new JLabel("Instrucciones");
        instrucciones.setFont(new Font("Arial",Font.PLAIN,20));
        
        area = new JTextArea("Esta es una prue\n como se\nveria el texto \nen el area.\n A veri si asi \njala");
        area.setFont(new Font("Arial",Font.PLAIN,20));
        area.setEditable(false);
        area.setBackground(color);
        
        mostrar = new JButton("Mostrar");
        mostrar.setFont(new Font("Arial",Font.BOLD,20));
        
        barra = new JProgressBar(1,4); //son los limites de la barra de progreso
        barra.setValue(0); //va incrementando el porcentaje de la barra de progreso
        barra.setStringPainted(true); //hace que muestre el porcentaje en la barra
        
        //se agregan los componentes al panel  central
        centro = new JPanel();
        centro.setLayout(new GridLayout(2, 4, 2, 2)); 
        centro.setBackground(color);
        centro.add(bt1);
        centro.add(bt2);
        centro.add(bt3);
        centro.add(bt4);
        centro.add(bt5);
        centro.add(bt6);
        centro.add(bt7);
        centro.add(bt8);
        
        //se agregan los componentes al panel inferior
        inferior = new JPanel();
        inferior.setLayout(new BorderLayout(2,1));
        inferior.add(mostrar, BorderLayout.WEST);
        inferior.add(salir,BorderLayout.EAST);
        inferior.setBackground(color);
        //se agregan los componentes al panel superior
        superior =new JPanel();
        superior.setLayout(new FlowLayout());
        superior.add(this.nivel);
        superior.add(this.barra);
        superior.setBackground(color);
        //se agregan componentes al panel lateral.
        lateral = new JPanel();
        lateral.setLayout(new BorderLayout());
        lateral.add(instrucciones, BorderLayout.NORTH);
        lateral.add(area, BorderLayout.CENTER);
        lateral.setBackground(color);
        lateral.setVisible(false);
        
        //se agregan los paneles a la base.
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