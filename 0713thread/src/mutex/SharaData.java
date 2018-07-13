package mutex;

import java.util.ArrayList;

public class SharaData {
	public static ArrayList<Character> list = new ArrayList();

	// 데이터를 저장하는 메소드
	public void save(char ch) {
		list.add(ch);
		System.out.println(ch + "를 저장했습니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 리스트에서 하나를 꺼내는 메소드
	public void get() {
		char ch = list.remove(0);
		System.out.println(ch + "를 소비했습니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
