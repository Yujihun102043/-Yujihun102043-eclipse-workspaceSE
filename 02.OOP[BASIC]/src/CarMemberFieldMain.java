
public class CarMemberFieldMain {
	public static void main(String[] args) {
		/*
		 * 주차관리프로그램시작
		 */
		/*
		 1.차량번호 1234번 12시 입차
		 */
		Car car1;//차객체의 주소값을 저장할 Car 타입 참조(주소)변수선언
		car1 = new Car();//Car클래스를 사용해서 차객체를 힙메모리에 생성후 차객체의 주소값이 car1 주소변수 대입
		
		car1.no = "1234";//차객체(car1)의 멤버필드no에 "1234"값대입
		car1.inTime=12;  //차객체(car1)의 멤버필드inTime에 12대입
		
		/*
		 * 2.car1차량 16시출차 
		 */
		car1.outTime=16;//차객체(car1)의 멤버필드outTime에 16대입
		/*
		 * 2-1. 주차요금계산
		 */
		car1.fee = (car1.outTime-car1.inTime)*1000;
		//차객체(car1)의 멤버필드fee에 차객체(car1)의 
		//outTime,inTime멤버필드를 사용해서 주차요금계산후대입
		/*
		 * 2-2. 주차요금영수증출력
		 */
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-----------------------------------");
		System.out.printf("%7s %7d %9d %8d\n",car1.no,car1.inTime,car1.outTime,car1.fee);
		return;
	}
}
