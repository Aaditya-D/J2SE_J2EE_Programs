
public class Program11 {

	public Program11() {
//		this(20);
		System.out.println("default constructor of Parent Class");
	}

	public Program11(int a) {
		this(a, "Constructor Chaining");
		System.out.println("single parameter constructor of parent class");
	}

	public Program11(int a, String b) {
		System.out.println(a + "\t" + b);
		System.out.println("multiparameter construtor of parent class");
	}

	public static void main(String[] args) {
//		new Program11(555,"hello");
		new conc(2000, "(^_^)"); // At first,Default Constructor from base class will be executed if parameterized constructor is not called explicitly
	}

}

class conc extends Program11 {

	public conc() {
//		super();	//By default calls the parent class, implicitly added super()
		System.out.println("default constructor of child Class");
	}

	public conc(int a, String b) {
//		super();	//by default added
		super(a);	//explicitly calling single parameterized constructor of base class
		System.out.println("multiparameter constructor of child class : " + a + "\t" + b);
	}

	public conc(int a) {
//		super();	//by default added
		super(a, "Hi"); // explicitly calling parameterized constructor of base class
		System.out.println("single parameter constructor of child class: " + a);
	}

}
