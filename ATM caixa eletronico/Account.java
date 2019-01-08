/**
 * @author Raul Cesar Mulerschat
 * @email raulzito737@gmail.com
 * @create date 2019-01-07 22:15:58
 * @modify date 2019-01-07 22:15:58
 * @desc [description]
 */
public class Account{
    private double balance;

    public Account( double initialBalance){
        if (initialBalance > 0.0) {
            balance= initialBalance;
        }
    } 
    public void credit (double amount){

        balance = balance + amount;
    }
    public double getBalance(){

        return balance;
    }   
}