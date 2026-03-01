

public abstract class Starship {
    private final String name;
    private final int fuel;
    static int totalFleet = 0;

    public final String galaxy = "Milky Way";

    public Starship(String name, int fuel){
        this.name = name;
        this.fuel = fuel;
        totalFleet++;
    }

    public String getName(){
        return name;
    }

    public int getFuel(){
        return fuel;
    }

    public abstract void attack();
}
