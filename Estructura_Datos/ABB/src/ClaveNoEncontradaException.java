
public class ClaveNoEncontradaException extends Exception{
    
    public ClaveNoEncontradaException(){
        super("Clave inexistente");
    }
    
    public ClaveNoEncontradaException(String mensaje){
        super(mensaje);
    }
}
