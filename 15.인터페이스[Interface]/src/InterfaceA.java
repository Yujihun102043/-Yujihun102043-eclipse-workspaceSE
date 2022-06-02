/*
 * interface keyword사용
 */
public interface InterfaceA {
	/*
	 * << interface 안에 정의되는 메소드는 추상 메소드여야한다.>>
	 *  error : Abstract methods do not specify a body
	 */
	public void method1();
	public abstract void method2(); 
	
}
