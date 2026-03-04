public class CryptoWallet extends BaseWallet{
    private double tax = 0.10;

    public CryptoWallet(String owner, double balance){
        super (owner, balance);
    }

    @Override
    public boolean processPayment(double amount){
        double totalCost = amount + (amount * tax);

        if (totalCost <= getBalance()) {
            setBalance(totalCost-getBalance());
            return true;
        }
        else {
            return false;
        }

}

    @Override
    public void addfunds(double amount){
        setBalance(getBalance()-amount);
    }
}
