package abstraction;

public class ChildClass extends AbstractClass {
	public void display()
	{
		System.out.println("Implementation of abstract method");
	}
	public void show()
	{
		System.out.println("child method");
	}

	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.display();
		obj.print();
		obj.show();

	}

}
