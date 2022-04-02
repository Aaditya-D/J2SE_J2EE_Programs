import java.util.Scanner;

public class Program6 {
	int a, b, c;
	char choice;

	void calculator() {

		System.out.println("************WELCOME TO CALCULATOR**************");
		
		do {
			System.out.println("Enter two numbers: ");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("To Add Press: +");
			System.out.println("To Subtract Press: -");
			System.out.println("To Multiply Press: *");
			System.out.println("To Division Press: /");
			System.out.println("To Modulo Press: %");
			System.out.println("To Exit Press: e");
			choice = sc.next().charAt(0);
			
			switch (choice) {

			case '+':
				c = a + b;
				System.out.println("Addition: " + c);
				System.out.println("\n");
				break;
			case '-':
				c = a - b;
				System.out.println("Substraction: " + c);
				System.out.println("\n");
				break;
			case '*':
				c = a * b;
				System.out.println("Multiplication: " + c);
				System.out.println("\n");
				break;
			case '/':
				c = a / b;
				System.out.println("Division: " + c);
				System.out.println("\n");
				break;
			case '%':
				c = a % b;
				System.out.println("Modulo: " + c);
				System.out.println("\n");
				break;
			
			case 'e':
				System.out.println("Exiting calculator !");
				System.out.println("\n");
				break;
			default:
				System.out.println("Invalid operation selected ");
			}

		} while (choice != 'e');
		{
			System.out.println("Thank You....");
		}
	}
	
	public static void main(String []a) {
		Program6 p6 = new Program6();
		p6.calculator();
	}

}

