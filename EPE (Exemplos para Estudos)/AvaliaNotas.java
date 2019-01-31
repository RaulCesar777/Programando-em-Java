import java.util.Scanner;

public class AvaliaNotas{

    public static void main(String[] args) {
        int total =0;
        int contadordenotas =0;
        int contaA =0;
        int contaB =0;
        int contaC =0;
        int contaD =0;
        int contaF =0;

        Scanner entrada = new Scanner(System.in);

        System.out.printf("entre com uma nota de 0 a 100 %n%s",
                           "para enserar a incerssao (contrl + z)\n"); 
                           
        while(entrada.hasNext()){
            int nota = entrada.nextInt();
            total+=nota;//seria o mesmo que total = total+nota
            ++contadordenotas;
            switch(nota/10){
                case 9:
                case 10:
                ++contaA;
                break;
                
                case 8:
                ++contaB;
                break;

                case 7:
                ++contaC;
                break;

                case 6:
                ++contaD;
                break;

                default:
                ++contaF;
                break;
            }
        }
        System.out.println("\n RELATORIO DE NOTAS");
        if(contadordenotas !=0){
            double media = (double)total/contadordenotas;
            System.out.printf(" total de %d notas inseridas eh %d", contadordenotas, total);
            System.out.printf(" media da classe eh %.2f%n", media);
            System.out.printf(" %n %s %n %s %d %n %s %d %n %s %d %n %s %d %n %s %d %n",
                                "numero de estudante em relacao as notas:",
                                "A:",contaA,
                                "B:",contaB,
                                "C:",contaC,
                                "D:",contaD,
                                "F:",contaF);

        }
        else
                System.out.println("nao ha entrada de notas");
    }

}