class animation {

	public void render() {
		System.out.println("Rendering ...");
	}

	public void render(Object a) {
		System.out.println("Rendering Object a...");
	}

	public void render(Object a, Object b) {
		System.out.println("Rendering Object a and b...");
	}
}

class Vehicle {
	public void displayInfo() {
		System.out.println("I am a Vehicle...");
	}
}

class Electric extends Vehicle {
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("I am an Electric Vehicle...");
	}
}

public class Program18 {
	public static void main(String[] args) {
		System.out.println("-----------------------------\nMethod Overloading\n-----------------------------");
		animation an = new animation();
		an.render();
		an.render(an);
		an.render(an, null);
		System.out.println("-----------------------------\nMethod Overriding\n-----------------------------");
		Electric a = new Electric();
		a.displayInfo();
		
	}
}
