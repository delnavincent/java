package inheritance;

import java.util.Scanner;

public class SalaryDetails {
	
	int basicPay;
	int deduction;
	int bonus;

	public void details() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your basic pay");
		 basicPay = sc.nextInt();
		System.out.println("Enter deduction amount");
		 deduction = sc.nextInt();
		System.out.println("Enter bonus amount");
		 bonus = sc.nextInt();
		
	}

}
