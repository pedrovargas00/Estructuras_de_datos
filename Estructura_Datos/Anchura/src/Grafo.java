/*
Ramos López Lizbeth.
Vargas Arenas Pedro.
*/

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

class Grafo {
    private int orden; //orden del grafo
    private ArrayList <Vertice> vertices; 
    private Arista [][]M;  //matriz de adyacencia
    ArrayList<Character> b = new ArrayList();
    private int nA = 0;

    public Grafo(){
        this(10);
    }

    public Grafo(int orden){
        this.orden = orden;
        vertices = new ArrayList<> ();
        M = new Arista[orden][orden];
    }

    public Vertice getVertices(){
        return vertices.get(0);
    }

    public void agregarVertice(Point2D p){	
        Vertice v = new Vertice(p);
        vertices.add(v);
    }
//-------------
    public void agregarVertice(Point2D p, String nombre){		
        Vertice v = new Vertice(p, nombre);
        v.setNombre(nombre);
        vertices.add(v);
    }

    //obtiene el primer Vertice que contenga el punto p
    public Vertice getVertice(Point2D p){
        for(Vertice v: vertices)
            if(v.getCirculo().contains(p)) 
                return v;
        return null;
    }


    public void agregarArista(Point2D po, Point2D pd){
        //TODO: crear una arista y agregarla a la matriz
        //  donde corresponde de acuerdo a los vertices
        // po y pd, son los puntos origen de los vertices
        String p = JOptionPane.showInputDialog("ingrese el peso");
        if (p != null){// si presiona aceptar
            Arista a = new Arista(po, pd, Double.parseDouble(p));
            Vertice vo, vd;
            vo = getVertice(po);
            vd = getVertice(pd);
            M[vo.getIndex()][vd.getIndex()] = a;
            M[vd.getIndex()][vo.getIndex()] = a;
            this.nA++;
            //System.out.println("recorrido en profudidad " + dfs(getVertices(), b, 0, 0));
            b.clear(); 
        } //si presiona cancela, no hace nada

    }

     //mostrar la lista de vertices
    public String mostrarVertices(){
        String cad = " ";
        for(Vertice v: vertices) 
            cad += v.getNombre()+", ";
        return cad;
    } 

    public void dibujar(Graphics2D g2, JPanel l){
   //pintamos los vertices
        for(Vertice v: vertices) 
            v.dibujar(g2);
        for(int i = 0; i< orden; i++){
            for(int j = 0; j < orden; j++){
                if (M[i][j] != null)
                    M[i][j].dibujar(g2);
            }
        }
    }

    public void desvisitar(){
        for(Vertice v: vertices)
            v.setVisitado(false);
    }
    
    public ArrayList dfs(Vertice vi, ArrayList a, int fila, int tam){
        
        if(a.isEmpty()){
            a.add(vi.getNombre());
            vi.setVisitado(true);
        }
        if(a.size() == vertices.size()){
            desvisitar();
            return a;
        }else{
            for(int j = 0; j < M.length; j++){
                if(M[fila][j] != null && vertices.get(j).isVisitado() == false){
                    vertices.get(j).setVisitado(true);
                    a.add(vertices.get(j).getNombre());
                    return dfs(vi, a, j, a.size()-1);
                }            
            } 
            for(int i = 0; i < vertices.size(); i++){
//                System.out.println("Vertice: " + vertices.get(i).getNombre() + " A: " + (String)a.get(tam));
                if(vertices.get(i).getNombre().equalsIgnoreCase((String) a.get(tam))){
                    vi = vertices.get(i);
                    tam -= 1;
                    return dfs(vi, a, vi.getIndex(), tam-1);    
                }
            }
            
        }
        return a;
    }
    
    public ArrayList RPA(Vertice vi){
        
        Queue<Vertice> cola = new LinkedList();
        ArrayList<String> ar = new ArrayList();
        Vertice v;
        
        cola.add(vi);
        vi.setVisitado(true);
        while(!cola.isEmpty()){
            v = cola.remove();
            for(int i = 0; i < M.length; i++){
                if(M[v.getIndex()][i] != null && vertices.get(i).isVisitado() == false){
                    cola.add(vertices.get(i));
                    vertices.get(i).setVisitado(true);
                }
            }
            ar.add(v.getNombre());
        }
        return ar;
    }
} //clase