

public class Paladin extends BaseUnit implements Attacker, Healer{
    public Paladin(String unitName, int health){
        super(unitName, health);
    }

    @Override
    public void attack(){
        System.out.println("Paladin Attacks!");
    }
    
    @Override
    public void heal(){
        System.out.println("Paladin Heals!");
    }
}
