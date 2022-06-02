
public class AcademyMemberMain {

	public static void main(String[] args) {
		/*
		AcademyMember academyMember=new AcademyMember(0, "아무개");
		*/
		AcademyStudent st1=new AcademyStudent(1, "KIM", "LINUX");
		AcademyStudent st2=new AcademyStudent(2, "KAN", "JAVA");
		
		AcademyGangsa gs1=new AcademyGangsa(3, "HONG", "웹디자인");
		AcademyGangsa gs2=new AcademyGangsa(4, "SIM", "안드로이드");
		
		AcademyStaff sf1=new AcademyStaff(5,"LEE", "영업");
		AcademyStaff sf2=new AcademyStaff(6, "JUNG", "취업");
		
		System.out.println("-------------Student-----------");
		//st1.print();
		st1.studentPrint();
		st2.studentPrint();
		System.out.println("-------------Gangsa-------------");
		gs1.gangsaPrint();
		gs2.gangsaPrint();
		System.out.println("-------------Staff---------------");
		sf1.staffPrint();
		sf2.staffPrint();
		System.out.println("--------------Object-------------");
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(gs1.toString());
		System.out.println(gs2.toString());
		System.out.println(sf1.toString());
		System.out.println(sf1.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
