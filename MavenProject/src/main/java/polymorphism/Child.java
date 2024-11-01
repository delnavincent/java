package polymorphism;

public class Child extends Parent {
	public void method1(int c,int d)
	{
		super.method1(45,45);
		int sum=c+d;
		System.out.println("Child sum is"+sum);
	}

	public static void main(String[] args) {
		//Child obj=new Child();
		//obj.method1(20,50);
		Parent obj=new Child();
		obj.method1(20,50);
		
		
		
	}

}
