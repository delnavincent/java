package polymorphism;

import java.util.Scanner;

public class Offseason extends Onseason {
	
	public void discount(int amount)
	{
		super.discount(amount);
		float dis=amount*0.15f;
		System.out.println("Offseason Discount is"+dis);
	}

	public static void main(String[] args) {
		Onseason bj=new Offseason();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
		
		
		bj.discount(amount);
	}

}
