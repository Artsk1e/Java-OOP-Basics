public class ExpressPackage extends Package {
    public ExpressPackage(String trackingId, double weight){
        super(trackingId, weight);
    }

    @Override
    public double calculateShippingCost() {
       return getWeight() * 5.0;
    }
}
