public class DVD extends Media implements Physical{
    private int minutes;

    public DVD(String mediaName, int id, int minutes){
        super(mediaName, id);
        this.minutes = minutes;
    }

    @Override
    public void borrowItem(){
        if (getHealth() > 0){
            System.out.println(getMediaName() + " borrowed.");
        } else {
            System.out.println("Can't borrow! too damage.");
        }
    }

    @Override
    public void returnItem(){
        System.out.println(getMediaName() + " is returned.");
    }

    @Override
    public void takeDamage(int amount) {
        System.out.println("The DVD is cracked!");
        reduceHealth(50);
    }

    @Override
    public void displayInfo() {
        System.out.println("Item Name: " + getMediaName() + " id: " + getId());
    }
}
