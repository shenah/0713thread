package thread;

public class ThreadMain3 {

	public static void main(String[] args) {
		ThreadEx3 th = new ThreadEx3();
		Thread obj = new Thread(th);
		obj.start();

	}

}
