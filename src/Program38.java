class P_C {

	int a;
	boolean produced;

	public synchronized void produce(int a) throws Exception { // synchronized keyword let's a single thread to access resource at a time
		
		while (produced) {
			wait(); // wait for the other threads notification
		}
		System.out.println("Produced: " + a);
		this.a = a;
		produced = true;
		notify(); // notifies the other thread to resume
	}

	public synchronized void Consume() throws Exception {
		
		while (!produced) {
			wait();
		}
		System.out.println("Consumed: " + a);
		produced = false;
		notify();
	}
}

class Producer implements Runnable {

	P_C pc;

	public Producer(P_C pc) {
		this.pc = pc;
		Thread t = new Thread(this, "Producer Thread");
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			try {
				pc.produce(++i);
				Thread.sleep(500);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {

	P_C pc;

	public Consumer(P_C pc) {
		this.pc = pc;
		Thread t1 = new Thread(this, "Consumer Thread");
		t1.start();
	}

	@Override
	public void run() {
		while (true) {
			try {
				pc.Consume();
				Thread.sleep(1000);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}

public class Program38 {

	public static void main(String[] args) {

		P_C m = new P_C();

		new Producer(m);
		new Consumer(m);
	}
}