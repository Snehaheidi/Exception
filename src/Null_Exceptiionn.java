//import java.util.Scanner;

public class Null_Exceptiionn {

	public static void main(String[] args) {
		String s =null;
		String s1="hi";
		try
		{
		  if(s.equals(s1))	     // if(s1.equlas(s)) --> String are not equal 
		  {
			  System.out.println(s+ " & " +s1+ "String are Equal..");
		  }
		  else
		  {
			  System.out.println("String are not Equal..");
		  }
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("We have a null value in any variable, on the variable throws a NullPointerException.");
		}
		finally
		{
			System.out.println(" ");
			System.out.println("finally block is always executed");  
		}

	}

}
