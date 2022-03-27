import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Program1 {

	static void buffer() {
		
		System.out.println("Enter your name: ");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		try {
			String name = buf.readLine();
			System.out.println("You've Entered: "+name);
		} catch (IOException e) {
			e.getMessage();
		
		}
	}
	
	static void scanner() {
		System.out.println("Enter your Name: ");
		Scanner sc = new Scanner(System.in);
		String Name = sc.next();
		System.out.println("Enter your Age: ");
		long age = sc.nextLong();
		sc.close();
		System.out.println("You've Entered: \n"+"Name: "+Name+"\tAge: "+age);
	}
	public static void main(String []a) {
		scanner();
		buffer();
	}
	
}
