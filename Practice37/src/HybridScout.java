public class HybridScout extends SpaceCraft implements Cargo, Combat {
    private boolean weaponsReady = false;
    public HybridScout(String shipName, int fuelLevel){
        super (shipName, fuelLevel);
    }

    @Override
    public void performMission(){
        System.out.println(getShipName() + " is scouting deep.");
    }
    @Override
    public void loadCargo(int weight){
        System.out.println(getShipName() +  " stashed " + weight + " tons of supplies.");
    }

    @Override
    public void armWeapons(){
        this.weaponsReady = true;
        System.out.println(getShipName() + " weapons systems: ONLINE");
    }
}
