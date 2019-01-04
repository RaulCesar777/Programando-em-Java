
/**
 * @author Raul Cesar Mulerschat
 * @email raulzito737@gmail.com
 * @create date 2019-01-04 17:45:45
 * @desc [compara inteiros utilizando if, operadores]
 * relacionais e operadores de igualdade
 */
import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println(" insira o primeiro numero");
        number1 = input.nextInt(); /* le o primeiro numero */
        System.out.println("insira o segundo numero");
        number2 = input.nextInt(); /* le o segundo numero */

        /************ incio das comparações ********************/

        if (number1 == number2) {
            System.out.println("os nuemros sao iguais \n");
        }
        if (number1 != number2) {
            System.out.println("os numeros sao diferentes \n");
        }
        if (number1 < number2) {
            System.out.printf("o numero1 %d eh menor que o numero 2 %d \n\n", number1, number2);
        }
        if (number1 > number2) {
            System.out.printf("o numero1 %d eh maior que o numero 2 %d \n\n", number1, number2);
        }
        if (number1 <= number2) {
            System.out.printf("o numero1 %d eh menor ou igual que o numero 2 %d \n\n", number1, number2);
        }
        if (number1 >= number2) {
            System.out.printf("o numero1 %d eh maior ou igual que o numero 2 %d \n\n", number1, number2);

            System.out.println("\n\n\n\n");
        }

    }

}