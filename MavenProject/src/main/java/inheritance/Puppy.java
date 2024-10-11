package inheritance;

public class Puppy extends Dog  {
	String food="milk";
	void sleep()
	{
		System.out.println("Puppy is sleeping");
		System.out.println("food is "+food);
	}

	public static void main(String[] args) {
		Puppy obj=new Puppy();
		obj.sleep();
		obj.bark();
		obj.item();
		
	}

}
