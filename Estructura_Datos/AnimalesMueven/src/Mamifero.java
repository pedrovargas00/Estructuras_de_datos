
public class Mamifero {
    
    protected String especie;
    
    Mamifero(){
        especie = "";
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public  void mover(){
        
        System.out.println("El mamífero se está moviendo");
    
    }
}
