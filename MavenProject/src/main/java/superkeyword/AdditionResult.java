package superkeyword;

import java.util.Scanner;

public class AdditionResult {
	int sum;
	Scanner sc=new Scanner(System.in);
 public int result()
 {
	 System.out.println("Enter two numbers");
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 sum=a+b;
	 return sum;
	 
 }
}
