package mutex;

public class SyncMain {

	public static void main(String[] args) {
		Producer p = new Producer(null);
		Customer c = new Customer(null);
		
		p.start();
		c.start();

	}

}
