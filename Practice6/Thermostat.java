package Practice6;
public class Thermostat {
    // 1. Private fields (The "Hidden" data)
    private double temperature;

    // 2. Constructor
    public Thermostat(double initialTemp){
        // We use the setter even in the constructor to ensure validation!
        setTemperature(initialTemp);
    }

    // 3. The Getter (Accessing the data)
    public double getTemperature(){
        return temperature;
    }

    // The Setter (The Security Guard)
    public final void setTemperature(double newTemp){
        // Validation logic: Humans can't survive outside 10°C - 35°C in this house
        if (newTemp >= 10.0 && newTemp <= 35.0) {
            this.temperature = newTemp;
            System.out.println("Temperature set to: " + newTemp + "°C");
        } else {
            System.out.println("ERROR: " + newTemp + "°C is unsafe! System blocked change.");
        }
    }
}
