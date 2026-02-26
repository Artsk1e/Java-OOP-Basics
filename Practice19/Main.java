

public class Main {
    public static void main(String[] args) {
        Flyable[] sky = new Flyable[2];

        sky[0] = new Bird();
        sky[1] = new Plane();

        System.out.println("--- Air Traffic Control: All units Take Off! ---");

        for (Flyable m : sky){
            m.takeOff();
        }
    }
}
