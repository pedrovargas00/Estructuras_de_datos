import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*La mayoría de los componentes gráficos de
Java están en el paquete AWT, se extiende JFrame
porque es de donde se obtienen los componentes y se crea la ventana*/

public class Convertidor extends JFrame{
    
    //Inicialmente se crean las referencias de los objetos que se quieren
    protected String sel, sel1;
    private JLabel /*lbDato,*/ lbConvierte, resultado;
    private JTextField txtDato, txtResultado;
    private JButton btConvertir;
    private JComboBox cbTipo, cbInicial;
    Convertir con = new Convertir();
    
    public Convertidor(){
        //setTitle es para agregar título a la ventana
        setTitle("Convertidor de Unidades de almacenamiento");
        //Evita que se rediemnsione la ventana
        setResizable(false);
        //Le da formato a la ventana (Opcional)
        setLayout(new FlowLayout());
    //Instanciar componentes.
    /*Aquí se instancian los componentes
    y se agregan a los paneles que les corresponde*/
    iniComponentes();
    
    //Colocae en el contenedor (JFrame).
    /*add(lbDato);
    Se agregan los componentes necesarios 
    a la ventana principal (Opcional)
    */
    add(cbInicial); add(txtDato);
    add(lbConvierte);add(cbTipo);
    add(btConvertir);
    add(resultado); add(txtResultado);
    
    pack();
    setLocation(200, 200);
    //setSize(500, 500);
    
}

    private void iniComponentes(){
        //lbDato = new JLabel("Bytes: ");
        //Se instancian los elementos de la ventana
        lbConvierte = new JLabel("Convierte a ");
        resultado = new JLabel("Resultado");
        
        txtDato = new JTextField("", 10);
        txtResultado = new JTextField("", 10);
        
        //Instancia el comboBox y se agregan los elementos
        String []tipos = {"Selecciona tipo", "Bytes", "KBytes", "MBytes", "GBytes", "TBytes"};
        cbTipo = new JComboBox();
        cbTipo.addItem("Seleccionar tipo");
        cbTipo.addItem("Bytes");
        cbTipo.addItem("KBytes");
        cbTipo.addItem("MBytes");
        cbTipo.addItem("GBytes");
        cbTipo.addItem("TBytes");
        cbTipo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox)e.getSource();
                sel = (String)cb.getSelectedItem();
                //setTitle(seleccionado);
        }
        });
        
        cbInicial = new JComboBox();
        cbInicial.addItem("Seleccionar tipo");
        cbInicial.addItem("Bytes");
        cbInicial.addItem("KBytes");
        cbInicial.addItem("MBytes");
        cbInicial.addItem("GBytes");
        cbInicial.addItem("TBytes");
        
        //Estos son los eventos de los botones y espacios
        //Para escribir. La síntaxis es igualpara todo evento
        cbInicial.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox)e.getSource();
                sel1 = (String)cb.getSelectedItem();
            }
        });
     
        btConvertir = new JButton("Convertir");
        btConvertir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            //Dentro de este método irán todas las instrucciones que se ejecutarán al presionar el botón.
                String salida;
                double in;
                switch(sel){
                    case "Bytes":
                        in = Double.parseDouble(txtDato.getText());
                        con.setDatoEntrada(in);
                        con.bytes(sel1);
                        salida = String.valueOf(con.getDatoSalida());
                        txtResultado.setText(salida);
                        break;
                    case "KBytes":
                        in = Double.parseDouble(txtDato.getText());
                        con.setDatoEntrada(in);
                        con.kilobyte(sel1);
                        salida = String.valueOf(con.getDatoSalida());
                        txtResultado.setText(salida);
                        break;
                    case "Mbytes":
                        in = Double.parseDouble(txtDato.getText());
                        con.setDatoEntrada(in);
                        con.megabyte(sel1);
                        salida = String.valueOf(con.getDatoSalida());
                        txtResultado.setText(salida);
                        break;
                    case "GBytes":
                        in = Double.parseDouble(txtDato.getText());
                        con.setDatoEntrada(in);
                        con.gigabyte(sel1);
                        salida = String.valueOf(con.getDatoSalida());
                        txtResultado.setText(salida);
                        break;
                    case "TBytes":
                        in = Double.parseDouble(txtDato.getText());
                        con.setDatoEntrada(in);
                        con.gigabyte(sel1);
                        salida = String.valueOf(con.getDatoSalida());
                        txtResultado.setText(salida);
                        break;
                    default:
                        break;
                }
            }
        });
    }    
}
        