package interfacesample;

public class ChildClass implements Interface1,Interface2 {
	public void method1()
	{
		System.out.println("College name:"+NAME);
	}
	public void method2()
	{
		System.out.println("department is:"+DEPT);
		
	}
	

	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.method1();
		obj.method2();
		
	}

}
