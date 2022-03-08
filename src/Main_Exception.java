import java.util.Scanner;

public class Main_Exception {

	public static void main(String[] args) {

		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the A value");
		a = scanner.nextInt();
		System.out.println("Enter the B value");
		b = scanner.nextInt();
		try
		{
			c = a/b;
			System.out.println("The C value is = " +c);
		}
		catch(ArithmeticException s )        // s --> to create the own name
		{
			System.out.println(s);
			System.out.println("We divide any number by zero, there occurs an ArithmeticException.");
		}
		finally
		{
			System.out.println(" ");
			System.out.println("finally block is always executed");  
		}
		scanner.close();
	}

}
