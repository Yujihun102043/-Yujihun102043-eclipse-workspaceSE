/*
	type A:
	1. Thread 클래스를 상속받는다.
	2. Thread class의 run method를 overriding 한다.
		동사원형:public void run()
	3. Thread 객체를 생성한다.
	4. Thread 객체를통해서 Thread를 시작시킨다.
 */
public class CreateCustomThread extends Thread {
	/*
	 * public void run()
	 * CreateCustomThread
	 */
	@Override
	public void run() {
		//while (true) {
		//}
			System.out.println("가." + Thread.currentThread().getName() + "스레드실행");
			System.out.println("나." + Thread.currentThread().getName() + "스레드실행 후 반환");
	}
}
