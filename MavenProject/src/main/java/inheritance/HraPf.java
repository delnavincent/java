package inheritance;

public class HraPf extends SalaryDetails {
	
	double hra;
	double pf;

	public double calculateHra() {
		hra = basicPay*.05;
		return hra;
	}
	
	public double calculatePf() {
		pf = basicPay*.2;
		return pf;
	}

}
