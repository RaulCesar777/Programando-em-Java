package treino_diario;

public class WhileCounter{
    public static void main(String[]args){
        int contador =0;
        while(++contador<=10){
            System.out.printf("%d%n",contador);              
            // poderia ser ++contador; mas não era o topico de estudo.
        }
    }
}