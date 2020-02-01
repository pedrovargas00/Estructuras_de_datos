import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

class Grafo {
        
    private int orden; //orden del grafo
    private ArrayList <Vertice> vertices; 
    private Arista [][]M;  //matriz de adyacencia
    private AristaDirigida [][]N;
    private int nA = 0;
    private boolean dirigido = false;
    
    public Grafo(){
        this(20);
    }

    public Grafo(int orden){
        this.orden = orden;
        vertices = new ArrayList<> ();
        M = new Arista[orden][orden];
        N = new AristaDirigida[orden][orden];
    }

    public boolean isDirigido() {
        return dirigido;
    }

    public void setDirigido(boolean dirigido) {
        this.dirigido = dirigido;
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

    public Vertice getVertice(String n){
        for(Vertice v: vertices)
            if(v.getNombre().equalsIgnoreCase(n))
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
        }
    }

    public void agregarAristaDirigida(Point2D po, Point2D pd){
        //TODO: crear una arista y agregarla a la matriz
        //  donde corresponde de acuerdo a los vertices
        // po y pd, son los puntos origen de los vertices
        String p = JOptionPane.showInputDialog("ingrese el peso");
        if (p != null){// si presiona aceptar
            AristaDirigida a = new AristaDirigida(po, pd, Double.parseDouble(p));
            Vertice vo, vd;
            vo = getVertice(po);
            vd = getVertice(pd);
            N[vo.getIndex()][vd.getIndex()] = a;
            this.nA++;
        }
    }

     //mostrar la lista de vertices
    public String mostrarVertices(){
        String cad = " ";
        for(Vertice v: vertices) 
            cad += v.getNombre()+", ";
        return cad;
    } 
    
    public void mostrarMatriz(){
        System.out.println("\t\t----Matriz----\n");
            for(int i = 0; i< vertices.size(); i++){
                System.out.println("");
                for(int j = 0; j < vertices.size(); j++){
                    if (M[i][j] != null)
                        System.out.print("\t1");
                    else
                        System.out.print("\t0");
                }
            }
            System.out.println("\n");
    }
    
    public void mostrarMatrizDirigida(){
        System.out.println("\t\t----Matriz----\n");
            for(int i = 0; i< vertices.size(); i++){
                System.out.println("");
                for(int j = 0; j < vertices.size(); j++){
                    if (N[i][j] != null)
                        System.out.print("\t1");
                    else
                        System.out.print("\t0");
                }
            }
            System.out.println("\n");
        } 

