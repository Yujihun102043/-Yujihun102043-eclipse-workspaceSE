
public class LocalVaraibleMain {

	public static void main(String[] args) {
		
		/*
		 * 지역변수(local variable)
		 *   - 메쏘드 블록안에서 선언된변수(매개변수)
		 * 멤버변수(필드)
		 *   - 클래스 블록안에서 선언된변수  
		 */
		/*
		 * 기본형 변수
		 */
		int a=9;
		int b=10;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//swap
		int t = a;
		a=b;
		b=t;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		/*
		 1.<< The local variable tot may not have been initialized >>
		int tot;
		System.out.println("tot="+tot);
		*/
		/*
		2.<< The local variable tot may not have been initialized >>
		int tot;
		boolean condition=true;
		if(condition) {
			tot=0;
		}
		System.out.println("tot="+tot);
		*/
		
		int tot;
		boolean condition=true;
		if(condition) {
			tot=0;
		}else {
			tot=1;
		}
		System.out.println("tot="+tot);
		
		int tot2=0;
		tot2=tot2+4;
		
		
		/*
		 * 참조변수
		 */
		DuoMember member1;
		member1 = new DuoMember(1, "KIM");
		/*
		The local variable member1 may not have been initialized
		 */
		member1.print();
		
		
		
		DuoMember member2=null;//참조변수 초기화시 null리터럴을 사용
		
		if(member2==null) {
			member2=new DuoMember(2, "김은희");
		}
		
		member2.print();
		
		
		
		
		
	}

}














