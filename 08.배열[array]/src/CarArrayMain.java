public class CarArrayMain {

	public static void main(String[] args) {
			//Car[] carArray=new Car[30];
			
			Car[] carArray= {
					null,null,new Car("5654", 8),null,null,
					new Car("3422", 12),null,null,null,null,
					null,null,null,null,new Car("7789", 11),
					new Car("1120", 10),null,null,null,null,
					null,new Car("2389", 9),null,null,null,
					null,null,null,null,new Car("5555", 6)
			};
			/*
			null.메쏘드() --> NullPointerException
			 */
			System.out.println("1.전체 차량출력");
			Car.headerPrint();
			for (int i = 0; i < carArray.length; i++) {
				if(carArray[i]!=null) { // null값을 가진 배열을 제외
					carArray[i].print(); // 출력
				}
			} 
			
			System.out.println("2.전체주차구획수");
			System.out.println(">> "+ carArray.length); // 전체 배열 인덱스값 출력
			System.out.println("3.남은주차구획수"); 
			int remainingNumerOfParkingCount=0; // null값을 제외한 배열 인덱스값을 받을 int 타입 변수 선언 후 초기화
			for(int i=0;i<carArray.length;i++) { // 반복문
				if(carArray[i]==null) { // null값이 들어있는 배열 인덱스 체크
					remainingNumerOfParkingCount++; // null값 있는만큼 1씩 추가
				}
			}
			
			System.out.println(">> "+remainingNumerOfParkingCount);
			System.out.println("4.입차");
			/*
			 * 1.차량객체생성
			 * 2.빈자리찾아서대입
			 */
			Car newCar = new Car("1111", 5);
			for(int i=0;i<carArray.length;i++) {
				if(carArray[i] != null) {
					carArray[i] = newCar;
					carArray[i].print();
					break;
				}
			}
			
			System.out.println("5.차량번호 7789번  차한대 정보출력");
			for(int i=0;i<carArray.length;i++) {
				if(carArray[i] != null) {
					String tempNo = carArray[i].getNo();
					if(tempNo.equals("7789")) {
						carArray[i].print();
						break;
					}
				}
				/*
				if(carArray[i] != null && carArray[i].getNo().equals("7789")) {
					carArray[i].print();
					break;
				}
				*/
				// equal() 은 문자열 비교하는 명령어 true false.
				
				/*
				if(carArray[i] != null && carArray[i].getNo() == "7789") {
					carArray[i].print();
				}
				>> 이렇게 쓰면 안된다.
				*/
			}
			
			System.out.println("6.입차시간 10시이후 차량여러대 찾아서 정보출력");
			for(int i=0;i<carArray.length;i++) {
				if(carArray[i]!=null) {
					if(carArray[i].getInTime() > 10) {
						carArray[i].print();
				}
			}
			}
			System.out.println("7.2389번차량 12시 출차");
			for(int i=0;i<carArray.length;i++) {
				if(carArray[i]!=null) {
					if(carArray[i].getNo().equals("2389")) {
						carArray[i].setOutTime(12);
						carArray[i].calculateFee();
						carArray[i].print();
						carArray[i] = null;
						break;
					}
				}
			}
			/*
			 * 1. 2389번차량찾기
			 * 2. 출차(출차시간 12시 대입,요금계산)
			 * 3. 영수증출력
			 * 4. 2389번차량 주차장에서 차량삭제 (해당 배열 인덱스에 null 대입)
			 * 
			 */
			
			System.out.println("8. 2389번차량 출차후전체 차량출력");	
			Car.headerPrint();
			for (int i = 0; i < carArray.length; i++) {
				if(carArray[i]!=null) {
					carArray[i].print();
				}
			}
			
		}

}