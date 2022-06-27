
public class ControlJoinThread1 extends Thread {
	@Override
	public void run() {
		try {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(10);
		}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
