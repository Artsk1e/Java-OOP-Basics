

public class StarshipTest {
    public static void main(String[] args) {
        int distance = 500;
        int fuel = 0;


    try {
        System.out.println("Attempting to calculate jump...");
        int efficiency = distance / fuel;
        System.out.println("Efficiency " + efficiency);
    } catch (ArithmeticException e) {
        System.out.println("Error.");
    } finally {
        System.out.println("System Scan Complete. Now closing");
    }
    System.out.println("PRogram continues running safely");
    }
}
