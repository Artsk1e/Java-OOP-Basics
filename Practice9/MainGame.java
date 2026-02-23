

public class MainGame {
    public static void main(String[] args) {
        GameCharacter duke = new GameCharacter(100);

        duke.getHealth();
        duke.takeDamage(50);
        duke.getHealth();
        duke.takeDamage(69);
        duke.revive();
        duke.heal(50);
    }
    
}
