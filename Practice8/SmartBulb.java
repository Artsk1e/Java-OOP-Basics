

public class SmartBulb {
    private int brightness;

    //Constructor
    public SmartBulb(int brightness) {
        this.brightness = brightness;
    }

    //Getter
    public int getBrightness(){
        System.out.println("Current Brightness: " + brightness);
        return brightness;
    }

    //Setter
    public void setBrightness(int newBrightness){
        if (brightness > 0 && brightness <= 10){
            brightness = newBrightness;
            System.out.println("Brightness: " + newBrightness);
        }  else {
            System.out.println("BLACKOUT");
        }
            
        }
    }

    

