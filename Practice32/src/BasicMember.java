public class BasicMember extends  Member{

    public BasicMember(String name, boolean hasPaidFree){
        super(name, hasPaidFree);
    }
    double monthlyCost;

    public double getMonthlyCost(){
        return 30;
    }
}
