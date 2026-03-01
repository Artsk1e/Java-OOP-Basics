

public class Main {
    public static void main(String[] args) {
       Fighter f1 = new Fighter("F1", 20);
       Fighter f2 = new Fighter("F2", 0);
       CargoShip c2 = new CargoShip("C1", 10, 200);

       System.out.println("StarShip Count: " + Starship.totalFleet);
       System.out.println("F2 Fuel: " + f2.getFuel());
       
       System.out.println("\n--- Fighter 1 Warp Jump ---");
       f1.warpJump(10);
       
       System.out.println("\n--- CargoShip Attack ---");
       c2.attack();
    }
}
