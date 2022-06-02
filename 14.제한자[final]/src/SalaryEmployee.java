public class SalaryEmployee extends Employee {
	private int annualSalary;//사원연봉
	public SalaryEmployee() {
	}
	public SalaryEmployee(int no,String name,int annualSalary) {
		super(no,name);
		this.annualSalary = annualSalary;
	}

	@Override
	public void calculatePay() {
		int tempPay = this.annualSalary/12;
		this.setPay(tempPay);

	}
	/*
	 <<Cannot override the final method from Employee >>
	public double calculateIncentive() {
		return 0.0;
	}
	 */
	
	
	public void print() {
		super.print();
		System.out.println(this.annualSalary);
	}
	public int getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	
	
}
