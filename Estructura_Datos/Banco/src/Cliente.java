
public class Cliente {
    
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    
    public Cliente(String n, String ap){
        this.nombre = n;
        this.apellido = ap;
    }
    
    public void setCuenta(Cuenta cuenta){
        this.cuenta = cuenta;
    }
    
    public Cuenta getCuenta(){
        return cuenta;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
}
