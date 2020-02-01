import java.util.*;

public class Ecuacion extends Exception{
    
    public static void calcularEcuacion(int a, int b, int c) throws RaizNegativa
   {
       double x1, x2;
       
       x1 = ((-1)*b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
       x2 = ((-1)*b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
       if (x1 == 0 || x2 == 0)
           throw new RaizNegativa("Raíz Negativa Excepcion");
       else
           System.out.println("x1: "+x1);
           System.out.println("x2: "+x2);

   }
   
   public static void main(String []args){
       Scanner in = new Scanner(System.in);
       int a,b,c;
       
       System.out.println("Ingresa los coeficientes a, b y c");
       try {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            calcularEcuacion(a,b,c);
       }
       catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }
       catch(InputMismatchException e){
           System.out.println(e.getMessage());
       }
       catch (RaizNegativa ex){
           System.out.println(ex.getMessage());
       }
   }
}