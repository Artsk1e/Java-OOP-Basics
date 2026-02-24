class BankAccount {
    String accountHolder;
    double balance;

    //Constructor: Setting up the account
    BankAccount(String accountHolder, double initialBalance){
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    //Method to deposit Money
    void deposit(double amount) {
        this.balance = this.balance + amount;
        System.out.println(accountHolder + " deposited: $" + amount);
        System.out.println("New Balance: $" + this.balance);
    }

    //Method to withdraw
    void withdraw(double amount) {
        if (amount > 500) {
            System.out.println("Daily Limit Exceeded");
        } else if (amount > balance) {
            System.out.println("Insufficient Funds");
            
        } else {
            this.balance -= amount;
            System.out.println(accountHolder + " Withdrew: $" + amount);
        }
        System.out.println("Current Balance: $" + this.balance);
    }
}

public class BankApp {
    public static void main (String[]args) {
        BankAccount bankaccount = new BankAccount("Art", 1000);

        bankaccount.deposit(150);
        bankaccount.withdraw(100.);
        bankaccount.withdraw(600);
    }
}
