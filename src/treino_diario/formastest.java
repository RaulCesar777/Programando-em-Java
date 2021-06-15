package treino_diario;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class formastest 
{
   public static void main(String[] args)
   {
        String entrada = JOptionPane.showInputDialog("1 para retangulo, 2 para oval");
        int escolha = Integer.parseInt(entrada);
        formas panel = new formas(escolha);
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300,300); 
        app.setVisible(true);       
   }










}