
public class CarFactoryMain {

	public static void main(String[] args) {
		/*
		 * 자동차공장
		 */
		/*
		Engine audiEngine = new Engine();
		audiEngine.type="A";
		audiEngine.cc=3000;
		
		Car audiCar=new Car();
		audiCar.no=1234;
		audiCar.model = "AUDI";
		audiCar.engine = audiEngine;
		*/
		
		/*
		Engine audiEngine=new Engine();
		audiEngine.setType("A");
		audiEngine.setCc(3000);
		
		Car audiCar=new Car();
		audiCar.setNo(1234);
		audiCar.setModel("AUDI");
		audiCar.setEngine(audiEngine);
		*/
		
		Engine audiEngine=new Engine("A",3000);
		Car audiCar=
				new Car(1234, "AUDI", audiEngine);
		audiCar.print();
		Car car=audiCar;
		System.out.println("----차의엔진검사----");
		Engine returnEngine = car.getEngine();
		returnEngine.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
