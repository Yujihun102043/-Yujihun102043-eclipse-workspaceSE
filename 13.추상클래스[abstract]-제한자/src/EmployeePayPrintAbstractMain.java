
public class EmployeePayPrintAbstractMain {

	public static void main(String[] args) {
		SalaryEmployee sEmp1=new SalaryEmployee(1, "KIM", 30000000);
		HourlyEmployee hEmp2=new HourlyEmployee(2, "JIM", 100, 20000);
		
		sEmp1.calculatePay();
		hEmp2.calculatePay();
		sEmp1.print();
		hEmp2.print();
		
		Employee e1=sEmp1;
		Employee e2=hEmp2;
		
		Employee[] emps=new Employee[5];
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=new SalaryEmployee(3, "KANG", 35000000);
		emps[3]=new SalaryEmployee(4,"SIM",28000000);
		emps[4]=new HourlyEmployee(5,"DIM",100,9000);
		
		for(int i=0;i<emps.length;i++) {
			emps[i].calculatePay();
			System.out.println("--------------"+emps[i].getName()+" 님 월급명세표-----------");
			emps[i].print();
			System.out.println("------------------------------------------------------------");
		}
		
	}

}
