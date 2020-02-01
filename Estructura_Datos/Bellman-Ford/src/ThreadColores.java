import java.awt.*;
import java.util.*;

public class ThreadColores extends Thread {

    private Lienzo lienzo;
    private ArrayList <Vertice> lista;
    private ArrayList<Arista> arista;
    private ArrayList<AristaDirigida> dirigida;
    private Color[] colores = { 
        Color.RED, Color.red,
        Color.cyan, Color.yellow, Color.orange,
        Color.green,Color.LIGHT_GRAY,
        Color.pink, Color.DARK_GRAY
    };
    private Color color; //color actual

    public ThreadColores(Lienzo lienzo, ArrayList <Vertice> lista, ArrayList<Arista> arista, ArrayList<AristaDirigida> dirigida){

        this.lienzo = lienzo;
        this.lista = lista;
        this.arista = arista;
        this.dirigida = dirigida;
        color = Color.yellow; //por default;
    }

    public void run(){

        //obtiene numero aleatorio de 0 a 10
        // y lo relaciona con colores
        color = colores[(int) (Math.random()*9)];
        //para cada vertice, cambia su color y lo dibuja
        System.out.print("Recorrido: ");
        for( Vertice v: lista){
            v.setColor(color); //establece nuevo color
            System.out.print(""+v.getNombre());
            try {
               lienzo.repaint();
               sleep(1000);
            }catch (InterruptedException ex){}
        }
        if(arista != null && !arista.isEmpty()){
            for(Arista a: arista){
                a.setColor(color); //establece nuevo color
                try {
                    lienzo.repaint();
                    sleep(1000);
                }catch (InterruptedException ex){}
            }
        }if(dirigida != null && !dirigida.isEmpty()){
            for(AristaDirigida a: dirigida){
                a.setColor(color); //establece nuevo color
                try {
                    lienzo.repaint();
                    sleep(1000);
                }catch (InterruptedException ex){}
            }
        }
        
    }   
    
    public void restaurar(){
        for( Vertice v: lista)
            v.setColor(Color.BLACK);
        if(arista != null || dirigida != null){
            for(Arista a: arista)
                a.setColor(Color.BLACK);
            for(AristaDirigida a: dirigida)
                a.setColor(Color.WHITE);
        }
        lienzo.repaint();
    }
}