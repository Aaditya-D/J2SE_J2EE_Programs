public class Program32 {// Outer Class(main)

	class anonymousDemo {// Nested Inner Class

		String s = "I'm a Field Variable";

		public void anonymousClassMethod() {
			System.out.println("Just another method ...");
		}
	}

	interface demo {
		public void editable();
	}

	public static void main(String[] args) {

		Program32 p32 = new Program32();// accessing outer class(main)
		Program32.anonymousDemo aD = p32.new anonymousDemo()// accessing nested inner class
		{ // creating anonymous class
			@Override
			public void anonymousClassMethod() {
				System.out.println(s);
				System.out.println("Inside Anonymous Class !!!");
			}
		};
		aD.anonymousClassMethod();// calling overridden method

		Program32.demo Ad = new demo()// accessing the interface
		{
			public void editable() {
				System.out.println("Inside Anonymous Class (through interface) !!!");
			}
		};
		Ad.editable();
	}
}
