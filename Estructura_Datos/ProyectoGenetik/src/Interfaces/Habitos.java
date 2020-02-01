package Interfaces;

import java.awt.*;
import javax.swing.*;
import Controlador.*;
import Árbol.*;

public class Habitos extends JFrame{
    
    private Controlador controlador;
    private JPanel pa,pa1,pa2,pa3,pa4,pa5,pa6,pa7,pa8,pa9,pa10,pa11,p10, base;
    private JLabel habitos,pr1,pr2,pr3,pr4,pr5,pr6,pr7,pr8,pr9;
    private JComboBox resHabito1,resHabito2,resHabito3,resHabito4,resHabito5,resHabito6,resHabito7,resHabito8,resHabito9;
    
    public Habitos(){
    
        setSize(400,450);
        setTitle("Habitos");
        setLocation(700,50);
        setResizable(false);
        this.setVisible(false);
        init();
    }
    
    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    
    public void init(){
        
        p10 = new JPanel(new BorderLayout());
        base = new JPanel(new BorderLayout());
        
        pa = new JPanel(new BorderLayout());
        pa1 = new JPanel(new BorderLayout());
        pa2 = new JPanel(new BorderLayout());
        pa3 = new JPanel(new BorderLayout());
        pa4 = new JPanel(new BorderLayout());
        pa5 = new JPanel(new BorderLayout());
        pa6 = new JPanel(new BorderLayout());
        pa7 = new JPanel(new BorderLayout());
        pa8 = new JPanel(new BorderLayout());
        pa9 = new JPanel(new BorderLayout());
        pa10 = new JPanel(new BorderLayout());
        pa11 = new JPanel(new BorderLayout());
        
         //comienzan preguntas
        habitos = new JLabel("Hábitos");
        habitos.setFont(new Font("Tahoma", Font.LAYOUT_LEFT_TO_RIGHT, 15));
        pr1 = new JLabel("Fuma constantemente");
        resHabito1 = new JComboBox();
        resHabito1.addItem("");
        resHabito1.addItem("SI");
        resHabito1.addItem("NO");
        pr2 = new JLabel("Ingiere bebidas alcohólicas en exceso");
        resHabito2 = new JComboBox();
        resHabito2.addItem("");
        resHabito2.addItem("SI");
        resHabito2.addItem("NO");
        pr3 = new JLabel("Consume muchos alimentos ricos en grasas y/o azúcares");
        resHabito3 = new JComboBox();
        resHabito3.addItem("");
        resHabito3.addItem("SI");
        resHabito3.addItem("NO");
        pr4 = new JLabel("Se ejercita");
        resHabito4 = new JComboBox();
        resHabito4.addItem("");
        resHabito4.addItem("SI");
        resHabito4.addItem("NO");
        pr5 = new JLabel("Suele dormir a altas horas de la noche");
        resHabito5 = new JComboBox();
        resHabito5.addItem("");
        resHabito5.addItem("SI");
        resHabito5.addItem("NO");
        pr6 = new JLabel("Es débil emocionalmente");
        resHabito6 = new JComboBox();
        resHabito6.addItem("");
        resHabito6.addItem("SI");
        resHabito6.addItem("NO");
        pr7 = new JLabel("Suele tener realaciones sexuales sin protección");
        resHabito7 = new JComboBox();
        resHabito7.addItem("");
        resHabito7.addItem("SI");
        resHabito7.addItem("NO");
        pr8 = new JLabel("Está constantemente sometido a estrés");
        resHabito8 = new JComboBox();
        resHabito8.addItem("");
        resHabito8.addItem("SI");
        resHabito8.addItem("NO");
        pr9 = new JLabel("Ingiere medicamentos para convulsiones");      
        resHabito9 = new JComboBox();
        resHabito9.addItem("");
        resHabito9.addItem("SI");
        resHabito9.addItem("NO");
        
        pa.add(habitos, BorderLayout.NORTH);
        pa.add(pr1, BorderLayout.CENTER);
        pa.add(resHabito1, BorderLayout.SOUTH);

        pa1.add(pr2, BorderLayout.NORTH);
        pa1.add(resHabito2, BorderLayout.SOUTH);

        pa2.add(pr3, BorderLayout.NORTH);
        pa2.add(resHabito3, BorderLayout.SOUTH);        

        pa3.add(pr4, BorderLayout.NORTH);
        pa3.add(resHabito4, BorderLayout.SOUTH);

        pa4.add(pr5, BorderLayout.NORTH);
        pa4.add(resHabito5, BorderLayout.SOUTH);

        pa5.add(pr6, BorderLayout.NORTH);
        pa5.add(resHabito6, BorderLayout.SOUTH);

        pa6.add(pr7, BorderLayout.NORTH);
        pa6.add(resHabito7, BorderLayout.SOUTH);

        pa7.add(pr8, BorderLayout.NORTH);
        pa7.add(resHabito8, BorderLayout.SOUTH);

        pa8.add(pr9, BorderLayout.NORTH);
        pa8.add(resHabito9, BorderLayout.SOUTH);
        
        pa9.add(pa, BorderLayout.NORTH);
        pa9.add(pa1, BorderLayout.CENTER);
        pa9.add(pa2, BorderLayout.SOUTH);
        
        pa10.add(pa3, BorderLayout.NORTH);
        pa10.add(pa4, BorderLayout.CENTER);
        pa10.add(pa5, BorderLayout.SOUTH);

        pa11.add(pa6, BorderLayout.NORTH);
        pa11.add(pa7, BorderLayout.CENTER);
        pa11.add(pa8, BorderLayout.SOUTH);

        p10.add(pa9, BorderLayout.NORTH);
        p10.add(pa10, BorderLayout.CENTER);
        p10.add(pa11, BorderLayout.SOUTH);
        
        base.add(p10, BorderLayout.NORTH);
        
        add(base, BorderLayout.CENTER);
    }
    
