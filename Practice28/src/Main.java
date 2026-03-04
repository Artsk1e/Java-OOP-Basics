

public class Main {
    public static void main(String [] args){
        CryptoWallet sam = new CryptoWallet("Sam", 200);

        System.out.println("Name: " + sam.getOwner());
        System.out.println("Balance: $" + sam.getBalance());
        sam.addfunds(50);
        sam.processPayment(100);
        sam.processPayment(20);

        System.out.println("Final Balance: $" + sam.getBalance());
        sam.printHistory();

        System.out.println("-------------------------------------------");
    }


    }
