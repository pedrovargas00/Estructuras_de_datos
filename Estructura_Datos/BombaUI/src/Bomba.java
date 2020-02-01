/*package Logica;
import Test.Test;*/

public class Bomba {
    
    private Test test; 
    private float litrosDeposito;
    private int precioLitro;
    private float cantidadServidaLitros;
    private float totalEnPesos;
        
    public Bomba(){
        litrosDeposito = 0;
        precioLitro = 0;
        cantidadServidaLitros = 0;
        totalEnPesos = 0;
    }
    
    public Bomba(float capacidadInicial){
        
        if (capacidadInicial > 1000)
            System.out.println("La cantidad inicial es más grande que la capacidad de la bomba");
        else{
            System.out.println("Entrada");
            this.litrosDeposito = capacidadInicial;
            precioLitro = 12;
        }
    }
    // Set y get.
    public void setTest(Test test){
        this.test = test;
    }
    
    public void setPrecioLitro(int nuevoPrecio){
        precioLitro = nuevoPrecio;
    }
    
    public float getPrecioLitro(){
        return precioLitro;
    }
    
    public void setLitrosDeposito(float nuevoLitrosDeposito){
        litrosDeposito = nuevoLitrosDeposito;
    }
    
    public float getLitrosDeposito(){
        return litrosDeposito;
    }
    
    public float getCantidadServidaLitros(){
        return cantidadServidaLitros;
    }
    
    public float getTotalEnPesos(){
        return totalEnPesos;
    }
    
    public boolean anuncio(int litrosServidos){
        
        cantidadServidaLitros  = litrosServidos;
        totalEnPesos = litrosDeposito * precioLitro;
        if (litrosServidos > litrosDeposito){
            System.out.println("El depósito no cuenta con la suficiente cantidad de gasolina");
            System.out.println("Se surtirá el contenido restante de la bomba: "+ litrosServidos);
            litrosDeposito = 0;
            System.out.println("El costo total es: "+ totalEnPesos);
            return true;
        }
        else
            return false;
    }
        
    public String anuncio(String n){
        
        int litros = Integer.valueOf(n);
        
        cantidadServidaLitros  = litros;
        totalEnPesos = litrosDeposito * precioLitro;
        if(litros > litrosDeposito)
            return "Gasolina insuficiente";
        else
            return "Gasolina Suficiente";
    }
    
    public void despacharLi(String n){
        
        System.out.println("111");
        int litrosSolicitados = Integer.valueOf(n);
        if( anuncio(litrosSolicitados) == true)
            return;
        else{
            cantidadServidaLitros = litrosSolicitados;
            litrosDeposito -= litrosSolicitados;
            totalEnPesos = litrosSolicitados * precioLitro;
            System.out.println("La cantidad surtida es: "+ litrosSolicitados);
            System.out.println("El costo total es: "+ totalEnPesos);
        }
    }
    
    public void despachar(String n){
              
        float cambio;
        int cantidadPesos = Integer.valueOf(n);
        int litrosSolicitados = cantidadPesos/precioLitro;
        if( anuncio(litrosSolicitados) == true)
            return;
        else{
            litrosDeposito -= cantidadServidaLitros;
            totalEnPesos = cantidadServidaLitros * precioLitro;
            System.out.println("La cantidad surtida es: "+ cantidadServidaLitros);
        }
    }
    
    public void mostrarEstado(){
        
        System.out.println("La cantidad de gasolina restante en la bomba: "+ litrosDeposito);
        System.out.println("La cantidad de gasolina surtida es: "+ cantidadServidaLitros);
        System.out.println("El costo por litro de gasolina es: "+ precioLitro);
        System.out.println("La costo total de la gasolina surtida es: "+ totalEnPesos);        
    }
}