
public class GameCharacter {
    private int health;

    //Constructor
    GameCharacter(int health){
        this.health = health;
    } 

    //Setter
    public void takeDamage(int damage){
        health -= damage;
        if (health > 0){
            System.out.println("New Health: " + health + " damage.");
        } else {
            health = 0;
            System.out.println("You took " + damage + " damage");
            System.out.println("Wasted");
            System.out.println("New Health: " + health);
        }
        }
    
        //Getter
    public void getHealth(){
        System.out.println("Current Health: " + health);
    }

    //Revive
    public void revive(){
        if (health == 0){
            health = 25;
            System.out.println("You fucking revived dude!");
            System.out.println("Current Health: " + health);
        } else {
            System.out.println("Cant Revive Yet nigga you are still alive");
        }
    }

    public void heal(int heal){
        health += heal;
        if(health > 100 ){
            health = 100;
            System.out.println("Max heal! Current Health: " + health);
        } else {
            System.out.println("Current Health: " + health);
        }
    }
    }
