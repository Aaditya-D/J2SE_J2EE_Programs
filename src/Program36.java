public class Program36 {

	public static void main(String[] args) {

		Runnable d1 = () -> { // Runnable interface implemented using anonymous class and lambda Expressions
			for (int i = 0; i <= 5; ++i) {
				System.out.println("Thread 1 !!!");
			}
		};
		
		Runnable d2 = () -> {
			for (int i = 0; i <= 5; ++i) {
				System.out.println("Thread 2 !!!");
			}
		};
		
//		Runnable d3 = () -> {
//			for (int i = 0; i <= 5; ++i) {
//				System.out.println("Thread 3 !!!");
//			}
//		};

		Thread t1 = new Thread(d1);// passing the Runnable object to thread class
		Thread t2 = new Thread(d2);

		Thread t3 = new Thread(() -> { // can also be written as by passing the value of d3 in Thread Constructor
			for (int i = 0; i <= 5; ++i) {
				System.out.println("Thread 3 !!!");
			}
		});

		t1.start();
		t2.start();
		t3.start();
	}

}
