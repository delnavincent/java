package exception;

public class LicenseException extends Exception {
	public LicenseException(String s)
	{
		super(s);
		System.out.println("License expired");
	}
}
	