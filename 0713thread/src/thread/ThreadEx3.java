package thread;

// Runnable 인터페이스를 구현한 클래스
public class ThreadEx3 implements Runnable {

	@Override
	public void run() {
		String msg = "ontheway";
		int idx = 0;
		while(true) {
			String str = "";
			for(int i=0; i<msg.length(); i++) {
				char ch = msg.charAt((idx+i)%msg.length());
				str = str + ch;
			}
			System.out.println(str);
			try {
				Thread.sleep(1000);
				idx = idx + 1;
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
