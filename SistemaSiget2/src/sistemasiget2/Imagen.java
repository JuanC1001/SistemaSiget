/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasiget2;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/**
 *
 * @author GHISSEL
 */
public class Imagen implements Border{

    private BufferedImage image;

    public Imagen() {
        try {
            URL imagePath = new URL(getClass().getResource("../ec/edu/unach/siget/rnegocio/Imagenes/Fondo2.jpg").toString());
            image = ImageIO.read(imagePath);
        } catch (IOException ex) {
            Logger.getLogger(Imagen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void paintBorder(Component componente, Graphics graficos, int x, int y, int ancho, int alto) {
        int x0 = x + (ancho - image.getWidth()) / 2;
//        graficos.drawImage(back, (x + (ancho - back.getWidth()) / 2), (y + (alto - back.getHeight()) / 2), null);
        int y0 = y + (alto - image.getHeight()) / 2;
        graficos.drawImage(image, x0, y0, null);

    }

    public Insets getBorderInsets(Component cmpnt) {
        return new Insets(0, 0, 0, 0);
    }

    public boolean isBorderOpaque() {
        return true;
    }

}
