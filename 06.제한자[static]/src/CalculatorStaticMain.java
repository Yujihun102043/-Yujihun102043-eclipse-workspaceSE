

public class CalculatorStaticMain {

	public static void main(String[] args) {
		/*
		Calculator calculator1=new Calculator();
		System.out.println(calculator1.add(12, 34));
		Calculator calculator2=new Calculator();
		System.out.println(calculator2.add(12, 34));
		*/
		System.out.println("---------static access---------");
		System.out.println(Calculator.add(12, 33));
		System.out.println(Calculator.sub(12, 33));
		System.out.println(Calculator.div(12, 33));
		System.out.println(Calculator.mul(12, 33));
		System.out.println(Calculator.add(12, 33,44));
		

	}

}
