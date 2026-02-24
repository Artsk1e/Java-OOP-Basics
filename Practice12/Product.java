
public class Product {
    protected String name;
    protected double price;

    //Constructor
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Method: Display details
    public void displayDetails(){
        System.out.println("Item: " + name);
        System.out.println("Price: $" + price);
    }

}
