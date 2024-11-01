package superkeyword;

public class Class2 extends Class1{
	String name="Neena";
	public  Class2()
	{
		//super();
		System.out.println("child class constructor");
	}
	public void details()
	{
		super.details();
		System.out.println(name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		Class2 obj=new Class2();
		obj.details();
		
		

	}

}
