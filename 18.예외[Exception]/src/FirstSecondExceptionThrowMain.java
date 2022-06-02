
public class FirstSecondExceptionThrowMain {

	public static void main(String[] args) {
		System.out.println("1.main흐름 start");
		First first=new First();
		System.out.println("2.main흐름 first.method1()호출전");
		first.method1();
		System.out.println("3.main흐름 first.method1()호출후 JVM반환");
	
		return;
	}

}
