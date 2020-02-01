/*
Ramos López Lizbeth.
Vargas Arenas Pedro.
*/

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.event.*;


//Lienzo para dibujar el grafo

class Lienzo extends JPanel
{
    private Ellipse2D actual;
    private Point2D po, pd;
    private Grafo grafo;
    private Arista g;
    
    //constructor
    public Lienzo(Grafo g1) {
        
	grafo = g1;  //asignamos la referencia para manejarla
	actual = null;
	po = pd = null;
	setLayout(null);
		
	//agregamos codigo para que el lienzo "oiga" al raton               
        addMouseListener(new MouseAdapter(){
            
            public void mouseClicked(MouseEvent evento){
                Point2D x = evento.getPoint();
                if(grafo.getVertice(x) == null){ //no existe vertice
                    String n = JOptionPane.showInputDialog("ingrese el nombre del vértice :D ");
                    if (n != null){//si presiona la opcion aceptar 
                        grafo.agregarVertice(x, n);
                        repaint();
                    } //si presiona cancelar, no hace nada
                    //System.out.println(""+grafo.getVertices().getNombre());
                    //System.out.println("recorrido en profudidad " + grafo.dfs(grafo.getVertices(), a, 0, 0));
                }
            }
			
            //es llamado cuando se presiona el raton sobre un componente
            //se utiliza para indicar el inicio de la arista
            public void mousePressed(MouseEvent evento){
                Point2D x = evento.getPoint();
                //si de presiona sobre algun vertice este se marca como inicial(po)
                if(grafo.getVertice(x) != null)
                    po = x;
                else                   
                    po = null;
            }

            //es llamado cuando se suelta el raton sobre un componente
            //se utiliza para indicar el fin de la arista
            public void mouseReleased(MouseEvent evento)
            {
                    Point2D x = evento.getPoint();
                    if(grafo.getVertice(x) != null){
                    //ya existe el vertice origen marcado
                        if(po != null)
                            pd = x; 
                        grafo.agregarArista(po, pd);
                    }
                    repaint();
            }  
	}); // fin de la clase interna
		
	//Ahora "oira" cuando se mueva el raton
	addMouseMotionListener(new MouseMotionAdapter(){
            //Va a cambiar de icono del cursos al pasar por los vertices
            public void mouseMoved(MouseEvent evento)
            {
		if(grafo.getVertice(evento.getPoint()) == null)
                    setCursor(Cursor.getDefaultCursor());
		else
                    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
	}); // fin de la clase interna Motion
    } // fin constructor
		
    
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g; 
        setBackground(Color.white);
        grafo.dibujar(g2, this);
    }		
} //clase