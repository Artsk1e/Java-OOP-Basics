package Practice6;
public class Main {
    public static void main(String[] args) {
        Thermostat livingRoom = new Thermostat(20.0);  // Create The Object

        //Trying to Read data
        // System.out.println(livingRoom.temperature); <== Error! Private access.
        System.out.println("Current Temp: " + livingRoom.getTemperature());

        //Trying to set valid data
        livingRoom.setTemperature(25.5);

        //Trying to set Invalid Data (The "Sabotage")
        livingRoom.setTemperature(100.0);

        //Confirming the data stayed safe
        System.out.println("Final Safe Temp: " + livingRoom.getTemperature());
    }
}
