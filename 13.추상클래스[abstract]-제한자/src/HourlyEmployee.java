public class HourlyEmployee extends Employee {
	private int wokrsHour; 	//일한시간
	private int payPerHour;	//시간당급여
	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public HourlyEmployee(int no,String name,int wokrsHour, int payPerHour) {
		super(no,name);
		this.wokrsHour = wokrsHour;
		this.payPerHour = payPerHour;
	}

	public void print() {
		super.print();
		System.out.println(this.wokrsHour+"\t"+this.payPerHour);
	}
	@Override
	public void calculatePay() {
		this.setPay(payPerHour*wokrsHour);
	}


	public int getWokrsHour() {
		return wokrsHour;
	}


	public void setWokrsHour(int wokrsHour) {
		this.wokrsHour = wokrsHour;
	}


	public int getPayPerHour() {
		return payPerHour;
	}


	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	
}
