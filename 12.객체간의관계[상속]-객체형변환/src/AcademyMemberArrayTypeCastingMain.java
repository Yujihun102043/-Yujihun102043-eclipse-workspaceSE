
public class AcademyMemberArrayTypeCastingMain {

	public static void main(String[] args) {
		AcademyMember[] members=new AcademyMember[7];
		/*
		 * AcademyMember타입으로 자동형변환
		 */
		members[0]=new AcademyStudent(1,"KIM","JAVA");
		members[1]=new AcademyStudent(2,"LIM","DESIGN");
		members[2]=new AcademyStudent(3,"MIM","IOS");
		members[3]=new AcademyGangsa(4,"OIM","ANDROID");
		members[4]=new AcademyGangsa(5,"PIM","JAVA");
		members[5]=new AcademyStaff(6,"QIM","ACCOUNTING");
		members[6]=new AcademyStaff(7,"RIM","MARKETING");
		System.out.println("----AcademyMember 전체출력------");
		for (int i = 0; i < members.length; i++) {
			/*
			 * AcademyStudent,AcademyStaff,AcademyGangsa에서 재정의된 print메쏘드호출
			 */
			members[i].print();
		}
		System.out.println("----------instanceof-----------");
		/*
		 * 연산자 -->  instanceof
		 *    - 형태		:  참조변수 instanceof  클래스이름
		 *    - 연산결과	:  true or false 
		 *    - ex> boolean b = members[0] instanceof AcademyStudent;
		 *    
		 */
		
		//AcademyMember am=new AcademyStudent(90,"김기수","정보처리");
		AcademyMember am=new AcademyGangsa(90,"김기수","정보처리");
		
		if(am instanceof AcademyStudent) {
			AcademyStudent tempStudent= (AcademyStudent)am;
			String tempBan=tempStudent.getBan();
			System.out.println("학생반:"+tempBan);
		}else {
			System.out.println("am객체가 AcademyStudent클래스로 생성된객체가 아니다.");
		}
		
		
		System.out.println("------------AcademyMember배열에있는 객체들둥에서 AcademyStudent객체들만 출력-------------");
		for(int i=0;i<members.length;i++) {
			if(members[i] instanceof AcademyStudent) {
				members[i].print();
				AcademyStudent tempStudent=(AcademyStudent)members[i];
				String tempBan=tempStudent.getBan();
				System.out.println("학생반:"+tempBan);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
