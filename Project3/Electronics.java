

public class Electronics extends Item implements Fragile, Insured {
    public Electronics(String name, double weight) {
        super(name, weight);
    }

    @Override
    public double getPackingCost(){
        return weight * 2.0;
    }

    @Override
    public double getInsurancePremium() {
        return 50.0; }
}
