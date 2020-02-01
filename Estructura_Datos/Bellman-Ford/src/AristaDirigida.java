import java.awt.*;
import java.awt.geom.*;

public class AristaDirigida {
    
    private double peso;
    private Point2D pi, pf, p;
    private Color color;
    private Line2D linea;
    private Grafo grafo;
  //---  
    public AristaDirigida(Point2D pi, Point2D pf){
 
        this.pi = pi;
        this.pf = pf;
        linea = new Line2D.Double(pi, pf);     
    }
  //----  
    public AristaDirigida(Point2D pi, Point2D pf, double peso){
        
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
        double alfa=Math.atan2(pf.getY()-pi.getY(), pf.getX()-pi.getX());
        g2.drawLine((int)pi.getX(), (int)pi.getY(), (int)pf.getX(), (int)pf.getY());
        int k = 5;
        int xa = (int)(pf.getX()-k*Math.cos(alfa+1));
        int ya = (int)(pf.getY()-k*Math.sin(alfa+1));
        // Se dibuja un extremo de la dirección de la flecha.
        g2.drawLine(xa, ya, (int)pf.getX(), (int)pf.getY()); 
        xa=(int)(pf.getX()-k*Math.cos(alfa-1));
        ya=(int)(pf.getY()-k*Math.sin(alfa-1));
        // Se dibuja el otro extremo de la dirección de la flecha.
        g2.drawLine(xa, ya, (int)pf.getX(), (int)pf.getY()); 
        g2.setPaint(Color.WHITE);
        g2.drawString(String.valueOf(peso), (int)(p.getX()), (int)(p.getY()));
    }
    
}
