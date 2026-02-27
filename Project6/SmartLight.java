
public class SmartLight extends Device {
    public SmartLight(String location, double batteryPercentage){
        super(location, batteryPercentage);
    }

    @Override
    public void statusCheck(){
        System.out.println("Light in " + location + " is Dimmed");
    }
}
