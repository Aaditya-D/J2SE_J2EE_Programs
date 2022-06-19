import java.util.*;

public class Program23 {

	static void arrayList(String[] a) {
		List<String> L = new ArrayList<String>(Arrays.asList(a)); // ArrayList Declaration
//		Collections.addAll(L,a);
		System.out.println("Value inside ArrayList: " + L);
		L.add("6");
		L.add("7");
		L.add("8");
		System.out.println("Value of ArrayList after adding new Elements: " + L);
		Collections.sort(L);
		System.out.println("After shorting the ArrayList" + L);
		L.clear();
		System.out.println("After clearing the ArrayList Size is: " + L.size());
		System.out.println("------------------------------------------------------");
	}

	static void LinkedList(int[] i) {
		List<Integer> list = new LinkedList<Integer>(); // LinkedList Declaration

		list.add(20);
		list.add(40);
		list.add(80);
		list.add(50);
		System.out.println("Value inside LinkedList: " + list);

		List<Integer> list2 = new LinkedList<>();
		list2.add(8);
		list2.add(5);
		System.out.println("Value inside new LinkedList: " + list2);
		list2.addAll(list);
		System.out.println("Value after adding elements of first LinkedList into second: " + list2);
		System.out.println(list2.contains(20));
		System.out.println(list2.size());

		LinkedList<Integer> NL = new LinkedList<Integer>();

		for (int var : i) { // For-Each to Add element from an array to LinkedList
			NL.add(var);
		}
		System.out.println("Adding Array elements to the LikedList: " + NL);
		System.out.println("------------------------------------------------------");
	}

	static void stack() {

		Stack<String> animals = new Stack<>(); // Stack Declaration
		animals.push("Lion");
		animals.push("Tiger");
		animals.push("Cat");
		animals.push("Dog");

		System.out.println("Last added value to stack: " + animals.peek());
		animals.pop();
		System.out.println("After removing value: " + animals);
		System.out.println("------------------------------------------------------");
	}

	public static void main(String[] args) {

		String[] a = { "11", "52", "93", "74", "65" };
		int[] i = { 10, 20, 30, 40, 50 };
		arrayList(a);
		LinkedList(i);
		stack();
	}

}
