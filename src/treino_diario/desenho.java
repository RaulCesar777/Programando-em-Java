
package treino_diario;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

 public class desenho extends JPanel
 {
    public void paintComponent(Graphics g)
    {
         super.paintComponent(g);
         Color VERDAO = new Color(34,83,49);// com o paint é posssivel criar os padroes RGB (RED , GREEN, BLUE)
         Color VERDINHO = new Color(26,210,35);
       
         
         
          g.setColor(VERDAO);
          g.fillOval(0,0, 400, 400);
        
       
        g.setColor(VERDINHO); 
        g.fillOval(25,25, 350, 350);
        
        g.setColor(VERDAO);
        g.fillOval(50,50, 300, 300);
        
        g.setColor(VERDINHO); 
        g.fillOval(75,75, 250, 250);
        
        g.setColor(VERDAO);
        g.fillOval(100,100, 200, 200);
        
        g.setColor(VERDINHO); 
        g.fillOval(125,125, 150, 150);
        
        g.setColor(VERDAO);
        g.fillOval(150,150, 100, 100);
        
        g.setColor(VERDINHO); 
        g.fillOval(175,175, 50, 50);
        
        g.setColor(VERDAO);
        g.fillOval(195,195, 10, 10);
       
        
       

       
    }
} 