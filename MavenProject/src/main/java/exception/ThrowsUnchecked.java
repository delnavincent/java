package exception;

public class ThrowsUnchecked {
	public static void method1() throws ArithmeticException
	{
		throw new  ArithmeticException();
	}

	public static void main(String[] args) {
		method1();
	}

}
