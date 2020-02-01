import java.util.*;

public class TestAnimalesQueSeMueven {
    
    public static void main(String []args){
        
        String nombre;
        
        Scanner in = new Scanner(System.in);
        //Loro.
        Loro loro = new Loro();
        System.out.println("Ingrese la especie del loro: ");
        nombre = in.nextLine();
        loro.setEspecie(nombre);
        loro.volar();
        loro.caminar();
        loro.cantar();
        System.out.println("La especie es: "+ loro.getEspecie());
        System.out.print("\n\n");
                
        //Gato.
        Gato gato = new Gato();
        System.out.println("Ingrese la especie del gato: ");
        nombre = in.nextLine();
        gato.setEspecie(nombre);
        gato.caminar();
        gato.nadar();
        gato.mover();
        System.out.println("La especie es: "+ gato.getEspecie());
        System.out.print("\n\n");
        
        //Tigre.
        Tigre tigre = new Tigre();
        System.out.println("Ingrese la especie del tigre: ");
        nombre = in.nextLine();
        tigre.setEspecie(nombre);
        tigre.caminar();
        tigre.nadar();
        tigre.mover();
        System.out.println("La especie es: "+ tigre.getEspecie());
        System.out.print("\n\n");
        
        //Avestruz.
        Avestruz avestruz = new Avestruz();
        System.out.println("Ingrese la especie del avestruz: ");
        nombre = in.nextLine();
        avestruz.setEspecie(nombre);
        avestruz.caminar();
        avestruz.cantar();
        System.out.println("La especie es: "+ avestruz.getEspecie());
        System.out.print("\n\n");
        
        //Murciélago.
        Murcielago murcielago = new Murcielago();
        System.out.println("Ingrese la especie del murciélago: ");
        nombre = in.nextLine();
        murcielago.setEspecie(nombre);
        murcielago.mover();
        System.out.println("La especie es: "+ murcielago.getEspecie());
    }
}
