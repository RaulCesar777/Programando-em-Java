
import java.util.Random;

public class randomicos{
    public static void main(String[]args){
        Random numerosAleatorios = new Random();

        int lado;
        int i;
        System.out.println();
        for ( i = 1; i < 21; i++){
            
            lado = 1 + numerosAleatorios.nextInt(6);
            System.out.printf(" %d  ", lado);
            if (i == 5 || i == 10 || i ==15 || i > 20) {
                System.out.println();
                
            }
            
        }
        System.out.println("\n\n\n"); 
    }
}