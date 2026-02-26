

public class VIPMember extends Member implements Premium {
    
    public VIPMember(String name, String membershipType){
        super(name, membershipType);
    }

    @Override
    public double getTrainerFee(){
        return 100.00;
    }
    @Override
    public double calculateMonthlyBill(){
        return 50.00 + getTrainerFee();

    }
}
