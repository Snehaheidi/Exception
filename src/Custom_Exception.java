
import java.util.Scanner;
public class Custom_Exception {
	//static void input(String s) throws MyException{    
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{	
		Scanner scanner = new Scanner(System.in);
		String s;
		try
		{
			s = scanner.nextLine();
			if(s.equals("good"))
			{
				System.out.println("The String is same..");
			}
			else
			{
				throw new MyException("The string is not same..");
			}
		}
		catch(MyException ex)
		{
			System.out.println("Caught the exception");     
			System.out.println(ex);	
		}
		scanner.close();	
	}
}
