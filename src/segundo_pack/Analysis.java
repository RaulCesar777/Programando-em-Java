package segundo_pack;

import java.util.Scanner;

public class Analysis{

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        int aprovado =0;
        int reprovado =0;
        int contagemestudante = 1;
        int resultado = 0;

        while( contagemestudante <= 10){
            System.out.println("entre com o resultado (1 aprovado, 2 reprovado):");
            resultado = entrada.nextInt();
            if(resultado==1)
            
                aprovado=aprovado+1;
            else
                reprovado=reprovado+1;

        contagemestudante=contagemestudante+1;




        }
        System.out.printf("aprovados %d%n reprovados %d%n", aprovado, reprovado);
        if(aprovado>8)
            System.out.println("bonus professor");

    }





























}