//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String [] args){
        Warrior warrior = new Warrior("Steve");
        Enemy enemy = new Enemy("Herobrine", 20);
        WoodDoor woodDoor = new WoodDoor("Wood Door",15);

        warrior.attack(enemy);
        warrior.attack(woodDoor);

        System.out.println("Herobrine's Health: " + enemy.getHealth());
        System.out.println("Door Wood Health: " + woodDoor.getHealth());
    }
}

