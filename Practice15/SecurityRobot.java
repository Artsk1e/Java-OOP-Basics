
public class SecurityRobot extends Robot{

    public SecurityRobot(String model){
        super(model);
    }

    @Override
    public void work(){
        System.out.println("Model " + model + " is scanning for intruders");
    }
    
}
