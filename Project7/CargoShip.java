
public class CargoShip extends Starship {
    private final int weight; 

    public CargoShip(String name, int fuel, int weight) {
        super(name, fuel);
        this.weight = weight;
    }

    @Override
    public void attack() {
        System.out.println("Dropping " + weight + " tons of cargo!");
    }

    public void showCargo(){
        System.out.println("Weight of Cargo: " + weight);
    }
}