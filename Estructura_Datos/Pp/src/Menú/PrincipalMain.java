/**
García Cruz Ricardo Emmanuel
Ramos López Lizbeth
Tepoz Romero Belén
Vargas Arenas Pedro
 */
package Menú;

import javax.swing.*;
import Memorama.*;
import Sonido.*;
import Sucesión.*;
import Menú.*;
import Coordinador.*;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;

public class PrincipalMain {
 
    //Falta instanciar las clases encargadas de la lógica.
    public static void main(String [] args ) throws FileNotFoundException, JavaLayerException {  
        
        Coordinador coordinador = new Coordinador();
        
        //Instancias a las clases para el menú.
        NivelesUI nivel = new NivelesUI();
        PanelPrincipal principal = new PanelPrincipal();
        PrincipalUI principalUI = new PrincipalUI();
        //Dentro de un método.
        principalUI.setVisible(true);
        principalUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nivel.setVisible(true);    
        
        //Instancias a las clases que componen el juego de sonidos.
        Sonido logicaSo = new Sonido();
        SonidoUI vistaSo1 = new SonidoUI();
        SonidoUI2 vistaSo2 = new SonidoUI2();
        SonidoUI3 vistaSo3 = new SonidoUI3();
         //Dentro de un método.
        vistaSo1.setVisible(true);
        vistaSo2.setVisible(true);
        vistaSo3.setVisible(true);
       
        //Instancias a las clases que componen el juego de memorama.
        Memorama logicaMe = new Memorama();
        MemoramaUI vistaMe1 = new MemoramaUI();
        Memorama2 vistaMe2 = new Memorama2();
        Memorama3 vistaMe3 = new Memorama3();
        //Dentro de un método.
        /*vistaMe1.setVisible(true);      
        vistaMe2.setVisible(true);
        vistaMe3.setVisible(true);
      */
        //Instancias a las clases que componen el juego de sucesión.
        Ordenar logicaSu = new Ordenar();
        OrdenarUIN1 vistaSu1 = new OrdenarUIN1();
        OrdenarUIN2 vistaSu2 = new OrdenarUIN2();
        OrdenarUIN3 vistaSu3 = new OrdenarUIN3();
        //Dentro de un método.
        /*vistaSu1.setVisible(true);
        vistaSu2.setVisible(true);
        vistaSu3.setVisible(true);
        */
        
        principalUI.setCoordinador(coordinador);
        nivel.setCoordinador(coordinador);
        
        logicaSo.setCoordinador(coordinador);
        vistaSo1.setCoordinador(coordinador);
        vistaSo2.setCoordinador(coordinador);
        vistaSo3.setCoordinador(coordinador);
        
        logicaMe.setCoordinador(coordinador);
        vistaMe1.setCoordinador(coordinador);      
        vistaMe2.setCoordinador(coordinador);
        vistaMe3.setCoordinador(coordinador);
        
        logicaSu.setCoordinador(coordinador);
        vistaSu1.setCoordinador(coordinador);
        vistaSu2.setCoordinador(coordinador);
        vistaSu3.setCoordinador(coordinador);
        
        coordinador.setNivel(nivel);
        coordinador.setPrincipalUI(principalUI);
        coordinador.setPrincipal(principal);
        
        coordinador.setLogicaMe(logicaMe);
        coordinador.setVistaMe1(vistaMe1);
        coordinador.setVistaMe2(vistaMe2);
        coordinador.setVistaMe3(vistaMe3);
        
        coordinador.setLogicaSo(logicaSo);
        coordinador.setVistaSo1(vistaSo1);
        coordinador.setVistaSo2(vistaSo2);
        coordinador.setVistaSo3(vistaSo3);
        
        coordinador.setLogicaSu(logicaSu);
        coordinador.setVistaSu1(vistaSu1);
        coordinador.setVistaSu2(vistaSu2);
        coordinador.setVistaSu3(vistaSu3);
    }
  
}
