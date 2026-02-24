

public class CreditCardPayment extends Payment {
    
    public CreditCardPayment(int amount){
        super(amount);

    }

    @Override
    public void authorize(){
        System.out.println("Processing Credit Card... Authorizing $" + amount);
    }
}
