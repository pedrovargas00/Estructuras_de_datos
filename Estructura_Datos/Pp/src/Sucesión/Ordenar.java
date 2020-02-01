package Sucesión;

import Coordinador.*;
import java.util.*;

public class Ordenar {
   
    private Coordinador coordinador;
    private int i;
    protected Vector<Integer> num;
    
    public Ordenar(){
        num = new Vector();    
        i = 0;
    }


    
    public void setCoordinador(Coordinador coordinador){
        this.coordinador = coordinador;
    }
    //-------------------------------------------------------------------------
    public void agregarNivel1(int n){
        num.add(n);
        System.out.println("Número: " +num);
    }
    
    public Vector<Integer> getNum() {
        return num;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void limpiarArreglo(){
        num.removeAllElements();
        //System.out.println("------------");
    }    

    public void burbuja(Vector a) {
        Collections.sort(a);
        /*
        for (Object numero: a) {
            System.out.println("pos"+a.get(i));
            i++;
            System.out.println(numero);
        }*/      
    }
    
    public boolean comparar(int n){
        if(num.get(i)== n){
            i++;
            return true;
        }
        else
            return false;
    }
    

    //--------------------------------------------------------------------------
}
