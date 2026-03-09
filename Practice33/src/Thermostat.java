public class Thermostat implements Toggleable{
    private int temperature;

    public Thermostat(int temperature){
        this.temperature = temperature;
    }

    public void turnOn(){
        System.out.println("Turning on Thermostat. Temperature is: " + getTemperature());
    }

    public void turnOff(){
        System.out.println("Temperature is : " + getTemperature() + ", Turning off Thermostat");
    }

    public int getTemperature(){
        return temperature;
    }

}
