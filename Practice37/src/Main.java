import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String [] args){
        ArrayList<SpaceCraft> dock = new ArrayList<>();
        dock.add(new Freighter("Johnson", 50));
        dock.add(new HybridScout("Fortress", 30));

        for(SpaceCraft s : dock){
            System.out.println("\n--- Processing: " + s.getShipName() + " ----");

            if(s.getFuelLevel() < 20){
                System.out.println("Alert! Emergency docking for " + s.getShipName());
            }

            if(s instanceof Cargo){
                ((Cargo) s).loadCargo(500);
            }

            if(s instanceof Combat){
                ((Combat) s).armWeapons();
            }

            s.performMission();
        }
    }
}
