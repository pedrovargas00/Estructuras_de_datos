/*package Test;
import Vista.*;
import Logica.*;*/

public class Test {
    
    private Bomba bomba;
    private BombaUI vista;
    
    public Test(){
    
    }
    
    public void setVista(BombaUI vista){
        this.vista = vista;
    }
    
    public void setLogica(Bomba bomba){
        this.bomba = bomba;
    }
    
    public void despacharLitros(String litrosSolicitados){
        System.out.println("litros: "+ litrosSolicitados);
        bomba.despacharLi(litrosSolicitados);
    }
    
    public void despacharDinero(String Monto){
        System.out.println("Monto: "+ Monto);
        bomba.despachar(Monto);
    }
    
    public String VerVenta(){
        String st = String.valueOf(bomba.getTotalEnPesos());
        return st;
    }
    
    public String verLitros(){
        String st = String.valueOf(bomba.getCantidadServidaLitros());
        return st;
    }
    
    public String consinLitros(String Monto){
        String st = bomba.anuncio(Monto);
        return st;
    }
}