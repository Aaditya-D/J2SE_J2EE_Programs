class a {

	a() {		//Default Constructor
		System.out.println("Parent class constructor called");
	}

	a(String var) {		//Parameterized Constructor
		System.out.println("Inside Parent class parametrized constructor " + var);
	}

	String s = "Parent field ";
	String s1 = "Variable";

	void concat() {
		System.out.println("Inside Parent method " + s + s1);
	}
}

class b extends a {

	b() {
		// super(); //Default constructor call to parent class (Can be achieved both Implicitly and Explicitly)
		super("\\_0-0_/"); // Calling parent Parameterized constructor
		System.out.println("Child class constructor called");
	}

	String s = "Child field ";
	String s1 = "Variable";

	void concat() {
		System.out.println("Inside Child method " + s + s1);
	}

	void show() {
		System.out.println(s + "-" + "- " + s1);
		System.out.println(super.s + "-" + "- " + super.s1); // accessing parent fields
		super.concat(); // accessing parent method
	}
}

public class Program9 {

	public static void main(String[] args) {
		b ref = new b();
		ref.concat();
		ref.show();
	}
}
