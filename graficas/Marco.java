
package graficas;

import javax.swing.JFrame;

public class Marco  extends JFrame
{
    
    public void getVentana()
    {
        setBounds(200,50,1024,768);
        setVisible(true);
        setTitle("#manosenelcódigo");
        setResizable(true);
        Panel1 pane1=new Panel1();
        Panel2 panel2=new Panel2();
        
        //add(pane1);
        add(panel2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
