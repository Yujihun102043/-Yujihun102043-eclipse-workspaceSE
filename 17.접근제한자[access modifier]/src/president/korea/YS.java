package president.korea;

import president.america.Trump;

public class YS {
	public int member1;
	protected int member2;
	int member3;
	private int member4;
	
	public void method1() {
		System.out.println("YS.method1()");
	}
	protected void method2() {
		System.out.println("YS.method2()");
	}
	void method3() {
		System.out.println("YS.method3()");
	}
	private void method4() {
		System.out.println("YS.method4()");
	}
	public void access() {
		/* YS와 같은 패키지의 클래스 접근 */
			DJ dj = new DJ(); // 같은 패키지의 클래스는 import를 생략한다.
			dj.member1 = 1;
			dj.member2 = 2;
			dj.member3 = 3;
			//dj.member4 = 4; << private 라 접근불가.
			dj.method1();
			dj.method2();
			dj.method3();
			//dj.method4(); 접근불가.
			/* YS와 다른 패키지의 클래스 접근 */
			Trump trump = new Trump();
			trump.member1 = 1;
			//trump.member2 = 2; // protected > 다른 패키지라 접근불가.
			//trump.member3 = 3; // (default)
			//trump.member4 = 4; //  private
			
			trump.method1();
			//trump.method2(); // protected
			//trump.method3(); // (default)
			//trump.method4(); // private
			
	}
	
}
