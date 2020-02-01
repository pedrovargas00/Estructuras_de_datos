/*import Logica.Bomba;
import Test.Test;
import Vista.*;*/
import javax.swing.*;

public class TestBomba {
    
   public static void main(String [] args){
       
    Bomba bomba = new Bomba(900);
    BombaUI vista = new BombaUI();
    Test test = new Test();
    
    bomba.setTest(test);
    vista.setTest(test);
    
    test.setLogica(bomba);
    test.setVista(vista);
    
    vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    vista.setLocation(100, 200);
    vista.setVisible(true);
    
    }
}
        
        /*float monto, precio, inicial, res;
        int op, litros;
        
        Scanner in = new Scanner(System.in);
        
        try{
            System.out.println("Ingrese la cantidad inicial de gasolina: ");
            inicial = in.nextFloat();
            System.out.println("Ingrese el precio por litro de gasolina: ");
            precio = in.nextFloat();
        }
        catch(Exception e){
            System.out.println("Datos incorrectos, ingrese de nuevo los valores");
            return;
        }
        Bomba bomba1 = new Bomba(inicial);
        bomba1.setPrecioLitro(precio);
        bomba1.setLitrosDeposito(inicial);
        res = bomba1.getLitrosDeposito();
        if (res > 1000)
            return;
        System.out.println("Si desea comprar gasolina por litro, presione 1");
        System.out.println("Si desea comprar gasolian por monto de dinero, presione 2");
        op = in.nextInt();
        switch(op){
            case 1: //Litro.
                try{
                    System.out.println("Ingrese los litros de gasolina que desea: ");
                    litros = in.nextInt();
                }
                catch(Exception e){
                    System.out.println("Datos incorrectos, ingrese de nuevo los valores");
                    return;
                }
                bomba1.despachar(litros);
                bomba1.mostrarEstado();
                break;
            case 2: //Monto
                try{
                    System.out.println("Ingrese el monto de dinero que desea gastar: ");
                    monto = in.nextFloat();
                }
                catch(Exception e){
                    System.out.println("Datos incorrectos, ingrese de nuevo los valores");
                    return;
                }
                bomba1.despachar(monto);
                bomba1.mostrarEstado();
                break;
            default:
                System.out.println("Dato inválido");
        }
    }*/