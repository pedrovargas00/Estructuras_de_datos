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
        for(int i=0; i<pos; i++) {
            for(int j=0; j<pos; j++){
                System.out.print(A[i][j]+" ");
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
        A[a][b]=A[a][b]+peso;
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
}
