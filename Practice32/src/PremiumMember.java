public class PremiumMember extends Member{
    private boolean wantsPersonalTrainer;

    public PremiumMember(String name, boolean hasPaidFree, boolean wantsPersonalTrainer){
        super(name, hasPaidFree);
        this.wantsPersonalTrainer = wantsPersonalTrainer;
    }

    double monthlyCost;
    public double getMonthlyCost() {
        monthlyCost = 50;
        if (wantsPersonalTrainer){
            monthlyCost += 40;
        }
        return monthlyCost;
    }
}
