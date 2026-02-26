

public class Soldier extends BaseUnit implements Attacker {
    
    public Soldier(String unitName, int health){
        super(unitName, health);
    }

    @Override
    public void attack(){
        System.out.println("Soldier attack!");
    }
}
