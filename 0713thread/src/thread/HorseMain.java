package thread;

public class HorseMain {

	public static void main(String[] args) {
		Horse horse1 = new Horse();
		Horse horse2 = new Horse();
		Horse horse3 = new Horse();
		
		horse1.start();
		horse2.start();
		horse3.start();

		

	}

}
