/*Equipo:
Ramos Lopez Lizbeth
Vargas Arenas Pedro*/

import java.util.ArrayList;
public class Grafo {
    private boolean dirigido;  //por defautl NO dirigido - FALSE
    private ArrayList <Vertice> vertices; //arreglo de vÃ©rtices
    private int A[][];   //RepresentaciÃ³n con matriz de adyacencia
    private int orden;
    private int pos; //Indice de vertices

    public Grafo(int n, boolean dirigido){
        vertices = new ArrayList();
        A = new int[n][n];
        this.dirigido = dirigido; 
        orden = n;
        pos = 0;
    }

    public Grafo(int n) {
        this(n, false);//por default NO dirigido
    }
    
    public Grafo(){
        this(15);  //Por default hasta de 15 vÃ©rtices
    }

    public Vertice getVertices(){
        return vertices.get(0);
    
    }
    public void agregaVertice(String nom){
        if(pos < orden){
            Vertice v = new Vertice(nom, pos);
            vertices.add(pos, v);
            pos++;
        }
        else
            System.out.println("Numero de vertices excedido");
    }

    public void mostrarMatriz(){
        System.out.println("\nMatriz de Adyacencia");
        for(int i = 0; i < pos; i++) {
            for(int j = 0; j < pos; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
    }

    //mostrar la lista de vï¿½rtices
    public void mostrarVertices(){
    	System.out.println("\nLista de vertices");
        for(Vertice v : vertices){
            System.out.println("Vertice: "+v.getNombre()+" indice: "+v.getIndex());
        }
    }

    //TODO -implementa las siguientes funciones
    public void agregaArista(String vo, String vd, int peso){
        int a = 0,b=0;
        for(Vertice v : vertices){
            if(vo.equalsIgnoreCase(v.getNombre()))
                a = v.getIndex();
        }
        for(Vertice v : vertices){
            if(vd.equalsIgnoreCase(v.getNombre()))
                b = v.getIndex();
        }
        A[a][b]= A[a][b]+peso;
    }

    public void agregaArista(String vo, String vd){
        int a = 0,b=0;
        for(Vertice v : vertices){
            if(vo.equalsIgnoreCase(v.getNombre()))
                a = v.getIndex();
        }
        for(Vertice v : vertices){
            if(vd.equalsIgnoreCase(v.getNombre()))
                b = v.getIndex();
        }
        A[a][b]=(A[a][b])+1;
    }
    
    public ArrayList dfs(Vertice vi, ArrayList a, int fila, int tam){
        
        if(a.isEmpty()){
            a.add(vi.getNombre());
            vi.setVisitado(true);
        }
        if(a.size() == vertices.size())
            return a;
        else{
            for(int j = 0; j < A.length; j++){
                if(A[fila][j] != 0 && vertices.get(j).isVisitado() == false){
                    vertices.get(j).setVisitado(true);
                    a.add(vertices.get(j).getNombre());
                    //System.out.println("Vi: " + vi + "a: " + a + "j: " + j);
                    return dfs(vi, a, j, a.size()-1);
                }            
            } 
            for(int i = 0; i < vertices.size(); i++){
                //System.out.println("Vertice: " + vertices.get(i).getNombre() + " A: " + (String)a.get(tam));
                if(vertices.get(i).getNombre().equalsIgnoreCase((String) a.get(tam))){
                    vi = vertices.get(i);
                    tam -= 1;
                    //System.out.println("Vi: " + vi.getNombre() + " a: " + a + " Index: " + vi.getIndex() + " tam: " + tam);
                    return dfs(vi, a, vi.getIndex(), tam-1);    
                }
            }
            
        }
        return a;
    }
}