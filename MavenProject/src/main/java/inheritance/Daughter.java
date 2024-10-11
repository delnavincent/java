package inheritance;

public class Daughter extends Father {
	public void method4()
	{
		System.out.println("Daughter class");
	}
	

	public static void main(String[] args) {
		Daughter obj=new Daughter();
		obj.method1();
		obj.method2();
		obj.method4();
		Son obj1=new Son();
		obj1.method3();
	}

}
