

public class SmartTV extends SmartDevice {
    public SmartTV(String deviceName){
        super(deviceName);
    }

    @Override
    public void performAction(){
        System.out.println(deviceName + ": Saving current show and shutting down.");
    }
}
