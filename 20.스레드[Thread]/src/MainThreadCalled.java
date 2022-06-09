
public class MainThreadCalled {
	public void main_thread_called_method() {
		System.out.println("\t"+Thread.currentThread().getName() +"\tA.스레드실행");
		
		System.out.println("\t"+Thread.currentThread().getName() +"\tB.스레드반환");
		return;
	}
}
