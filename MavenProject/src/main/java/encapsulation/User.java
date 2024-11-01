package encapsulation;

public class User {

	public static void main(String[] args) {
		Bank obj=new Bank();
		
		obj.setter("SBI", 5000, 34);
		obj.getter();
		
	}

}
