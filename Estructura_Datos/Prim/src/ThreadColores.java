import java.awt.*;
import java.util.*;

public class ThreadColores extends Thread {

    private Lienzo lienzo;
    private Grafo grafo;
    private ArrayList <Vertice> lista;
    private ArrayList<Arista> arista;
    private ArrayList<Arista> aristas;
    private ArrayList<AristaDirigida> dirigida;
    private Color[] colores = { 
        Color.MAGENTA, Color.RED,
        Color.CYAN, Color.BLUE, Color.DARK_GRAY,
        Color.GREEN, Color.PINK
    };
    private Color color; //color actual

    public ThreadColores(Lienzo lienzo, ArrayList <Vertice> lista, ArrayList<Arista> arista, ArrayList<AristaDirigida> dirigida){

        this.lienzo = lienzo;
        this.lista = lista;
        this.arista = arista;
        this.dirigida = dirigida;
        color = Color.yellow; //por default;
    }

    public void setAristas(ArrayList aristas){
        this.aristas = aristas;
    }
    
    public void run(){

        //obtiene numero aleatorio de 0 a 10
        // y lo relaciona con colores
        color = colores[(int) (Math.random()*7)];
        //para cada vertice, cambia su color y lo dibuja
        System.out.print("Recorrido: ");
        for( Vertice v: lista){
            v.setColor(color); //establece nuevo color
            System.out.print(""+v.getNombre());
            try {
               lienzo.repaint();
               sleep(100);
            }catch (InterruptedException ex){}
        }
        if(!arista.isEmpty()){
            for(Arista a: arista){
                a.setColor(color); //establece nuevo color
                try {
                    lienzo.repaint();
                    sleep(100);
                }catch (InterruptedException ex){}
            }
        }if(!dirigida.isEmpty()){
            for(AristaDirigida a: dirigida){
                a.setColor(color); //establece nuevo color
                try {
                    lienzo.repaint();
                    sleep(100);
                }catch (InterruptedException ex){}
            }
        }
        System.out.println("Peso-----------: " + aristas.toString());
        if(aristas.isEmpty())
            System.out.println("\nfghkdfgshdfgihs\nhdfkggd\nduhgudfg\ndjfhgkdfhg");
        for(Arista a: aristas){
            a.setColor(Color.LIGHT_GRAY); //establece nuevo color
            try {
                lienzo.repaint();
                sleep(100);
            }catch (InterruptedException ex){}
        } 
    }   
    
    public void restaurar(){
        for( Vertice v: lista)
            v.setColor(Color.BLACK);
        if(arista != null || dirigida != null){
            for(Arista a: arista)
                a.setColor(Color.BLACK);
            for(Arista a: aristas)
                a.setColor(Color.BLACK);
            for(AristaDirigida a: dirigida)
                a.setColor(Color.WHITE);
        }
        lienzo.repaint();
    }
}