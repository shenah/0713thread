package thread;

public class ThreadEx4 implements Runnable {
	private String name;
	public ThreadEx4(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		// 일정한 주기를 가지고 반복해서 수행할 만한 내용
		//1초마다 name을 출력하는 작업을 10번 수행
		for(int i=0; i<10;i++) {
			System.out.println(name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("스레드 종료");
				return;
			}
		}
		
	}

}
