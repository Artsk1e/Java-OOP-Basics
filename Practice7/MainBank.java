public class MainBank {
    public static void main(String[] args) {
        BankCard james = new BankCard(1000.0, 9752);

        System.out.println("--- LANDBANK ---");
        System.out.println("Initial Balance: $" + james.getBalance());

        james.deposit(600);

        james.withdraw(100, 9999);
        james.withdraw(2000, 9752);
        james.withdraw(100, 9752);

        System.out.println("Final Balance: $" + james.getBalance());


    }
}
