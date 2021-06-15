

package treino_diario;

import javax.swing.JFrame;


public class desenhoTEST 
{
   public static void main(String[] args)
   {
        
        
        desenho panel = new desenho();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(425,450); 
        app.setVisible(true);       
   }
}
