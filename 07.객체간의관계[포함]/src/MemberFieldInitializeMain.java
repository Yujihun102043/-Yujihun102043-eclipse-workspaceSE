
public class MemberFieldInitializeMain {

	public static void main(String[] args) {
		MemberField mf1=new MemberField();
		System.out.println("1-1. 인스턴스 멤버필드는 객체생성시 기본값으로 자동 초기화");
		System.out.println(mf1.member1);
		System.out.println(mf1.member2);
		System.out.println(mf1.member3);
		System.out.println(mf1.member4);
		System.out.println("\t참조변수는 null값으로 초기화된다.");
		System.out.println(mf1.member5);
		System.out.println(mf1.member6);
		System.out.println("1-2.멤버필드는 선언시 초기값을줄수있다.");
		System.out.println(mf1.member7);
		System.out.println(mf1.member8);
		System.out.println(mf1.member9);
		System.out.println(mf1.member10);
		System.out.println(mf1.member11);
		System.out.println("---------------mf2-------------");
		MemberField mf2=new MemberField(333, 3.0, '꿈', false, "멤버필드초기화순서");
		System.out.println(mf2.member7);
		System.out.println(mf2.member8);
		System.out.println(mf2.member9);
		System.out.println(mf2.member10);
		System.out.println(mf2.member11);
		
		String str="ㅎ헤헤헤";
	}

}
