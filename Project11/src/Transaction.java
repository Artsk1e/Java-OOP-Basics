public abstract class Transaction {
    protected final String id;
    protected double amount;
    private boolean isProcessed = false;

    public Transaction(String id, double amount){
        this.id = id;
        this.amount = amount;
    }

    public void displayDetails(){
        System.out.println("ID: " + id);
        System.out.println("Balance: " + amount);
        System.out.println("Status: " + (isProcessed ? "Success" : "Pending/Refunded"));
    }

    public String getId(){
        return id;
    }

    public void setProcessedStatus(boolean status) {
        this.isProcessed = status;
    }

    public double getAmount(){
        return amount;

    }

    public abstract boolean validate();
}
