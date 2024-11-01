package accessmodifier1;

public class Example1 {
	 protected int a=10;
	protected void method1()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
	Example1 obj=new Example1();
	obj.method1();


}
}
