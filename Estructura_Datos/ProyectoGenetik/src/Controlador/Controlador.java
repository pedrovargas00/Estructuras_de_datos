package Controlador;

import Archivo.*;
import Interfaces.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import Árbol.*;

public class Controlador{
    
    private Archivo archivo;
    private PortadaUI portada;
    private Arbol arbol;
    private DatosUI formulario;
    private Datos datos;
    private DibujarArbol dibujaArbol;
    private AbrirArchivoGUI abrir;
    private ArbolUI arbolUI;
    private DiagnosticoUI diagnosticoUI;
    public Controlador(){
    }

    public AbrirArchivoGUI getAbrir() {
        return abrir;
    }
    
    public Arbol getArbol(){
        return arbol;
    }

    public void setAbrir(AbrirArchivoGUI abrir) {
        this.abrir = abrir;
    }

    public DiagnosticoUI getDiagnosticoUI() {
        return diagnosticoUI;
    }

    public void setDiagnosticoUI(DiagnosticoUI diagnosticoUI) {
        this.diagnosticoUI = diagnosticoUI;
    }
 
    public void setPortada(PortadaUI portada){
        this.portada = portada;
    }
        
    public void setArbolUI(ArbolUI arbolUI){
        this.arbolUI = arbolUI;
    }

    public void setDibujaArbol(DibujarArbol dibujaArbol) {
        this.dibujaArbol = dibujaArbol;
    }
    
    public void setAbrirArchivosGUI(AbrirArchivoGUI abrir){
        this.abrir = abrir;
    }
      
    public int numNodos(){
        return dibujaArbol.getArrayVertices().size();
    }
    
    public int altura(){
        return arbol.altura(arbol.getRaiz());
    }
    public Persona crearPersona(){
        return arbol.CrearPersona();
    }
        
    public void insertarPPersona(String per) {
          arbol.insertar(per);
       }
    public void insertarPersonaD(String hijo,String Padre) {
          arbol.insertarD(hijo, Padre);
       }
    public void insertarPersonaI(String hijo,String Padre) {
          arbol.insertarI(hijo, Padre);
       } 
    public void setArchivo(Archivo archivo) {
           this.archivo = archivo;
       }

    public void setArbol(Arbol arbol) {
        this.arbol = arbol;
    }
    
    public void setDibujar(PortadaUI dibujar){
        this.portada = dibujar;
    }
    
    public void setFormulario(DatosUI formulario){
        this.formulario = formulario;
    }
    
    public void setDatos(Datos datos){
        this.datos = datos;
    }
    
    public void setCausaMuerte(int causa){
        
        datos.setCausaMuerte(causa);
    }
    
    public int getCausaMuerte(){
        return datos.getCausaMuerte();
    }
    
    public void setSexo(char sexo){
        datos.setSexo(sexo);
    }
    
    public char getSexo(){
        return datos.getSexo();
    }
    
    public void setNombre(String nombre){
        datos.setNombre(nombre);
    }
    
    public String getNombre(){
        return datos.getNombre();
    }
    
    public void setPregHist1(boolean ph1){
        datos.setPregHist1(ph1);
    }
    
    public boolean isPregHist1(){
        return datos.isPregHist1();
    }
    
    public void setPregHist2(boolean ph2){
        datos.setPregHist2(ph2);
    }
    
    public boolean isPregHist2(){
        return datos.isPregHist2();
    }

    public void setPregHist3(boolean ph3){
        datos.setPregHist3(ph3);
    }
    
    public boolean isPregHist3(){
        return datos.isPregHist3();
    }
    
    public void setPregHist4(boolean ph4){
        datos.setPregHist4(ph4);
    }
    
    public boolean isPregHist4(){
        return datos.isPregHist4();
    }
    
    public void setPregHist5(boolean ph5){
        datos.setPregHist5(ph5);
    }
    
    public boolean isPregHist5(){
        return datos.isPregHist5();
    }
    
    public void setPregHist6(boolean ph6){
        datos.setPregHist6(ph6);
    }
    
    public boolean isPregHist6(){
        return datos.isPregHist6();
    }    

    public void setPregHist7(boolean ph7){
        datos.setPregHist7(ph7);
    }
    
    public boolean isPregHist7(){
        return datos.isPregHist7();
    }
    
    public void setPregHist8(boolean ph8){
        datos.setPregHist8(ph8);
    }
    
