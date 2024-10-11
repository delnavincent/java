package inheritance;

public class Tester extends Employee {
	int age=35;
	public void category()
	{
		System.out.println("age is"+age);
		System.out.println("testing");
	}

	public static void main(String[] args) {
		Tester obj=new Tester();
		obj.category();
		obj.details();
		Developer sc=new Developer();
		sc.details();
		sc.designation();

	}

}
