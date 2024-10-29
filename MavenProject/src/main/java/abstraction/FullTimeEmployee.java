package abstraction;

public class FullTimeEmployee extends Employee{
	int hours=8;
	int payperhour=3000;
	public void calculateSalary()
	{
		int salary=payperhour*hours;
		System.out.println("salary is :"+salary);
	}
	

	public static void main(String[] args) {
		FullTimeEmployee obj=new FullTimeEmployee();
		System.out.println("Full time employee salary");
		obj.calculateSalary();
		Contractor obj1=new Contractor();
		System.out.println("Contractor salary");
		obj1.calculateSalary();
		

	}

}
