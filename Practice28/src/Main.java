import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        CryptoWallet sam = new CryptoWallet("Sam", 200);
        CreditCard ball = new CreditCard("ball", 20);
        Bank banks = new Bank();

        banks.addAccount(sam);
        banks.addAccount(ball);
        banks.showStatus();
        banks.applyAnnualFee(50);
        banks.showStatus();

        System.out.println();
        sam.printHistory();


    }


    }
