
public class AquaticCreature extends Specimen implements Reactable{
    private int depthLimit;

    public AquaticCreature(String speciesName, int energyLevel, boolean isAgressive, int depthLimit){
        super(speciesName, energyLevel, isAgressive);
        this.depthLimit = depthLimit;
    }

    @Override
    public void reactToLight(int intensity){
        if (intensity > 80){
            setEnergyLevel(getEnergyLevel() - 10);
            System.out.println("Energy Drops to: " + getEnergyLevel());
        } else {
            System.out.println("It's Enjoying Surface Lgiht");
        }
    }

    @Override
    public void performAction(){
        System.out.println(getSpeciesName()+ " is patrolling the tank");
        System.out.println("Current depth Limit: " + depthLimit);
        if (IsAgressive() == true){
            System.out.println(getSpeciesName() + " is banging the glass and showing its teeth");
        } else if (getEnergyLevel() > 80){
            System.out.println(getSpeciesName() + " is very playful"); 
        } else {
            System.out.println(getSpeciesName()+ " is just floating in the tank");
        }
    }

    @Override
    public void reactToSound(String soundType){
        if (soundType.equals("Sonar")){
            System.out.println("The creature(" + getSpeciesName() + ") is agitated");
            setIsAgressive(true);
        }
    }


}
