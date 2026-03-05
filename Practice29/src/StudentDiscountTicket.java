public class StudentDiscountTicket extends Ticket{
    public StudentDiscountTicket(String movieName, double basePrice){
        super(movieName, basePrice);
    }

    @Override
    public double calculateFinalPrice(){
        return basePrice * 0.5;
    }
}
