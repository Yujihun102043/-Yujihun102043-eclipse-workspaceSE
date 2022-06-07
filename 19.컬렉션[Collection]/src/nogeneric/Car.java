package nogeneric;

/**
 * 차객체를 생성하기위한클래스
 * @author KIM
 * @version 1.0
 * 
 *
 */
public class Car {
	public static final int FEE_PER_HOUR = 1000;//시간당주차요금
	
	/*
	클래스의 구성요소
	   1. 멤버필드(변수)[속성] (차객체의 속성데이타를 저장할변수)
	   2. 생성자메쏘드[필드초기화기능]
	   3. 멤버메쏘드[기능](차객체가 가지고있는 기능 )
	*/
	
	/*
	 * 1.멤버필드(변수)[속성]
	 */
	private String no;	//차량번호
	private int inTime;	//입차시간
	private int outTime;//출차시간
	private int fee;	//주차요금
	
	/*
	 * 2.생성자
	 */
	/**
	 * 초기값을가진 차객체생성
	 */
	public Car() {
	}
	/**
	 * 입차데이타로초기화된 차객체생성
	 * @param no 차량번호
	 * @param inTime 입차시간[음수는 허용하지않는다.]
	 */
	public Car(String no,int inTime) {
		this.no=no;
		this.inTime=inTime;
	}
	/**
	 * 매개변수데이타로초기화된 차객체생성
	 * @param no 차량번호
	 * @param inTime 입차시간
	 * @param outTime 출차시간
	 * @param fee 주차요금
	 */
	public Car(String no, int inTime, int outTime, int fee) {
		
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}
	
	
	
	/*
	 * 3.멤버메쏘드[기능](차객체가 가지고있는 기능 )
	 */
	
	

	/*
	 *입차시데이타(번호,시간)대입 
	 */
	public void setIpChaData(String no,int inTime) {
		this.no=no;
		this.inTime=inTime;
	}
	/*
	 * 출차시간 필드outTime에 출차시간데이타 대입(set)
	 */
	public void setOutTime(int outTime) {
		this.outTime=outTime;
	}
	
	
	/*
	 * 요금계산
	 */
	public void calculateFee() {
		this.fee =(this.outTime-this.inTime)* Car.FEE_PER_HOUR;
	}
	/*
	 * 헤더출력
	 */
	public void headerPrint() {
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-----------------------------------");
	}
	/*
	 * 차량정보출력
	 */
	public void print() {
		
		System.out.printf("%7s %7d %9d %8d\n",this.no,this.inTime,this.outTime,this.fee);
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getInTime() {
		return inTime;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getOutTime() {
		return outTime;
	}
	
	
	
	
	
}




















