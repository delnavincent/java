package exception;

public class CustomTest {
	public static void license(int age) throws LicenseException
	{
		if(age<18)
		{
			throw new LicenseException("can't apply for license for age group below 18 ");
			
		}
		else
		{
			System.out.println("eligible for applying license");
		}
	}
	

	public static void main(String[] args)  {
		try
		{
			
		license(12);
		}
		catch(LicenseException e)
		{
			System.out.println(e);
		
	}

}


}
