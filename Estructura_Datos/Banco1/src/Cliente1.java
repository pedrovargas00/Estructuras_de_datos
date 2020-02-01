
public class Cliente1 {
    
    private String nombre;
    private String apellido;
    private Cuenta1 cuenta;
    
    public Cliente1(String n, String ap){
        this.nombre = n;
        this.apellido = ap;
    }
    
    public void setCuenta(Cuenta1 cuenta){
        this.cuenta = cuenta;
    }
    
    public Cuenta1 getCuenta(){
        return cuenta;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
}
