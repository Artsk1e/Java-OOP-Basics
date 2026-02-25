

public class Fan extends SmartDevice {
    public Fan(String deviceName){
        super(deviceName);
    }

    @Override
    public void performAction(){
        System.out.println(deviceName + ": Stoppingn blades...");
    }
}
