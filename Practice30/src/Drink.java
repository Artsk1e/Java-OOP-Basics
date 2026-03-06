public class Drink extends MenuItem {
    private final String size;

    public Drink(String name, double basePrice, String size){
        super(name, basePrice);
        this.size = size;
    }

    @Override
    public double calculatePrice() {
        double finalPrice = getBasePrice();

        if(size.equals("Large")) {
            finalPrice += 2.00;
        } else if (size.equals("Medium")) {
            finalPrice += 1.00;
        }
        return getBasePrice();
    }
}
