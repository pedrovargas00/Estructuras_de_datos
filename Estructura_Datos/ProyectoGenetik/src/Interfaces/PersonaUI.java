package Interfaces;

import java.awt.*;
import java.awt.geom.*;
/*Ricardo Emmanuel García Cruz
Belen Tepoz Romero*/
public  class PersonaUI {
        private String nombre;
        private int index;
        private Point2D origen;
        private Ellipse2D nodo;
        private Color color;
        private final static int diametro = 60;
         public static int nVertices = 0;  //contador  de vertices creados
     
    public PersonaUI(Point2D p, String nombre){
             origen=p;
            double x = p.getX();
            double y = p.getY();
            origen = p;
            color = Color.cyan;
            nodo = new Ellipse2D.Double(x-diametro/2,y-diametro/2, diametro+30,diametro);
            this.nombre = nombre;
            this.index =nVertices++;
          
    }

    public String getNombre() {
        return nombre;
    }
         public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   	
   public void setColor(Color c){
   	 color = c;
   }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
   
   public void dibujar(Graphics2D g2){
       if(nombre != null){
            g2.setPaint(color);
            g2.fill(nodo);
            g2.setPaint(Color.BLACK);
            g2.drawString(nombre, (int)origen.getX()-30, (int) origen.getY()+4);
       }
}

    public Ellipse2D getCirculo() {
        return nodo;
    }
    

    public void setCirculo(Ellipse2D circulo) {
        this.nodo = circulo;
    }

    public Point2D getOrigen() {
        return origen;
    }

    public void setOrigen(Point2D origen) {
        this.origen = origen;
    }

    public Ellipse2D getNodo() {
        return nodo;
    }

    public void setNodo(Ellipse2D nodo) {
        this.nodo = nodo;
    }

    public static int getnVertices() {
        return nVertices;
    }

    public static void setnVertices(int nVertices) {
        PersonaUI.nVertices = nVertices;
    }
    
} //fin 