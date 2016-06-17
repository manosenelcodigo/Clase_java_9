
package graficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel2 extends JPanel 
{

    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        
        Font fuente=new Font("Verdana",Font.PLAIN,45);
        g2.setFont(fuente);
        g2.setColor(Color.RED);
        g2.drawString("Hola desde #manosenelcódigo", 100,100);
        
        
        File file=new File("src/images/logo.png");
        try {
            Image imagen=ImageIO.read(file);
            g2.drawImage(imagen, 50,100,null);
        } catch (IOException ex) {
            System.out.println("la imagen no existe");
        }
        
    }
    
}
