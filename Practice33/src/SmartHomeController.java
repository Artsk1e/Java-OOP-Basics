import java.util.ArrayList;

public class SmartHomeController {
     ArrayList<Toggleable> devices = new ArrayList<>();

     public void addDevice(Toggleable t){
         devices.add(t);
         System.out.println("Adding devices" + t);
     }

     public void allLightsOut(){
         for (Toggleable p : devices){
             p.turnOff();
         }
     }

}
