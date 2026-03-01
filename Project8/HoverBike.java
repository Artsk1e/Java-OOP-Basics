

public class HoverBike extends Vehicle{
    private int maxAltitude;

    public HoverBike(String model, int health, int maxAltitude){
        super(model, health);
        this.maxAltitude = maxAltitude;
    }

    @Override 
    public void accelerate(int speed){
        System.out.println(getModel() + " rockets forward at " + speed + " mph");
    }

    @Override
    public void brake(){
        System.out.println("BREAK!");
    }

    @Override 
    public void displayInfo(){
        System.out.println("Bike: " + getModel());
        System.out.println(" Altitude: " + maxAltitude);
    }



}    
    