public class CreditCard extends BaseWallet{
    private double limit = 5000.0;

    public CreditCard(String owner, double balance){
        super(owner, balance);
    }

    @Override
    public boolean processPayment(double amount){
        if (amount <= (getBalance() + limit)){
            setBalance(getBalance()-amount);
            return true;
        }
        return false;
    }

}
