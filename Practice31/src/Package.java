public abstract class Package {
    private String trackingId;
    private double weight;

    public Package(String trackingId, double weight) {
        this.trackingId = trackingId;
        this.weight = weight;

    }

    public String getTrackingId(){
        return trackingId;
    }

    public double getWeight(){
        return weight;
    }

    public abstract double calculateShippingCost();
}
