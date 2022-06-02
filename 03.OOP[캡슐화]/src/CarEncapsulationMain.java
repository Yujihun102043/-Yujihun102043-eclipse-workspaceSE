
public class CarEncapsulationMain {

	public static void main(String[] args) {
		/*
		 * 입차
		 */
		Car car1=new Car();
		car1.setIpChaData("1234", 9);
		Car car2=new Car();
		car2.setIpChaData("3422", 10);
		
		/*
		 * 12시 출차 
		 *   - 출차시간대입
		 *   - 요금계산
		 */
		
		car1.setOutTime(20);
		car1.calculateFee();
		
		car2.setOutTime(20);
		car2.calculateFee();
		
		
		/*
		 * 영수증출력
		 */
		
		car1.headerPrint();
		car1.print();
		
		
		car2.headerPrint();
		car2.print();
	
		/*
		 * car1의 주차요금get
		 */
		//System.out.println(car1.fee);
		int car1Fee=car1.getFee();
		System.out.println("car1주차요금-->"+car1Fee);
		/*
		 * car1의 주차요금set
		 */
		//car1.fee=0;
		car1.setFee(0);
		
		car1.print();
		
		

	}

}
