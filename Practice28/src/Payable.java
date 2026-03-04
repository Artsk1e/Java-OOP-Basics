public interface Payable {
    boolean processPayment(double amount);
    void addfunds(double amount);
}
