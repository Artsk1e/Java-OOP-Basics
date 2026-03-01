

public abstract class Specimen {
    private String speciesName;
    private int energyLevel;
    private boolean isAgressive;

    public Specimen(String speciesName, int energyLevel, boolean isAgressive){
        this.speciesName = speciesName;
        this.energyLevel = energyLevel;
        this.isAgressive = isAgressive;
    }

    public String getSpeciesName(){
        return speciesName;
    }

    public int getEnergyLevel(){
        return energyLevel;
    }
    public boolean IsAgressive(){
        return isAgressive;
    }

    public void setEnergyLevel(int energy){
        if (energy > 100){
            this.energyLevel = 100;
            System.out.println("Max Energy! Energy: " + this.energyLevel);
        } else if (energy < 0) {
            this.energyLevel = 0;
            System.out.println(speciesName + " is exhausted");
            
        } else {
            this.energyLevel = energy;
        }
    }

    public void setIsAgressive(boolean agressive){
        this.isAgressive = agressive;
    }

    public abstract void performAction();

}

