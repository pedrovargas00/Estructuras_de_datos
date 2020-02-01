package Interfaces;
import Controlador.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Árbol.Persona;

public class DatosUI extends JFrame {
 
    private Controlador controlador;
    private Habitos habito;

// panel Norte
//paneles principales
    private JPanel base, norte, centro, sur;
    private JScrollPane center;
//inf Personal
    private JPanel p1, p2, p3;
    private JLabel InfP, nombre,sexo,vive;
    private JTextField nomb;
    private JCheckBox masculino,femenino,siVive,noVive;
//inf Extra
    private JPanel p4, p5, p6, p7;
    private JLabel edad,peso,estatura,nacionalidad ;
    private JTextField ed, pe, estat, nacion;
// inf muerte
    private JPanel p8, p9;
    private JLabel causa, enfermedades ;    
    private JCheckBox enfermedad, natural;
    private JCheckBox esquizofrenia, hemofilia, diabetes, obesidad, labioL, cancerMP, defectosTN,hipertension;
// historial medico
    private JPanel ph,ph1,ph2,ph3,ph4,ph5,ph6,ph7,ph8,ph9,ph10,ph11,ph12,ph13,ph14;
    private JLabel historial,preg1,preg2,preg3,preg4,preg5,preg6,preg7,preg8,preg9,preg10;
    private JComboBox resHist1,resHist2,resHist3,resHist4,resHist5,resHist6,resHist7,resHist8,resHist9,resHist10;
//panel sur
    private Persona persona;
    private JButton salir, guardar;
    
    public DatosUI(Persona dato){
        this.persona=dato;
        this.setSize(620, 500);
        this.setTitle("Formulario");
        this.setLocation(50,50);
        this.setResizable(false);
        this.setVisible(false);
        init();

    }
    
    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    
    public void init(){
    
        habito = new Habitos();
        base = new JPanel(new BorderLayout(1,3));
        norte = new JPanel(new BorderLayout());
        centro = new JPanel(new BorderLayout());
        sur = new JPanel(new BorderLayout());
        center = new JScrollPane(centro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        center.setVisible(false);
        
        //norte
        p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p3 = new JPanel(new BorderLayout());
//      FlowLayout.TRAILING
        p4 = new JPanel(new GridLayout(1,4));
        p5 = new JPanel(new GridLayout(1,4));
        p6 = new JPanel(new GridLayout(8,1));
        p7 = new JPanel(new BorderLayout());
        p7.setVisible(false);
        
        p8 = new JPanel(new FlowLayout());
        p9 = new JPanel(new BorderLayout());
        p9.setVisible(false);
        
        //centro
        ph = new JPanel(new BorderLayout());
        ph1 = new JPanel(new BorderLayout());
        ph2 = new JPanel(new BorderLayout());
        ph3 = new JPanel(new BorderLayout());
        ph4 = new JPanel(new BorderLayout());
        ph5 = new JPanel(new BorderLayout());
        ph6 = new JPanel(new BorderLayout());
        ph7 = new JPanel(new BorderLayout());
        ph8 = new JPanel(new BorderLayout());
        ph9 = new JPanel(new BorderLayout());
        ph10 = new JPanel(new BorderLayout());
        ph11 = new JPanel(new BorderLayout());
        ph12 = new JPanel(new BorderLayout());
        ph13 = new JPanel(new BorderLayout());
        ph14 = new JPanel(new BorderLayout());        
        
        InfP = new JLabel("Información Personal");
        InfP.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT, 15));
        nombre = new JLabel("Nombre Completo");
        nomb = new JTextField(20);
        sexo = new JLabel("SEXO   ");
        masculino = new JCheckBox("Masculino    ");
        femenino = new JCheckBox("Femenino            ");
        vive = new JLabel("         VIVE ");
        siVive = new JCheckBox("Si    ");
        noVive = new JCheckBox("No");

        edad = new JLabel("EDAD");        
        ed = new JTextField(5); 
        peso = new JLabel("PESO");
        pe= new JTextField(5);
        estatura = new JLabel("ESTATURA");
        estat = new JTextField(5);
        nacionalidad = new JLabel("NACIONALIDAD");
        nacion = new JTextField(10);