    public void cerrar(){
        this.setVisible(false);
    }

    public void mostrar(){
       this.setVisible(true);
    }
    
    public boolean guardaHabitos(Persona persona){
        
        int n = 0;
        
        if(resHabito1.getSelectedItem().equals("SI")){
            persona.getDatos().setPregHabito1(true);
            n++;
        }
        if(resHabito1.getSelectedItem().equals("NO")){
            persona.getDatos().setPregHabito1(false);
            n++;
        }
        if(resHabito2.getSelectedItem().equals("SI")){
            persona.getDatos().setPregHabito2(true);
            n++;        
        }
        if(resHabito2.getSelectedItem().equals("NO")){
            persona.getDatos().setPregHabito2(false);
            n++;
        }
        if(resHabito3.getSelectedItem().equals("SI")){
            persona.getDatos().setPregHabito3(true);
            n++;
        }
        if(resHabito3.getSelectedItem().equals("NO")){
            persona.getDatos().setPregHabito3(false);
            n++;
        }
        if(resHabito4.getSelectedItem().equals("SI")){
            persona.getDatos().setPregHabito4(true);
            n++;
        }
        if(resHabito4.getSelectedItem().equals("NO")){
            persona.getDatos().setPregHabito4(false);                    
            n++;
        }
        if(resHabito5.getSelectedItem().equals("SI")){
            persona.getDatos().setPregHabito5(true);
            n++;
        }
        if(resHabito5.getSelectedItem().equals("NO")){
            persona.getDatos().setPregHabito5(false);                    
            n++;
        }
        if(resHabito6.getSelectedItem().equals("SI")){
            persona.getDatos().setPregHabito6(true);
            n++;
        }
        if(resHabito6.getSelectedItem().equals("NO")){
            persona.getDatos().setPregHabito6(false);                    
            n++;
        }
        if(resHabito7.getSelectedItem().equals("SI")){
            persona.getDatos().setPregHabito7(true);
            n++;
        }
        if(resHabito7.getSelectedItem().equals("NO")){
            persona.getDatos().setPregHabito7(false);
            n++;
        }
        if(resHabito8.getSelectedItem().equals("SI")){
            persona.getDatos().setPregHabito8(true);
            n++;
        }
        if(resHabito8.getSelectedItem().equals("NO")){
            persona.getDatos().setPregHabito8(false);
            n++;
        }
        if(resHabito9.getSelectedItem().equals("SI")){
            persona.getDatos().setPregHabito9(true);
            n++;
        }
        if(resHabito9.getSelectedItem().equals("NO")){
            persona.getDatos().setPregHabito9(false);
            n++;
        }   
        if(n == 9)
            return true;
        else
            return false;
    }
    
    
}
