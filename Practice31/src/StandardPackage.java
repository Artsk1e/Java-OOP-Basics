public class StandardPackage extends Package{

    public StandardPackage(String trackingId, double weight){
        super(trackingId,weight);
    }

    @Override
    public double calculateShippingCost() {
        return getWeight() * 2.5;
    }
}
