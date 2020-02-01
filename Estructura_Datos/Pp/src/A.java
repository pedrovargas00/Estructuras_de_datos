import java.io.*;

import javax.sound.sampled.*;

public class A {
    Clip sonido;
    public A() throws LineUnavailableException{
        sonido = AudioSystem.getClip();
    }
    
    public void sonido() {
        //String st = "\\Sonidos\\Trompeta.wav";
        try {
            
            // Se carga con un fichero wav
            sonido.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream("Sonidos\\Trompeta.wav")));
            
            // Comienza la reproducción
            sonido.start();
            
            System.out.println("Espera mientras se esté reproduciendo.");
           //while (sonido.isRunning())
                Thread.sleep(10000);
            
            // Se cierra el clip.
            sonido.close();
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
    
    public static void main(String []args) throws LineUnavailableException{
        
        A a = new A();
        a.sonido();
        a.sonido();
        //a.sonido();
    }
}
