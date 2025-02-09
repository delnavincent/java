package finalkeyword;

public final class Class1 {
	final int A=10;
	final int B;//blank final variable or uninitialized final variable
public Class1()
{
	B=20;
	System.out.println(B);
	
}
public final void method1()
{
	System.out.println("final method");
}


	public static void main(String[] args) {
		Class1 obj=new Class1();
		obj.method1();

	}

}
