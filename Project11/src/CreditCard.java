public class CreditCard extends Transaction implements Refundable {

    public CreditCard(String id, double amount){
        super(id, amount);
    }

    @Override
    public void refund(){
        System.out.println("Processing refund for " + getAmount());
        setProcessedStatus(false);
    }

    @Override
    public boolean validate(){
        double creditLimit = 10000;
        return getAmount() <= creditLimit;
    }
}