    public boolean isPregHist8(){
        return datos.isPregHist8();
    }
    
    public void setPregHist9(boolean ph9){
        datos.setPregHist9(ph9);
    }
    
    public boolean isPregHist9(){
        return datos.isPregHist9();
    }
    
    public void setPregHist10(boolean ph10){
        datos.setPregHist10(ph10);
    }
    
    public boolean isPregHist10(){
        return datos.isPregHist10();
    }    
    
    public void setPregHabito1(boolean pregHabito1){
        datos.setPregHabito1(pregHabito1);
    }
    
    public boolean isPregHabito1(){
        return datos.isPregHabito1();
    }
    
    public void setPregHabito2(boolean pregHabito2){
        datos.setPregHabito2(pregHabito2);
    }
    
    public boolean isPregHabito2(){
        return datos.isPregHabito2();
    }

    public void setPregHabito3(boolean pregHabito3){
        datos.setPregHabito3(pregHabito3);
    }
    
    public boolean isPregHabito3(){
        return datos.isPregHabito3();
    }
    
    public void setPregHabito4(boolean pregHabito4){
        datos.setPregHabito4(pregHabito4);
    }
    
    public boolean isPregHabito4(){
        return datos.isPregHabito4();
    }
    
    public void setPregHabito5(boolean pregHabito5){
        datos.setPregHabito5(pregHabito5);
    }
    
    public boolean isPregHabito5(){
        return datos.isPregHabito5();
    }
    
    public void setPregHabito6(boolean pregHabito6){
        datos.setPregHabito6(pregHabito6);
    }
    
    public boolean isPregHabito6(){
        return datos.isPregHabito6();
    }    

    public void setPregHabito7(boolean pregHabito7){
        datos.setPregHabito7(pregHabito7);
    }
    
    public boolean isPregHabito7(){
        return datos.isPregHabito7();
    }

    public void setPregHabito8(boolean pregHabito8){
        datos.setPregHabito8(pregHabito8);
    }
    
    public boolean isPregHabito8(){
        return datos.isPregHabito8();
    }
    
    public void setPregHabito9(boolean pregHabito9){
        datos.setPregHabito9(pregHabito9);
    }
    
    public boolean isPregHabito9(){
        return datos.isPregHabito9();
    }
    public void setEsquizofrenia(boolean esquizofrenia){
        datos.setEsquizofrenia(esquizofrenia);
    }
    
    public boolean isEsquizofrenia(){
        return datos.isEsquizofrenia();
    }
    
    public void setHemofilia(boolean hemofilia){
        datos.setHemofilia(hemofilia);
    }
    
    public boolean isHemofilia(){
        return datos.isHemofilia();
    }
    
    public void setDiabetes(boolean diabetes){
        datos.setDiabetes(diabetes);
    }
    
    public boolean isDiabetes(){
        return datos.isDiabetes();
    }
    
    public void setObesidad(boolean obesidad){
        datos.setObesidad(obesidad);
    }
    
    public boolean isObesidad(){
        return datos.isObesidad();
    }
    
    public void setLabioL(boolean labioL){
        datos.setLabioL(labioL);
    }
    
    public boolean isLabioL(){
        return datos.isLabioL();
    }
    
    public void setCancerMP(boolean cancerMP){
        datos.setCancerMP(cancerMP);
    }
    
    public boolean isCancerMP(){
        return datos.isCancerMP();
    }
    
    public void setDefectosTN(boolean defectosTN){
        datos.setDefectosTN(defectosTN);
    }
    
    public boolean isDefectosTN(){
        return datos.isDefectosTN();
    }
    
    public void setHipertension(boolean hipertension){
        datos.setHipertension(hipertension);
    }
    
    public boolean isHipertension(){
        return datos.isHipertension();
    }
    
    public void setPorcEsquizofrenia(float porcEsquizofrenia){
        datos.setPorcEsquizofrenia(porcEsquizofrenia);
    }
    
    public float getPorcEsquizofrenia(){
        return datos.getPorcEsquizofrenia();
    }
    
    public void setPorcHemofilia(float porcHemofilia){
        datos.setPorcHemofilia(porcHemofilia);
    }
    
    public float getPorcHemofilia(){
        return datos.getPorcHemofilia();
    }
    
    public void setPorcDiabetes(float porcDiabetes){
        datos.setPorcDiabetes(porcDiabetes);
    }
    
