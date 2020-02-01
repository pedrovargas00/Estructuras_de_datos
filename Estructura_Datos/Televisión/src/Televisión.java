import java.util.*;

public class Televisión {
    
    boolean encendidoApagado;
    int volumen, canal;
    Scanner in = new Scanner(System.in);
    
    Televisión(){
        
        encendidoApagado = false;
        volumen = 10;
        canal = 5;
    }
    
    /*Televisión(){
    
    }*/
    
    void encender(){
        
        if (encendidoApagado != true)
            encendidoApagado = true;
    }
    
    void apagar(){
        
        if (encendidoApagado == true)
            encendidoApagado = false;
        else
            System.out.println("La TV está apagada");
    }
    
    void cambiarCanal(int nuevoC){
       
        if (nuevoC < 100 && nuevoC > 0)
            canal = nuevoC;
        else
            System.out.println("No existe el canal");
    }   
    
    void mostrarEstado(){
        
        System.out.println("Estado actual: ");
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + volumen);
        System.out.println("Encendida: " + encendidoApagado);
    }
    
    void avanzarCanal(){
        
        int r;
        
        if (canal == 99)
            System.out.println("El canal actual es el último");
        else
            for(int i = canal; i < 100; i++){
                canal += 1;
                System.out.println("El canal es el deseado? 1 = Sí, 0 = No: ");
                r = in.nextInt();
                if (r == 1)
                    break;
            }
        System.out.println("Canal cambiado\n");
    }
    
    void retrocederCanal(){
        
        int r;
        
        if (canal == 0)
            System.out.println("El canal actual es el primero");
        else
            for(int i = canal; i != 0; i--){
                canal -= 1;
                System.out.println("El canal es el deseado? 1 = Sí, 0 = No: ");
                r = in.nextInt();
                if (r == 1)
                    break;
            }
        System.out.println("Canal cambiado\n");
    }
    void subirVolumen(){
            
        int r;
        
        if (volumen == 50)
            System.out.println("El volumen está al máximo");
        else
            for(int i = volumen; i <= 50; i++){
                volumen += 1;
                System.out.println("El volumen es el deseado? 1 = Sí, 0 = No: ");
                r = in.nextInt();
                if (r == 1)
                    break;
            }
        System.out.println("Volumen subido\n");
    }
    void bajarVolumen(){
            
        int r;
        
        if (canal == 99)
            System.out.println("El canal actual es el último");
        else
            for(int i = volumen; i != 0; i--){
                volumen -= 1;
                System.out.println("El volumen es el deseado? 1 = Sí, 0 = No: ");
                r = in.nextInt();
                if (r == 1)
                    break;
            }
        System.out.println("Volumen bajado\n");
    }
}// Fin de clase.
