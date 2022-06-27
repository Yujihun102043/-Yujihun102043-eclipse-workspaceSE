
public class ControlJoinThread2 extends Thread{
	@Override
	public void run() {
		try {
			for(int i=11;i<=20;i++) {
				System.out.println(i);
				Thread.sleep(10);
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
}
