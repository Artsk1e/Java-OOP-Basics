

public class BankAccount {
    final int account_number;
    double balance;

    public BankAccount(int account_number, double balance){
        this.account_number = account_number;
        this.balance = balance;
    }

    public final void showRules(){
        System.out.println("Rule 1: No negative balances allowed.");
    }
}
