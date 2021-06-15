


package treino_diario;

import java.util.Scanner;
public class Calculadora {
    /**
     *
     */

    public static void main(String[] args) 
    {
        int x, y, z;
        String opt;
        boolean continuar = true;
        Scanner numScanner = new Scanner(System.in);
        Scanner op = new Scanner(System.in);

       

            System.out.println("\t\t\t\tCalculadora extruturada em java\n");
            System.out.println("\t\t\t\t* para multiplicacao\n");
            System.out.println("\t\t\t\t/ para divisão\n");
            System.out.println("\t\t\t\t+ para somar\n");
            System.out.println("\t\t\t\t- para subtracao\n");
            System.out.println("\t\t\t\t selecione  \n");
           opt = op.next();

            System.out.println("NUMERO1");
            x = numScanner.nextInt();
            System.out.println("numero2");
            y = numScanner.nextInt();

            if (opt.equals("*")) {
                z = x * y;
                System.out.printf("o numero eh %d\n\n", z);
            } else if (opt.equals("/")) {
                z = x / y;
                System.out.printf("o numero eh %d\n\n", z);
            } else if (opt.equals("+")) {
                z = x + y;
                System.out.printf("o numero eh %d\n\n", z);
            } else if (opt.equals("-")) {
                z = x - y;
                System.out.printf("o numero eh %d\n\n", z);
            }

                   

    }

}
