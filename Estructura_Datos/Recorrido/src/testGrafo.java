
import java.util.ArrayList;


public class testGrafo {
    public static void main(String []args){

        ArrayList <Character> a = new ArrayList(); 
        
        Grafo g = new Grafo(4);
        Grafo g1= new Grafo(6);
        Grafo g2= new Grafo(9);

        g.agregaVertice("A");
        g.agregaVertice("B");
        g.agregaVertice("C");
        g.agregaVertice("D");
        g.mostrarVertices();
        
        g.agregaArista("A", "B");
        g.agregaArista("A", "D");
        g.agregaArista("B", "A");
        g.agregaArista("B", "D");
        g.agregaArista("B", "C");
        g.agregaArista("C", "B");
        g.mostrarMatriz();

        System.out.println("recorrido en profudidad " + g.dfs(g.getVertices(), a, 0, 0));
        a.clear();
        
        g1.agregaVertice("a");
        g1.agregaVertice("b");
        g1.agregaVertice("c");
        g1.agregaVertice("d");
        g1.agregaVertice("e");
        g1.agregaVertice("f");
        g1.mostrarVertices();
        
        g1.agregaArista("a", "e");
        g1.agregaArista("a", "f");
        g1.agregaArista("b", "a");
        g1.agregaArista("b", "c");
        g1.agregaArista("c", "d");
        g1.agregaArista("d", "a");
        g1.agregaArista("d", "b");
        g1.agregaArista("d", "c");
        g1.agregaArista("e", "c");
        g1.agregaArista("e", "f");
        g1.agregaArista("f", "e");        
        g1.mostrarMatriz();
        
        System.out.println("recorrido en profudidad " + g1.dfs(g1.getVertices(), a, 0, 0));
        a.clear();

        g2.agregaVertice("1");
        g2.agregaVertice("2");
        g2.agregaVertice("3");
        g2.agregaVertice("4");
        g2.agregaVertice("5");
        g2.agregaVertice("6");
        g2.agregaVertice("7");
        g2.agregaVertice("8");
        g2.agregaVertice("9");
        g2.mostrarVertices();
        
        g2.agregaArista("1", "2",8);
        g2.agregaArista("1", "4",15);
        g2.agregaArista("1", "5",7);      
        g2.agregaArista("2", "1",8);
        g2.agregaArista("2", "5",5);
        g2.agregaArista("2", "6",34);
        g2.agregaArista("2", "8",12);
        g2.agregaArista("3", "6",11);
        g2.agregaArista("3", "9",98);
        g2.agregaArista("4", "1",15);
        g2.agregaArista("4", "5",10);
        g2.agregaArista("4", "7",20);
        g2.agregaArista("5", "1",7);
        g2.agregaArista("5", "2",5);
        g2.agregaArista("5", "4",10);
        g2.agregaArista("5", "7",15);        
        g2.agregaArista("5", "9",8);
        g2.agregaArista("6", "2",34);        
        g2.agregaArista("6", "3",11);     
        g2.agregaArista("6", "7",2);
        g2.agregaArista("6", "8",7);
        g2.agregaArista("6", "9",74);
        g2.agregaArista("7", "4",20);        
        g2.agregaArista("7", "5",15);
        g2.agregaArista("7", "6",2);        
        g2.agregaArista("8", "2",12);
        g2.agregaArista("8", "6",7);        
        g2.agregaArista("9", "3",98);
        g2.agregaArista("9", "5",8);        
        g2.agregaArista("9", "6",74);
        g2.mostrarMatriz();
        
        System.out.println("recorrido en profudidad " + g2.dfs(g2.getVertices(), a, 0, 0));
        a.clear();

    }
}
