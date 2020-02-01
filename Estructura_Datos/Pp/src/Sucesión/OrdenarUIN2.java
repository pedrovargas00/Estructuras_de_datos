package Sucesión;

import Coordinador.*;
import java.awt.*;
import javax.swing.*;
/**
García Cruz Ricardo Emmanuel
Ramos López Lizbeth
Tepoz Romero Belén
Vargas Arenas Pedro
 */
//interfaz nivel dos, Juego de ordenamiento de números
public class OrdenarUIN2 extends JFrame{
    
    private Coordinador coordinador;
    
    //declaración de componentes
    private JPanel base,norte,sur,instru,botones;
    private JLabel instruc,nivel;
    private JButton boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,salir,esconder;
    private JProgressBar nivelb;
    private JTextArea instrucciones; 
    
    public OrdenarUIN2(){
        //instanciar componentes
       super("juego ordenar"); 
       inicomponentes();
       this.setSize(600, 600);
       this.setResizable(false);
    }

    public void setCoordinador(Coordinador coordinador){
        this.coordinador = coordinador;
    }
    
    private void inicomponentes() {

        //creamos el tipo de fuente y tamaño de letra que vamos a utilizar para los botones
        Font fuente = new Font("mensaje",Font.BOLD,15);
        Font f = new Font("Arial", Font.BOLD, 25);
        //color de los paneles
        Color color = new Color(110,139,161);
        //instanciar componentes, agrecandoles sus caracteristicas
        nivel = new JLabel("NIVEL2");
        nivel.setFont(new Font("nivel", Font.BOLD, 20));
        instruc = new JLabel("instrucciones");
        instruc.setFont(fuente);
        nivelb = new JProgressBar();
        salir = new JButton("SALIR");
        salir.setFont(fuente);
        esconder = new JButton("OCULTAR");
        esconder.setFont(fuente);
        instrucciones = new JTextArea("aqui van las \n instrucciones");
        instrucciones.setEditable(false);
    
        //utilizamos la funcion random para agregar numeros aleatorios a los botones
        boton1 = new JButton(""+(int) ((Math.random()*30)+ 1));
        boton1.setFont(f);
        boton2 = new JButton(""+(int) ((Math.random()*30)+ 1));
        boton2.setFont(f);
        boton3 = new JButton(""+(int) ((Math.random()*30)+ 1));
        boton3.setFont(f);
        boton4 = new JButton(""+(int) ((Math.random()*30)+ 1));
        boton4.setFont(f);
        boton5 = new JButton(""+(int) ((Math.random()*30)+ 1));
        boton5.setFont(f);
        boton6 = new JButton(""+(int) ((Math.random()*30)+ 1));
        boton6.setFont(f);
        boton7 = new JButton(""+(int) ((Math.random()*30)+ 1));
        boton7.setFont(f);
        boton8 = new JButton(""+(int) ((Math.random()*30)+ 1));
        boton8.setFont(f);
        boton9 = new JButton(""+(int) ((Math.random()*30)+ 1));
        boton9.setFont(f);
        
        //crear paneles
        base = new JPanel();
        base.setBackground(color);
        base.setLayout(new BorderLayout(2,4));
        norte = new JPanel();
        norte.setBackground(color);
        norte.setSize(600, 100);
        norte.setLayout(new FlowLayout());
        sur = new JPanel();
        sur.setLayout(new BorderLayout(2,1));
        sur.setBackground(color);
        instru = new JPanel();
        instru.setBackground(color);
        instru.setLayout(new BorderLayout());
        instru.setVisible(true);
        botones = new JPanel();
        botones.setLayout(new GridLayout(3,3, 10, 10));
        botones.setBackground(color);
        
        // añadimos los componentes al panel correspondiente
        botones.add(boton1);
        botones.add(boton2);
        botones.add(boton3);
        botones.add(boton4);
        botones.add(boton5);
        botones.add(boton6);
        botones.add(boton7);
        botones.add(boton8);
        botones.add(boton9);
        norte.add(nivel);
        norte.add(nivelb);
        instru.add(instruc,BorderLayout.NORTH);
        instru.add(instrucciones, BorderLayout.CENTER);
        sur.add(esconder, BorderLayout.WEST);
        sur.add(salir, BorderLayout.EAST);
        
        //agregamos los paneles a panel principal
        base.add(norte,BorderLayout.NORTH);
        base.add(sur,BorderLayout.SOUTH);
        base.add(instru,BorderLayout.WEST);
        base.add(botones,BorderLayout.CENTER);
        add(base,BorderLayout.CENTER);
    }
}