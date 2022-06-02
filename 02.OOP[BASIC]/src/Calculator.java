/*
 * 4개의 멤버메쏘드를 가짐
 */
public class Calculator {

	/*
	 * - add( 두개의 정수를 매개변수로 받아서 더한 결과값을 반환)
	 * - sub( 두개의 정수를 매개변수로 받아서 뺀   결과값을 반환)
	 * - div( 두개의 정수를 매개변수로 받아서 나눈 결과값을 반환)
	 * - mul( 두개의 정수를 매개변수로 받아서 곱한 결과값을 반환)
	 */
	int addMethod(int a, int b) {
		int result = a+b;
		return result;
	}
	int addMethod(int a, int b, int c) {
		int result = a+b+c;
		return result;
	}
	
	
	int subMethod(int a, int b) {
		int result = a-b;
		return result;
	}
	
	double divMethod(double a, double b) {
		double result = a/b;
		return result;
	}
	
	int mulMethod(int a, int b) {
		int result = a*b;
		return result;
	}
	

	
}
