import java.util.Arrays;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		String b[] = entervaluesInArray();  //returned array stored in another array / Array copying
		iterateArray(b); //passed the same array to iterate 
	}
	
	public static String[] entervaluesInArray() {
		
		String a[] = new String[5];
		System.out.println("Enter Array Values of String Type");
		Scanner input = new Scanner(System.in);
		for (int i=0;i<5;i++) {
			a[i]=input.next();
		}System.out.println(Arrays.toString(a));
		return a;
	}
	static void iterateArray(String[] arr) {
		System.out.println("Inside iterateArray method");
		for(String var : arr) {
			System.out.println(var);
		}
		
	}

}
