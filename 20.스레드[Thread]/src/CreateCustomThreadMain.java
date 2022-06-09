/*
	type A:
	1. Thread 클래스를 상속받는다.
	2. Thread class의 run method를 overriding 한다.
		동사원형:public void run()
	3. Thread 객체를 생성한다.
	4. Thread 객체를통해서 Thread를 시작시킨다.
 */
public class CreateCustomThreadMain {

	public static void main(String[] args) {
		System.out.println("1.main thread start");
		CreateCustomThread cct = new CreateCustomThread();
		cct.setName("사용자정의스레드");
		System.out.println("3.main thread createCustomThread객체.start()메소드 호출");

		cct.start();

		//while (true) {
		//}
			System.out.println("4.main thread end return");

	}

}
