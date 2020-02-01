
public class Banco1 {
    
private int numClientes; // numero de clientes actuales
	private Cliente1[] clientes; //arreglo de clientes del banco
	
	//constructor del banco
	public Banco1(){
		numClientes = 0;
		clientes = new Cliente1[10];
	}
	
	//crea un nuevo cliente que agrega al banco
	public void agregaCliente(Cliente1 cl){
		clientes[numClientes++] = cl;
	}
	
	public Cliente1 getCliente(int index){
		return clientes[index];
	}

	//regresa el numero de clientes actuales del banco	
	public int getNumClientes(){
		return numClientes;
	}
}
