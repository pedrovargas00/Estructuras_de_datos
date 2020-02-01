/*
Ramos López Lizbeth.
Vargas Arenas Pedro.
*/

import java.awt.*;
import java.awt.geom.*;


class Vertice {
    private String nombre;
    private int index;
    private boolean visitado;
    private Point2D origen; //punto origen
    private Ellipse2D circulo;  //circulo
    private Color color;
    private final static int diametro = 40;
    public static int nVertices = 0;  //contador  de vertices creados
	
    public Vertice(){
        this(new Point2D.Double(0,0));
    }

    public Vertice(Point2D p){
        this(p, ""+nVertices);
    }
   
    public Vertice(Point2D p, String nombre){
        double x = p.getX();
        double y = p.getY();
        origen = p;
        this.setColor(Color.black);
        circulo = new Ellipse2D.Double(x-diametro/2,y-diametro/2,
        diametro,diametro);
        this.visitado = false;
        this.nombre = nombre;
        this.index =nVertices++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
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
        g2.setPaint(color);
        g2.fill(circulo);
        g2.setPaint(Color.BLACK);
        g2.setColor(Color.WHITE);
        g2.drawString(this.getNombre(), (int)(origen.getX()), (int)(origen.getY()));
    }

    public Ellipse2D getCirculo() {
        return circulo;
    }

    public void setCirculo(Ellipse2D circulo) {
        this.circulo = circulo;
    }
} //fin clase vertice