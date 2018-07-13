package mutex;

public class Mutex implements Runnable {

	private int result;
	private int idx;

	// 처음 스레드 수행할 때 잠시 쉬는 동안 두번째 스레이드가 와서 idx+1를 수행. 그러므로 처음 스레드 result=2, 두번째 스레드
	// result=4.
	 private void sum(){

	// synchronized가 붙은 메소드는 여러 개의 스레드가 동시에 호출하더라도 하나가 종료된 후에 다시 메소드가 호출됩니다.
	//private synchronized void sum() {
		for (int i = 0; i < 10000; i++) {
			//자신이 가지고 있는 자원을 사용할 때는 이 코드 영역은 동기적으로 동작하도록 해주는 설정  
			synchronized (this) {
				idx = idx + 1;
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				result = result + idx;
			}
		}
	}

	@Override
	public void run() {
		sum();
	}

	// result 값을 가져오는 접근자 메소드
	public int getResult() {
		return result;

	}
}
