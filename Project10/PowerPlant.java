

public class PowerPlant extends Infrastructure implements Powerable{
    private String fuelType;

    public PowerPlant(String address, double energyUsage, boolean isActive, String fuelType){
        super(address, energyUsage, isActive);
        this.fuelType = fuelType;
    }

    @Override
    public void adjustVoltage (int volts){
     if(volts > 100){
        System.out.println("Brownout Detected! " + fuelType + " plant is increasing output.");
        setEnergyUsage(50);
        System.out.println("Energy usage now at " + getEnergyUsage());
        
     } else {
        setEnergyUsage(5);
        System.out.println("Voltage adjusted at " + volts + " volts. Energy Usage increased by 5 and now at " + getEnergyUsage() + " kW.");
     }   
    }

    @Override
    public boolean isEmergencyMode(){
        return fuelType.equals("Nuclear") && getEnergyUsage() > 1000;
    }

    @Override
    public void performMaintenance(){
        System.out.println("Performing safety sweep on " + fuelType + " reactor at " + getAddress());
        if (fuelType.equals("Nuclear")){
            System.out.println("Warning: High-level radiation gear required!");
        }
    }
}
