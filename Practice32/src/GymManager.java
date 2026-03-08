
import java.util.ArrayList;

public class GymManager {
    private ArrayList<Member> member = new ArrayList<>();

    public void registerMember(Member m){
        member.add(m);
        System.out.println("Register member: " + m.getName());
    }

    public void checkIn(Member m){
        if (m.isHasPaidFree()){
            System.out.println("Welcome: " + m.getName());
        } else {
            System.out.println("Access denied. Member " + m.getName() + " needs to pay");
        }
    }

    public void printTotalRevenue(){
        double totalPrice = 0;
        for (Member p : member){
            double finalPrice = p.getMonthlyCost();
            totalPrice += finalPrice;

            System.out.printf("%-8s | $%.2f%n", p.getName(), finalPrice);
        }
        System.out.println(" ");
        System.out.println("=========================");
        System.out.println("Total Gym Revenue: " + totalPrice);
    }
}
