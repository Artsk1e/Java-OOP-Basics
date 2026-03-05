public class StandardTicket extends Ticket{
    public StandardTicket(String movieName, double basePrice){
        super(movieName, basePrice);
    }

    @Override
    public double calculateFinalPrice(){
        return basePrice;
    }

}
