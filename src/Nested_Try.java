import java.util.Scanner;

public class Nested_Try {

	public static void main(String[] args) {

		int a,b,c;
		String s;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the A value");
		a = scanner.nextInt();
		System.out.println("Enter the B value");
		b = scanner.nextInt();
		String s1[] = new String[5];
		try
		{
			c = a/b;
			System.out.println("The C value is = " +c);
			try
			{
				System.out.println("Enter the String : ");
				for(int i=0;i<=s1.length;i++)
				{
					s1[i] = scanner.nextLine();
				}
				try
				{
					System.out.println("Enter the String : ");
					s = scanner.nextLine();
					int n = Integer.parseInt(s);
					System.out.println("String is convert to integer :" + n);
				}	
				catch(NumberFormatException n)      
				{
					System.out.println(n);
					System.out.println("We have a string variable that has characters; converting this variable into digit will cause NumberFormatException.");
				}
			}
			catch(ArrayIndexOutOfBoundsException e)       
			{
				System.out.println(e);
				System.out.println("When an array exceeds to it's size, the ArrayIndexOutOfBoundsException occurs.");
			}
		}
		catch(ArithmeticException e )        
		{
			System.out.println(e);
			System.out.println("We divide any number by zero, there occurs an ArithmeticException.");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println(" ");
			System.out.println("finally block is always executed");  
		}
	scanner.close();	
	}
}



