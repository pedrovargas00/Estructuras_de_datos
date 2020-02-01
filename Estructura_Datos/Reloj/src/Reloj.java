import java.util.*;

public class Reloj {
    
    int hora, minuto, segundo, horaA, minutoA, segundoA;
    Scanner in = new Scanner(System.in);
    
    Reloj(){
        
        hora = 01;
        minuto = 01;
        segundo = 00;
    }
    
    void cambiarH(){
        
        System.out.println("La hora actual es: "+ hora +":"+ minuto +":"+ segundo);
        System.out.println("Ingrese sólo el horario (horas): ");
        hora = in.nextInt();
        System.out.println("\n**La hora se ha cambiado**");
    }
    
    void cambiarM(){
        
        System.out.println("La hora actual es: "+ hora +":"+ minuto +":"+ segundo);
        System.out.println("Ingrese sólo el minutero (minutos): ");
        minuto = in.nextInt();
        System.out.println("\n**Los minutos se ha cambiado**");
    }
    
    void cambiarS(){
    
        System.out.println("La hora actual es: "+ hora +":"+ minuto +":"+ segundo);
        System.out.println("Ingrese sólo el segundero (segundos): ");
        segundo = in.nextInt();
        System.out.println("\n**Los segundos se ha cambiado**");
    }
    
    void alarma(){
        
        System.out.println("Establezca la alarma");
        System.out.println("Ingrese las horas: ");
        horaA = in.nextInt();
        System.out.println("Ingrese los minutos: ");
        minutoA = in.nextInt();
        System.out.println("Ingrese los segundos: ");
        segundoA = in.nextInt();
        System.out.println("\n**Alarma ingresada**\n");
    }
    void mostrarHora(){
    
        System.out.println("La hora es: "+ hora +":"+ minuto +":"+ segundo);
    }
}
