package interfacesample;

public class Class1 implements SampleInterface {
	public void display()
	{
		System.out.println("implementation of abstract method");
		System.out.println("max value is"+MAX_VALUE);
		System.out.println("min value is"+MIN_VALUE);
	}
	public void print()
	{
		System.out.println("child method");
	}
	
	

	public static void main(String[] args) {
		SampleInterface obj=new Class1();//upcasting
		obj.display();
		Class1 obj1=new Class1();//object for child class
		obj1.print();//calling child method

	}

}
