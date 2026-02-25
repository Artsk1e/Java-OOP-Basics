

public class Mage extends Character {
    public Mage(String name){
        super(name);
    }

    @Override
    public void attack(){
        System.out.println(name + " casts a fireball");
    }
}
