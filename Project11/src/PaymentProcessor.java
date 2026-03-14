import java.util.ArrayList;

public class PaymentProcessor {

    public void runBatch(ArrayList<Transaction> batch){
        for(Transaction transaction : batch){
            System.out.println("\nChecking Transaction: " + transaction.id);

            if(transaction.validate()){
                if(transaction instanceof International){
                    ((International) transaction).convertCurrency(0.92);
                }
                transaction.setProcessedStatus(true);
                System.out.println("Result: PAYMENT APPROVED!");
            } else {
                System.out.println("Result: PAYMENT DENIED");
            }

            if (transaction instanceof Refundable){
                ((Refundable) transaction).refund();
            }
            transaction.displayDetails();
        }
    }
}
