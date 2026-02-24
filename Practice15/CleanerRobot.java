public class CleanerRobot extends Robot{

    public CleanerRobot(String model){
        super(model);
    }

    @Override
    public void work(){
        System.out.println("Model " + model + " is Sweeping the Floor");
    }
}