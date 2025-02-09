package exception;

public class ExceptionExample {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		int s=a+b;
		try {
			int arr[]=new int[5];
			arr[7]=67;
			int result=s/0;
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			System.out.println("division by zero is not possible ");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array size is 5");
		}
		catch(Exception e)
		{
			System.out.println("Parent exception ");
			
		}
		finally
		{
			System.out.println("Finally block must executed");
		}
		System.out.println("Rest of the code");
		
	}

}
