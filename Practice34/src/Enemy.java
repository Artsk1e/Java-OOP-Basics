
public class Enemy implements Damageable{
    private int health;
    private String name;

    public Enemy(String name, int health){
        this.name = name;
        this.health  = health;
    }

    @Override
    public int getHealth(){
        return health;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return this.name;
    }

    @Override
    public void takeDamage(int amount){
        health -= amount;
        health = Math.max(health, 0);
        System.out.println("Enemy " + name + " took " + amount  + " damage");
    }
}
