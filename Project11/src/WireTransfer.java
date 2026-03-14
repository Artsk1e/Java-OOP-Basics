public class WireTransfer extends Transaction implements International {
    private String swiftCode;

    public WireTransfer(String id, double amount){
        super(id, amount);
    }

    @Override
    public void convertCurrency(double rate){
        this.amount = amount * rate;
        System.out.println("Internation: Converted amount to " + amount);
    }

    @Override
    public boolean validate(){
        return amount > 0;
    }
}
