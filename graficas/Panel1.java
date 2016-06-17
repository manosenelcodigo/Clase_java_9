
package graficas;

import java.awt.Graphics;
import javax.swing.JPanel;


public class Panel1 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        g.drawString("hola desde #manosenelcódigo", 100, 100);
    }
    
    
}
