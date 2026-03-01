
public class SecuritySystem {
    final String master_key;

    public SecuritySystem(String master_key){
        this.master_key = master_key;
    }

    public final void rebootSystem(){
        System.out.println("System is restarting...");
    }
}
