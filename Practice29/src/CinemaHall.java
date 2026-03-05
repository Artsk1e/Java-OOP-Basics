import java.util.ArrayList;
public class CinemaHall {
    private ArrayList<Ticket> soldTickets = new ArrayList<>();

    public void sellTicket(Ticket t){
        soldTickets.add(t);
        System.out.println("LOG: Sold " + t.getMovieName() + " (Final Price: $" + t.calculateFinalPrice());

    }

    public void printRevenue(){
        double total =0;
        for (Ticket ticket: soldTickets){
            total += ticket.calculateFinalPrice();
            System.out.println("\n=== DAILY REVENUE REPORT ===");
            System.out.printf("Total Earned: $%.2f%n", total);
            System.out.println("============================");
        }
    }
}
