

public class Bird implements Flyable{
    
    @Override
    public void takeOff(){
        System.out.println("Bird: Flapping wings rapidly and lifting off");
    }

    @Override
    public void land(){
        System.out.println("Bird: Slowing down and perching on a branch.");

    }
}
