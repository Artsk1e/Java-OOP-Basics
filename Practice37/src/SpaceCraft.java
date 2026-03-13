public abstract class SpaceCraft {
    private String shipName;
    private int fuelLevel;

    public SpaceCraft(String shipName, int fuelLevel){
        this.shipName = shipName;
        this.fuelLevel = fuelLevel;
    }

    public String getShipName(){
        return shipName;
    }

    public int getFuelLevel() {
         return fuelLevel;
    }

    public abstract void performMission();

}
