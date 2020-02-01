package lord_many_p1;
import java.util.*;

public class FCubo extends Geometría{
    
    float lar;
    
    //Hacer un constructor y no acceder a los atributos.
    FCubo(float l){
        lar = l;
    }
    
    FCubo(){
        super();
    }
    
    public void ingreC(){           
        
        int n, a;
           
        do{
            a = 1;
            Scanner in = new Scanner(System.in);
            try{
                System.out.println("Ingrese el largo: ");
                lar = in.nextFloat();                
            }
            catch(Exception e){
                System.out.println("\n****Dato incorrecto****");
                System.out.println("**Ingrese dato de nuevo**\n");
                a = 0;
            }  
            if (a == 1)
                n = 0;
            else
                n = 1;
        } 
        while(n == 1);
    }
    
    public float getLargo(){
        return this.lar;
    }
}