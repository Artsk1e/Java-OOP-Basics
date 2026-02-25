

public class SmartHome {
    public static void main(String[] args) {
        
        SmartDevice[] device = new SmartDevice[3];

        device[0] = new Fan("HANABISHI");
        device[1] = new Light("Philips");
        device[2] = new SmartTV("Samsung");

        for (SmartDevice a : device) {
            a.performAction();
        }
    }
    
}
