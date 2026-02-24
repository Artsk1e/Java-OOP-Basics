public class MainGame {
    public static void main(String [] args){

        //Create Regular Enemy
        Enemy goblin = new Enemy("Goblin" , 10);
        
        //Creating Boss
        Boss dragon = new Boss("Ender Dragon" , 50, 20);

        goblin.attack();
        dragon.attack();
        dragon.ultimateMove();
    }
}
