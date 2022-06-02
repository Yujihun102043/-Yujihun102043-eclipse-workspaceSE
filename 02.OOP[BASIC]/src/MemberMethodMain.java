
public class MemberMethodMain {

	public static void main(String[] args) {
		System.out.println("main stmt1");
		MemberMethod mm1=new MemberMethod();
		/*
		 * 멤버메쏘드실행(호출)
		 *   - 형식 : 참조변수.메쏘드이름()
		 *   - main실행흐름을 mm1주소에있는 객체의 
		 *     method1이라는 이름의 메쏘드블록으로 보낸다.
		 */
		mm1.method1();
		System.out.println("main stmt2");
		mm1.method2();
		System.out.println("main stmt3");
		System.out.println("******매개변수가있는 메쏘드호출*******");
		mm1.method3(3);
		System.out.println("main stmt4");
		mm1.method3(5);
		System.out.println("main stmt5");
		mm1.method4("안녕하세요!!!", 3);
		/*
		<< The method method4(String, int) in the type MemberMethod 
		   is not applicable for the arguments (int, String)>>
		mm1.method4(10,"헤헤");
		mm1.method4(12,34);
		mm1.method4(34);
		*/
		mm1.method4("누구세요", 5);
		System.out.println("main stmt5");
		mm1.method5("이소라", "머하세요", 3);
		System.out.println("main stmt5");
		mm1.method5("김태희", "안녕하세요", 5);
		System.out.println("main stmt6");
		
		System.out.println("main return");
		return;
	}

}















