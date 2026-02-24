
public class WashingMachine extends Appliance {

    public WashingMachine(String brand){
        super(brand);
    }

    @Override
    public void turnOn(){
        super.turnOn();
        System.out.println("Filling with Water...");
    }
    
}
