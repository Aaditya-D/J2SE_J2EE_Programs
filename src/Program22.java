import java.util.Arrays;

public class Program22 {

	static void varArgs(int a, String... strings) { // must be declared as the last parameter and only one in a method
		System.out.println(a + " " + Arrays.deepToString(strings));
	}

	static void varArg(int... a) { // gives all passed parameters as an array
		for (int var : a) {
			System.out.println(var);
		}
	}

	public static void main(String[] args) {
		int i = 10;
		int j = 200;
		int k = 3000;
		String a = "This is String A";
		String b = "This is String B";
		String c = "This is String C";
		String d = "This is String D";
		varArgs(i, a, b, c, d);
		varArgs(i, a, b);
		varArg(i, j, k);
	}
}
