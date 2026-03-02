import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Infrastructure> bldg = new ArrayList<>();

        bldg.add(new ResidentialBuilding("Mahayahay", 50, true, 4));
        bldg.add(new ResidentialBuilding("Palao", 450, false, 20));
        bldg.add(new PowerPlant("MSU-IIT", 1200, true, "Nuclear"));

        
        for (Infrastructure i : bldg){
            System.out.println("Address: " + i.getAddress());
            System.out.println("Current Energy Usage: " + i.getEnergyUsage());

            if (i instanceof Powerable p){
                p.adjustVoltage(300);
            }

            if (i instanceof Powerable p && p.isEmergencyMode()){
                System.out.println("!!! EMERGENCY DETECTED at " + i.getAddress() + " !!!");

                i.performMaintenance();
                System.out.println("Maintenance complete.");
                System.out.println("-----------------------------------------------------------");
            }

            
        }
    }
}
