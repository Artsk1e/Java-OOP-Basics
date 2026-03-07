import java.util.ArrayList;

public class DeliveryTruck {
    private ArrayList<Package> cargo = new ArrayList<>();

    public void loadPackage(Package p){
        cargo.add(p);
        System.out.println("Package is being loaded");
        System.out.println("Added to the cargo: " + p.getTrackingId());
    }

    public void printManifest(){
        double total = 0;

        for (Package o : cargo){
            double finalPackagePrice = o.calculateShippingCost();
            total += finalPackagePrice;
            System.out.printf("ID: %-8s | Cost: $%.2f%n" , o.getTrackingId(), finalPackagePrice);
        }

        System.out.println(" ");
        System.out.println("--------------------");
        System.out.println("TOTAL SHIPPING COST: $" + total);
    }
}
