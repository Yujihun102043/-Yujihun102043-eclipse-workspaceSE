
public class ReferenceVariableMain {

	public static void main(String[] args) {
		System.out.println("----------기본형변수(swap)----------");
		int score1 = 80;
		int score2 = 90;
		System.out.println("score1=" + score1);
		System.out.println("score2=" + score2);

		int tempScore = score2;
		score2 = score1;
		score1 = tempScore;

		System.out.println("score1=" + score1);
		System.out.println("score2=" + score2);

		System.out.println("----참조형변수------");
		DuoMember memberOne = new DuoMember(1, "일번님");
		DuoMember memberTwo = new DuoMember(2, "이번님");
		DuoMember memberThree = memberOne;
		
		memberOne.print();
		memberThree.print();
		memberTwo.print();
		
		System.out.println("------참조형변수비교----------");
		if(memberOne == memberThree) {
			System.out.println("주소가 같다.   -->"+memberOne+" == "+memberThree);
		}
		if(memberOne!= memberTwo) {
			System.out.println("주소가 다르다. -->"+memberOne+" != "+memberTwo);
		}
		
		System.out.println("-------참조형변수 주소swap-----");
		DuoMember m1=new DuoMember(1000, "김경호");
		DuoMember m2=new DuoMember(2000, "신명숙");
		m1.print();
		m2.print();
		
		DuoMember tempMember=m1;
		m1=m2;
		m2=tempMember;
		
		m1.print();
		m2.print();
		
		
		System.out.println("------기본형변수 초기값-------");
		int tot=0;
		double avg=0.0;
		char c='\u0000';
		boolean isMarried=false;
		System.out.println("------참조형변수 초기값------");
		
		DuoMember m3=null;
		/*
		 * null :객체주소 리터럴(값)
		 *    - 객체주소값 초기화의 용도로 사용
		 *    - null주소사용시 NullPointerException 이 발생
		 */
		if(m3==null) {
			m3=new DuoMember(3000, "이소라");
		}
		m3.print();
		
		
	}

}
