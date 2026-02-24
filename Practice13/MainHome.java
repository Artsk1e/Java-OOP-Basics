
public class MainHome {
    public static void main(String[] args) {
        Fan dyson = new  Fan("Dyson");
        WashingMachine samsung = new WashingMachine("Samsung");
        SmartLight philips = new SmartLight("Philips");

        dyson.turnOn();
        samsung.turnOn();
        philips.turnOn();
    }
    
}
