
public class MemberMethodReturn {
	/*
	 * 멤버필드
	 */
	int memberField1;
	int memberField2;
	int memberField3;
	
	/*
	 * setter method:멤버필드의 값을 1개씩 set하는메쏘드
	 */
	void setMemberField1(int memberField1) {
		this.memberField1 = memberField1;
	}
	void setMemberField2(int memberField2) {
		this.memberField2 = memberField2;
	}
	void setMemberField3(int memberField3) {
		this.memberField3 = memberField3;
	}
	
	/*
	 * getter method:멤버필드의 값을 1개씩 반환하는메쏘드
	 */
	int getMemberField1() {
		return memberField1;
	}
	int getMemberField2() {
		return memberField2;
	}
	int getMemberField3() {
		return memberField3;
	}
	/*
	 * 멤버메쏘드
	 */
	int method1() {
		System.out.println("\t----int method1() 실행-----------");
		int result = 1 + 2;
		//System.out.println("\t\t local 변수 result:"+result);
		System.out.println("\t----int method1() 종료후 int 데이타반환-----");
		/*
		 return  <<호출한 클래스(객체)에게 반환할값(변수,리터럴,연산의결과)>>
		  	- 호출한곳으로 실행흐름(쓰레드) 반환
		  	- 호출한곳으로 데이타반환
		  	- 반환할 데이타가없는 경우에는(void)	return문 생략가능하다. 
		  	- 반환할 데이타가있는 경우에는 			return문 반드시기술하여야 한다. 
		 */
		
		return result;
	}
	boolean method2() {
		System.out.println("\t----boolean method2() 실행--------");
		boolean isMarried=true;
		System.out.println("\t----boolean method2() 종료후 boolean 데이타반환--------");
		return isMarried;
	}
	
	/*
	 * 두개의 정수를 매개변수로받아서 더한결과를 반환하는메쏘드
	 */
	int add(int a,int b) {
		System.out.println("\t----int add(int a,int b) 실행--------");
		int result=a+b;
		System.out.println("\t----int add(int a,int b) 종료후 int 데이타반환------");
		return result;
	}
	/*
	 * 이름을 매개변수로입력받아서  인사말을만들어서 문자열로반환
	 */
	
	String hello(String name) {
		System.out.println("\t---String hello(String name)실행-----");
		String msg=name+" 님 안녕하세요!!!!";
		System.out.println("\t---String hello(String name)종료후 String(문자열)데이타반환-----");
		return msg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
