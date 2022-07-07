import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class task implements Runnable {

	private String name;

	public task(String s) {
		this.name = s;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 15; i++) // repeats a task 15 times
			{
				if (i == 0) {
					System.out.println("Task started for --> " + name);
				} else {
					System.out.println("Task runnning for --> " + name);
				}
				Thread.sleep(1000);
			}
			System.out.println("Task Completed for --> " + name);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}

public class Program39 {

	public static void main(String[] args) {

		int threadsAllocated = 3; // Max threads available for pool
		int count = 0;

		ExecutorService pool = Executors.newFixedThreadPool(threadsAllocated); // creates the pool

		for (int j = 0; j <= 15; j++) { // creating 15 tasks

			Runnable obj = new task("Thread " + count++);
			pool.execute(obj); // executes the pool

		}
		pool.shutdown(); // shutdown the pool
	}

}
