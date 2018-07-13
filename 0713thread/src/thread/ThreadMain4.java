package thread;

public class ThreadMain4 {

	public static void main(String[] args) {
		ThreadEx4 obj1 = new ThreadEx4("스레드1");
		ThreadEx4 obj2 = new ThreadEx4("스레드2");
		Thread th1 = new Thread(obj1);
		Thread th2 = new Thread(obj2);

		// 스레드 우선순위 변경 - 확률이 높지 정확하진 않다.
		th1.setPriority(Thread.MAX_PRIORITY);
		th2.setPriority(Thread.MIN_PRIORITY);
		// 스레드 생성
		th1.start();
		th2.start();
		
		try {
			Thread.sleep(3000);
			th1.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
