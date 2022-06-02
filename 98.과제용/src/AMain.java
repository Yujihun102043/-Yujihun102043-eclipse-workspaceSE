// 2. AMain 이라는 이름의 클래스 작성.
public class AMain {
	// 2-1. AMain 클래스에 메인메소드 작성(생성)
	public static void main(String[] args) {
		//2-1-1. 메인메소드에 코드 작성
		
		// -A객체생성
		A a; // A타입 변수 a 선언
		a = new A(); // A객체 생성 후 주소값을 참조변수 a에 대입.
		
		// -A객체멤버변수에 값 대입
		a.number1 = 1230; 
		a.number2 = 3.1412;
		/*
		 * a변수가 A객체를 참조하게 되면 도트(.)연산자를 사용해서 객체필드에 접근할 수 있다.
		 * 도트(.)연산자는 객체 접근 연산자로 객체가 가지고 있는 필드나 메소드를 사용하고자 할 때 사용된다.
		 */
		// -A객체멤버변수의 값 출력
		System.out.println("A객체멤버변수 number1의 값 출력 : "+ a.number1);
		System.out.println("A객체멤버변수 number2의 값 출력 : "+ a.number2);
	
	}

}