    public void desVisitar(){
        for(Vertice v: vertices) 
            v.setVisitado(false);
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
        
    public void dibujarDirigida(Graphics2D g2, JPanel l){
       //pintamos los vertices
        for(Vertice v: vertices) 
            v.dibujar(g2);
        for(int i = 0; i< orden; i++){
            for(int j = 0; j < orden; j++){
                if (N[i][j] != null)
                    N[i][j].dibujar(g2);
            }
        }
    }
    
    public ArrayList dfs(Vertice vi, ArrayList a){ 
        if(a.isEmpty()){
            a.add(vi);
            vi.setVisitado(true);
        }
        for(Vertice v: vertices){
            if(M[vi.getIndex()][v.getIndex()] != null && v.isVisitado() != true){
                v.setVisitado(true);
                a.add(v);
                dfs(v,a);
            }
        }   
        return a;
    }
    
    public ArrayList dfsDirigido(Vertice vi, ArrayList a){ 
        if(a.isEmpty()){
            a.add(vi);
            vi.setVisitado(true);
        }
        for(Vertice v: vertices){
            System.out.println("vi: " + vi.getNombre() + " v: " + v.getNombre());
            if(N[vi.getIndex()][v.getIndex()] != null && v.isVisitado() != true){
                System.out.println("Entró if");
                v.setVisitado(true);
                a.add(v);
                dfsDirigido(v, a);
            }
        }   
        return a;
    }
     
    public ArrayList rpa(Vertice vi){
        
        ArrayList<Vertice> b = new ArrayList();
        Queue<Vertice> cola = new LinkedList();
        
        vi.setVisitado(true);
        cola.add(vi);
        while(cola.isEmpty()!= true){
            b.add(cola.remove());
            for(Vertice v: vertices){ 
                if(v.isVisitado()!= true){
                    v.setVisitado(true); 
                    cola.add(v);
                }
            } 
        }
        desVisitar();
        return b;
    }
    
    public ArrayList dijkstra(Vertice vi, Vertice vf)throws VerticeIgualException{
        
        int i = 0, dv = 0, aux = Integer.MAX_VALUE;
        ArrayList<String> v1 = new ArrayList();
        Vertice ver = null;
        
        if(vi == null || vf == null){
            JOptionPane.showMessageDialog(null, "Nodos inexistentes");
            return null;
        }
        while(vi != vf){
            vi.setFin(dv);
            vi.setVisitado(true);
            for(Vertice v: vertices){
                System.out.println("vi: " + vi.getNombre() + " vk: " + v.getNombre());
                System.out.println("vi.fin: " + vi.getFin() + " v.fin" + v.getFin());
                if(!v.isVisitado() && M[vi.getIndex()][v.getIndex()] != null){
                    if(v.getFin() > (vi.getFin() + M[vi.getIndex()][v.getIndex()].getPeso())){
                        dv = (int)(vi.getFin() + M[vi.getIndex()][v.getIndex()].getPeso());
                        v.setFin(dv);
                        v.setAnterior(vi);
                        if(dv < aux){
                            aux = dv;
                            ver = v;
                            System.out.println("aux: " + aux + "ver: " + ver.getNombre());
                        }   
                    }
                }
            }
            v1.add(vi.getNombre());
            if(vi == ver)
                throw new VerticeIgualException("El vertice de inicio es igual al menor");
            vi = ver;
            dv = aux;
            System.out.println("vi: " + vi.getNombre() + "\n");
            aux = Integer.MAX_VALUE;
            if(i < vertices.size()-1)
                i++;
        }
        v1.add(vf.getNombre());
        System.out.println("recorrido :D <3" + v1);
        return v1;
    }
    
    public ArrayList dijkstraDirigido(Vertice vi, Vertice vf)throws VerticeIgualException{
        
        int dv = 0, aux = Integer.MAX_VALUE;
        ArrayList<String> v1 = new ArrayList();
        Vertice ver = null;
        
        if(vi == null || vf == null){
            JOptionPane.showMessageDialog(null, "Nodos inexistentes");
            return null;
        }
        while(vi != vf){
            vi.setFin(dv);
            vi.setVisitado(true);
            for(Vertice v: vertices){
                System.out.println("vi: " + vi.getNombre() + " vk: " + v.getNombre());
                if(!v.isVisitado() && N[vi.getIndex()][v.getIndex()] != null){
                    System.out.println("vi.fin: " + (vi.getFin()+N[vi.getIndex()][v.getIndex()].getPeso()) + " v.fin: " + v.getFin() + "\n---------");
                    if(v.getFin() > (vi.getFin() + N[vi.getIndex()][v.getIndex()].getPeso())){
                        dv = (int)(vi.getFin() + N[vi.getIndex()][v.getIndex()].getPeso());
                        v.setFin(dv);
                        v.setAnterior(vi);
                        if(dv < aux){
                            aux = dv;
                            ver = v;
                            System.out.println("aux: " + aux + " ver: " + ver.getNombre());
                        }   
                    }
                }
            }
            v1.add(vi.getNombre());
            if(vi == ver)
                throw new VerticeIgualException("El vertice de inicio es igual al menor");
            vi = ver;
            dv = aux;
            System.out.println("vi: " + vi.getNombre() + "\n");
            aux = Integer.MAX_VALUE;
        }
        v1.add(vf.getNombre());
        System.out.println("recorrido :D <3" + v1);
        return v1;
    }
} //clase
