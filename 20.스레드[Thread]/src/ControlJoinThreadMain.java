
public class ControlJoinThreadMain {

	public static void main(String[] args) throws Exception{
		System.out.println("1.main");
		ControlJoinThread1 cjt1 = new ControlJoinThread1();
		cjt1.start();
		/*
		 * join메소드를 호출한 메인스레드를 cjt1스레드가 종료될 때 까지 중지시킨다.
		 */
		cjt1.join();
		System.out.println("2.main");
		ControlJoinThread2 cjt2 = new ControlJoinThread2();
		cjt2.start();
		/*
		 * join메소드를 호출한 메인스레드를 cjt2스레드가 종료될 때 까지 중지시킨다.
		 */
		cjt2.join();
		System.out.println("3.main");
		System.out.println("4.main");
		System.out.println("5.main");
		System.out.println("6.main");
		System.out.println("7.main");
		System.out.println("8.main");
		System.out.println("9.main");
		System.out.println("10.main thread jvm return end");
		
	}

}
