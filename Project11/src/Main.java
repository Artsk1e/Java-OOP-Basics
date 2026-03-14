import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

	public static void main(String[] args) {
		ArrayList<Transaction> queue = new ArrayList<>();

		queue.add(new CreditCard("John", 1200));
		queue.add(new CryptoPayment("Jake", 500, "diqwdihqwid"));
		queue.add(new WireTransfer("Bob", 3000));

		PaymentProcessor engine = new PaymentProcessor();
		engine.runBatch(queue);
		}
	}

