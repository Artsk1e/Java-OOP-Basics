
public class SecurityCamera extends Device implements Alarm{
    public SecurityCamera(String location, double batteryPercentage){
        super(location, batteryPercentage);
    }

    @Override
    public void statusCheck(){
        System.out.println("Camera in " + location + "  is RECORDING");
    }

    @Override
    public void trigger(){
        System.out.println("ALERT! Motion detected at " + location);
    }
}
