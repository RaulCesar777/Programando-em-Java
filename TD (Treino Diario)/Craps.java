/**
 * Craps
 */
import java.util.Random;
public class Craps {
    // gerador de aleatorios
    private static final Random numerosaletorios = new Random();
    //constantes para enumerar o estatus
    private enum Status{CONTINUE, VENCEU, PERDEU};

    // constantes que representam a logica do jogo
    private static final int OLHO_DE_COBRA =2;
    private static final int TRINCA =3;
    private static final int SETE =7;
    private static final int YO_LEVEN =11;
    private static final int CAIXA_DE_CARROS =12;
    
    //uma partida de craps
///////////////////////////////////////////////////////////////////////////////////////////
    public void play() {

        int ponto_meu=0;
        Status gameStatus;
        int somaDoDado = rollDado();

        switch (somaDoDado) {
            case SETE:
            case YO_LEVEN:
              gameStatus = Status.VENCEU;                
                break;

            case OLHO_DE_COBRA:
            case TRINCA:
            case CAIXA_DE_CARROS:
                gameStatus= Status.PERDEU;
                break;
            default:
                gameStatus = Status.CONTINUE;
                ponto_meu=somaDoDado;
                System.out.printf("Pontuacao igual a %d \n", ponto_meu);
                break;         
            
        }
        while (gameStatus == Status.CONTINUE) {
            somaDoDado=rollDado();

            if (somaDoDado == ponto_meu) {
                gameStatus=Status.VENCEU;
                               
            }else{
                if (somaDoDado==SETE) {
                    gameStatus=Status.PERDEU;

                    
                }
            }
            
        }//fim do while
        if (gameStatus==Status.VENCEU)System.out.println("jogador ganhou"); 
           else System.out.println("jogador perdeu");     
                           
       
        
    }// fim do metodo play
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int rollDado(){
        int dado1 =1+ numerosaletorios.nextInt(6);
        int dado2 =1+ numerosaletorios.nextInt(6);

        int soma = dado1 + dado2;
        System.out.printf(" o jogador lancou %d + %d = %d \n", dado1, dado2, soma);

        return soma;
    }    
}