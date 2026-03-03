

public abstract class Infrastructure {
    private final String address;
    private double energyUsage;
    private boolean isActive;

    public Infrastructure(String address, double energyUsage, boolean isActive){
        this.address = address;
        this.energyUsage = energyUsage;
        this.isActive = isActive;
    }

    public String getAddress(){
        return address;
    }

    public double getEnergyUsage(){
        return energyUsage;
    }

    public boolean isActive(){
        return isActive;
    }

    public void setEnergyUsage(double addEnergyUsage){
    if (addEnergyUsage >= 500){
        System.out.println("Warning. Energy Overload more than 500kw");
    } else {
        energyUsage += addEnergyUsage;
        System.out.println("Energy usage now at " + energyUsage);
    }
    }

    public void setActive(boolean active){
        this.isActive = active;
    }
    public abstract void performMaintenance();

}
