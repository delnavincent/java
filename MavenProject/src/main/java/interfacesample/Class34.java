package interfacesample;

public class Class34 implements Interface3,Interface4 {
	public void method1()
	{
	System.out.println("Name is"+NAME);
		
	} 
	public void method2()
	{
		System.out.println("Department is"+DEPT);
	}

	public static void main(String[] args) {
		Class34 obj=new Class34();
		obj.method1();
		obj.method2();

	}

}
