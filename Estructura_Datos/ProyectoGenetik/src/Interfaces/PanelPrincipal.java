
package Interfaces;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author btepo
 */
public class PanelPrincipal extends JPanel  {
      public void paintComponent(Graphics g){
        Dimension tam = getSize();
	//imagen de fondo
	ImageIcon imgFondo = new ImageIcon( getClass().getResource("logotipo.png"));
	g.drawImage(imgFondo.getImage(), 0, 0, tam.width,tam.height, null);
	setOpaque(false);	
	super.paintComponent(g);	
    }
    
}
