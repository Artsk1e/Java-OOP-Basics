

public class Burger extends MenuItem {
    private boolean hasExtraCheese;

    public Burger(String name, double basePrice, boolean hasExtraCheese) {
        super(name, basePrice);
        this.hasExtraCheese = hasExtraCheese;
    }

    @Override
    public double calculatePrice() {
        double finalPrice = getBasePrice();
        if (hasExtraCheese) {
            finalPrice += 1.5;
        }
        return finalPrice;
    }


}
