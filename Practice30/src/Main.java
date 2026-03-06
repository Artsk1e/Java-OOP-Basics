import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
		Restaurant mcdonalds = new Restaurant();

		Burger burger = new Burger("McCheese", 5.0, true);
		Drink coke = new Drink("Coke", 2.00, "Large");

		mcdonalds.addToOrder(burger);
		mcdonalds.addToOrder(coke);

		mcdonalds.printTotal();


	}
}
