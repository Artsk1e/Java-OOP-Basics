import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        ArrayList<BaseWallet> w =  new ArrayList<>();

        w.add(new CreditCard("Art", 3000));
        w.add(new CryptoWallet("John", 200.10));

        for (BaseWallet b : w){
            if(b.processPayment(100)){
                System.out.println("Payment Success full.");
                System.out.println("New balance: " + b.getBalance());
            }else {
                System.out.println("Insufficient Funds");
            }
        System.out.println("-------------------------------------------");
    }


    }
}