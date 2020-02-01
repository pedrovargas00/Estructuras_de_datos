/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sonido;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Pedro
 */
public class Icono implements Icon{
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Image image = new ImageIcon(getClass().getResource("/Sonidos/Correcto.png")).getImage();
        g.drawImage(image, x, y, c);
    }
 
    @Override
    public int getIconWidth() {
        return 50;
    }
 
    @Override
    public int getIconHeight() {
        return 50;
    }
}
