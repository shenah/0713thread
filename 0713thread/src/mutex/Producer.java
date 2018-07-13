package mutex;

import java.util.ArrayList;

public class Producer extends Thread {

	private SharaData sharadata;

	// 생성자
	public Producer(SharaData sharedata) {
		this.sharadata = sharadata;
	}

	// 스레드로 동작할 메소드
	public void run() {

	}
}