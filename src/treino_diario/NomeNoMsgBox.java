package treino_diario;

/**


 * 
 * 
 * @author Raul Cesar Mulerschat
 * @email raulzito737@gmail.com
 * @create date 2019-01-20 00:10:10
 * @modify date 2019-01-20 00:10:10
 * @desc [description]
 */
import javax.swing.JOptionPane;

public class NomeNoMsgBox{
    public static void main( String[] args){

        String nome = JOptionPane.showInputDialog("qual e seu nome ?");
        String mensagem = String.format("Bem vindo! %s ao meu git hub ", nome);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}