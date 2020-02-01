import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class GrafoUI extends JFrame {

	private JPanel pLetrero, botones;
 	private Lienzo lienzo;
	private Grafo grafo; //referencia al grafo
        private JButton inicio, terminar, restaurar;
        private JComboBox opGrafo, tipoGrafo;
        private ThreadColores hilo;
        private String sel;
        ArrayList<Vertice> b = new ArrayList();
  
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
        
        restaurar = new JButton("Restaurar");
        terminar = new JButton("Finalizar");
        inicio = new JButton("Iniciar");
        opGrafo = new JComboBox();
        tipoGrafo = new JComboBox();
        opGrafo.addItem("Tipo de Búsqueda");
        opGrafo.addItem("RPA");
        opGrafo.addItem("RPP");
        opGrafo.addItem("Dijkstra");
        tipoGrafo.addItem("Seleccione Tipo de Grafo");
        tipoGrafo.addItem("Dirigido");
        tipoGrafo.addItem("No dirigido");
        pLetrero = new JPanel();
        botones = new JPanel();
        //botones.add(restaurar);
        botones.add(tipoGrafo);
        botones.add(inicio);
        botones.add(opGrafo);
        botones.add(terminar);

        pLetrero.add(new JLabel ("Da click en cualquier punto para agregar vertices..."));
        add(pLetrero, BorderLayout.PAGE_START);
        add(lienzo, BorderLayout.CENTER );
        add(botones, BorderLayout.SOUTH);
        
        inicio.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                switch(sel){
                    case "Dirigido":
                        grafo.setDirigido(true);
                        break;
                    case "No dirigido":
                        break;
                }
            }
        });
        
        terminar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b.clear();
                grafo.desVisitar();
                if(grafo.isDirigido())
                    grafo.mostrarMatrizDirigida();
                else
                    grafo.mostrarMatriz();
                switch(sel){
                    case "RPA":
                        b.addAll(grafo.rpa(grafo.getVertices()));
                        hilo = new ThreadColores(lienzo, b);
                        hilo.start();
                        break;
                    case "RPP":
                        if(grafo.isDirigido())
                            b.addAll(grafo.dfsDirigido(grafo.getVertices(), new ArrayList()));
                        else
                            b.addAll(grafo.dfs(grafo.getVertices(),new ArrayList()));
                        hilo = new ThreadColores(lienzo, b);
                        hilo.start();
                        grafo.desVisitar();
                        break;
                    case "Dijkstra":
                        String n = JOptionPane.showInputDialog("Ingrese el nombre del vértice inicial: ");
                        String m = JOptionPane.showInputDialog("Ingrese el nombre del vértice final: ");
                        if(grafo.isDirigido())
                            grafo.dijkstraDirigido(grafo.getVertice(n), grafo.getVertice(m));
                        else
                            grafo.dijkstra(grafo.getVertice(n), grafo.getVertice(m));
                        grafo.desVisitar();
                        break;
                }
            }
        });
        
        restaurar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                hilo.restaurar();
                b.clear();
            }
        });  
                
        opGrafo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                JComboBox og = (JComboBox)e.getSource();
                sel = (String)og.getSelectedItem();
            }
        });
        
        tipoGrafo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                JComboBox og = (JComboBox)e.getSource();
                sel = (String)og.getSelectedItem();
            }
        });
        
    }
}



