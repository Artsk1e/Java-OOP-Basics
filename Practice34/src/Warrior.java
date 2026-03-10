public class Warrior extends Hero{

    public Warrior(String name){
        super(name);
    }

    @Override
    public void attack(Damageable target) {
        target.takeDamage(10);
        System.out.println(getName() + " is attacking " + target + " with a damage of " + target.getHealth());
    }

    }

