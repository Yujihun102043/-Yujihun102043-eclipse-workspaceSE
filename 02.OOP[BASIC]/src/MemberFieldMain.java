
public class MemberFieldMain {

	public static void main(String[] args) {
		int score;
		score=4353647;
		
		/*
		 * MemberField타입 참조변수선언(데이타타입)
		 */
		MemberField mf1;
		/*
		 * MemberField클래스로 객체생성(틀)후에  객체의 참조변수 mf1에 생성된객체의 주소값이대입(#100)
		 */
		mf1 = new MemberField();
		
		/*
		 * 객체의 참조(주소)변수가 가지고있는 객체의주소값 #100를 사용해서 멤버필드에 데이타대입
		 * 객체멤버필드접근방법
		 *    - 참조(주소)변수.멤버필드이름 = 값
		 *    - mf1.member1 = 12; 
		 */
		
		mf1.member1=12;
		mf1.member2=0.3;
		mf1.member3='꿈';
		mf1.member4="문자열1";
		
		int b=34343;
		/*
		 * MemberField클래스를사용해서 객체를생성하고 객체의 주소값(#200) 이 mf2 에 대입된다.
		 */
		MemberField mf2=new MemberField();
		/*
		 * mf2객체의 멤버필드member1에 232를 대입한다.
		 */
		mf2.member1=232;
		mf2.member2=3.14159;
		mf2.member3='행';
		mf2.member4="문자열2";
		
		System.out.println("-----mf1-------");
		/*
		 * 
		 */
		System.out.println(mf1.member1);
		System.out.println(mf1.member2);
		System.out.println(mf1.member3);
		System.out.println(mf1.member4);
		System.out.println("-----mf2-------");
		System.out.println(mf2.member1);
		System.out.println(mf2.member2);
		System.out.println(mf2.member3);
		System.out.println(mf2.member4);
		
	}

}
