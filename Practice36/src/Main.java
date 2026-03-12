
interface Chilled {
    boolean isCold();
}

abstract class Product{
    String name;
    double price;

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    abstract void dispense();
}

class Soda extends Product implements Chilled {
    boolean coldStatus;

    Soda(String name, double price, boolean coldStatus){
        super(name, price);
        this.coldStatus = coldStatus;
    }
    @Override
    public boolean isCold(){return coldStatus;}

    @Override
    void dispense() {
        if(isCold()){
            System.out.println("Refreshing! " + name + " is ice cold.");
        } else {
            System.out.println("Wait! " + name + " is still warm.");
        }
    }
}

class Chips extends Product{
    Chips(String name, double price) {
        super(name, price);
    }

    @Override
    void dispense(){
        System.out.println("Crunch. " + name + " is dispensed.");
    }

}
public class Main {
    public static void main(String [] args){
        Product s = new Soda("Coke", 3.5,true);
        Product v = new Chips("Chippy", 1.3);

        s.dispense();
        v.dispense();
    }
}