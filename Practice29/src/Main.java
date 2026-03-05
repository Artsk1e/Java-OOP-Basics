import java.util.ArrayList;

public class Main{
    public static void main(String []args) {
        CinemaHall imax = new CinemaHall();
        imax.sellTicket(new StandardTicket("Dune", 15));
        imax.sellTicket(new StudentDiscountTicket("Star Wars", 20));

        imax.printRevenue();
    }
    }
