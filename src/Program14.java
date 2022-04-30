public class Program14 {

	public static void main(String[] args) {

		Encap p1 = new Encap();
		p1.setAge(22);// accessing method to change private field value
		p1.setName("Aaditya");
		p1.setNumber(100);
		System.out.println("Name: " + p1.getName() + "\nAge: " + p1.getAge() + "\nNumber: " + p1.getNumber());
	}

}

class Encap {

	private int age;
	private int number;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}