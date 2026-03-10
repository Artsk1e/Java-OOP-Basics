

public class WoodDoor implements Damageable{
    private String name;
    private int health;

    public WoodDoor(String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return name;
    }
    @Override
    public int getHealth(){
        return health;
    }

    @Override
    public void takeDamage(int amount) {
        health -= amount;
        health = Math.max(health, 0);
        System.out.println("the door is splintering! Health: " + health);
    }

    public String toString(){
        return this.name;
    }
}
