

public class MainRoom {
    public static void main(String[] args) {
        SmartBulb bright = new SmartBulb(2);

        bright.getBrightness();
        bright.setBrightness(9);
        bright.setBrightness(15);
        bright.setBrightness(1);
        bright.setBrightness(20);
    }
    
}
