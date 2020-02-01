
public class Banco{
	
	private int numClientes; // numero de clientes actuales
	private Cliente[] clientes; //arreglo de clientes del banco
	
	//constructor del banco
	public Banco(){
		numClientes = 0;
		clientes = new Cliente[10];
	}
	
	//crea un nuevo cliente que agrega al banco
	public void agregaCliente(String n, String a){
		clientes[numClientes++] = new Cliente(n,a);
	}
	
	public Cliente getCliente(int index){
		return clientes[index];
	}

	//regresa el numero de clientes actuales del banco	
	public int getNumClientes(){
		return numClientes;
	}
	
}