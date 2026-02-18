class LightBulb{
    String roomName;
    boolean isOn;

    //Constructor
    LightBulb(String roomName, boolean isOn) {
        this.roomName = roomName;
        this.isOn = false;
    }

    void switchOn() {
        isOn = true;
        System.out.println("The " + roomName + " light is now ON.");
    }

    void switchOff(){
        isOn = true;
        System.out.println("The " + roomName + " light is now Off");
    }

    void status(){
        if (isOn == true){
        System.out.println("The " + roomName + " is on");
        } else {
            System.out.println("The " + roomName + " is Off");
        }
    }
}

public class SmartHome {
    public static void main(String[] args) {
        
    
    LightBulb room1 = new LightBulb("Room 1", true);

    room1.switchOff();
    room1.switchOn();
    room1.status();
    room1.switchOff();
    room1.status();
    }
}
