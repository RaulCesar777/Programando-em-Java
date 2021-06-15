package treino_diario;

import java.util.Random;
/**
 * Rodada
 */
public class Rodada {

    public static void main(String[] args) {
        
        Random aleatorios = new Random();
        
        int frequencia1 =0;
        int frequencia2 =0;
        int frequencia3 =0;
        int frequencia4 =0;
        int frequencia5 =0;
        int frequencia6 =0;
        int face;
        int rodada;
        int max =6000;

        for (rodada = 0; rodada <= max; rodada++) {
            face = 1 + aleatorios.nextInt(6);
            switch (face) {
                case 1:
                    ++frequencia1;
                    break;
                case 2:
                    ++frequencia2;
                    break;
                case 3:
                    ++frequencia3;
                    break;
                case 4:
                    ++frequencia4;
                    break;
                case 5:
                    ++frequencia5;
                    break;
                case 6:
                    ++frequencia6;
                    break;
                
            }            
        }
        System.out.println("Lado e frequencia");
        System.out.printf("L 1 = %d \n", frequencia1);
        System.out.printf("L 2 = %d \n", frequencia2);
        System.out.printf("L 3 = %d \n", frequencia3);
        System.out.printf("L 4 = %d \n", frequencia4);
        System.out.printf("L 5 = %d \n", frequencia5);
        System.out.printf("L 6 = %d \n", frequencia6);






    }
}