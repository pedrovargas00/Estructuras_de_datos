import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

class Grafo {
        
    private int orden; //orden del grafo
    private ArrayList <Vertice> vertices; 
    private Arista [][]M;  //matriz de adyacencia
    private AristaDirigida [][]N;
    private ArrayList<Arista> arista;
    private ArrayList<Arista> aristas;
    private ArrayList<AristaDirigida> dirigida;
    private boolean dirigido = false;
    private String recorridos = " ";
    private int costoMinimo = 0;
    
    public Grafo(){
        this(20);
    }

    public Grafo(int orden){
        this.orden = orden;
        vertices = new ArrayList<> ();
        M = new Arista[orden][orden];
        N = new AristaDirigida[orden][orden];
        arista = new ArrayList();
        aristas = new ArrayList();
        dirigida = new ArrayList();
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
    
    public int getCostoMinimo(){
        return costoMinimo;
    }
    
    public void setCostoMinimo(int costoMinimo){
        this.costoMinimo = costoMinimo;
    }
    
    public String getRecorridos(){
        return recorridos;
    }
    
    public void setRecorridos(String recorridos){
        this.recorridos = recorridos;
    }
    
    public ArrayList getAristaND(){
        return arista;
    }
    
    public ArrayList getDirigida(){
        return dirigida;
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
            aristas.add(a);
        }
    }

