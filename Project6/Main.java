
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        ArrayList<Device> device = new ArrayList<>();

        device.add(new SmartLight("Kitchen", 46));
        device.add(new SecurityCamera("Living Room", 19));

        for (Device d : device){
            d.statusCheck();

            if (d instanceof Alarm p){
                p.trigger();
            }

            if(d.getBattery() < 20){
                System.out.println("Warning: " + d.getLocation() + " battery is low!");
            }
        }
    }
}
