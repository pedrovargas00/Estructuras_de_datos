
package Archivo;
import Controlador.*;

public class Datos {
    
    private Controlador controlador;
    private int causaMuerte = -1, edad = 0;
    private char sexo;
    private String nombre, nacionalidad;
    private boolean pregHist1, pregHist2, pregHist3, pregHist4, pregHist5, pregHist6, pregHist7, pregHist8, pregHist9, pregHist10, pregHabito1, pregHabito2, pregHabito3, pregHabito4, pregHabito5, pregHabito6, pregHabito7, pregHabito8, pregHabito9; 
    private boolean esquizofrenia, hemofilia, diabetes, obesidad, labioL, cancerMP, defectosTN,hipertension,vivo;
    private float porcEsquizofrenia, porcHemofilia, porcDiabetes, porcObesidad, porcLabioL, porcCancerMP, porcDefectosTN,porcHipertension;
    private float estatura,peso;

    public Datos(){
    }
    public boolean getVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = Float.parseFloat(estatura);
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = Float.parseFloat(peso);
    }
    
    public float getPorcEsquizofrenia() {
        return porcEsquizofrenia;
    }

    public void setPorcEsquizofrenia(float porcEsquizofrenia) {
        this.porcEsquizofrenia = porcEsquizofrenia;
    }

    public float getPorcHemofilia() {
        return porcHemofilia;
    }

    public void setPorcHemofilia(float porcHemofilia) {
        this.porcHemofilia = porcHemofilia;
    }

    public float getPorcDiabetes() {
        return porcDiabetes;
    }

    public void setPorcDiabetes(float porcDiabetes) {
        this.porcDiabetes = porcDiabetes;
    }

    public float getPorcObesidad() {
        return porcObesidad;
    }

    public void setPorcObesidad(float porcObesidad) {
        this.porcObesidad = porcObesidad;
    }

    public float getPorcLabioL() {
        return porcLabioL;
    }

    public void setPorcLabioL(float porcLabioL) {
        this.porcLabioL = porcLabioL;
    }

    public float getPorcCancerMP() {
        return porcCancerMP;
    }

    public void setPorcCancerMP(float porcCancerMP) {
        this.porcCancerMP = porcCancerMP;
    }

    public float getPorcDefectosTN() {
        return porcDefectosTN;
    }

    public void setPorcDefectosTN(float porcDefectosTN) {
        this.porcDefectosTN = porcDefectosTN;
    }

    public float getPorcHipertension() {
        return porcHipertension;
    }

    public void setPorcHipertension(float porcHipertension) {
        this.porcHipertension = porcHipertension;
    }
       
    public boolean isEsquizofrenia() {
        return esquizofrenia;
    }

    public void setEsquizofrenia(boolean esquizofrenia) {
        this.esquizofrenia = esquizofrenia;
    }

    public boolean isHemofilia() {
        return hemofilia;
    }

    public void setHemofilia(boolean hemofilia) {
        this.hemofilia = hemofilia;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isObesidad() {
        return obesidad;
    }

    public void setObesidad(boolean obesidad) {
        this.obesidad = obesidad;
    }

    public boolean isLabioL() {
        return labioL;
    }

    public void setLabioL(boolean labioL) {
        this.labioL = labioL;
    }

    public boolean isCancerMP() {
        return cancerMP;
    }

    public void setCancerMP(boolean cancerMP) {
        this.cancerMP = cancerMP;
    }

    public boolean isDefectosTN() {
        return defectosTN;
    }

    public void setDefectosTN(boolean defectosTN) {
        this.defectosTN = defectosTN;
    }

    public boolean isHipertension() {
        return hipertension;
    }

    public void setHipertension(boolean hipertension) {
        this.hipertension = hipertension;
    }
    
    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }

    public int getCausaMuerte() {
        return causaMuerte;
    }

    public void setCausaMuerte(int causaMuerte) {
        this.causaMuerte = causaMuerte;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPregHist1() {
        return pregHist1;
    }

    public void setPregHist1(boolean pregHist1) {
        this.pregHist1 = pregHist1;
    }

    public boolean isPregHist2() {
        return pregHist2;
    }

    public void setPregHist2(boolean pregHist2) {
        this.pregHist2 = pregHist2;
    }

    public boolean isPregHist3() {
        return pregHist3;
    }

    public void setPregHist3(boolean pregHist3) {
        this.pregHist3 = pregHist3;
    }

    public boolean isPregHist4() {
        return pregHist4;
    }

    public void setPregHist4(boolean pregHist4) {
        this.pregHist4 = pregHist4;
    }

    public boolean isPregHist5() {
        return pregHist5;
    }

    public void setPregHist5(boolean pregHist5) {
        this.pregHist5 = pregHist5;
    }

    public boolean isPregHist6() {
        return pregHist6;
    }

    public void setPregHist6(boolean pregHist6) {
        this.pregHist6 = pregHist6;
    }

    public boolean isPregHist7() {
        return pregHist7;
    }

    public void setPregHist7(boolean pregHist7) {
        this.pregHist7 = pregHist7;
    }

    public boolean isPregHist8() {
        return pregHist8;
    }

    public void setPregHist8(boolean pregHist8) {
        this.pregHist8 = pregHist8;
    }

    public boolean isPregHist9() {
        return pregHist9;
    }

    public void setPregHist9(boolean pregHist9) {
        this.pregHist9 = pregHist9;
    }

    public boolean isPregHist10() {
        return pregHist10;
    }

    public void setPregHist10(boolean pregHist10) {
        this.pregHist10 = pregHist10;
    }

    

    public boolean isPregHabito1() {
        return pregHabito1;
    }

    public void setPregHabito1(boolean pregHabito1) {
        this.pregHabito1 = pregHabito1;
    }

    public boolean isPregHabito2() {
        return pregHabito2;
    }

    public void setPregHabito2(boolean pregHabito2) {
        this.pregHabito2 = pregHabito2;
    }

    public boolean isPregHabito3() {
        return pregHabito3;
    }

    public void setPregHabito3(boolean pregHabito3) {
        this.pregHabito3 = pregHabito3;
    }

    public boolean isPregHabito4() {
        return pregHabito4;
    }

    public void setPregHabito4(boolean pregHabito4) {
        this.pregHabito4 = pregHabito4;
    }

    public boolean isPregHabito5() {
        return pregHabito5;
    }

    public void setPregHabito5(boolean pregHabito5) {
        this.pregHabito5 = pregHabito5;
    }

    public boolean isPregHabito6() {
        return pregHabito6;
    }

    public void setPregHabito6(boolean pregHabito6) {
        this.pregHabito6 = pregHabito6;
    }

    public boolean isPregHabito7() {
        return pregHabito7;
    }

    public void setPregHabito7(boolean pregHabito7) {
        this.pregHabito7 = pregHabito7;
    }

    public boolean isPregHabito8() {
        return pregHabito8;
    }

    public void setPregHabito8(boolean pregHabito8) {
        this.pregHabito8 = pregHabito8;
    }

    public boolean isPregHabito9() {
        return pregHabito9;
    }

    public void setPregHabito9(boolean pregHabito9) {
        this.pregHabito9 = pregHabito9;
    }
    
    public void mostrar(int opcion){
    
        if( opcion == 0){
            System.out.println("Nombre: "+nombre+"\nSexo:"+sexo+"\nVive:"+vivo+"\nEdad: "+ edad + "\nPeso: " +peso+ "\nEstatura: " +estatura+ "\nNacionalidad:" + nacionalidad+"\nPregHist1"+pregHist1+"\nPregHist2:"+pregHist2+"\nPregHist3:"+pregHist3+"\nPregHist4:"+pregHist4+"\nPregHist5:"+pregHist5+"\nPregHist6:"+pregHist6+"\nPregHist7:"+pregHist7+"\nPregHist8:"+pregHist8+"\nPregHist9:"+pregHist9+"\nPregHist10:"+pregHist10);
            System.out.println("pregHabito1"+pregHabito1+"\npregHabito2"+pregHabito2+"\npregHabito3"+pregHabito3+"\npregHabito4"+pregHabito4+"\npregHabito5"+pregHabito5+"\npregHabito6"+pregHabito6+"\npregHabito7"+pregHabito7+"\npregHabito8"+pregHabito8+"\npregHabito9"+pregHabito9);
        }
        if(opcion == 1){
            System.out.println("Nombre: "+nombre+"\nSexo:"+sexo+"\nVive:"+vivo);
            System.out.println("esquizofrenia:"+esquizofrenia+"\nhemofilia"+hemofilia+"\ndiabetes"+diabetes+"\nobesidad"+obesidad+"\nlabio leporino"+labioL);
            System.out.println("Cancer mama/ prostata"+cancerMP+"\nDefecto del tubo neural: "+defectosTN+"\nhipertension"+hipertension);        
        }
    }
      public String getDiagnostico(boolean opcion){
    
        if( opcion){
             return("Nombre: "+nombre+"\nSexo: "+sexo+"\nVive: "+vivo+"\nEdad: "+ edad + "\nPeso: " +peso+ "\nEstatura: " +estatura+ "\nNacionalidad: " + nacionalidad+"\n\nDiagnóstico: \n"+"Porcentaje Cancer Mama y Prostata: "+this.getPorcCancerMP()+
                "\nPorcentaje defecto de tubo neural: "+this.getPorcDefectosTN()+ "%" +
                "\nPorcentaje Diabetes: "+this.getPorcDiabetes()+ "%" +
                "\nPorcentaje Esquizofrenia: "+this.getPorcEsquizofrenia()+ "%" +
                "\nPorcentaje Hemofilia: "+this.getPorcHemofilia()+ "%" +
                "\nPorcentaje Hipertension: "+this.getPorcHipertension()+ "%" +
                "\nPorcentaje Labio Leporino: "+this.getPorcLabioL()+ "%" +
                "\nPorcentaje Obesidad: "+this.getPorcObesidad() +"%" );
       
        }
        if(!opcion)
            return ("Nombre: "+nombre+"\nSexo: "+sexo+"\nVive: "+vivo+"\n\nEsquizofrenia: "+esquizofrenia+"\nHemofilia: "+hemofilia+"\nDiabetes: "+diabetes+"\nObesidad: "+obesidad+"\nLabio leporino: "+labioL+"\nCancer mama/ prostata: "+cancerMP+"\nDefecto del tubo neural: "+defectosTN+"\nHipertension: "+hipertension);
        return "";
    }
}
