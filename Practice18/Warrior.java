

public class Warrior extends Character {
    public Warrior(String name){
        super(name);
    }

    @Override
    public void attack(){
        System.out.println(name + " swings a massive sword");
    }
}
