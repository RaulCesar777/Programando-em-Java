import javax.swing.JFrame;


public class DrawPanelTest{
    public static void main(String[] args) {
        
        DrawPanel painel = new DrawPanel();
        JFrame aplicacao = new JFrame();
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(painel);
        aplicacao.setSize(400,400);
        aplicacao.setVisible(true);

    }
}