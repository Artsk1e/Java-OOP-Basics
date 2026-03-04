public abstract class BaseWallet implements Payable{
    private String owner;
    private double balance;

    public BaseWallet(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
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


}
