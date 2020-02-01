
public class Ave {
    
    protected String especie;
    
    Ave(){
        especie = "";
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public  void cantar(){
        System.out.println("El ave se está cantando");
    
    }
}
