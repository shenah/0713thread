package mutex;

import java.util.ArrayList;

public class Customer extends Thread {
	private SharaData sharadata;

	// 생성자
	public Customer(SharaData sharedata) {
		this.sharadata = sharadata;
	}
	
	//스레드를 수행할 메소드
	public void run() {
	}

}
