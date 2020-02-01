package Coordinador;

import Memorama.*;
import Sonido.*;
import Sucesión.*;
import Menú.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;

public class Coordinador {
    
    public Coordinador(){
    }
    //Referencias a las clases para el menú.
    NivelesUI nivel;
    NivelesUISo nivel2So;
    NivelesUISu nivel3Su;
    PanelPrincipal principal;
    PrincipalUI principalUI;
    
    //Referencias a las clases que componen el juego de sonidos.
    Sonido logicaSo;
    SonidoUI vistaSo1;
    SonidoUI2 vistaSo2;
    SonidoUI3 vistaSo3;
    
    //Referencias a las clases que componen el juego de memorama.
    Memorama logicaMe;
    MemoramaUI vistaMe1;
    Memorama2 vistaMe2;
    Memorama3 vistaMe3;
    
    //Referencias a las clases que componen el juego de sucesión.
    Ordenar logicaSu;
    OrdenarUIN1 vistaSu1;
    OrdenarUIN2 vistaSu2;
    OrdenarUIN3 vistaSu3;

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
    /*
     public void mostrar(int n) {
        switch(n){
            case 1: 
               nivel.mostrarN1();
            break;
            case 2: 
                nivel3Su.mostrarN3();
            break;
            case 3: 
                nivel2So.mostrarN2();
            break;
        }
    }
    
    public void mostrarMemorama(int n) {
        switch(n){
            case 1: 
                vistaMe1.mostrarM1();
            break;
            case 2: 
                vistaMe2.mostrarM2();
            break;
            case 3:  
                vistaMe3.mostrarM3();
            break;
       }
       
    }
    public void mostrarSucesion(int n) {
        System.out.println("sucesion");
        switch(n){
            case 1: 
                vistaSu1.mostrarSu1();
            break;
            case 2: 
                vistaSu2.mostrarSu2();
            break;
            case 3:  
                vistaSu3.mostrarSu3();
            break;
        }
    }
    public void mostrarSonido(int n) {
        switch(n){
            case 1: 
                vistaSo1.mostrarSo1();
            break;
            case 2: 
                vistaSo2.mostrarSo2();
            break;
            case 3:  
                vistaSo3.mostrarSo3();
            break;
        }
    }

    public void regresarMenu() {
        principalUI.mostrarMenu();
    }

    public void regresarNivelesMemorama() {
        nivel.mostrarN1();
    }
    */
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

    public void setLogicaMe(Memorama logicaMe) {
        this.logicaMe = logicaMe;
    }

    public void setVistaMe1(MemoramaUI vistaMe1) {
        this.vistaMe1 = vistaMe1;
    }

    public void setVistaMe2(Memorama2 vistaMe2) {
        this.vistaMe2 = vistaMe2;
    }

    public void setVistaMe3(Memorama3 vistaMe3) {
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

    /*public void desbloqNivel2Mem() {
        nivel.des();
    }*/
    
    //-------------------------------------------------
    public void agregar(String n){
        int m = Integer.parseInt(n);
        logicaSu.agregarNivel1(m);
    }
    public void limpiarArreglo(){
        logicaSu.limpiarArreglo();
    }
    public void burbuja(){
        logicaSu.burbuja(logicaSu.getNum());
    
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
    //------------------------------------------------
    
    //--------------------------------------------------------
    //Enlaces a la lógica de sonidos.
    int sonido;
    public void reproducirN1() throws FileNotFoundException, JavaLayerException{
        sonido = logicaSo.reproducirN1();
        System.out.println("------------");
    }
    
    public void reproducirN2() throws FileNotFoundException, JavaLayerException{
        sonido = logicaSo.reproducirN2();
        System.out.println("------------");
    }
    
    public void reproducirN3() throws FileNotFoundException, JavaLayerException{
        sonido = logicaSo.reproducirN3();
        System.out.println("------------");
    }
    
    public boolean compararSo(String s){
        System.out.println("cadena: "+ s);
        int p = Integer.parseInt(s);
        return logicaSo.comparar(p, sonido);
    }
   
    
    public int getSonido(){
        return sonido;
    }
    //--------------------------------------------------------
}
