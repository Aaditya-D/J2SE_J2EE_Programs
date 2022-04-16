import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program13 {
	
	void userDefined(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five integer elements for the array: ");
		int[] arr = new int[5];
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Array to be reversed : "+Arrays.toString(arr));
		for (int j = arr.length-1;j>=0;j--) {
			System.out.print(arr[j]+ "");
		}
	}
	
	void usingTemp(int[] a) {
		int [] b = new int [a.length];
		int j = a.length;
		System.out.println("Initial Array:\n"+Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			b [j-1] = a[i];
			j--;
		}
		System.out.println("Reversed Array:");
		for(int var : b) {
			System.out.print(var+" ");
		}
	}

	public static void main(String[] args) {
		Program13 p13 = new Program13();
//		p13.userDefined();
		int [] arr = {10, 20, 30, 40, 50};
		p13.usingTemp(arr);
	}

}
