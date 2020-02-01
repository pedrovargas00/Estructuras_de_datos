import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class SonidoUI2 extends JFrame{
    
    // Inicialización de los componentes a usar.
    private JPanel pBase, pCentro, pLateral,pSuperior, pInferior;
    private JButton btSalir, btIniciar, btMostrar;
    private JButton boton1, boton2, boton3, boton4;
    private JLabel lbNivel, lbInstrucciones;
    private JTextArea area;
    private JProgressBar pbBarra;
    private ImageIcon imPerro, imGato, imGallo, imBuho;    
    
    //Constructor de la clase
    public SonidoUI2(){
        
        super();
        this.setSize(600, 600);
        this.setResizable(false);
        iniComponentes();
    }
    
    // Método para instanciar los componentes
    public void iniComponentes(){
       Color color = new Color(100, 149, 237); 
        // Instancia de los botones.
        btSalir = new JButton("Salir");
        btSalir.setSize(10, 5);
        btIniciar = new JButton("Iniciar");
        btMostrar = new JButton("Instrucciones");
        
        // Instancia de los botones para imágenes.
        boton1 = new JButton();
        boton1.setSize(200, 200);
        boton2 = new JButton();
        boton2.setSize(200, 200);
        boton3 = new JButton();
        boton3.setSize(200, 200);
        boton4 = new JButton();
        boton4.setSize(200, 200);
        
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
        lbNivel = new JLabel("NIVEL 2");
        lbNivel.setFont(new Font("Arial", 1, 20));
        lbInstrucciones = new JLabel("Instrucciones");
        lbInstrucciones.setFont(new Font("Arial", Font.BOLD, 20));
        area = new JTextArea("jgfnjfgnjbngj\nojgorjgoe\nrlkjgnoego\nldrgnteoijg\n");
        area.setFont(new Font("Century", Font.ITALIC, 15));
        area.setEditable(false);
        
        // Instancia de la barra de progreso
        pbBarra = new JProgressBar(0, 100);
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
        pInferior.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pInferior.setBackground(color);
        pSuperior = new JPanel();
        pSuperior.setLayout(new FlowLayout(FlowLayout.CENTER));
        pSuperior.setBackground(color);
        
        Border borde = new CompoundBorder(new EmptyBorder(10, 10, 10, 10), new SoftBevelBorder(SoftBevelBorder.LOWERED));
        pLateral.setBorder(borde);
        
        // Se agregan los componentes a los paneles correspondientes.
        pLateral.add(lbInstrucciones, BorderLayout.NORTH);
        pLateral.add(area, BorderLayout.CENTER);
        pInferior.add(btIniciar);
        pInferior.add(btSalir);
        pInferior.add(btMostrar, FlowLayout.LEFT);
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
    }
    
     public static void setBoton(JButton boton){
        
        boton.setFocusPainted(false);
        boton.setForeground(Color.GREEN);
     }
}
