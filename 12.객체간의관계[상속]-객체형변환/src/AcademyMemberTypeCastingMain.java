
public class AcademyMemberTypeCastingMain {

	public static void main(String[] args) {
		/*
		 public class AcademyStudent extends AcademyMember{}
		 public class AcademyGangsa extends AcademyMember{}
		 public class AcademyStaff extends AcademyMember{}
		
		 AcademyMember의 자식타입객체(AcademyStudent,AcademyGangsa,AcademyStaff)들은
		 AcademyMember타입의 변수에 대입가능
		
		 */
		
		/*
		AcademyMember am=new AcademyMember(1,"아자씨");
		*/
		AcademyStudent st1=new AcademyStudent(1, "KIM", "LINUX");
		AcademyMember m1 = st1;
		
		AcademyMember m2=new AcademyStudent(2, "LEE","JAVA");
		
		AcademyMember m3=new AcademyGangsa(3, "김강사", "보안");
		AcademyMember m4=new AcademyGangsa(4, "정강사", "IOS");
		
		
		AcademyMember m5=new AcademyStaff(5, "허진혁", "마케팅");
		AcademyMember m6=new AcademyStaff(6, "천상룡", "회계부");
		
		/*
		AcademyMember에 정의되지않은 메쏘드호출불가능
		String ban=m1.setBan("C++");
		m1.getBan();
		*/
		System.out.println("---------AcademyMember전체출력-----------");
		/*
		 - AcademyMember타입에 정의된 print 메쏘드를 호출하면
		 - AcademyMember의 자식타입객체(AcademyStudent,AcademyGangsa,AcademyStaff)의
		  	재정의된 print메쏘드가호출된다.
		 */
		m1.print();
		m2.print();
		m3.print();
		m4.print();
		m5.print();
		
		
		
	}

}
