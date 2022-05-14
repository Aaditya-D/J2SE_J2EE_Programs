interface human{
	
	String name = "Aaditya";	//By default public, static and final
	int age = 22;
	
	void hobbies();			//By default public and abstract
	void skills();
	void language();
	
	default void defaultmeth() {	//default method
		System.out.println("Nationality: Indian");
	}
	
	static void statitcmeth() {		//Static method
		System.out.println("Static method called");
	}
}


public class Program16 implements human {

	public static void main(String[] args) {
		Program16 p16 = new Program16();
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		p16.hobbies();
		p16.skills();
		p16.language();
		p16.defaultmeth();
		human.statitcmeth();
	}

	@Override
	public void hobbies() {
		System.out.println("Hobbies: Coding");
	}

	@Override
	public void skills() {
		System.out.println("Skills: Java");		
	}

	@Override
	public void language() {
		System.out.println("Language: English");
	}
	
//	public void defaultmeth() {		//method will override the default method inside interface 
//		System.out.println("Nationality: INDIAN");
//	}

}
