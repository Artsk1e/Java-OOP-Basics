

public class ResidentialBuilding extends Infrastructure implements Powerable {
    private  int residentCount;
    
    public ResidentialBuilding(String address, int energyUsage, boolean isActive, int residentCount){
        super(address, energyUsage, isActive);
        this.residentCount = residentCount;
    }

    @Override
    public void adjustVoltage(int volts){
        if (volts > 240){
            setActive(false);
            System.out.println("Power surge at " + getAddress() + "! Fuses blown. " + residentCount + " residents are in the dark.");
        } else {
            System.out.println("Voltage stable at " + getAddress() + ". Lights are flickering slightly.");
        }
    }

    @Override
    public boolean isEmergencyMode(){
        return !isActive();
        }
    

    @Override
    public void performMaintenance(){
        System.out.println("Electrician is checking the wiring for " + residentCount + " units.");
        if (isActive() == false){
            setActive(true);
        }
    }

}
