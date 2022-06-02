
public class CarMemberMethodMain {

	public static void main(String[] args) {
		System.out.println("--------------car1--------------");
		/*
		 * 입차
		 */
		Car car1=new Car();
		/*
		car1.no="1234";
		car1.inTime=12;
		*/
		car1.setIpChaData("1234", 12);
		/*
		 * 4시간후출차
		 */
		//car1.outTime=16;
		car1.setOutTime(16);
		
		//car1.fee =(car1.outTime-car1.inTime)*1000;
		car1.calculateFee();
		
		/*
		 * 출차 차량정보출력
		 */
		/*
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-----------------------------------");
		System.out.printf("%7s %7d %9d %8d\n",car1.no,car1.inTime,car1.outTime,car1.fee);
		 */
		car1.headerPrint();
		//car1에정의되있는 print메쏘드호출
		car1.print();
		
		System.out.println("--------------car2--------------");
		Car car2=new Car();
		car2.setIpChaData("3423", 17);
		//2시간후
		car2.setOutTime(19);
		car2.calculateFee();
		car2.headerPrint();
		car2.print();
		
		System.out.println("#################오늘입출차차량리스트################");
		car1.headerPrint();
		car1.print();
		car2.print();
		
		
		
		

	}

}
