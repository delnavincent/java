package inheritance;

public class Car extends Vehicle {
	int speed=40;
	public void name()
	{
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		Car obj=new  Car();
		obj.name();
		obj.run();
		System.out.println("speed is"+obj.speed);
		System.out.println("colour is"+obj.color);
	}

}
