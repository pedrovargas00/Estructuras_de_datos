
public class ClaveDuplicadaException extends Exception{
    
    public ClaveDuplicadaException(){
        super("Valor duplicado");
    }
    
    public ClaveDuplicadaException(String mensaje){
        super(mensaje);
    }
    
}
