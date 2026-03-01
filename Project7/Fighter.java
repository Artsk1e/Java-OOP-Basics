

public class Fighter extends Starship{
    public Fighter(String name, int fuel){
        super(name, fuel);
    }

    @Override
    public void attack(){
        System.out.println("Pewpew!");
    }

    public void warpJump(int speed){
        try {
            if (speed <= 0) {
                throw new IllegalArgumentException("Speed must be greater than 0");
            }
            if (getFuel() > 0){
            int calculateTime = 100/speed;
            System.out.println("Warping at " + speed + " speed. Arrival time: " + calculateTime);
            } else {
                System.out.println("Cannot warp: No fuel!");
            }
        } catch (Exception e) {
            System.out.println("Warp Jump Failed: " + e.getMessage());
        } finally {
            System.out.println("System Complete.");
        }
    }
}
