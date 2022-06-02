
/*
 * 4개의 멤버메쏘드를 가짐
 */
/**
 * 계산기능을하는 클래스
 * @author TEA
 * 
 */
public class Calculator {
	Calculator() {
	}
	/**
	 * 더하기
	 * @param a 1항
	 * @param b 2항
	 * @return 더한결과
	 */
	public static int add(int a,int b) {
		return a+b;
	}
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	public static int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	public static int div(int a,int b) {
		return a/b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	
}
