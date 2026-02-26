

public class Medic extends BaseUnit implements Healer {
    public Medic(String unitName, int health){
        super(unitName, health);
    }

    @Override
    public void heal(){
        System.out.println(unitName + " Medic Heal!");
    }
    
}
