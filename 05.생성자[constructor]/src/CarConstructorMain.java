
public class CarConstructorMain {

	public static void main(String[] args) {
		System.out.println("*****************car1****************");
		Car car1=new Car();
		car1.setIpChaData("1233", 3);
		car1.setOutTime(6);
		car1.calculateFee();
		car1.headerPrint();
		car1.print();
		
		System.out.println("*****************car2****************");
		Car car2=new Car("8876", 7);
		car2.setOutTime(10);
		car2.calculateFee();
		car2.headerPrint();
		car2.print();
		
		System.out.println("----------오늘주차장이용차량출력------");
		Car cara=new Car("1212", 1, 2, 1000); 
		Car carb=new Car("8723", 12, 17, 5000); 
		Car carc=new Car("1327", 6, 9, 3000); 
		
		cara.headerPrint();
		cara.print();
		carb.print();
		carc.print();
		
	}

}
