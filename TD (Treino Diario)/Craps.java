/**
 * Craps
 */
import java.util.Random;
public class Craps {
    // GERADOR DE ALEATORIOS PARA O INICIO DA PRIMEIRA PARTIDA PODENDO ENCERRAR COM VITORIA OU DERROTA 
    // CASO NÃO HOUVER GANHADOR O STATUS SERA CONTINUE E CHAMARA O METODO ROLLDADO
    private static final Random numerosaletorios = new Random();
    //constantes para enumerar o estatus
    private enum Status{CONTINUE, VENCEU, PERDEU};

    // constantes que representam a logica do jogo
    private static final int DOIS =2;
    private static final int TRES =3;
    private static final int SETE =7;
    private static final int ONZE =11;
    private static final int DOZE =12;
    
    
///////////////////////////////////////////////////////////////////////////////////////////
////METODO PLAY
    public void play() {

        int ponto_meu=0;                          // VARIAVEL PONTO_MEU GUARDA O VALOR DA RODADA PARA O JOGADOR
        Status gameStatus;                                                 // GAME STATUS SALVA O STATUS DO JOGO
        int somaDoDado = rollDado();                             // VARIAVEL SOMADODADO INVOCA O METODO ROLLDADO 
                    // CASO NA PRIMEIRA RODADA O ACUMULATIVO DE SOMADODADO FOR UM DESTE VALORES O JOGADOR GANHOU
        switch (somaDoDado) {
            case SETE:
            case ONZE:
              gameStatus = Status.VENCEU;                
                break;




                   // CASO NA PRIMEIRA RODADA O ACUMULATIVO DE SOMADODADO FOR UM DESTE VALORES O JOGADOR PERDEU
            case DOIS:
            case TRES:
            case DOZE:
                gameStatus= Status.PERDEU;
                break;



                // POR DEFAULT  SERA O STATUS DE CONTINUAÇÃO
            default:
                gameStatus = Status.CONTINUE;
                ponto_meu=somaDoDado;
                System.out.printf("Pontuacao igual a %d \n", ponto_meu);
                break;         
            
        }

                                      // EMQUANTO O STATUS FOR CONTINUAR IRA INVOCAR O METODO ROLLDADO NOVAMENTE
        while (gameStatus == Status.CONTINUE) {
            somaDoDado=rollDado();
                /// CASO TENHA SIDO A APROVAÇÃO DE CONTINUAR  AQUI SERÁ DEFINIDA A VITORIA OU DERROTA DO JOGADOR
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
////METODO ROLLDADO
    public int rollDado(){
        int dado1 =1+ numerosaletorios.nextInt(6);                               //CRIA ALEATORI0S PARA O DADO 1
        int dado2 =1+ numerosaletorios.nextInt(6);                               //CRIA ALEATORIOS PARA O DADO 2

        int soma = dado1 + dado2;                                             ///SOMA OS RESULTADO DOS DOIS DADOS
        System.out.printf(" o jogador lancou %d + %d = %d \n", dado1, dado2, soma);

        return soma;                                                // RETORNA O VALOR OBTIDO PELA VARIAVEL SOMA
    }    
}