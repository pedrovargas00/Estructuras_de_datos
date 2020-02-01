import java.util.*;

public class TestReloj {
    
    public static void main(String[] args){
        
        int sel;
        Reloj rl = new Reloj();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Seleccione una opción: ");
        System.out.println("1.- Mostrar hora.\n2.- Cambiar horario.\n3.- Cambiar minutero.\n4.- Cambiar segundero.\n5.- Alarma.");
        sel = in.nextInt();
        switch(sel){
            case 1: rl.mostrarHora();
            break;
            case 2: rl.cambiarH();
            break;
            case 3: rl.cambiarM();
            break;
            case 4: rl.cambiarS();
            break;
            case 5: rl.alarma();
            break;
        }
        rl.mostrarHora();
    }
}// Fin de clase.
