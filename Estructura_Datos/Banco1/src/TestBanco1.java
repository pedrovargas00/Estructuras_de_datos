
public class TestBanco1 {
    
    public static void main (String []args){
    
    Banco1 banco = new Banco1();
    Cliente1 cliente;
    Cuenta1 cuenta;

    System.out.println("Creando el cliente Luis Millan.");
    banco.agregaCliente(new Cliente1("Luis", "Millan"));
    cliente = banco.getCliente(0);
    System.out.println("Creando su cuenta con 500.00.");
    cliente.setCuenta(new Cuenta1(500.00));

    System.out.println("Creando el cliente Rogelio Rea.");
    banco.agregaCliente(new Cliente1("Rogelio", "Rea"));
    cliente = banco.getCliente(1);
    System.out.println("Creando una cuenta con 800.00.");
    cliente.setCuenta(new Cuenta1(800.00));

	//creando una cuenta adicional para la esposa de Rogelio Rea
    System.out.println("Creando la cliente Alma Rea.");
    banco.agregaCliente(new Cliente1 ("Alma", "Rea"));
    cliente = banco.getCliente(2);
    System.out.println("Alma comparte su cuenta con su esposo Rogelio.");
    cliente.setCuenta(banco.getCliente(1).getCuenta());

    System.out.println();
    // Probar algunas cuentas
    System.out.println("Recupera el cliente Luis Millan y su cuenta.");
    cliente = banco.getCliente(0);
    cuenta = cliente.getCuenta();
    // Desarrolla algunas transacciones
    System.out.println("Retira 150.00: " + cuenta.retirar(150.00));
    System.out.println("Deposito 25.0: " + cuenta.depositar(25.0));
    System.out.println("Retira 47.62: " + cuenta.retirar(47.62));
    System.out.println("retirar 400.00: " + cuenta.retirar(400.00));
    System.out.println("Deposito -100.0: " + cuenta.depositar(-100.0));
    // Imprime el banance final
    System.out.println("Cliente [" + cliente.getNombre()
		       + ", " + cliente.getApellido()
		       + "] su balance de " + cuenta.getBalance());

    System.out.println();

    System.out.println("Recupera el cliente Rogelio Rea y su cuenta.");
    cliente = banco.getCliente(1);
    cuenta = cliente.getCuenta();
    // Desarrolla algunas transacciones
    System.out.println("Retira 150.00: " + cuenta.retirar(150.00));
    System.out.println("Deposito 25.0: " + cuenta.depositar(25.0));
    System.out.println("Retira 47.62: " + cuenta.retirar(47.62));
    System.out.println("retirar 400.00: " + cuenta.retirar(400.00));
    // Imprime el balance final
    System.out.println("Cliente [" + cliente.getNombre()
		       + ", " + cliente.getApellido()
		       + "] su balance de " + cuenta.getBalance());

    System.out.println();
    
    System.out.println("Recupera el cliente Alma Rea su cuenta.");
    cliente = banco.getCliente(2);
    cuenta = cliente.getCuenta();
    // Desarrolla algunas transacciones
    System.out.println("Deposita 150.00: " + cuenta.depositar(150.00));
    System.out.println("retirar 750.0: " + cuenta.retirar(750.0));
    // Imprime el balance final
    System.out.println("Cliente [" + cliente.getNombre()
		       + ", " + cliente.getApellido()
		       + "] su balance de " + cuenta.getBalance());
  }
}
