/**
 * Arrays
 */
public class Arrays {

    public static void main(String[] args){
        int TAM =20;
        int vetor[]= new int[TAM];
        int i;

        for(i=0; i<TAM; i++){
            vetor[i]=2+2*i;
          

        }
        System.out.printf("%s%8s%n","indice","valor");

        for(i=0;i<TAM;i++){
            System.out.printf("%5d%8d%n",i,vetor[i]);
        }
    }    
}