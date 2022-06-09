
public class ConcurrentPrint extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				System.out.println("띵");
				Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
