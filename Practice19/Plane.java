
public class Plane implements Flyable{
    @Override
    public void takeOff(){
        System.out.println("Plane: Engines at full thrust... lifting off the runway!");
    }

    @Override
    public void land(){
        System.out.println("Plane: Landing gear down... smooth touchdown.");
    }
}
