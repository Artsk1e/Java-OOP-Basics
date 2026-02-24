public class GcashPayment extends Payment{
    
    public GcashPayment(int amount){
        super(amount);
    }

    @Override
    public void authorize(){
        System.out.println("Opening Gcash App... Verifying PIN for $" + amount);
    }
}
