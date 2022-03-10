import java.util.Scanner;

public class Program3 {

	void withVar(){
		System.out.println("Enter Two variable: ");
		Scanner sc = new Scanner(System.in);
		int var1 = sc.nextInt();
		int var2 = sc.nextInt();
		System.out.println("Before swap variables: "+var1+" "+var2);
		int temp = var1;
		var1 = var2;
		var2 = temp;
		System.out.println("After Swapping: "+var1+" "+var2);
		
	}
	
	void withoutVar() {
		System.out.println("Enter Two variable: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swap variables: "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping: "+a+" "+b);
	}
	
}
