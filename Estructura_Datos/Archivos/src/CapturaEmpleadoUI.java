
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yalu
 */
public class CapturaEmpleadoUI extends JDialog implements ActionListener {
    private JTextField txtId, txtNombre, txtAp, txtSueldo;
    private JButton btCancelar, btAceptar;
    private JLabel lbId, lbNombre, lbAp, lbSueldo;

    Empresa miEmpresa;

    public CapturaEmpleadoUI(JFrame prop, Empresa em){
        super(prop, "Captura de Altas", true);

        setSize(300, 159);
        setLayout(new GridLayout(5,2));
        setLocation(170, 250);

        miEmpresa = em;

        lbId = new JLabel("ID: ");
        txtId = new JTextField(20);
        lbNombre = new JLabel("Nombre: ");
        txtNombre = new JTextField(20);
        lbAp = new JLabel("Apellidos: ");
        txtAp = new JTextField(20);
        lbSueldo = new JLabel("Sueldo: ");
        txtSueldo = new JTextField(20);

        btCancelar = new JButton("Cancelar");
        btCancelar.addActionListener(this);
        btAceptar = new JButton("Aceptar");
        btAceptar.addActionListener(this);

        add(lbId);
        add(txtId);
        add(lbNombre);
        add(txtNombre);
        add(lbAp);
        add(txtAp);
        add(lbSueldo);
        add(txtSueldo);
        add(btAceptar);
        add(btCancelar);
        pack();
    }

    public void actionPerformed(ActionEvent e) {
   	String nombre, apellido;
    	int id;
    	double sueldo;
        boolean continuar = true;

        if(e.getSource() == btAceptar){
            try{
                id = Integer.parseInt(txtId.getText());
                nombre = txtNombre.getText();
                apellido = txtAp.getText();
                sueldo = Double.parseDouble(txtSueldo.getText());

                Empleado em = new Empleado(id, nombre, apellido, sueldo);
                miEmpresa.agregaEmpleado(em);
            }
            catch(Exception ex){
               JOptionPane.showMessageDialog(null, "Formato de los datos invalido", "Aviso", JOptionPane.WARNING_MESSAGE);
               continuar = false;
            }
        }

        if(continuar) {
            txtId.setText("");
            txtNombre.setText("");
            txtAp.setText("");
            txtSueldo.setText("");
            this.setVisible(false);
        }
    }
}
