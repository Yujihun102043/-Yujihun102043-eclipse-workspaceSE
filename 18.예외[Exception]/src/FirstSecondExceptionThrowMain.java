
public class FirstSecondExceptionThrowMain {

	public static void main(String[] args) {
		System.out.println("1.main 흐름 Start");
		First first = new First();
		System.out.println("1.main 흐름 first.method1()호출 전");
		first.method1();
		System.out.println("1.main 흐름 first.method1()호출 후 JVM 반환");
		
		return;
	}

}
