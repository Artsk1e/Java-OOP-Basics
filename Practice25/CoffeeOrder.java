

public class CoffeeOrder {
    String flavor;
    static int totalOrder = 0;

    public CoffeeOrder(String flavor){
        this.flavor = flavor;
        totalOrder++;
    }
}
