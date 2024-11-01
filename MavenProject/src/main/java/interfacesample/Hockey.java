package interfacesample;

public class Hockey implements Sports {
	public void game()
	{
		System.out.println("implementation of abstract method in Hockey class");
	}

	public static void main(String[] args) {
	Sports s;
	s=new Football();
	s.game();
	s=new Cricket();
	s.game();
	s=new Hockey();
	s.game();

	}

}
