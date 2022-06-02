
public class Second {
	
	public void method2() {
		System.out.println("\t\t Second.method2() 실행");
		/************case1***********/
		/*
		String str = null;
		int length = str.length();
		System.out.println("length : " + length);
		*/
		/************case2***********/
		NullPointerException ex = new NullPointerException("내가 만든 예외객체");
		boolean b = true;
		if(b) {
			throw ex;
		}
		
		
		
		
		
		System.out.println("\t\t Second.method2() 반환");
		return;
	}
}
