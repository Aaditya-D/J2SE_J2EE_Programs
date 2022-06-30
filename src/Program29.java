import java.util.Scanner;

public class Program29 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) { // try with single resource it can have multiple resources
			System.out.println("Enter something: ");
			if (sc.hasNext()) {
				System.out.println("You've entered: \n" + sc.nextLine());
			}
		} catch (Exception e) {
			e.getMessage();
		} finally {
			System.out.println("Finally block is optional resources already closed");
		}
		// resources will be auto closed before executing catch or finally

	}

}
