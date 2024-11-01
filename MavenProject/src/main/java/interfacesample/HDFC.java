package interfacesample;

import java.util.Scanner;

public class HDFC implements RBI {
	int amount;
	int duration;
	Scanner sc=new Scanner(System.in);
	public void recurringDeposit()
	{
		System.out.println("Enter the amount to be deposited");
		amount=sc.nextInt();
		System.out.println("Enter the duration");
		duration=sc.nextInt();
		float interest=amount*duration*INTEREST_RATE;
		float deposit=amount+interest;
		System.out.println("Amount received after "+duration+"years is"+deposit);
		
	}

	public static void main(String[] args) {
		RBI s=new HDFC();
		s.recurringDeposit();
		
	}

}
