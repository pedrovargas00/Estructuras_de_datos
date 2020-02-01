import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Sonido {
    
    public void audioBuho() throws FileNotFoundException, JavaLayerException{
    
      Player apl = new Player(new FileInputStream(""));

      apl.play();
    }
    
    public void audioPerro()throws FileNotFoundException, JavaLayerException{
    
      Player apl = new Player(new FileInputStream(""));

      apl.play();
    }
    
    public void audioGato()throws FileNotFoundException, JavaLayerException{
    
      Player apl = new Player(new FileInputStream(""));

      apl.play();
    }
    
    public void audioGallo()throws FileNotFoundException, JavaLayerException{
    
      Player apl = new Player(new FileInputStream(""));

      apl.play();
    }
    
}
