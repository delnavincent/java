package abstraction;

import java.util.Scanner;

public class Contractor extends Employee {
	int hours;
	int payperhour;
	Scanner sc=new Scanner(System.in);
	public void calculateSalary()
	{
		System.out.println("Enter the payment per hour");
		payperhour=sc.nextInt();
		System.out.println("Enter working hours");
		hours=sc.nextInt();
		int salary=payperhour*hours;
		System.out.println("salary is :"+salary);
		
	}

	

}
