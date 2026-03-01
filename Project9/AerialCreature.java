

public class AerialCreature extends Specimen implements Reactable {
    private int wingspan;
    
    public AerialCreature(String speciesName, int energyLevel, boolean isAgressive, int wingspan){
        super(speciesName, energyLevel, isAgressive);
        this.wingspan = wingspan;
    }

    @Override
    public void reactToLight(int intensity){
        if (intensity < 20){
            System.out.println("The creature " + getSpeciesName() + " is landing to sleep.");
            setEnergyLevel(getEnergyLevel() + 20);
        }
    }



    @Override
    public void performAction(){
        System.out.println("The Creature is Soaring.");
        if (getEnergyLevel() > 50){
            System.out.println("It's gliding to save strenght.");
        }
    }

    @Override
    public void reactToSound(String soundType){
        if (soundType.equals("Whistle")){
        setEnergyLevel(getEnergyLevel() - 5);
        System.out.println("System energy levels down to: " + getEnergyLevel() + "  and it's tired from flying back.");
    } else {
        System.out.println("The creature is ignoring the noise and it's current " + wingspan + " altitude");
    }
    }

    
}
