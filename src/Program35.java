class D1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;++i) {System.out.println("O.O");}
	}
}
class D2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;++i) {System.out.println("^_^");}
	}
}
class D3 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;++i) {System.out.println("$_$");}
	}
}
public class Program35{	
	
	public static void main(String[] args) {
		
		Runnable d1 = new D1();//making VAR of type Runnable (UpCasting child method to parent reference)
		Runnable d2 = new D2();
		Runnable d3 = new D3();

		Thread t1 = new Thread(d1);//passing the Runnable object to thread class
		Thread t2 = new Thread(d2);
		Thread t3 = new Thread(d3);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
}