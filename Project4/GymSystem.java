import java.util.ArrayList;

public class GymSystem {
    public static void main(String[] args) {
        
        ArrayList<Member> gymRoster = new ArrayList<>();

        gymRoster.add(new BasicMember("Art", "Regular"));
        gymRoster.add(new VIPMember("John", "Premium"));
        gymRoster.add(new BasicMember("Charlie", "Regular"));

        System.out.println("===Gym Bill Report===");

        double totalRevenue = 0;

        for(Member m : gymRoster){
            double bill = m.calculateMonthlyBill();
            System.out.println("Member " + m.name + " | Total Bill: $"+ bill);
            totalRevenue += bill;
        }

        System.out.println("Total Revenue: $" + totalRevenue);
    }
}
