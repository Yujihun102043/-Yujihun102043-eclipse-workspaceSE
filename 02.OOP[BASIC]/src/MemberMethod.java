/*
2.멤버메쏘드 선언    
 *        접근제한자 리턴타입 메쏘드이름(매개변수선언1,매개변수선언2,...){
 *           - 매개변수선언1: 나를 호출한클래스(객체) 가 전달한 데이타를 받을변수선언
 *        	 - 리턴타입: 나를 호출한클래스(객체) 에게 반환할 데이타타입 
 *               void --> 줄데이타가 없는경우
 *        }
 *        ex> public int test(int a,int b,...){}
 *        	  	
 */   
public class MemberMethod {
	
	/*
	 * 클래스의 구성요소
	 *   1.멤버필드(변수)[속성]:객체생성시 속성데이타를 저장할변수
	 *   2.멤버메쏘드
	 */
	void method1() {
		System.out.println("\t-------void method1() 실행-----");
		System.out.println("\tmethod1 stmt1");
		System.out.println("\tmethod1 stmt2");
		/*
		   - 모든 메쏘드블록의 마지막에는 항상 실행흐름을 호출한곳으로 반환하여야한다.
		   - 실행흐름을 반환하는 문장이 return문이다.
		   - return 문을 만나면 실행흐름이 호출한곳으로 반환된다.
		   - return type이 void 인경우에는 생략이 가능하다.
		   - return문이 생략된경우에는 컴파일러가 자동으로 return문을 삽입하여준다.
		 */
		System.out.println("\t-------void method1() 종료후 반환-----");
		return;
	}
	
	void method2() {
		System.out.println("\t-------void method2()-----실행");
		System.out.println("\tmethod2 stmt1");
		System.out.println("\tmethod2 stmt2");
		System.out.println("\t-------void method2()-----종료후 반환");
		return;
	}
	
	void method3(int count) {
		System.out.println("\t-------void method3(int count)-----실행");
		int localVar = 1111;
		System.out.println("\t method3메쏘드안에선언된변수:"+localVar);
		for(int i=0;i<count;i++) {
			System.out.println("\t void method3(int count)실행파라메타(매개변수) count 값:"+count);
		}
		System.out.println("\t-------void method3(int count)-----종료후 반환");
		return;
	}
	
	void method4(String msg,int count) {
		System.out.println("\tvoid method4(String msg,int count--실행");
		for(int i=0;i<count;i++) {
			System.out.println("\t\t"+msg);
		}
		System.out.println("\tvoid method4(String msg,int count--종료후 실행흐름반환");
		return;
	}
	
	void method5(String name,String msg,int count) {
		System.out.println("\tvoid method5(String name,String msg,int count)--실행");
		for(int i=0;i<count;i++) {
			System.out.printf("\t\t%s님 %s\n",name,msg);
		}
		System.out.println("\tvoid method5(String name,String msg,int count)--종료후 실행흐름반환");
		return;
	}
	
}











