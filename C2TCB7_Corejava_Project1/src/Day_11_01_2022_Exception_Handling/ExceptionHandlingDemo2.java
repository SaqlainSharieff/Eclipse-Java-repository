package Day_11_01_2022_Exception_Handling;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		int[] arr=new int[4];
		try
		{			
			arr[3]=35;
			System.out.println("In try block");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Exception in try block");
		}
		finally
		{
			System.out.println("In finally block");
		}
		System.out.println("In the class");
	}
}
class Main {
	  public static void main(String[] args) {
	    try {
	      // code that generates exception
	      int divideByZero = 5 / 0;
	    }

	    catch (ArithmeticException e) {
	      System.out.println("ArithmeticException => " + e.getMessage());
	    }
	    
	    finally {
	      System.out.println("This is the finally block");
	    }
	  }
	}