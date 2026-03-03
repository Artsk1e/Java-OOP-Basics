

class Building {
    String name;
    public Building(String name){
        this.name = name;
    }
}

public class MemoryMastery{
    public static void main(String[] args) {
        
        int a = 10;
        int b =a;

        b = 20;

        System.out.println("Test 1 (Stack): a is " + a + ", b is " + b);

        Building b1 = new Building("Residential");

        Building b2 = b1;

        b2.name = "Power Plant";

        System.out.println("Test 2 (Heap): b1 is " +  b1.name + ", b2 is " + b2.name);

        b1 = null;

        System.out.println("Test 3 (Cleanup): b2 still sees: " +b2.name);

        b2 = null;
    }
}
