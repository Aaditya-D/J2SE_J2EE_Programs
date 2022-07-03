public class Program37 {

	public static void main(String[] args) throws Exception {

		Thread t0 = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Value of i: " + i);
				Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // set current threads priority as MAX
			}
		}, "000");
		Thread t1 = new Thread(() -> {
			for (int j = 0; j <= 5; j++) {
				System.out.println("Value of J: " + j);
				Thread.currentThread().setPriority(Thread.MAX_PRIORITY); // set current threads priority as MIN
			}
		}, "111");

		System.out.println("Thread " + t0.getName() + " state:  " + t0.getState());
		t0.start();
		Thread.sleep(100);
		System.out.println(t0.getId());
		System.out.println(t0.getName());
		System.out.println(t0.getPriority());
		System.out.println(t0.isAlive());
		System.out.println(t0.isDaemon());
		t0.join();
		System.out.println("Thread " + t0.getName() + " state:  " + t0.getState());
		
		System.out.println("Thread " + t1.getName() + " state:  " + t1.getState());
		t1.start();
		Thread.sleep(100);
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isAlive());
		System.out.println(t1.isDaemon());
		t1.join();
		System.out.println("Thread " + t1.getName() + " state:  " + t1.getState());
		System.out.println("Have a nice day");
	}

}
