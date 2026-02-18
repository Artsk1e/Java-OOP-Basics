class CoffeeCard {
    String ownerName;
    double balance;

    CoffeeCard(String ownerName, double balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }

    //Method 1 is to buy Coffee
    void buyCoffee(double price){
        if (balance >= price){
            balance -= price;
            System.out.println("Enjoy your Coffee, " +ownerName);
        } else {
            System.out.println("Declined! Please top up your card");
        }
    }

    void topUp(double amount){
        balance += amount;
        System.out.println("Current Balance is: " + this.balance);
    }
}




public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeCard jay = new CoffeeCard("Jay" , 50.15);


        jay.buyCoffee(14);
        jay.buyCoffee(50);
        jay.topUp(20);
        jay.buyCoffee(50);
    }
}
