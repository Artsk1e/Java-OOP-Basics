public class Furniture extends Item implements Fragile, Insured{
    public Furniture(String name, double weight){
        super(name, weight);
    }

    @Override
    public double getInsurancePremium(){
        return 20.0;
    }
}
