

public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		AcademyStudent[] students=new AcademyStudent[3];
		AcademyGangsa[] gangsas=new AcademyGangsa[2];
		AcademyStaff[] staffs=new AcademyStaff[2];
		
		students[0]=new AcademyStudent(1, "KIM", "JAVA");
		students[1]=new AcademyStudent(2, "LIM", "ANDROID");
		students[2]=new AcademyStudent(3, "SIM", "IOS");
		
		gangsas[0]=new AcademyGangsa(4, "김강사", "오피스");
		gangsas[1]=new AcademyGangsa(5, "정강사", "리눅스");
		
		staffs[0]=new AcademyStaff(6,"천상용", "총무부");
		staffs[1]=new AcademyStaff(7,"심덕수", "홍보부");
		
		System.out.println("----------AcademyMember전체출력------");
		System.out.println("------------Student----------");
		for (int i = 0; i < students.length; i++) {
			students[i].studentPrint();
		}
		System.out.println("------------Gangsa----------");
		for (int i = 0; i < gangsas.length; i++) {
			gangsas[i].gangsaPrint();
		}
		System.out.println("------------Staff----------");
		for (int i = 0; i < staffs.length; i++) {
			staffs[i].staffPrint();
		}
		
		

	}

}
