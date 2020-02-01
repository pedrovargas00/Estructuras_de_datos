package Coordinador;

import Diferente.*;
import Sonido.*;
import Sucesión.*;
import Menú.*;
import java.io.FileNotFoundException;

public class Coordinador {
    
    
    Coordinador c;
    //Referencias a las clases para el menú.
    NivelesUI nivel;
    NivelesUISo nivel2So;
    NivelesUISu nivel3Su;
    PanelPrincipal principal;
    PrincipalUI principalUI;
    PrincipalMain pri;
    
    //Referencias a las clases que componen el juego de sonidos.
    Sonido logicaSo;
    SonidoUI vistaSo1;
    SonidoUI2 vistaSo2;
    SonidoUI3 vistaSo3;
    
    //Referencias a las clases que componen el juego de memorama.
    Diferente logicaMe;
    DiferenteUI vistaMe1;
    DiferenteUI2 vistaMe2;
    DiferenteUI3 vistaMe3;
    
    //Referencias a las clases que componen el juego de sucesión.
    Ordenar logicaSu;
    OrdenarUIN1 vistaSu1;
    OrdenarUIN2 vistaSu2;
    OrdenarUIN3 vistaSu3;

    public PrincipalMain getPri() {
        return pri;
    }

    public void setPri(PrincipalMain pri) {
        this.pri = pri;
    }

    public void setNivel(NivelesUI nivel) {
        this.nivel = nivel;
        
    }

    public NivelesUISo getNivel2() {
        return nivel2So;
    }

    public void setNivel2(NivelesUISo nivel2) {
        this.nivel2So = nivel2;
    }

    public NivelesUISu getNivel3() {
        return nivel3Su;
    }

    public void setNivel3(NivelesUISu nivel3) {
        this.nivel3Su= nivel3;
    }
     public void mostrar(int n) {
       System.out.println("jol");
       switch(n){
           case 1: 
               nivel.mostrarN1();
              
               break;
            case 2: 
                nivel3Su.mostrarN3();
            break;
             case 3: nivel2So.mostrarN2();break;
       }
       
    }
       public void mostrarMemorama(int n) {
      
       switch(n){
           case 1:
                mostrarM1();
               break;
            case 2: 
                mostrarM2();
            break;
             case 3:  
                mostrarM3();
                 break;
       }
       
    }
        public void mostrarSucesion(int n) {
      
       switch(n){
           case 1: 
               mostrarSu1();
               break;
            case 2: 
                mostrarSu2();
            break;
             case 3:  
                 mostrarSu3();break;
       }
       
    }
           public void mostrarSonido(int n) throws FileNotFoundException{
      
       switch(n){
           case 1: 
               mostrarSo1();
               break;
            case 2: 
                 mostrarSo2();
            break;
             case 3:  
                 mostrarSo3();
                 break;
       }
       
       
    }
    
        public void regresarMenu() {
            principalUI.mostrarMenu();
    }
        
         public void regresarNivelesMemorama() {
         nivel.mostrarN1();
    }
         
 public void regresarNivelesSucesion() {
       nivel3Su.mostrarN3();
    }
 public void regresarNivelesSonido() {
       nivel2So.mostrarN2();
    }
    public void setPrincipal(PanelPrincipal principal) {
        this.principal = principal;
    }

    public void setPrincipalUI(PrincipalUI principalUI) {
        this.principalUI = principalUI;
    }

    public void setLogicaSo(Sonido logicaSo) {
        this.logicaSo = logicaSo;
    }

    public void setVistaSo1(SonidoUI vistaSo1) {
        this.vistaSo1 = vistaSo1;
    }

    public void setVistaSo2(SonidoUI2 vistaSo2) {
        this.vistaSo2 = vistaSo2;
    }

    public void setVistaSo3(SonidoUI3 vistaSo3) {
        this.vistaSo3 = vistaSo3;
    }

    public void setLogicaMe(Diferente logicaMe) {
        this.logicaMe = logicaMe;
    }

    public void setVistaMe1(DiferenteUI vistaMe1) {
        this.vistaMe1 = vistaMe1;
    }

    public void setVistaMe2(DiferenteUI2 vistaMe2) {
        this.vistaMe2 = vistaMe2;
    }

    public void setVistaMe3(DiferenteUI3 vistaMe3) {
        this.vistaMe3 = vistaMe3;
    }

    public void setLogicaSu(Ordenar logicaSu) {
        this.logicaSu = logicaSu;
    }

    public void setVistaSu1(OrdenarUIN1 vistaSu1) {
        this.vistaSu1 = vistaSu1;
    }

    public void setVistaSu2(OrdenarUIN2 vistaSu2) {
        this.vistaSu2 = vistaSu2;
    }

    public void setVistaSu3(OrdenarUIN3 vistaSu3) {
        this.vistaSu3 = vistaSu3;
    }

