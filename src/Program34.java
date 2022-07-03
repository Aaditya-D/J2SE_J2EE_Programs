class C1 extends Thread {
	@Override
	public void run() { // Thread execution starts from here
		for (int i = 0; i < 5; ++i) {
			System.out.println("Thread 1 Running......");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

class C2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; ++i) {
			System.out.println("Thread 2 Running......");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

class C3 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; ++i) {
			System.out.println("Thread 3 Running......");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

public class Program34 {

	public static void main(String[] args) {

		C1 c1 = new C1();
		C2 c2 = new C2();
		C3 c3 = new C3();

		c1.setName("Thread 1");
		c1.start(); // Calls the run method of Thread
		c2.setName("Thread 2");
		c2.start();
		c3.setName("Thread 3");
		c3.start();

	}
}
