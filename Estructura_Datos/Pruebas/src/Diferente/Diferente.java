package Diferente;

import Coordinador.*;
import java.util.*;

public class Diferente {
    private Coordinador coordinador;
     static int i;
      int ar[]=new int[2];
      protected Vector<Integer> bot;
      
    public Diferente(){
        bot = new Vector();
        i = 0;
    }
    public int guardarCadena(String cad){
        int c=Integer.parseInt(cad);
       if (i<2){
           
           bot.add(c);
           System.out.println("elemento"+bot.get(i));
           i++; 
       } 
       if(i==2)
           if(bot.get(0)== bot.get(1)){
               bot.removeAllElements();
               System.out.println("Son iguales");
               i=0;
               return 0;
           }else{
               System.out.println("No Son iguales");
               bot.removeAllElements();
               i=0;
             return 1;
           } /*else*/
           return 0;
  
   }
    public void setCoordinador(Coordinador coordinador){
        this.coordinador = coordinador;
    }
}
