import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program26 {

	static void hashMap() {			 // Key and Value pair where order not preserved
		Map<Integer, String> hash = new HashMap<>();
		hash.put(81, "to be replaced");
		hash.put(11, "Good Morning");
		hash.put(41, "This is a String");
		hash.put(51, "Welcome");

		System.out.println("Present Set: " + hash);
		hash.remove(0);
		hash.putIfAbsent(60, "new");
		System.out.println("Updated Set: " + hash);
		System.out.println(hash.replace(81, "Hello"));

		for (Map.Entry<Integer, String> e1 : hash.entrySet()) {			 // iteration using for-each
			System.out.println("-------------------------------------");
			System.out.println(e1);
			System.out.println("Key: " + e1.getKey());
			System.out.println("Value: " + e1.getValue());
			System.out.println(hash.containsValue("Hello"));
			System.out.println("Is hashMap empty: " + hash.isEmpty());
			System.out.println(e1.getKey() + " - " + e1.getValue());
		}
	}

	static void treeMap() { 			// Key and Value pair where order is sorted
		Map<Integer, String> tree = new TreeMap<>();
		tree.put(20, "Two");
		tree.put(30, "Three");
		tree.put(40, "Four");
		tree.put(80, "to be replaced");
		tree.put(0, "Infinity");
		
		System.out.println("Present treeMap: " + tree);
		System.out.println("Value to be removed: " + tree.remove(0));
		System.out.println("Updated treeMap: " + tree);
		tree.putIfAbsent(60, "new value");
		System.out.println(tree.replace(80, "Eight"));

		for (Map.Entry<Integer, String> e : tree.entrySet()) {			// iteration using for-each
			System.out.println("-------------------------------------");
			System.out.println(e);
			System.out.println("Key: " + e.getKey());
			System.out.println("Value: " + e.getValue());
			tree.containsValue("Four");
			System.out.println("Is treeMap empty: " + tree.isEmpty());
			System.out.println(e.getKey() + " - " + e.getValue());
		}
	}

	public static void main(String[] args) {
		hashMap();
		treeMap();
	}
}
