
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vc = new ArrayList<>();

        vc.add(new HoverBike("Tesla", 20, 100));
        vc.add(new HoverBike("Toyota", 0, 30));
        
        for(Vehicle c : vc){

            c.displayInfo();

            if(c.getHealth() < 20){
                System.out.println("Health is " + c.getHealth() + " Urgent Repair needed.");
            } else {
                System.out.println("System Nominal");
            }

            c.accelerate(120);
        }

        
    }
}
