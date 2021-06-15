import javax.swing.JFrame;


public class FormAletTest 
{
   public static void main(String[] args)
   {
        
        
        FormAleat panel = new FormAleat();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(425,450); 
        app.setVisible(true);       
   }
}
