import java.util.Scanner;

public class Array_Exception {

	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of String ");
	     a = Integer.parseInt(scanner.nextLine());
		//a = scanner.nextInt();
		System.out.println("Enter the String: ");
		String c[] = new String[a];
		try
		{
			for(int i=0;i<=c.length;i++)
			{
				//System.out.println(i);
				c[i] = scanner.nextLine();
				//System.out.println(c[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)       
		{
			System.out.println(e);
			System.out.println("When an array exceeds to it's size, the ArrayIndexOutOfBoundsException occurs.");
		}
		finally
		{
			System.out.println(" ");
			System.out.println("finally block is always executed");  
		}
		scanner.close();
	}

}
