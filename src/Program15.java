abstract class Bike { // Abstract class
	void wheels() { // Regular method
		int wheels = 2;
		System.out.println("wheels: " + wheels);
	}

	abstract void brake(); // Abstract method
}

class SportBike extends Bike {

	@Override
	void brake() {
		String brake = "Disc brakes";
		System.out.println("Bike: Sports Bike");
		System.out.println("Brakes: " + brake);
	}

}

class MountainBike extends Bike {

	@Override
	void brake() {
		String brake = "Mountain Bike brakes";
		System.out.println("Bike: Mountain Bike");
		System.out.println("Brakes: " + brake);
	}

}

public class Program15 {
	public static void main(String[] args) {
		SportBike sb = new SportBike();
		sb.wheels();
		sb.brake();
		MountainBike mb = new MountainBike();
		mb.wheels();
		mb.brake();

	}
}