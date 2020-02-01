/*
Estructuras de datos
García Cruz Ricardo Emmanuel 
Vargas Arenas Pedro
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraVista extends JFrame implements ActionListener {
    private JTextField txtRes, txtPostFijo;
    private JButton btPostFijo, btLimpiar, btIgual;
    private JButton []digitos;
    private JButton []opers;
    private Calculadora cal;
    private Controlador controlador;
    
    public CalculadoraVista(/*Calculadora cal*/){
        super("Calculadora sencilla");
        setLocation(150, 100);

        this.cal = cal; //instancia de la calculadora

        initComponentes();
        this.setSize(300, 300);
        this.setVisible(true);

    }

    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    
    private void initComponentes(){
        txtRes = new JTextField("", 20);
        txtRes.setHorizontalAlignment(JTextField.RIGHT);
        txtPostFijo = new JTextField("", 20);

        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btPostFijo = new JButton("PostFijo");
        btPostFijo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                   String posfijo = controlador.convertirPostFijo(txtRes.getText());
                   txtPostFijo.setText(posfijo);
            }
        });
        
        btLimpiar = new JButton("Limpiar");
        btLimpiar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txtRes.setText("");
                txtPostFijo.setText("");
            }
        });
        
        btIgual = new JButton ("  =  ");
        btIgual.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //controlador.igual(txtPostFijo.getText());
                txtRes.setText(txtRes.getText()+" = "+controlador.igual(txtPostFijo.getText()));
            }
        });
        
        p2.add(btPostFijo);
        p2.add(btLimpiar);
        p2.add(btIgual);

        JPanel pA = new JPanel(new GridLayout(3,1,2,2));
        pA.add(txtRes);
        pA.add(txtPostFijo);
        pA.add(p2);

         JPanel p3 = new JPanel(new GridLayout(4,4));
         opers = new JButton[4];
         opers[0] = new JButton("/");
         opers[1] = new JButton("*");
         opers[2] = new JButton("+");
         opers[3] = new JButton("-");
         for(int i=0; i<4; i++){
             opers[i].addActionListener(this);
             p3.add(opers[i]);
         }

         digitos = new JButton[10];
         for(int i = 0; i < 10; i++){
             digitos[i] = new JButton("" + i);
             digitos[i].addActionListener(this);
             p3.add(digitos[i]);
         }

         //se agregan los paneles al frame
        add(pA, BorderLayout.NORTH);
        add(p3, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
            
        String infijo;

        infijo = txtRes.getText();
        infijo += e.getActionCommand();
        txtRes.setText(infijo);
    }
}