import java.util.ArrayList;

public class Restaurant {
    private ArrayList<MenuItem> currentOrder = new ArrayList<>();

    public void addToOrder(MenuItem item){
        currentOrder.add(item);
        System.out.println("Added to order: " + item.getName());
    }

    public void printTotal(){
        double totalPrice = 0;
        System.out.println("=========Receipt========");
        System.out.println("=======Your Orders=======");
        for (MenuItem item : currentOrder){
            double finalitemPrice = item.calculatePrice();
            totalPrice +=finalitemPrice;
            System.out.printf("%-8s | $%.2f", item.getName(), finalitemPrice);
        }

        System.out.println();
        System.out.println("============================");
        System.out.printf("%-10s | $%.2f%n", "Grand Total: ", totalPrice);
    }
}
