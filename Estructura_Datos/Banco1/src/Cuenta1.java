
public class Cuenta1 {
    
    private double balance;
    
    public Cuenta1(double balanceInicial){
        this.balance = balanceInicial;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public boolean depositar(double cantidad){
        
        if (cantidad > 0){
            System.out.println("La cantidad a depositar es positiva");
            balance += cantidad;
            System.out.println("El deposito se ha realizado");
            return true;
        }
        else{
            System.out.println("La cantidad a depositar es negativa");
            System.out.println("El deposito no se puede realizar");
            return false;
        }
    }
    
    public boolean retirar(double cantidad){
        
        if (cantidad < balance){
            System.out.println("El retiro es válido");
            balance -= cantidad;
            System.out.println("Retiro realizado");
            return true;
        }
        else{
            System.out.println("El retiro se puede realizar");
            System.out.println("Retiro denegado");
            return false;
        }
    }
}
