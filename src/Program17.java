class Animal {
	String name = "Pablo";
	int age = 5;

	protected void name() {
		System.out.println("Animal name: " + name);
	}

	private void smeth() { // invisible to sub classes
		System.out.println("Private Method of super class");
	}
}

class Dog extends Animal {
	void show() {
		System.out.println(name);
		name();
	}

	void age() {
		System.out.println("Age: " + age);
	}
}

class Husky extends Dog {

	void modify() {
		System.out.println(name + "\n" + age);
		name();
	}
}

interface First {
	void show();
}

interface Second {
	void show();
}

class muliplienheritance implements First, Second {

	@Override
	public void show() {
		System.out.println("Interface A and B");
	}

}

class Parent {
	String s = "Parent";

	void p() {
		System.out.println(s);
	}
}

class Child1 extends Parent {
	void c1() {
		System.out.println(s);
	}
}

class Child2 extends Parent {
	void c2() {
		System.out.println(s);
	}
}

public class Program17 {

	public static void main(String[] args) {
		System.out.println("-----------------------------\nSingle level Inheritance\n-----------------------------");
		Dog d = new Dog();
		d.show();
		System.out.println("-----------------------------\nMultilevel Inheritance\n-----------------------------");
		Husky h = new Husky();
		System.out.println(h.name + "\t" + h.age);
		h.age();
		System.out.println("-----------------------------\nMultiple Inheritance\n-----------------------------");
		muliplienheritance mul = new muliplienheritance();
		mul.show();
		System.out.println("-----------------------------\nHierarchical Inheritance\n-----------------------------");
		Child1 c1 = new Child1();
		c1.p();
		c1.c1();
		Child2 c2 = new Child2();
		c2.p();
		c2.c2();
	}
}
