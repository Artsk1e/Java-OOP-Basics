
public class Boss extends Enemy{
    private int armor;

    //Constructor
    public Boss(String name, int hp, int armor) {
        super(name, hp);
        this.armor = armor;
        }

    //Method
    public void ultimateMove(){
        System.out.println(name +" uses World Destroyer with " + armor + " armor!");
    }
}
