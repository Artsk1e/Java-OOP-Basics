import java.awt.*;

public abstract class MenuItem {
    private String name;
    private double basePrice;

    public MenuItem(String name, double basePrice ){
        this.name = name;
        this.basePrice = basePrice;
    }

    public double getBasePrice(){
        return basePrice;
    }

    public String getName(){
        return name;
    }

    public void setBasePrice(double price){
        basePrice = price;
    }
    public abstract double calculatePrice();
}
