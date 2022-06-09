import java.awt.Toolkit;

public class BeepPrintMain {

	public static void main(String[] args) throws Exception {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//비프음 발생
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			Thread.sleep(1000);
		}
		//콘솔에 띵찍기.
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			Thread.sleep(1000);
		}
	}

}
