
public abstract class Device {
    protected String location;
    protected double batteryPercentage;
    
    public Device(String location, double batteryPercentage){
        this.location = location;
        this.batteryPercentage = batteryPercentage;
    }

    public abstract void statusCheck();
    
    public double getBattery(){
        return batteryPercentage;
    }

    public String getLocation(){
        return location;
    }
}
