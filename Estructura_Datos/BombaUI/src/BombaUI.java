/*package Vista;
import Test.Test;*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class BombaUI extends JFrame {

//Declaración de componentes.
    
    private Test test;
    private JLabel lbCantidad, lbVenta, lbLitros;
    private JTextField txtCantidad, txtVenta, txtLitros;
    private JButton btDespachar; 
    private JRadioButton rbPesos, rbLitros;
    private ButtonGroup grupo;
    private JPanel pNorte, pDespachar, pVenta;
    
    public BombaUI( ) {
         super("Servicio de Gasolina");

         //instanciar componentes
        initComponentes();
        this.setSize(420, 420);
        this.setResizable(false);       
    }
    
    public void setTest(Test test){
        this.test = test;
    }
    private void initComponentes(){
        //instanciar componentes
           lbCantidad = new JLabel("Cantidad:");
           lbVenta = new JLabel ("Venta $:");
           lbLitros = new JLabel ("Litros vendidos: ");
           
           txtCantidad = new JTextField("0.0", 8);
           txtCantidad.setHorizontalAlignment(JTextField.TRAILING);
           txtVenta = new JTextField("0", 8);
           txtVenta.setEditable(false);
           txtLitros = new JTextField("0", 8);
           txtLitros.setEditable(false);
           btDespachar = new JButton("Despachar");
           //btDespachar.setEnabled(false);
           rbPesos = new JRadioButton("Pesos");
           rbLitros = new JRadioButton("Litros");
           grupo = new ButtonGroup();
           grupo.add(rbPesos);
           grupo.add(rbLitros);
           //rbPesos.setSelected(true);
     
           // Eventos.
           btDespachar.addActionListener(new ActionListener (){
               public void actionPerformed(ActionEvent e){
                   if (rbLitros.isSelected() == true){
                       test.despacharLitros(txtCantidad.getText());
                       txtVenta.setText(test.VerVenta());
                       txtLitros.setText(test.verLitros());
                       JOptionPane.showMessageDialog(null, test.consinLitros(txtCantidad.getText()));
                   }
                   
                   if (rbPesos.isSelected() == true){
                       test.despacharDinero(txtCantidad.getText()); 
                       txtVenta.setText(test.VerVenta());
                       txtLitros.setText(test.verLitros());
                       JOptionPane.showMessageDialog(null, test.consinLitros(txtCantidad.getText()));
                   }
               }
           });
           
           //Crear paneles
           pNorte = new JPanel();
           pNorte.setLayout(new GridLayout(2,1, 1,1));
           pDespachar = new JPanel(new FlowLayout(FlowLayout.LEFT));
           pVenta = new JPanel(new FlowLayout(FlowLayout.LEFT));
           pNorte.add(pDespachar);
           pNorte.add(pVenta);
    
           //Agregar componetes a los paneles
           pDespachar.add(lbCantidad);
           pDespachar.add(txtCantidad);
           pDespachar.add(rbPesos);
           pDespachar.add(rbLitros);
           pDespachar.add(btDespachar);
           pVenta.add(lbVenta);
           pVenta.add(txtVenta);
           pVenta.add(lbLitros);
           pVenta.add(txtLitros);       
           add(pNorte, BorderLayout.NORTH);
           
           //Agregué un botón para poner al centro la palabra PEMEX
           //No tiene uso adicional
           JButton btPemex = new JButton("  PEMEX  ");
           btPemex.setBackground(Color.GREEN);
           btPemex.setForeground(Color.WHITE);
           btPemex.setFont(new Font("Tahoma", Font.BOLD, 48));
           add(btPemex, BorderLayout.CENTER);
    }
}