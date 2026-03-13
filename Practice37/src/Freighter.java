public class Freighter extends SpaceCraft implements Cargo {

    public Freighter(String shipName, int fuelLevel){
        super(shipName, fuelLevel);
    }

    @Override
    public void loadCargo(int weight) {
        System.out.println(getShipName() + " loaded " + weight);
    }

    @Override
    public void performMission(){
        System.out.println(getShipName() + " is hauling ore.");
    }
}
