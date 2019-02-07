

import javax.swing.JFrame;

/**
 * testaSmile
 */
public class DesenhaSmileTest {

    public static void main(String[] args) {

        DesenhaSmile panel = new DesenhaSmile();
        JFrame quadro = new JFrame();

        quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quadro. add (panel);
        quadro.setSize(230,230);
        quadro.setVisible(true);




    }


}