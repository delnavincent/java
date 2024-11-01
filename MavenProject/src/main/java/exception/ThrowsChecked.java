package exception;

import java.io.IOException;

public class ThrowsChecked {
	public static void m()throws IOException
	{
		throw new IOException();
	}

	public static void main(String[] args) throws IOException {
		m();

	}

}
