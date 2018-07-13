package thread;

import java.util.Random;

public class ThreadEx2 extends Thread {

	@Override
	public void run() {
		//빨강 파랑 노랑을 랜덤하고 1초마다 출력하기
		String [] color = {"빨강", "노랑", "파랑"};
		Random r = new Random();
		//무한 반복
		while(true) {
			System.out.println(color[r.nextInt(color.length)]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
