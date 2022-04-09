
public class Program8 {

	int a;
	String b;

	Program8() { // Default Constructor-initialize automatically with default values
		a = 0;
		b = null;
		System.out.println("Inside Default constructor");
	}

	Program8(int x, String y) { // Parameterized Constructor-accepts parameters
		a = x;
		b = y;
		System.out.println("Inside Parameterized constructor");
	}

	Program8(Program8 ref) { // Copy Constructor-copies the content of a object to another object through reference
		int c = ref.a;
		String d = ref.b;
		System.out.println("Inside Copy constructor");
		System.out.println(c + "\t" + d);
	}

	private Program8(int x) { // Private Constructor-only accessible to class
		System.out.println("Inside private constructor");
		System.out.println(x);
	}

	void show() {
		System.out.print(a + "\t");
		System.out.println(b);
	}

	public static void main(String[] args) {
		Program8 p8 = new Program8();
		p8.show();
		Program8 p81 = new Program8(101, "Aaditya Dwivedi");
		p81.show();
		Program8 p82 = new Program8(p8); // Passed default constructor values to Copy Constructor
		Program8 p83 = new Program8(p81); // Passed Parameterized constructor values to Copy Constructor
		Program8 p84 = new Program8(20); // accessing private constructor only visible in this class
	}
}
