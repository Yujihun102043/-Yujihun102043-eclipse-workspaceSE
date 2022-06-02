
public class AcademyMemberOverridingMain {

	public static void main(String[] args) {
		AcademyStudent st1=new AcademyStudent(1, "KIM", "LINUX");
		AcademyStudent st2=new AcademyStudent(2, "KAN", "JAVA");
		
		AcademyGangsa gs1=new AcademyGangsa(3, "HONG", "웹디자인");
		AcademyGangsa gs2=new AcademyGangsa(4, "SIM", "안드로이드");
		
		AcademyStaff sf1=new AcademyStaff(5,"LEE", "영업");
		AcademyStaff sf2=new AcademyStaff(6, "JUNG", "취업");
		
		System.out.println("-------------Student-----------");
		st1.print();
		st1.print();
		System.out.println("-------------Gangsa-------------");
		gs1.print();
		gs2.print();
		System.out.println("-------------Staff---------------");
		sf1.print();
		sf2.print();
		System.out.println("--------------Object-------------");
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(gs1.toString());
		System.out.println(gs2.toString());
		System.out.println(sf1.toString());
		System.out.println(sf1.toString());

	}

}