    public void agregarAristaDirigida(Point2D po, Point2D pd){
        //TODO: crear una arista y agregarla a la matriz
        //  donde corresponde de acuerdo a los vertices
        // po y pd, son los puntos origen de los vertices
        String p = JOptionPane.showInputDialog("ingrese el peso");
        if (p != null){// si presiona aceptar
            //Double.parseDouble(p)
            AristaDirigida a = new AristaDirigida(po, pd, Double.valueOf(p));
            Vertice vo, vd;
            vo = getVertice(po);
            vd = getVertice(pd);
            N[vo.getIndex()][vd.getIndex()] = a;
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
    
    public void desFin(){
        for(Vertice v: vertices){
            v.setFin(Integer.MAX_VALUE);
            v.setAnterior(null);
        }
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
    
    public ArrayList getAristas(){
        return aristas;
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
           // System.out.println("vi: " + vi.getNombre() + " v: " + v.getNombre());
            if(N[vi.getIndex()][v.getIndex()] != null && v.isVisitado() != true){
                //System.out.println("Entró if");
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
    
    public ArrayList dijkstra(Vertice vi, Vertice vf){
        this.arista.clear();
        int dv = 0;
        ArrayList<Vertice> v1 = new ArrayList();
        ArrayList<Integer> adyacentes = new ArrayList();
        Stack<Vertice> pila = new Stack();
        Vertice ver = vi, vAux;
        
        if(vi == null || vf == null){
            JOptionPane.showMessageDialog(null, "Nodos inexistentes");
            return null;
        }
        
        vi.setFin(dv);
        while(vi != vf){
            vi.setVisitado(true); 
            for(Vertice v: vertices){
                if(!v.isVisitado() && M[vi.getIndex()][v.getIndex()] != null){
                    if(v.getFin() > (vi.getFin() + M[vi.getIndex()][v.getIndex()].getPeso())){
                        dv = (int)(vi.getFin() + M[vi.getIndex()][v.getIndex()].getPeso());
                        v.setFin(dv);
                        v.setAnterior(vi);
                        adyacentes.add(dv); 
                    }
                }
            }
            vi = verMenor(adyacentes);
        }
        costoMinimo = vf.getFin();
        do{
            pila.add(vf);
            vf = vf.getAnterior();
        }while(vf != ver);
        pila.add(ver);
       
        while(pila.empty() != true){
            recorridos += pila.peek().getNombre();
            recorridos += "  ";
            vAux = pila.pop();
            if(!pila.empty())
                arista.add(M[vAux.getIndex()][pila.peek().getIndex()]);
            v1.add(vAux);
        }
        return v1;
    }
    
    public Vertice verMenor(ArrayList<Integer> adyacentes){
                
        int menor,i;
        
        Collections.sort(adyacentes);
        for(i = 0; i < adyacentes.size(); i++)
            System.out.println("ordenados: " + adyacentes.get(i));
        menor = adyacentes.get(0);
        adyacentes.remove(0);
        for(Vertice v: vertices){
            if(v.getFin() == menor && (!v.isVisitado()))
                return v;
        }
    return null;
    }
    
    public ArrayList dijkstraDirigido(Vertice vi, Vertice vf){
        this.dirigida.clear();
        int dv = 0;
        ArrayList<Vertice> v1 = new ArrayList();
        ArrayList<Integer> adyacentes = new ArrayList();
        Stack<Vertice> pila = new Stack();
        Vertice ver = vi, vAux;
        
        if(vi == null || vf == null){
            JOptionPane.showMessageDialog(null, "Nodos inexistentes");
            return null;
        }
        
        vi.setFin(dv);
        while(vi != vf){
            vi.setVisitado(true); 
            for(Vertice v: vertices){
                if(!v.isVisitado() && N[vi.getIndex()][v.getIndex()] != null){
                    if(v.getFin() > (vi.getFin() + N[vi.getIndex()][v.getIndex()].getPeso())){
                        dv = (int)(vi.getFin() + N[vi.getIndex()][v.getIndex()].getPeso());
                        v.setFin(dv);
                        v.setAnterior(vi);
                        adyacentes.add(dv); 
                    }
                }
            }
            vi = verMenor(adyacentes);
        }
        costoMinimo = vf.getFin();
        do{
            pila.add(vf);
            vf = vf.getAnterior();
        }while(vf != ver);
        pila.add(ver);
        
        while(pila.empty() != true){ 
            recorridos += pila.peek().getNombre();
            recorridos += "  ";
            vAux = pila.pop();
            if(!pila.empty())
                dirigida.add(N[vAux.getIndex()][pila.peek().getIndex()]);
            v1.add(vAux);
        }
        return v1;
    }
    
    public ArrayList bellmanFord(Vertice vi, Vertice vf){
        this.arista.clear();
        this.dirigida.clear();
        
        ArrayList<Vertice> a = new ArrayList();
        Stack<Vertice> b = new Stack();
        Queue<Vertice> cola = new LinkedList();
        Vertice ver = null, vAux;
        int dv = 0;
        int dv1 = 0; 
        
        ver = vi;
        vi.setFin(dv);
        cola.add(vi);
                
        while(cola.isEmpty() != true){
            vi = cola.remove();
            
            for(Vertice vk: vertices){
                if(this.dirigido == true){
                    if(N[vi.getIndex()][vk.getIndex()]!= null){
                        if(vk.getFin() > vi.getFin() + N[vi.getIndex()][vk.getIndex()].getPeso()){
                            dv1 = vk.getFin();
                            dv = (int)(vi.getFin() + N[vi.getIndex()][vk.getIndex()].getPeso());
                            vk.setFin(dv);
                            vk.setAnterior(vi);
                            if(cola.contains(vk) != true && dv1 != dv);
                                cola.add(vk);
                                System.out.println("ingresa en cola: " +vk.getNombre());
                        } 
                    }    
                }else{
                    if(M[vi.getIndex()][vk.getIndex()]!= null){
                        if(vk.getFin() > vi.getFin() + M[vi.getIndex()][vk.getIndex()].getPeso()){
                            dv = (int)(vi.getFin() + M[vi.getIndex()][vk.getIndex()].getPeso());
                            vk.setFin(dv);
                            vk.setAnterior(vi);
                            if(cola.contains(vk) != true);
                                cola.add(vk);
                        } 
                    }
                }
                
            }
        }
        
        costoMinimo = vf.getFin();
        do{
            b.add(vf);
            vf = vf.getAnterior();
        }while(vf != ver);
        b.add(ver);
       
        while(b.empty() != true){ 
            recorridos += b.peek().getNombre();
            recorridos += "  ";
            vAux = b.pop();
            if(!b.empty())
                dirigida.add(N[vAux.getIndex()][b.peek().getIndex()]);
            a.add(vAux);
        }
    return a;
    }
    
    public boolean hayVisitados(){
        
        for(Vertice v: vertices){
            if(!v.isVisitado())
                return true;
        }
        return false;
    }
    
    public ArrayList prim(Vertice vi){
        
        this.arista.clear();
        int c = 0;
        ArrayList<Integer> adyacentes = new ArrayList();
        
        vi.setFin(c);
        while(hayVisitados() && vi != null){
            System.out.println("Vertices: " + vertices.toString());
            System.out.println("Entra");
            vi.setVisitado(true); 
            System.out.println("Vez: " + vi.getNombre());
            for(Vertice vk: vertices){
                if(!vk.isVisitado() && M[vi.getIndex()][vk.getIndex()] != null){
                    if(vk.getFin() > (M[vi.getIndex()][vk.getIndex()].getPeso())){
                        c = (int)(M[vi.getIndex()][vk.getIndex()].getPeso());
                        vk.setFin(c);
                        vk.setAnterior(vi);
                        adyacentes.add(c); 
                    }
                }
            }
            vi = verMenor(adyacentes);
        }
        
        for(Vertice v: vertices){
            costoMinimo += v.getFin();
            if(!v.equals(getVertices())){
                arista.add(M[v.getIndex()][v.getAnterior().getIndex()]);
                recorridos += v.getAnterior().getNombre() + v.getNombre() + " ";
            }
        }
        aristas.removeAll(arista);
        return vertices;
    }
} //clase