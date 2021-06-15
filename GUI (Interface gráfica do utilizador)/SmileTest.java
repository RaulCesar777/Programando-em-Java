import javax.swing.JFrame;


public class SmileTest 
{
   public static void main(String[] args)
   {
        
        
        Smile panel = new Smile();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300,300); 
        app.setVisible(true);       
   }
}