      public void desbloqNievel2Mem() {
       nivel.des2();
    }
        public void desbloqNievel3Mem() {
       nivel.des3();
    }


    public void desbloqNivel2Su() {
        nivel3Su.des2();
    }
    
    public void desbloqNivel3Su() { 
        nivel3Su.des3();
    }
    public void desbloqNivel2So() {
        nivel2So.des2();
    }
    
    public void desbloqNivel3So() { 
        nivel2So.des3();
    }
        public int guarCad(String cad) {
       return logicaMe.guardarCadena(cad);
    }
    public void mostrarN1(){
      
    }
     public void mostrarM1(){
         DiferenteUI vistaMe1 = new DiferenteUI(); 
        this.setVistaMe1(vistaMe1);
        vistaMe1.setCoordinador(this);
         vistaMe1.setVisible(true);


    }
      public void mostrarM2(){
         DiferenteUI2 vistaMe2 = new DiferenteUI2(); 
        this.setVistaMe2(vistaMe2);
        vistaMe2.setCoordinador(this);
         vistaMe2.setVisible(true);


    }
      public void mostrarM3(){
         DiferenteUI3 vistaMe3 = new DiferenteUI3(); 
        this.setVistaMe3(vistaMe3);
        vistaMe3.setCoordinador(this);
         vistaMe3.setVisible(true);
  }
       public void mostrarSu1(){
       OrdenarUIN1 vistaSu1 = new OrdenarUIN1();
        this.setVistaSu1(vistaSu1);
        vistaSu1.setCoordinador(this);
        vistaSu1.setVisible(true);
        Ordenar logicaSu = new Ordenar();
         this.setLogicaSu(logicaSu);
        logicaSu.setCoordinador(this);
    
  }
        public void mostrarSu2(){
         OrdenarUIN2 vistaSu2 = new OrdenarUIN2();
        this.setVistaSu2(vistaSu2);
        vistaSu2.setCoordinador(this);
        vistaSu2.setVisible(true);
        Ordenar logicaSu = new Ordenar();
         this.setLogicaSu(logicaSu);
        logicaSu.setCoordinador(this);
  }
         public void mostrarSu3(){
         OrdenarUIN3 vistaSu3 = new OrdenarUIN3();
        this.setVistaSu3(vistaSu3);
        vistaSu3.setCoordinador(this);
        vistaSu3.setVisible(true);
        Ordenar logicaSu = new Ordenar();
         this.setLogicaSu(logicaSu);
        logicaSu.setCoordinador(this);
  }
        public void mostrarSo1() throws FileNotFoundException{
        SonidoUI vistaSo1 = new SonidoUI();
        this.setVistaSo1(vistaSo1);
        vistaSo1.setCoordinador(this);
        vistaSo1.setVisible(true);
         Sonido logicaSo = new Sonido();
         this.setLogicaSo(logicaSo);
        logicaSo.setCoordinador(this);
  }
        public void mostrarSo2() throws FileNotFoundException{
        SonidoUI2 vistaSo2 = new SonidoUI2();
        this.setVistaSo2(vistaSo2);
        vistaSo2.setCoordinador(this);
        vistaSo2.setVisible(true);
         Sonido logicaSo = new Sonido();
         this.setLogicaSo(logicaSo);
        logicaSo.setCoordinador(this);
  }
         public void mostrarSo3() throws FileNotFoundException{
           SonidoUI3 vistaSo3 = new SonidoUI3();
        this.setVistaSo3(vistaSo3);
        vistaSo3.setCoordinador(this);
        vistaSo3.setVisible(true);
         Sonido logicaSo = new Sonido();
         this.setLogicaSo(logicaSo);
        logicaSo.setCoordinador(this);
  }
      public void agregar(String n){
        int m = Integer.parseInt(n);
        logicaSu.agregarNivel1(m);
    }
    public void limpiarArreglo(){
        logicaSu.limpiarArreglo();
    }
    public void ordena(){
        logicaSu.ordena(logicaSu.getNum());
    
    }
    
    public boolean comparar(String n){
        int m = Integer.parseInt(n);
        
        if(logicaSu.comparar(m)==true)
            return true;
        else 
            return false;      
    }
    
    public void valorI(){
        logicaSu.setI(0);
    }
      int sonido;
    public void reproducirN1() throws FileNotFoundException{
        sonido = logicaSo.reproducirN1();
        System.out.println("------------");
    }
    
    public void reproducirN2() throws FileNotFoundException{
        sonido = logicaSo.reproducirN2();
        System.out.println("------------");
    }
    
    public void reproducirN3() throws FileNotFoundException{
        sonido = logicaSo.reproducirN3();
        System.out.println("------------");
    }
    
    public boolean compararSo(String s){
        System.out.println("cadena: "+ s);
        int p = Integer.parseInt(s);
        return logicaSo.comparar(p, sonido);
    }
    
    public void arreglo(){
        logicaSo.iniciarVector();
    }
    
}
