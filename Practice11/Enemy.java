
public class Enemy {
    protected String name;
    protected int hp;

    public Enemy(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void attack(){
        System.out.println(name + " attacks for 10 damage!");
    }
}
