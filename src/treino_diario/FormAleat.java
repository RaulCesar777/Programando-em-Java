package treino_diario;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

 public class FormAleat extends JPanel
 {
    public void paintComponent(Graphics g)
    {
         super.paintComponent(g);
         
         Color VERDAO = new Color(34,83,49);// com o paint é posssivel criar os padroes RGB (RED , GREEN, BLUE)
         Color VERDINHO = new Color(26,210,35);
         Color VERMELHAO = new Color(222,26,3);
         Color ROSA = new Color(199,27,182);
         Color AZULAO = new Color(39,0,225);
         Color AZUSINHO = new Color(46,201,209);
         Color PRETO = new Color(0,0,0);
         
         
        g.setColor(VERDAO);                     ////////////////////////////////////////////////////
        g.fillOval(0,0, 400, 400);
        
       
        g.setColor(VERDINHO); 
        g.fillRect(25,25, 350, 350);
        
        g.setColor(VERDAO);
        g.fillOval(50,50, 300, 300);
        
        g.setColor(VERDINHO); 
        g.fillOval(75,75, 250, 250);
        
        g.setColor(VERDAO);
        g.fillRect(100,100, 200, 200);
        
        g.setColor(VERMELHAO); 
        g.fillOval(125,125, 150, 150);
        
        g.setColor(VERDAO);
        g.fillRect(150,150, 100, 100);
        
        g.setColor(VERDINHO); 
        g.fillOval(175,175, 50, 50);
        
        g.setColor(VERDAO);
        g.fillRect(195,195, 10, 10);

        g.setColor(ROSA); 
        g.fillOval(350,10, 50, 50);

        g.setColor(AZULAO); 
        g.fillOval(10,350, 50, 50);

        g.setColor(AZUSINHO); 
        g.fillOval(10,10, 50, 50);

        g.setColor(PRETO);
            
        
        
        g.fillRect(350, 350, 50, 50);
       
        
       

       
    }
} 