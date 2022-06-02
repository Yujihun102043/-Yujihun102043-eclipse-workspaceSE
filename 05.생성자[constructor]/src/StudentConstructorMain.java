
public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
			  학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		
		Student std1 = new Student();
		std1.setNo(1);
		std1.setName("김예은");
		std1.setKor(98);
		std1.setEng(90);
		std1.setMath(80);
		
		Student std2 = new Student(2, "김범수", 70, 60, 70);
		Student std3 = new Student(3, "유지훈", 90, 88, 99);
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		
		std1.calculateTotal();
		std2.calculateTotal();
		std3.calculateTotal();
		
		std1.calculateAvg();
		std2.calculateAvg();
		std3.calculateAvg();
		
		std1.calculateGrade();
		std2.calculateGrade();
		std3.calculateGrade();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		
		std1.headerPrint();
		std1.print();
		std2.print();
		std3.print();
		
		/*
		 * 학생 student1 의 이름변경한후(이름변경메쏘드호출후) student1학생객체출력
		 * 학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		 * 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		 */
		
		System.out.println();
		std1.setName("홍기범");
		std1.headerPrint();
		std1.print();
		
		int totdata = std1.getTot();
		System.out.println("std1 총점 데이타 : " + totdata);
		
		char gradedata = std1.getGrade();
		System.out.println("std1 학점 데이타 : " + gradedata);
		
	}

}
