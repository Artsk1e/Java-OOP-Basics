
public class Light extends SmartDevice{
    
    public Light(String deviceName){
        super(deviceName);
    }

    @Override
    public void performAction(){
        System.out.println(deviceName + ": Dimming Lights to 0");
    }
}
