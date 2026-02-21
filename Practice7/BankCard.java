public class BankCard {
    //Hidden Data
    private double balance;
    private final  int pin;

    //Constructor
    public BankCard(double balance, int pin){
        this.balance = balance;
        this.pin = pin;
    }
    // Getter (READ ONLY BALANCE)
    public double getBalance() {
        return balance;
    }
    
    // Setter
    public void deposit (double amount){
        if (amount > 0){
            this.balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw
    public void withdraw(double amount, int enteredPin) {
        if (enteredPin == this.pin && amount > 0 && amount <= this.balance){
            this.balance -= amount;
            System.out.println("Withdraw Successful! Remaining Balance: $" + this.balance);
        } else {
            System.out.println("Transaction Denied.");
            
        }
    }
    }

