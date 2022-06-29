import java.io.Serializable;

class Bean { // Outer class

	class PojoClass { // inner member class

		public String name;
		public int age;
		private double salary;

		public PojoClass(String name, int age, double salary) { // field initialization using args-constructor
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "PojoClass [name=" + name + ", age=" + age + ", salary=" + salary + "]";
		}
	}

	static class BeanClass implements Serializable { // static inner class
		// only private fields
		private String name;
		private int age;
		private double salary;

		public BeanClass() { // no args-constructor

		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "BeanClass [name=" + name + ", age=" + age + ", salary=" + salary + "]";
		}

	}
}

public class Program28 {

	public static void main(String[] args) {

		Bean b = new Bean(); // Outer class object
		Bean.PojoClass pc = b.new PojoClass("Aaditya", 22, 9999999); // inner class object creation
		pc.getName();
		pc.setAge(23);
		pc.name = "Aaditya Dwivedi";
		System.out.println("Values of " + pc.toString()); // printing bean values

		Bean.BeanClass bc = new Bean.BeanClass(); // inner static class object creation
		bc.setName("Aaditya");
		bc.setAge(22);
		System.out.println("Values of " + bc.toString());
	}
}
