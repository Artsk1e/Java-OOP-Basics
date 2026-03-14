public class CryptoPayment extends Transaction{
    private String walletAddress;

    public CryptoPayment(String id, double amount, String wallet){
        super(id, amount);
        this.walletAddress = wallet;
    }

    @Override
    public boolean validate(){
        return walletAddress !=null  && walletAddress.startsWith("0x") && walletAddress.length() > 20;
    }
}