        causa = new JLabel("CAUSA DE MUERTE                 ");
        enfermedad = new JCheckBox("ENFERMEDAD          ");
        natural = new JCheckBox("NATURAL");
        
        esquizofrenia = new JCheckBox("Esquizofrenia");
        hemofilia  = new JCheckBox("Hemofilia");
        diabetes  = new JCheckBox("Diabetes");
        obesidad  = new JCheckBox("Obesidad");
        labioL  = new JCheckBox("Labio Leporino");
        cancerMP  = new JCheckBox("Cáncer (Mama/Prostata)");
        defectosTN  = new JCheckBox("Defectos del tubo neural");
        hipertension  = new JCheckBox("Hipertensión");
        enfermedades = new JLabel("PADECÍA ALGUNA DE ESTAS ENFERMEDADES?");
        guardar = new JButton("GUARDAR");
        guardar.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT, 15));
        salir = new JButton("SALIR");
        salir.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT, 15));
        //PANEL NORTE-----------------------------------------------------------
        //empieza inf personal
        nomb.setText(persona.getNombre()+"");
        p1.add(nombre);
        p1.add(nomb);
        p2.add(sexo);
        p2.add(masculino);
        p2.add(femenino);
        p2.add(vive);
        p2.add(siVive);
        p2.add(noVive);
        p3.add(InfP, BorderLayout.NORTH);
        p3.add(p1, BorderLayout.CENTER);
        p3.add(p2, BorderLayout.SOUTH);
        //termina, comienza inf extra
        p4.add(edad);
        p4.add(ed);
        p4.add(peso);
        p4.add(pe);
        p5.add(estatura);
        p5.add(estat);
        p5.add(nacionalidad);
        p5.add(nacion);
        p7.add(p4, BorderLayout.NORTH);
        p7.add(p5, BorderLayout.SOUTH);
        // termina comienza inf (muerte)
        p8.add(causa);
        p8.add(enfermedad);
        p8.add(natural);
        p9.add(p8, BorderLayout.NORTH);

        p6.add(esquizofrenia);
        p6.add(hemofilia);
        p6.add(diabetes);
        p6.add(defectosTN);
        p6.add(labioL);
        p6.add(obesidad);
        p6.add(hipertension);
        p6.add(cancerMP);
        p9.add(enfermedades, BorderLayout.CENTER);
        p9.add(p6, BorderLayout.SOUTH);
        // termina, llena panel norte
        norte.add(p3, BorderLayout.NORTH);
        norte.add(p7, BorderLayout.CENTER);
        norte.add(p9, BorderLayout.SOUTH);
        //termina
        //PANEL CENTRO----------------------------------------------------------
        //comienzan preguntas
        historial = new JLabel("Historial Médico");
        historial.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT, 15));
        preg1 = new JLabel("¿Ha sufrido hemorragias constantes y prolongadas sin razon aparente en los ultimos 3 meses?");
        resHist1 = new JComboBox();
        resHist1.addItem("");
        resHist1.addItem("SI");
        resHist1.addItem("NO");
        preg2 = new JLabel("¿Ha recibido algún tipo de tratamiento psicológico o psiquiatrico?");
        resHist2 = new JComboBox();
        resHist2.addItem("");
        resHist2.addItem("SI");
        resHist2.addItem("NO");
        preg3 = new JLabel("¿Ha sufrido delirios, alucinaciones, pensamiendo y habla desorganizada?");
        resHist3 = new JComboBox();
        resHist3.addItem("");
        resHist3.addItem("SI");
        resHist3.addItem("NO");
        preg4 = new JLabel("¿Ha presentado aumento de sed, vision borrosa o fatiga?");
        resHist4 = new JComboBox();
        resHist4.addItem("");
        resHist4.addItem("SI");
        resHist4.addItem("NO");
        preg5 = new JLabel("si está embarazada: ¿ha estado expuesta a altas temperaturas entre el 4-6 mes?");
        resHist5 = new JComboBox();
        resHist5.addItem("");
        resHist5.addItem("SI");
        resHist5.addItem("NO");
        preg6 = new JLabel("¿Ha tenido dolor fuerte de cabeza, mauseas o vomito, confusión, cambios en la visión o sangrado nasal?");
        resHist6 = new JComboBox();
        resHist6.addItem("");
        resHist6.addItem("SI");
        resHist6.addItem("NO");
        preg7 = new JLabel("Si es mujer,¿tuvo su primer periodo a temprana edad? (menor de 12 años)");
        resHist7 = new JComboBox();
        resHist7.addItem("");
        resHist7.addItem("SI");
        resHist7.addItem("NO");
        preg8 = new JLabel("¿durante su pubertad se expuso a radiaciones?");
        resHist8 = new JComboBox();
        resHist8.addItem("");
        resHist8.addItem("SI");
        resHist8.addItem("NO");
        preg9 = new JLabel("Si es hombre, ¿Presenta sangrado al orinar y/o al eyacular?");      
        resHist9 = new JComboBox();
        resHist9.addItem("");
        resHist9.addItem("SI");
        resHist9.addItem("NO");
        preg10 = new JLabel("¿Presenta molestias en la zona pélvica al sentarse?");
        resHist10 = new JComboBox();
        resHist10.addItem("");
        resHist10.addItem("SI");
        resHist10.addItem("NO");
        
        //agregamos 
        // agregamos preguntas a los paneles BorderLayout
        
        ph.add(historial, BorderLayout.NORTH);
        ph.add(preg1, BorderLayout.CENTER);
        ph.add(resHist1, BorderLayout.SOUTH);
        
        ph1.add(preg2, BorderLayout.NORTH);
        ph1.add(resHist2, BorderLayout.SOUTH);
        
        ph2.add(preg3, BorderLayout.NORTH);
        ph2.add(resHist3, BorderLayout.SOUTH);
        
        ph3.add(preg4, BorderLayout.NORTH);
        ph3.add(resHist4, BorderLayout.SOUTH);
        
        ph4.add(preg5, BorderLayout.NORTH);      
        ph4.add(resHist5, BorderLayout.SOUTH);
        
        ph5.add(preg6, BorderLayout.NORTH);
        ph5.add(resHist6, BorderLayout.SOUTH);        
        
        ph6.add(preg7, BorderLayout.NORTH);
        ph6.add(resHist7, BorderLayout.SOUTH);
        
        ph7.add(preg8, BorderLayout.NORTH);
        ph7.add(resHist8, BorderLayout.SOUTH);

        ph8.add(preg9, BorderLayout.NORTH);
        ph8.add(resHist9, BorderLayout.SOUTH);

        ph9.add(preg10, BorderLayout.NORTH);
        ph9.add(resHist10, BorderLayout.SOUTH);

        
        ph10.add(ph, BorderLayout.NORTH);
        ph10.add(ph1, BorderLayout.CENTER);
        ph10.add(ph2, BorderLayout.SOUTH);
        
        ph11.add(ph3, BorderLayout.NORTH);
        ph11.add(ph4, BorderLayout.CENTER);
        ph11.add(ph5, BorderLayout.SOUTH);
        
        ph12.add(ph6, BorderLayout.NORTH);
        ph12.add(ph7, BorderLayout.CENTER);
        ph12.add(ph8, BorderLayout.SOUTH);        

        ph13.add(ph9, BorderLayout.NORTH);
        
        ph14.add(ph12, BorderLayout.NORTH);
        ph14.add(ph13, BorderLayout.SOUTH);
        
        centro.add(ph10, BorderLayout.NORTH);
        centro.add(ph11, BorderLayout.CENTER);
        centro.add(ph14, BorderLayout.SOUTH);
        
