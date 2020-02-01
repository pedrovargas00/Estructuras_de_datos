/*
Ramos López Lizbeth.
Vargas Arenas Pedro.
*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class GrafoUI extends JFrame {

	private JPanel pLetrero;
 	private Lienzo lienzo;
	private Grafo grafo; //referencia al grafo
        private JButton terminar;
        ArrayList<Character> b = new ArrayList();
  
      //constructor
    public GrafoUI(Grafo grafo) {

        super("App Grafo");
        setLocation(100, 100);
        setLayout(new BorderLayout(2,2));

	this.grafo = grafo; //Se conoce el grafo
	lienzo = new Lienzo(this.grafo); //pasamos al grafo para que el lienzo lo conozca
        lienzo.setPreferredSize(new Dimension(600, 500));
        initComponentes();
        
        pack();
   }


    private void initComponentes(){
        terminar = new JButton("Finalizar");
        pLetrero = new JPanel();
        pLetrero.add(new JLabel ("Da click en cualquier punto para agregar vertices..."));
        add(pLetrero, BorderLayout.PAGE_START);
        add(lienzo,BorderLayout.CENTER );
        add(terminar,BorderLayout.SOUTH);
        
        terminar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            b.clear();
            System.out.println("Recorrido A Profundidad"+grafo.dfs(grafo.getVertices(),b, 0, 0));
            b.clear();
        }
    
    });
    }
}
