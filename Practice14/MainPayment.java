public class MainPayment {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(100);
        Payment p2 = new GcashPayment(100);

        p1.authorize();
        p2.authorize();
    }
}
