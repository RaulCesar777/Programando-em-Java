package treino_diario;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{
        

    public void paintComponent(Graphics g){
        super. paintComponent(g);
        int largura = getWidth();
        int altura= getHeight();
       

        
         int medlar = 1;
        int medalt = 400;         
        int cont =0;

        while(++cont<20){
         g.drawLine(medlar ,medalt,largura, altura); // CANTO SUPERIRO ESQ P DIREITO
            medlar=medlar+25;
            medalt=medalt-25;

            




        }

    }


}