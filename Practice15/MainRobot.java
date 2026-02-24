

public class MainRobot {
    public static void main(String[] args) {
        
        Robot r1 = new CleanerRobot("Dazz");
        Robot r2 = new SecurityRobot("John");

        r1.work();
        r2.work();
    }
    
}
