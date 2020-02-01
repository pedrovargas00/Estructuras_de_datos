package Interfaces;


import Interfaces.DibujarArbol;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import static java.lang.Thread.sleep;
import Árbol.Arbol;
import Árbol.Persona;


class Lienzo extends JPanel{
    ThreadColores hilo;
    private JPopupMenu Pmenu;
    String PersonaUI;
    Point2D person;
    private DibujarArbol dibuja;
    public ArrayList <PersonaUI> vertices;  // para simplicidad
    JMenuItem mostrar, eliminar, anadir;
	//constructor
    public Lienzo(DibujarArbol dibuja,ArbolUI color) {
                
        this.dibuja = dibuja;  //asignamos la referencia para manejarla
	
        Pmenu = new JPopupMenu();
        mostrar = new JMenuItem("Mostrar Información");
        mostrar.setForeground(Color.cyan);
        mostrar.setBackground(Color.black);
        Pmenu.add(mostrar);
        anadir = new JMenuItem("Añadir ");
        Pmenu.add(anadir);
        anadir.setBackground(Color.black);
        anadir.setForeground(Color.cyan);             

        mostrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Persona o=dibuja.controlador.getPersona(dibuja.getVertice(person).getNombre());
                dibuja.controlador.mostrarDiagnostico(o.getDatos().getDiagnostico(o.getDatos().getVivo()));

            }
        });
        
        anadir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                               
                int n=dibuja.numNodos();
                int a=dibuja.alturaArbol();
                         
                System.out.println("altura"+a);
                if(n>0 && n<3){
                    System.out.println("numNodos"+n);
                    Point2D x; 
                    x = new Point2D.Double(person.getX()-(800/4)+0, 10+person.getY()*2.5);
                    pintarNodo(x);
                    x = new Point2D.Double(person.getX()+(800/4)-0,10+ person.getY()*2.5);
                    pintarNodo(x);
                } 
                if(n>2 && n<7){
                    System.out.println("numNodos"+n);
                    Point2D x; 
                    x = new Point2D.Double(person.getX()-(800/8), 10+person.getY()*2.5);
                    pintarNodo(x);
                    x = new Point2D.Double(person.getX()+(800/8)+32,10+ person.getY()*2.5);
                    pintarNodo(x);
                } 
                if(n >6){
                    System.out.println("numNodos"+n);
                    Point2D x; 
                    x = new Point2D.Double(person.getX()-(800/19)-6, person.getY()*1.5);
                    pintarNodo(x);
                    x = new Point2D.Double(person.getX()+(800/19), person.getY()*1.5);
                    pintarNodo(x);
                }              
            }
        });
                
        //Ahora "oira" cuando se mueva el raton
        addMouseMotionListener(new MouseMotionAdapter(){
            //Va a cambiar de icono del cursos al pasar por los vertices
            public void mouseMoved(MouseEvent evento){ 
                PersonaUI v=dibuja.getVertice(evento.getPoint()) ;
                if(v == null)
                    setCursor(Cursor.getDefaultCursor());
                else
                    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        }); // fin de la clase interna Motion  
    } //fin constructor
    
    public void pintarNodoP(Point2D p){
        String nom= JOptionPane.showInputDialog("Nombre de la Persona:");
        System.out.println("nom"+nom);
        if(dibuja.getVertice(p) == null) {
            dibuja.agregarVerticeP(p, nom);                            
        }
        repaint();   
    }
    
    public void pintarNodo(Point2D p) {
        String nom= JOptionPane.showInputDialog("Nombre de la Persona:");
        if(dibuja.getVertice(p) == null) {//no existe vertice
            dibuja.agregarVertice(p,nom,person);    
            dibuja.agregarArista(person, p);
        }
        repaint();   
    }
    
    public void mostrarMenu(Point2D p ,MouseEvent Me){                 
        if(dibuja.getVertice(p) != null){ // existe vertice
            System.out.println("p"+p);
            PersonaUI=dibuja.getVertice(p).getNombre();
            person = p;
            Pmenu.show(Me.getComponent(), Me.getX(), Me.getY());
        }    
    }
    
    //ojo con este metodo, es necesario sobreescribirlo
    //para que se pinte el lienzo.
    public void setVertices(ArrayList <PersonaUI> vertices){
        this.vertices = vertices;
    }
    
    public void paintComponent(Graphics g){
	super.paintComponent(g);
 	Graphics2D g2 = (Graphics2D)g;
 	setBackground(Color.lightGray);
        dibuja.dibujar(g2, this);
	//pintamos los vertices
    }
} //clase Lienzo