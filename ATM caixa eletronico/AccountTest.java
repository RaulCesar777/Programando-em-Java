/**
 * @author Raul Cesar Mulerschat
 * @email raulzito737@gmail.com
 * @create date 2019-01-07 23:47:10
 * @modify date 2019-01-07 23:47:10
 * @desc [description]
 */
import java.util.Scanner;

public class AccountTest{
    public static void main(String[] args) {
        Account account1 = new Account (50.00);
        Account account2 = new Account (-7.53);

        System.out.prinf("balanco da conta 1: $%2.f \n", account1.getBalance());
        System.out.prinf("balanco da conta 2: $%2.f \n", account2.getBalance());

        Scanner input = new Scanner (System.in);
    }
}