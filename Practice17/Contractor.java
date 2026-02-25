
public class Contractor extends Employee{

    public Contractor(String name){
        super(name);
    }

    @Override
    public void calculatePay(){
        System.out.println(name + " is paid $50 per hour.");
    }
}