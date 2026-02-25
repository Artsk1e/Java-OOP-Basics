

public class FullTimeEmployee extends Employee {
    
    public FullTimeEmployee(String name){
        super(name);
    }

    @Override
    public void calculatePay(){
        System.out.println(name + " is paid a fixed salary of $5,000.");

    }
}
