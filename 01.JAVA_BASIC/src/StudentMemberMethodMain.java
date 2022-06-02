
public class StudentMemberMethodMain {

	public static void main(String[] args) {
		Student student1 = new Student();
		
		Student student2 = new Student();
		
		Student student3 = new Student();
		/*
		학생객체생성(3명)
		*/
		student1.setMethod(1,"김경호", 42, 80, 76);
		
		student2.setMethod(1,"김경수", 66, 77, 50);
		
		student3.setMethod(1,"유지훈", 100, 90, 80);
	
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		student1.totMethod();
		student2.totMethod();
		student3.totMethod();
		
		student1.avg();
		student2.avg();
		student3.avg();
		
		student1.grade();
		student2.grade();
		student3.grade();
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		student1.headerPrint();
		System.out.println();
		student1.setprint();
		System.out.println();
		student2.setprint();
		System.out.println();
		student3.setprint();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */


	}

}
