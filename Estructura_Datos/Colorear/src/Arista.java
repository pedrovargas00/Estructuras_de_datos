import java.awt.geom.*;
import java.awt.*;


public class Arista {
    
    private double peso;
    private Point2D pi, pf, p;
    private Color color;
    private Line2D linea;

  //---  
    public Arista(Point2D pi, Point2D pf){
 
        this.pi = pi;
        this.pf = pf;
        linea = new Line2D.Double(pi, pf);     
    }
  //----  
    public Arista(Point2D pi, Point2D pf, double peso){
        
        this.pi = pi;
        this.pf = pf;
        this.peso = peso;
        linea = new Line2D.Double(pi,pf);
        p = mitad(pi.getX(),pi.getY(),pf.getX(),pf.getY());
    }
    
    public Point2D mitad(double x1, double y1, double x2, double y2){
        
        double x = x2 - x1;
        double y = y2 - y1;
        Point2D p = new Point2D.Double(x1+(x/2), y1+(y/2));
        return p;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public void setColor(Color color){
        this.color = color;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public Color getColor(){
        return color;
    }
    
    public void dibujar(Graphics2D g2){
        g2.setPaint(color);
        g2.draw(linea);
        g2.setPaint(Color.BLACK);
        g2.drawString(String.valueOf(peso), (int)(p.getX()), (int)(p.getY()));
    }
    
}
