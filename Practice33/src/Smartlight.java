public class Smartlight implements Toggleable {
    String roomName;

    public Smartlight(String roomName){
        this.roomName = roomName;
    }

    public void turnOn(){
        System.out.println(getRoomName()+  " Turning on");
    }
    public void turnOff(){
        System.out.println(getRoomName() + " Turning Off");
    }

    public String getRoomName(){
        return roomName;
    }
}
