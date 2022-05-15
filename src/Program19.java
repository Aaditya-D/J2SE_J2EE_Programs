
public class Program19 {

	void throwerror() throws ArithmeticException {
		System.out.println("\nThrows declare the type of exceptions that might occur");
		throw new ArithmeticException("Cannot Divide by zero");
	}

	public static void main(String[] args) {
		try {

			int arr[] = new int[10];
			arr[11] = 11;
			int divideByZero = 5 / 0;

		} catch (ArithmeticException e) {

			System.out.println("ArithmeticException => " + e.getMessage());

		} catch (Exception e) {

			System.out.println("Exception => " + e.getMessage());

		} finally {

			System.out.println("Finally block is always executed");
		}
		Program19 p19 = new Program19();
		p19.throwerror();
	}
}
