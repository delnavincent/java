package encapsulation;

import java.util.Scanner;

public class UserAtm {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin");
		int pin=sc.nextInt();
		BankAtm obj=new BankAtm();
		obj.setPin(pin);
		obj.getPin();
		obj.validPin(pin);
		
		
		

	}

}
