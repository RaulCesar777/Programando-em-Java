import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;

public class formas extends JPanel
{
    public static void main(String[] args)
    {
         String entrada = JOptionPane.showInputDialog("1 para retangulo, 2 para oval, 3 para circulo");
         int escolha = Integer.parseInt(entrada);
         formas panel = new formas(escolha);
         JFrame app = new JFrame();
 
         app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         app.add(panel);
         app.setSize(300,300); 
         app.setVisible(true);       
    }
    private int escolha;
    
    public formas (int opcao){

        escolha = opcao;

    }
 //////////desenha as formas
 public void paintComponent (Graphics g)
 {

    super.paintComponent(g);

    for (int i = 0; i < 10; i++) 
    {
        switch (escolha) {
            case 1:
                g.drawRect(10+i*10,10+i*10,50+i*10,50+i*10);
                break;

            case 2:
                 g.drawOval(10+i*10,10+i*10,50+i*10,50+i*10);
                  break;
        
           case 3:
                if (i%2==0) {
                    g.setColor(Color.red);
                    g.drawOval(130-12*i,120-12*i,10+25*i,10+25*i);
                }else{
                    g.setColor(Color.black);
                    g.drawOval(130-12*i,120-12*i,10+25*i,10+25*i);
                }

                break;

           
        }        
    }
 }

}