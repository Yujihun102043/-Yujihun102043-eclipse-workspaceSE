
/*
 * 4개의 멤버메쏘드를 가짐
 */
public class Calculator {

	/*
	 * add메쏘드 오버로딩
	 */
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	
	
	
	public int div(int a,int b) {
		return a/b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	
}
