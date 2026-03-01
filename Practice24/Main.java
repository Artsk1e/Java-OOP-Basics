

public class Main {
    public static void main(String[] args) {
        Starship s1 = new Starship("Jet");
        Starship s2 = new Starship("Flame");

        System.out.println("Starship 1: " + s1.name);
        System.out.println("Starship 1: " + s2.name);

        System.out.println("TotalShips: " +  Starship.total);

    }
}
