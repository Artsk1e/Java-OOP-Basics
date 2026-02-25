
public class Game {
    public static void main(String[] args) {
        Character[] characters = new Character[3];

        characters[0] = new Warrior("Guts");
        characters[1] = new Mage("Vivi");
        characters[2] = new Warrior("Thor");

        for (Character c : characters){
            c.attack();
        }

    }
    
}
