
public class CalCulatorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		double result = 0;
		System.out.println("계산 결과");
		result = calculator.add(23, 34);
		System.out.println("add : " +result);
		
		result = calculator.add(1, 2, 3);
		System.out.println(result);
		
		result = calculator.sub(23, 34);
		System.out.println("sub : " +result);
		
		result = calculator.mul(45, 34);
		System.out.println("div : " +result);
		
		result = calculator.div(236516584, 34);
		System.out.println("mul : " +result);
		
		/*
		int result=calculator.add(23,34);
		System.out.println(result);
		result=calculator.sub(23,34);
		System.out.println(result);
		result=calculator.mul(23,34);
		System.out.println(result);
		result=calculator.div(54543,34);
		System.out.println(result);
		*/
	}

}
