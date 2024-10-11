package inheritance;

public class SalarySlip extends HraPf {
	
	public void totalSalary() {
		double total= basicPay+hra-pf-deduction+bonus;
		System.out.println("Total Salary: "+total);
	}

	public static void main(String[] args) {
	SalarySlip obj=new SalarySlip();
	obj.details();
	obj.calculateHra();
	obj.calculatePf();
	obj.totalSalary();
	}
}
