import java.util.Scanner;
public class Account_test {
    static Scanner object = new Scanner(System.in);

    public class checkingAccount{
        public String name;
        public int account_no;

        public double account_balance;
    }
    //withdraw function
        public static void withdraw(double amount) {
            double balance;
            balance = 2000;
            if (amount > balance) {
                System.out.println("your account balance is too low for the transaction");
            } else {
                double new_balance;
                new_balance = balance - amount;
                System.out.println("Transaction successfull");
                System.out.println("New balance is : " + new_balance);
            }
        }
    public static void main(String[] args){
        double act_amount;
        System.out.println("Enter the amount to withdraw");
        act_amount = object.nextDouble();

        withdraw(act_amount);







    }
}
