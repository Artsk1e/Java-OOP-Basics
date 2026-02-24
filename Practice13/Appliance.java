
public class Appliance {
    protected String brand;

    //Constructor
    public Appliance(String brand){
    this.brand = brand;
    }

    //Method
    public void turnOn(){
        System.out.println(brand + " appliance is now starting up");
    }
}
