import java.util.ArrayList;

public abstract class BaseWallet implements Payable{
    private String owner;
    private double balance;
    private ArrayList<Transaction> history;

    public BaseWallet(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.history = new ArrayList<>();
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner(){
        return owner;
    }

    @Override
    public void addfunds(double amount){
        setBalance(getBalance()-amount);
        history.add(new Transaction("DEPOSIT", amount));
    }

    public void printHistory() {
        System.out.println("--- History for " + owner + " ---");
        for (Transaction t : history) {
            System.out.println(t);
            System.out.println("-----------------------------------");
        }
    }

    public abstract boolean processPayment(double amount);

    protected void recordPayment(double amount){
        this.balance -= amount;
        history.add(new Transaction("Payment", amount));
    }



    }


