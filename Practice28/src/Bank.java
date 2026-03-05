import java.util.ArrayList;

public class Bank {
    private ArrayList<BaseWallet> bank = new ArrayList<>();

    public void addAccount(BaseWallet wallet){
        bank.add(wallet);
        System.out.println("Account added for: " + wallet.getOwner());
    }

    public void applyAnnualFee(double fee){
        System.out.println("\n ---Applying Annual Fee: $" + fee + " ---");
        for (BaseWallet w : bank){
            boolean success = w.processPayment(fee);
            if (success){
                System.out.println("Fee collected from " + w.getOwner());
            }else {
                System.out.println("Failed: Insufficient funds for: " +  w.getOwner());
            }
        }

    }

    public void showStatus(){
        System.out.println("\n=== BANK STATUS ===");
        for (BaseWallet w : bank) {
            System.out.printf("Owner: %-10s | Balance: $%.2f%n", w.getOwner(), w.getBalance());

    }
    }


}