    public float getPorcDiabetes(){
        return datos.getPorcDiabetes();
    }
    
    public void setPorcObesidad(float porcObesidad){
        datos.setPorcObesidad(porcObesidad);
    }
    
    public float getPorcObesidad(){
        return datos.getPorcObesidad();
    }
    
    public void setPorcLabioL(float porcLabioL){
        datos.setPorcLabioL(porcLabioL);
    }
    
    public float getPorcLabioL(){
        return datos.getPorcLabioL();
    }
    
    public void setPorcCancerMP(float porcCancerMP){
        datos.setPorcCancerMP(porcCancerMP);
    }
    
    public float getPorcCancerMP(){
        return datos.getPorcCancerMP();
    }
    
    public void setPorcDefectosTN(float porcDefectosTN){
        datos.setPorcDefectosTN(porcDefectosTN);
    }
    
    public float getPorcDefectosTN(){
        return datos.getPorcDefectosTN();
    }
    
    public void setPorcHipertension(float porcHipertension){
        datos.setPorcHipertension(porcHipertension);
    }
    
    public float getPorcHipertension(){
        return datos.getPorcHipertension();
    }
    
    public void setEdad(int edad){
        datos.setEdad(edad);
    }
    
    public int getEdad(){
        return datos.getEdad();
    }
    
    public void setEstatura(String estatura){
        datos.setEstatura(estatura);
    }
    
    public float getEstatura(){
        return datos.getEstatura();
    }
    
    public void setPeso(String peso){
        datos.setPeso(peso);
    }
    
    public float getPeso(){
        return datos.getPeso();
    }
    
    /*es para imprimir
    public void mostrar(int opcion){
        datos.mostrar(opcion);
    }
    */
    public void setNacionalidad(String nacionalidad){
        datos.setNacionalidad(nacionalidad);
    }
    
    public String getNacionalidad(){
        return datos.getNacionalidad();
    }
    
    public void setVivo(boolean vivo){
        datos.setVivo(vivo);
    }
    
    public boolean isVivo(){
        return datos.getVivo();            
    }
    
    public void mostrarAbrir(){
        abrir.mostrar();
    }
    
    public void cerrarAbrir(){
        abrir.cerrar();
    }
    
    public void mostrarArbol(){
        arbolUI.mostrar();
    }
    
    public void cerrarArbol(){
        arbolUI.cerrar();
    }
    
     public void mostrarDatosUI(Persona dato){
        DatosUI vistaDi1 = new DatosUI(dato); 
         vistaDi1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);       
         this.setFormulario(vistaDi1);
        vistaDi1.setControlador(this);
         vistaDi1.setVisible(true);
    }
     public void mostrarDiagnostico(String dato){
        DiagnosticoUI vistaDi1 = new DiagnosticoUI(dato); 
         vistaDi1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);       
         this.setDiagnosticoUI(vistaDi1);
        vistaDi1.setControlador(this);
         vistaDi1.setVisible(true);
    }
    public void cerrarDatosUI(){
        formulario.cerrar();
    }
     public Persona getPersona(String padre){
         arbol.buscar(padre,arbol.getRaiz());
        return arbol.buscar();
    }
     
      public PersonaUI getPersonaUI(String padre){
                return dibujaArbol.getVertice(padre);

    }
     public void mostrarPortadaUI(){
        portada.mostrar();
    }
    
    public void cerrarPortadaUI(){
        portada.cerrar();
    }
  public ArrayList<PersonaUI> getSemaforoRojo() {
        return arbol.getSemaforoRojo();
    }

    public ArrayList<PersonaUI> getSemaforoAmarillo() {
         return arbol.getSemaforoAmarillo();
    }

    public ArrayList<PersonaUI> getSemaforoVerde() {
        return arbol.getSemaforoVerde();
    }
    public void calcularSemaforo(){
                arbol.calcularSemaforo();
    }
    public void calcularPorcentaje(){
        arbol.postOrden(arbol.getRaiz());
        arbol.calcularSemaforo();
    }
    
    public String ventanaArchivos(){

        return Archivo.explorarDisco();
        
    }
    
    public void leerArchivo(String nombreArchivo, Arbol arbol){
        Archivo.leerArchivo(nombreArchivo, arbol);
    }
    
    public void escribirArchivo(String nombreArchivo, Arbol arbol) throws IOException{
        Archivo.escribirArchivo(nombreArchivo, arbol);
    }
}
