import java.util.Scanner;

public class Number_Exception {

	public static void main(String[] args) {
		String s;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		s = scanner.nextLine();
		try
		{
		   int n = Integer.parseInt(s);
		   System.out.println("String is convert to integer :" + n);
		}
		catch(NumberFormatException n)      
		{
			System.out.println(n);
			System.out.println("We have a string variable that has characters; converting this variable into digit will cause NumberFormatException.");
		}
		finally
		{
			System.out.println(" ");
			System.out.println("finally block is always executed");  
		}
		scanner.close();
	}

}
