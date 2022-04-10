
public class Program10 {

	int a;
	Program10(){
		this(5000);		//calls the parameterized constructor
		System.out.println("Default called");
	}
	Program10(int a) {
//		this();					//calls the default constructor
		this.a=a;				//refers to instance variable 
		System.out.println(this.a);
		System.out.println(this);		//holds same address as the class's object
	}

	public static void main(String[] args) {
		Program10 p10 = new Program10(2000);
		System.out.println(p10);
		Program10 p101 = new Program10();

	}

}
