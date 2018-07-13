package mutex;

public class MutexMain {

	public static void main(String[] args) {
		Mutex mutex = new Mutex();
		Thread th1 = new Thread(mutex);
		th1.start();
		Thread th2 = new Thread(mutex);
		th2.start();
		//25초 후 mutex의 result 값 확인
		try {
			Thread.sleep(30000);
			System.out.println(mutex.getResult());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
