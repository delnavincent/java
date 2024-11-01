package exception;

public class ThrowExample {
public void method1(int a,int b)
{
	
	int sum=a+b;
	if(sum>50)
	{
		throw new ArithmeticException("exception occured");
	}
	else
	{
		System.out.println("sum is less than 50");
	}
	
}
	public static void main(String[] args) {
		ThrowExample obj=new ThrowExample();
		try
		{
		obj.method1(60,10);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");

	}

}
 