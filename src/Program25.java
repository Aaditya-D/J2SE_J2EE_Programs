import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Program25 {

	static void hashSet() {			 // order not preserved and does not contain duplicate values
		Set<Integer> set = new HashSet<>();		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);
		set.add(50);
		set.add(80);
		System.out.println("Set values: " + set);
		System.out.println("After removing specific value: " + set.remove(40));
		System.out.println("Set values: " + set);
		System.out.println(set.contains(30));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println("Set values: " + set);

		Set<Integer> set1 = new HashSet<>();
		set1.add(2);
		set1.add(3);
		set1.add(30);
		set1.add(40);
		set.add(50);
		set.add(80);
		System.out.println("Set1: " + set1);

		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(2);

		System.out.println("Set2: " + set2);
		set2.addAll(set1);
		System.out.println("Union is: " + set2);
		set2.retainAll(set1);
		System.out.println("Intersection is: " + set2);
		set2.removeAll(set);
		System.out.println("Difference is: " + set2);
	}

	static void treeSet() {		 // order sorted and does not contain duplicate values
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(2);
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);
		System.out.println("Set using TreeSet: " + numbers);

		System.out.print("Accessing elements using iterator(): ");
		Iterator<Integer> iterate = numbers.iterator();
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
	}

	public static void main(String[] args) {
		hashSet();
		treeSet();
	}

}
