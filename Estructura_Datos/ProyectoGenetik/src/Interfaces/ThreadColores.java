package Interfaces;

import Interfaces.DibujarArbol;
import java.awt.*;
import java.util.*;
import Árbol.Arbol;

/*
Ricardo Emmanuel García Cruz
Belen Tepoz Romero
 *Esta clase es la que va a permitir colorear los vertices.
 *Recibe como parametro la lista de vertices y el panel(lienzo)
 *donde se dibujan
 */
public class ThreadColores extends Thread {
                private DibujarArbol grafo;
	private Lienzo lienzo;
            private int i;
	private ArrayList <PersonaUI> lista;
	
	private Color color; //color actual

	public ThreadColores(Lienzo lienzo, ArrayList <PersonaUI> lista,DibujarArbol gr,int i)
	{
                                 System.out.println(lista);
                                this.i=i;
                                this.grafo= gr;
                               this.lienzo = lienzo;
		this.lista = lista;
		color = Color.yellow; //por default;
	}

	public void run(){
                                              
                                switch(i){
                                    case 0:
                                       if(!lista.isEmpty()){
                                                color=Color.red;
                                                for( PersonaUI v: lista){        
                                                    v.setColor(color); //establece nuevo color
                                                    try {
                                                            lienzo.repaint();
                                                            sleep(1000);
                                                    }catch (InterruptedException ex){}
                                                }
                                       }
                                       break;
                                    case 1: 
                                          if(!lista.isEmpty()){
                                              color=Color.yellow;
                                                for( PersonaUI v: lista){        
                                                    v.setColor(color); //establece nuevo color
                                                    try {
                                                            lienzo.repaint();
                                                            sleep(1000);
                                                    }catch (InterruptedException ex){}
                                                }
                                          }
                                        break;
                                    case 2:
                                           if(!lista.isEmpty()){
                                         color=Color.GREEN;
                                        for( PersonaUI v: lista){        
                                            v.setColor(color); //establece nuevo color
                                            try {
                                                    lienzo.repaint();
                                                    sleep(1000);
                                            }catch (InterruptedException ex){}
                                        }
                                        break;

                                           }
                                }
	}
}