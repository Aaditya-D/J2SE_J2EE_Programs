import java.util.Arrays;
import java.util.List;

class genClass<T> { 		// Generic Class
	T obj; 		// Object of Type T is created

	public genClass(T obj) {	 // Constructor with type T
		super();
		this.obj = obj;
	}

	public T display() {
		return this.obj;
	}
}

class genClassM<T, P> { 		// Generic parameterized Class
	T obj;
	P obj1;

	public genClassM(T obj, P obj1) {		 // Constructor with type T and type P
		super();
		this.obj = obj;
		this.obj1 = obj1;
	}

	public void display() {
		System.out.println(this.obj);
		System.out.println(this.obj1);
	}
}

public class Program21 {

	static <T> void genFunc(T element) {		 // Generic Method
		System.out.println(element.getClass().getName() + " = " + element);
	}

	static <E> void genFunct(E[] element) { 	
		for (E var : element) {
			System.out.println(var);
		}
		System.out.println();
	}

	public static void display(List<?> list) 		// Generic WildCard
	{
		for (Object var : list) {
			System.out.println(var);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		genClass<Integer> g1 = new genClass<Integer>(500);
		System.out.println(g1.display());
		genClass<String> g2 = new genClass<String>("Hello There !!!");
		System.out.println(g2.display());
		System.out.println("----------------------------------------------------------");
		genClassM<String, Integer> gm1 = new genClassM<>("How Are You", 2000);
		gm1.display();
		System.out.println("----------------------------------------------------------");
		genFunc("Wonderful !");
		genFunc(1000);
		genFunc(0.1);
		Integer[] arr = { 10, 20, 30, 40, 50 };
		genFunct(arr);
		Character[] Array = { 'J', 'A', 'V', 'A' };
		genFunct(Array);
		System.out.println("----------------------------------------------------------");
		List<Integer> l1 = Arrays.asList(10, 20, 30);
		display(l1);
		List<String> l2 = Arrays.asList("Hello !", "How Are You !", "Thank You !");
		display(l2);
	}
}
