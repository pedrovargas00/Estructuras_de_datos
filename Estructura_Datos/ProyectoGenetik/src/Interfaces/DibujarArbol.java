/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Controlador.Controlador;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.JPanel;
import Árbol.Persona;

/**
 *
 * @author btepo
 */
public class DibujarArbol {
     private ArrayList <PersonaUI > vertices; 
      private Arista [][]M;  //matriz de adyacencia
     Controlador controlador;
    public DibujarArbol() {
           vertices = new ArrayList<> ();
               M =new Arista[15][15]; //se instancia la matriz
    }

    public void setVertices(ArrayList<PersonaUI> vertices) {
        this.vertices = vertices;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public ArrayList<PersonaUI> getVertices() {
        return vertices;
    }
    public void agregarArista(Point2D po, Point2D pd){
            Arista a = new Arista(po,pd);
            PersonaUI vo,vd;
            vo = getVertice(po);
            vd = getVertice(pd);

            M[vo.getIndex()][vd.getIndex()] = a;
            M[vd.getIndex()][vo.getIndex()] = a;
    }
    
    public void agregarVerticeP(Point2D p, String nombre){		
        controlador.insertarPPersona(nombre);
        PersonaUI v = new PersonaUI(p,nombre);
        vertices.add(v);               
    }
    public int alturaArbol(){
        return controlador.altura();
    }
 
     public int numNodos(){
        return controlador.numNodos();
    }

     
   public void agregarVertice(Point2D p, String nombre,Point2D padres){		
        String pad = getVertice(padres).getNombre();
        if(p.getX()<padres.getX())
                  controlador.insertarPersonaI(pad,nombre);
          if(p.getX()>padres.getX())
                  controlador.insertarPersonaD(pad,nombre);
        PersonaUI v = new PersonaUI(p,nombre);
        vertices.add(v);               
    }
    
    public PersonaUI getVertice(Point2D p){
         for(PersonaUI v: vertices)
                 if(v.getCirculo().contains(p)) 
                    return v;
         return null;
    }
    public PersonaUI getVertice(String p){
       for(PersonaUI v: vertices)
               if(v.getNombre().equals(p)) 
                  return v;
       return null;
    }
    public ArrayList<PersonaUI> getArrayVertices(){
       return vertices;
    }
        
    public void dibujar(Graphics2D g2, JPanel l){
        System.out.println("vértices: " + vertices);
        if(!vertices.isEmpty()){
                for(int k=0;k<15;k++)
                    for(int j=0;j<15;j++)
                       if(M[k][j]!=null )
                                M[k][j].dibujar(g2);
                for(PersonaUI v: vertices) 
                        v.dibujar(g2);
        }	
    }
}
