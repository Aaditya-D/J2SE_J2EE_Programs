/*
 * Lambda Expression can only be used with Functional Interface(which has only a single method)
 */

interface A {
	public void show();
}

interface B {
	public void show(String name);
}

interface C {
	public int add(int a, int b);
}

public class Program33 {

	public static void main(String[] args) {

		A obj = new A() {// Without Lambda Implementation
			@Override
			public void show() {
				System.out.println("Normal Annonymous Class");
			}
		};
		obj.show();

		B obj2 = new B() {// Without Lambda Implementation
			@Override
			public void show(String name) {
				System.out.println("Name: " + name);
			}
		};
		obj2.show("Aaditya");

		C obj4 = new C() {// Without Lambda Implementation
			@Override
			public int add(int a, int b) {
				int sum = a + b;
				System.out.println("Sum of two number: " + sum);
				return sum;
			}
		};
		obj4.add(25, 75);

		
		A obj1 = () -> System.out.println("Lambda Expression");// With Lambda Implementation
		obj1.show();
		
		B obj3 = (String name) -> System.out.println("Name: " + name);// With Lambda Implementation
		obj3.show("Aaditya Dwivedi");
		
		C obj5 = (a, b) -> (a + b);
		System.out.println("Sum of two number: " + obj5.add(50, 80)); // With Lambda Implementation

	}

}
