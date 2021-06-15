/**
 * SomaVetor
 */
public class SomaVetor {

    public static void main (String[]args){
        int vetor[] = {89, 90, 45, 45,78,34,12,56};
        int total =0;
        int i;
        for(i=0; i<vetor.length; i++){

            total+= vetor[i];
        }
        System.out.printf("soma dos elemntos do vetor : %d%n",total);
    }
}