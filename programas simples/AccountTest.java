/**
 * @author Raul Cesar Mulerschat
 * @email raulzito737@gmail.com
 * @create date 2019-01-07 23:47:10
 * @modify date 2019-01-07 23:47:10
 * @desc [description]
 */
import java.lang.Math;
import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        double depositAmount;
        Account account1 = new Account (50);
        Account account2 = new Account (7);

        System.out.printf("balanco da conta 1:R$ %.2f \n", account1.getBalance());
        System.out.printf("balanco da conta 2:R$  %.2f \n", account2.getBalance());

        Scanner input = new Scanner (System.in);

     

        System.out.println("entre com o deposito");        
        depositAmount = input.nextDouble();

        System.out.printf("\n adicionado R$  %.2f  para a conta 1\n\n", depositAmount);
        account1.credit(depositAmount);

        System.out.printf("balanco da conta 1:R$  %.2f \n", account1.getBalance());
        System.out.printf("balanco da conta 2:R$  %.2f \n", account2.getBalance());


        System.out.print("entre com o deposito 2\n");
        depositAmount = input.nextDouble();
        System.out.printf("\n adicionado %.2f  para a conta 1\n\n", depositAmount);
        account2.credit(depositAmount);

        System.out.printf("balanco da conta 1:R$  %.2f \n", account1.getBalance());
        System.out.printf("balanco da conta 2:R$  %.2f \n", account2.getBalance());


    }
}