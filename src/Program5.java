import java.util.Scanner;

public class Program5 {

	static void table() {
		System.out.println("Enter the number for the multiplication Table: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		for(int i=0;i<10;i++) {
			System.out.println(a+" X "+ (i+1) +" ="+(a*(i+1)));
		}
	}
	public static void main(String []a) {
		table();
	}

}
