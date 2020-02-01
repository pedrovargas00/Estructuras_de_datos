package Árbol;
import Archivo.Datos;
import Enfermedades.Enfermedad;

public class Persona {
    private Persona padre;
    private Persona madre;
    private boolean visitado;
    private Enfermedad enfermedad;
    //private Controlador controlador;
    private Datos datos;
    //Atributos
       private String nombre;
       public Persona(){
       datos = new Datos(); 
       this.madre =null;
       this.padre=null;
       this.enfermedad = new Enfermedad(this);
       //this.datos =null;
    }
    public String getNombre() {
        return nombre;
    }

    public String getMadreNombre(){
        return madre.getNombre();
    }
    
    public String getPadreNombre(){
        return padre.getNombre();
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   
    
    public void calcularPorcentaje(){
        System.out.println("heufhe");
        enfermedad.calcporCancerMP();
        enfermedad.calcporLabioLep();
   //     enfermedad.calporcesquizofrenia();
        enfermedad.calporchemofilia();
        enfermedad.calpordiabetes();
        enfermedad.calporhipertension();
        enfermedad.calporobesidad();
        enfermedad.calportuboneural();
    }
  /*  public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    
    public Controlador getControlador(){
        return controlador;
    }*/
    public Datos getDatos(){
        return datos;
    }
    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }

    public Persona getMadre() {
        return madre;
    }

    public void setMadre(Persona madre) {
        this.madre = madre;
    }
    
    public void setVisitado(boolean visitado){
        this.visitado = visitado;
    }
    
    public boolean getVisitado(){
        return visitado;
    }
}
