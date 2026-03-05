public abstract class Ticket {
    private String movieName;
    protected double basePrice;

    public Ticket(String movieName, double basePrice){
        this.basePrice = basePrice;
        this.movieName = movieName;
    }

    public String getMovieName(){
        return movieName;
    }

    public double getBasePrice(){
        return basePrice;
    }

    public void setBasePrice(double price){
        this.basePrice = price;
    }

    public abstract double calculateFinalPrice();
}
