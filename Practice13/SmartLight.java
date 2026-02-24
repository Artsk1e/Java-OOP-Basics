
public class SmartLight extends Appliance {

    public SmartLight(String brand){
        super(brand);
    }
    @Override
    public void turnOn(){
        System.out.println("The Light glows a soft blue");
    }
    }

