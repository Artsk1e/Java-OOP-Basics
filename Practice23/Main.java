




public class Main {
    public static void main(String[] args) {
        
        SecuritySystem sec = new SecuritySystem("1234");

        System.out.println("MasterKey: " + sec.master_key);
        sec.rebootSystem();
        
        //Doing this would cause an error.
        //Cannot assign a value to a final variable
        //sec.master_key = "0123";


    }
}
