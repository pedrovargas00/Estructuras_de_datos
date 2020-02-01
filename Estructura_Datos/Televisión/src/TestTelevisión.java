
public class TestTelevisión {
    
    public static void main(String[] args){
        
        Televisión tv = new Televisión();
        Televisión tv1 = new Televisión();
        
        tv.canal = 10;
        tv.encender();
        System.out.println("Avanzar canales");
        tv.avanzarCanal();
        tv.mostrarEstado();
        
        tv1.volumen = 49;
        System.out.println("Bajar Volumen");
        tv1.bajarVolumen();
        tv1.mostrarEstado();
    }
}