//PANEL SUR-------------------------------------------------------------
        
        sur.add(guardar, BorderLayout.WEST);
        sur.add(salir, BorderLayout.EAST);        
        
        
        base.add(norte, BorderLayout.NORTH);
        base.add(center, BorderLayout.CENTER);
        base.add(sur, BorderLayout.SOUTH);
        add(base, BorderLayout.CENTER);  
        
        
        masculino.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                  femenino.setSelected(false);
                }
        });

        femenino.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    masculino.setSelected(false);
                }


        });

        siVive.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {

                    noVive.setSelected(false);                          
                    if(p7.isVisible()){
                        p7.setVisible(false);
                        center.setVisible(false);
                        habito.cerrar();
                        
                    }                    
                    else{
                        p7.setVisible(true);
                        p9.setVisible(false);
                        center.setVisible(true);
                        habito.mostrar();
                    }
                }
        });

        noVive.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    siVive.setSelected(false);
                    center.setVisible(false);
                    if(p9.isVisible()){
                        p9.setVisible(false);
                        habito.cerrar();
                        
                    }
                    else{
                        p9.setVisible(true);
                        p7.setVisible(false);
                        habito.cerrar();
                    }
                }


        });
        
        enfermedad.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                  natural.setSelected(false);
                }
        });

        natural.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    enfermedad.setSelected(false);
                }


        });
        
        salir.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    habito.cerrar();
                    controlador.mostrarArbol();
                    cerrar();
                }
        });
        
        guardar.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(verificaInfPersonal()){
                       persona.getDatos().setNombre(persona.getNombre());
                        if(masculino.isSelected()){
                            persona.getDatos().setSexo('M');
                        }if(femenino.isSelected()){
                            persona.getDatos().setSexo('F');
                        }
                        if(siVive.isSelected()){
                            if(verificaLlenadoSi()){
                                persona.getDatos().setEdad(Integer.parseInt(ed.getText()));
                                persona.getDatos().setPeso(pe.getText());
                                persona.getDatos().setEstatura(estat.getText());
                                persona.getDatos().setNacionalidad(nacion.getText());
                                persona.getDatos().setVivo(true);
                                if(resHist1.getSelectedItem().equals("SI")){
                                    persona.getDatos().setPregHist1(true);
                                }
                                if(resHist1.getSelectedItem().equals("NO")){
                                    persona.getDatos().setPregHist1(false);
                                }
                                if(resHist2.getSelectedItem().equals("SI")){
                                    persona.getDatos().setPregHist2(true);
                                }
                                if(resHist2.getSelectedItem().equals("NO")){
                                    persona.getDatos().setPregHist2(false);
                                }
                                if(resHist3.getSelectedItem().equals("SI")){
                                    persona.getDatos().setPregHist3(true);
                                }
                                if(resHist3.getSelectedItem().equals("NO")){
                                    persona.getDatos().setPregHist3(false);
                                }
                                if(resHist4.getSelectedItem().equals("SI")){
                                    persona.getDatos().setPregHist4(true);
                                }
                                if(resHist4.getSelectedItem().equals("NO")){
                                    persona.getDatos().setPregHist4(false);
                                }
                                if(resHist5.getSelectedItem().equals("SI")){
                                    persona.getDatos().setPregHist5(true);
                                }
                                if(resHist5.getSelectedItem().equals("NO")){
                                    persona.getDatos().setPregHist5(false);
                                }
                                if(resHist6.getSelectedItem().equals("SI")){
                                    persona.getDatos().setPregHist6(true);
                                }
                                if(resHist6.getSelectedItem().equals("NO")){
                                    persona.getDatos().setPregHist6(false);
                                }
                                if(resHist7.getSelectedItem().equals("SI")){
                                    persona.getDatos().setPregHist7(true);
                                }
                                if(resHist7.getSelectedItem().equals("NO")){
                                    persona.getDatos().setPregHist7(false);
                                }
                                if(resHist8.getSelectedItem().equals("SI")){
                                    persona.getDatos().setPregHist8(true);
                                }
                                if(resHist8.getSelectedItem().equals("NO")){
                                    persona.getDatos().setPregHist8(false);
                                }
                                if(resHist9.getSelectedItem().equals("SI")){
                                    persona.getDatos().setPregHist9(true);
                                }
                                if(resHist9.getSelectedItem().equals("NO")){
                                    persona.getDatos().setPregHist9(false);
                                }
                                if(resHist10.getSelectedItem().equals("SI")){
                                    persona.getDatos().setPregHist10(true);
                                }
                                if(resHist10.getSelectedItem().equals("NO")){
                                    persona.getDatos().setPregHist10(false);
                                }
                                if(habito.guardaHabitos(persona))                                    
                                        System.out.println("231");
                                        //controlador.mostrar(0);
                            }else
                                JOptionPane.showMessageDialog(null, "NO SE LLENARON TODOS LOS CAMPOS!!!");
                        }
                        if(noVive.isSelected()){
                                persona.getDatos().setVivo(false);
                                if(verificaLlenadoNo()){              
                                    if(esquizofrenia.isSelected()){
                                        persona.getDatos().setEsquizofrenia(true);
                                    }
                                    if(hemofilia.isSelected()){
                                        persona.getDatos().setHemofilia(true);
                                    }
                                    if(diabetes.isSelected()){
                                        persona.getDatos().setDiabetes(true);
                                    }
                                    if(obesidad.isSelected()){
                                        persona.getDatos().setObesidad(true);
                                    }
                                    if(labioL.isSelected()){
                                        persona.getDatos().setLabioL(true);
                                    }
                                    if(cancerMP.isSelected()){
                                        persona.getDatos().setCancerMP(true);
                                    }
                                    if(defectosTN.isSelected()){
                                        persona.getDatos().setDefectosTN(true);
                                    }
                                    if(hipertension.isSelected()){
                                        persona.getDatos().setHipertension(true);
                                    }
                                    if(enfermedad.isSelected()){
                                        persona.getDatos().setCausaMuerte(0);
                                    }
                                    if(natural.isSelected()){
                                        persona.getDatos().setCausaMuerte(1);
                                    }    
                                    
                                    controlador.mostrarArbol();
                                    habito.cerrar();
                                    cerrar();
                                }else
                                    JOptionPane.showMessageDialog(null, "NO SE LLENARON TODOS LOS CAMPOS!!!");
                            }
                    }else
                        JOptionPane.showMessageDialog(null, "NO SE LLENARON TODOS LOS CAMPOS!!!");
                }
        });        
    }
    public void  añadirArbol(){
      
        
    }
    
    public boolean verificaInfPersonal(){
        return (!"".equals(nomb.getText()) && (masculino.isSelected()||femenino.isSelected()) && (siVive.isSelected() || noVive.isSelected()));
    }
    
    public boolean verificaLlenadoSi(){
        int n = 0;
        if(!"".equals(ed.getText()))
            n++;
        if(!"".equals(estat.getText()))
            n++;
        if(!"".equals(nacion.getText()))
            n++;
        if(!"".equals(pe.getText()))
            n++;
        if(resHist1.getSelectedItem().equals("SI")){
            n++;
        }
        if(resHist1.getSelectedItem().equals("NO")){
            n++;
        }
        if(resHist2.getSelectedItem().equals("SI")){
            n++;
        }
        if(resHist2.getSelectedItem().equals("NO")){
            n++;
        }
        if(resHist3.getSelectedItem().equals("SI")){
            n++;
        }
        if(resHist3.getSelectedItem().equals("NO")){
            n++;
        }
        if(resHist4.getSelectedItem().equals("SI")){
            n++;
        }
        if(resHist4.getSelectedItem().equals("NO")){
            n++;
        }
        if(resHist5.getSelectedItem().equals("SI")){
            n++;
        }
        if(resHist5.getSelectedItem().equals("NO")){
            n++;
        }
        if(resHist6.getSelectedItem().equals("SI")){
            n++;
        }
        if(resHist6.getSelectedItem().equals("NO")){
            n++;
        }
        if(resHist7.getSelectedItem().equals("SI")){
            n++;
        }
        if(resHist7.getSelectedItem().equals("NO")){
            n++;
        }
        if(resHist8.getSelectedItem().equals("SI")){
            n++;
        }
        if(resHist8.getSelectedItem().equals("NO")){
            n++;
        }
        if(resHist9.getSelectedItem().equals("SI")){
            n++;
        }
        if(resHist9.getSelectedItem().equals("NO")){
            n++;
        }
        if(resHist10.getSelectedItem().equals("SI")){
            n++;
        }
        if(resHist10.getSelectedItem().equals("NO")){
            n++;
        }
        
        if( n == 14)
            return true;
        else
            return false;
    }
    
    public boolean verificaLlenadoNo(){
        
        if(enfermedad.isSelected() || natural.isSelected())
            return true;
        else
            return false;
    }
    
    public void mostrar(){
        this.setVisible(true);
    }
    
    public void cerrar(){
        this.dispose();
    }
    
}