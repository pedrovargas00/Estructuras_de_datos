import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FraccionUI extends JFrame{
    
    private Fraccion fraccion = new Fraccion();
    protected Fraccion fr1;
    private Coordinador coordinador;
    private JComboBox cbOperacion;
    private JLabel lbDFraccion, lbNFraccion, lbDFraccion1, lbNFraccion1;
    private JTextField inDFraccion, inNFraccion, inDFraccion1, inNFraccion1, resultado;
    private JPanel base, panel, panel1, panel2, panel3;
    String sel;
    Fraccion fra;
    
    public FraccionUI(){
        
        super("Calculadora de fracciones");
        iniComponentes();
        this.setSize(350, 250);
        this.setResizable(false);
        
    }
    
    public void setCoordinador(Coordinador coordinador){
        this.coordinador = coordinador;
    }
    
    private void iniComponentes(){
        
        //Instancias.
        lbDFraccion = new JLabel("Denominador");
        lbNFraccion = new JLabel("Numerador");
        lbDFraccion1 = new JLabel("Denominador");
        lbNFraccion1 = new JLabel("Numerador");
        
        cbOperacion = new JComboBox();
        cbOperacion.addItem("Seleccione operacion");
        cbOperacion.addItem("Sumar");
        cbOperacion.addItem("Restar");
        cbOperacion.addItem("Multiplicar");
        cbOperacion.addItem("Dividir");
        
        inDFraccion = new JTextField("0", 6);
        inNFraccion = new JTextField("0", 6);
        inDFraccion1 = new JTextField("0", 6);
        inNFraccion1 = new JTextField("0", 6);
        resultado = new JTextField("", 9);  
        
        //Eventos.
        cbOperacion.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                fra = coordinador.cons(inNFraccion1.getText(), inDFraccion1.getText());
                JComboBox cb = (JComboBox)e.getSource();
                sel = (String)cb.getSelectedItem();
                Fraccion fr = null;
                switch(sel){
                    case "Sumar":
                        try {
                            fr = coordinador.sumar(new Fraccion(inNFraccion.getText(), inDFraccion.getText()), fra);
                        } catch (ValorNoValidoException ex) {
                            System.out.println(ex.getMessage());
                            JOptionPane.showMessageDialog(null, "Denominador cero");
                        }
                        resultado.setText(coordinador.mostrar(fr));
                        break;
                    case "Restar":
                        try {
                            fr = coordinador.restar(new Fraccion(inNFraccion.getText(), inDFraccion.getText()), fra);
                        } catch (ValorNoValidoException ex) {
                            System.out.println(ex.getMessage());
                            JOptionPane.showMessageDialog(null, "Denominador cero");
                        }
                        resultado.setText(coordinador.mostrar(fr));
                        break;
                    case "Multiplicar":
                        try {
                            fr = coordinador.multiplicar(new Fraccion(inNFraccion.getText(), inDFraccion.getText()), fra);
                        } catch (ValorNoValidoException ex) {
                            System.out.println(ex.getMessage());
                            JOptionPane.showMessageDialog(null, "Denominador cero");
                        }
                        resultado.setText(coordinador.mostrar(fr));
                        break;
                    case "Dividir":
                        try {
                            fr = coordinador.dividir(new Fraccion(inNFraccion.getText(), inDFraccion.getText()), fra);
                        } catch (ValorNoValidoException ex) {
                            System.out.println(ex.getMessage());
                            JOptionPane.showMessageDialog(null, "Denominador cero");
                        }
                        resultado.setText(coordinador.mostrar(fr));
                        break;
                    default:
                        break;
                }
            }
        });
        
        //Paneles.
        
        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.setBackground(Color.yellow);
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel1.setBackground(Color.WHITE);
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel2.setBackground(Color.yellow);
        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel3.setBackground(Color.WHITE);
        base = new JPanel();
        base.setLayout(new GridLayout(4, 1, 2, 1));
        base.add(panel);
        base.add(panel1);
        base.add(panel2);
        base.add(panel3);
        
        //Agregar elementos a paneles.
        panel.add(lbNFraccion);
        panel.add(inNFraccion);
        panel.add(lbDFraccion);
        panel.add(inDFraccion);
        panel1.add(lbNFraccion1);
        panel1.add(inNFraccion1);
        panel1.add(lbDFraccion1);
        panel1.add(inDFraccion1);
        panel2.add(cbOperacion);
        panel3.add(resultado);
        add(base, BorderLayout.CENTER);
    }
}