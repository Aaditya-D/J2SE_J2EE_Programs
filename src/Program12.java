import java.util.Scanner;

public class Program12 {
	
	public Program12() {
//		withCharArray();
		withSplit();
	}
	
	void withCharArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
//		String s = sc.next();	
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
//			System.out.print(ch[i]);
		}
		sc.close();
	}
	void withSplit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		String[] str = s.split(" ");
		for(String vv : str) {
			System.out.println(vv +" <0_0> ");
		}
		sc.close();
	}

	public static void main(String[] args) {
		new Program12();
	}

}
