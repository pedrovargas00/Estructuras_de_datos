import java.awt.*;
import java.util.*;

public class ThreadColores extends Thread {

    private Lienzo lienzo;
    private ArrayList <Vertice> lista;
    private Color[] colores = { 
        Color.RED, Color.red,
        Color.cyan, Color.yellow, Color.orange,
        Color.green,Color.LIGHT_GRAY,
        Color.pink, Color.DARK_GRAY
        };
    private Color color; //color actual

    public ThreadColores(Lienzo lienzo, ArrayList <Vertice> lista){

        this.lienzo = lienzo;
        this.lista = lista;
        color = Color.yellow; //por default;
    }

    public void run(){

        //obtiene numero aleatorio de 0 a 10
        // y lo relaciona con colores
        color = colores[(int) (Math.random()*9)];
        //para cada vertice, cambia su color y lo dibuja
        System.out.print("Recorrido: ");
        for( Vertice v: lista)
        {
            v.setColor(color); //establece nuevo color
            System.out.print(""+v.getNombre());
            try {
               lienzo.repaint();
               sleep(1000);
            }catch (InterruptedException ex){}
        }
        System.out.println("");
    }   
    
    public void restaurar(){
        for( Vertice v: lista)
            v.setColor(Color.BLACK);
        lienzo.repaint();
    }
    
    
}