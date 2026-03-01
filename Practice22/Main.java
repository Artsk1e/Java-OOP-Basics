

public class Main {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount(123456, 200);

        System.out.println("Account: " + myAcc.account_number);

        //You cannot assign a final variable here and it shows an error.
        //myAcc.account_number = 12394;
        System.out.println("Balance: " + myAcc.balance);
    }
}
