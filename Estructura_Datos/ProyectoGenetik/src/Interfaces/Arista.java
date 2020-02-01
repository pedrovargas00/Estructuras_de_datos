package Interfaces;

import java.awt.*;
import java.awt.geom.*;
/*Ricardo Emmanuel García Cruz
Belen Tepoz Romero*/
public class Arista {
   
   private  Point2D p1,p2;
    private Color color;
    private Line2D linea;
     private final int ARR_SIZE = 4; 
    
  /*  public Arista(Point2D pi, Point2D pf){
        linea = new Line2D.Double(pi, pf);
        color = Color.pink;
    }*/
     public Arista(Point2D pi, Point2D pf){
         this.p1=pi;
         this.p2=pf;
        linea = new Line2D.Double(pi, pf);
        color = Color.BLACK;
    }
    
    public Arista(Point2D pi, Point2D pf, double peso){
          this.p1=pi;
         this.p2=pf;
         linea = new Line2D.Double(pi, pf);
        color = Color.black;

        
    }
    
     public void dibujar(Graphics2D g2){
        g2.setPaint(color);
        g2.draw(linea);
        int y = (int)(linea.getY1()+linea.getY2())/2;
        int x = (int)(linea.getX1()+linea.getX2())/2;
     

   }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Point2D getP1() {
        return p1;
    }

    public void setP1(Point2D p1) {
        this.p1 = p1;
    }

    public Point2D getP2() {
        return p2;
    }

    public void setP2(Point2D p2) {
        this.p2 = p2;
    }

    public Line2D getLinea() {
        return linea;
    }

    public void setLinea(Line2D linea) {
        this.linea = linea;
    }
      
   
}
