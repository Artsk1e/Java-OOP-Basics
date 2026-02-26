

public class BasicMember extends Member{
    

    public BasicMember(String name, String membershipType){
        super(name, membershipType);
    }

    @Override
    public double calculateMonthlyBill(){
        return 50.0;
    }
}
