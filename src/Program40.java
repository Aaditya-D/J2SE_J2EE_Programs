class Task {

    private int a = 0;

    public Task(int a) {
        this.a = a;
    }

    synchronized void perform() { // Synchronized Method
        for (int i = 1; i <= 10; i++) {
            System.out.println(a * i);
        }
        System.out.println("Thread Completed Task...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void display() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + "--> Non Synchronized Task");
        }

        synchronized (this) { // Synchronized Block
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread " + Thread.currentThread().getName() + " :: " + a * i);
            }
            System.out.println("Synchronized Task Completed...");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + "--> Non Synchronized Task");
        }
    }
}

class Thread0 implements Runnable {

    Task T;

    public Thread0(Task t) {
        T = t;
    }

    @Override
    public void run() {
        T.perform(); // implemments Method synchronization
        T.display(); // implemments Block synchronization
    }

}

public class Program40 {

    public static void main(String[] args) throws InterruptedException {
        Task task = new Task(5);
        Runnable t0 = new Thread0(task);
        Thread T0 = new Thread(t0, "Zero");
        Thread T1 = new Thread(t0, "One");
        T0.start();
        T1.start();
        System.out.println("All Processes has been Completed...");
    }

}
