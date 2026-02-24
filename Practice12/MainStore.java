
public class MainStore {
    public static void main(String[] args) {
        Shirt polo = new Shirt("Polo" , 25.25, "Large");
        Shoes sneakers = new Shoes("Sneakers", 31.50, 10);

        polo.displayDetails();
        sneakers.displayDetails();

        polo.wear();
        sneakers.tieLaces();
        
    }
}
