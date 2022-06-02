
public class StudentMemberFieldMain { 

	public static void main(String[] args) {
		Student std1; // Student 타입의 참조변수 std1 선언.
		std1 = new Student(); // Student 클래스로 객체를 생성하고 참조변수 std1에 생성된 객체의 주소값이 대입된다.
		
		Student std2; // Student 타입의 참조변수 std2 선언
		std2 = new Student(); // 참조변수(std1,std2)를 선언하면 주소값이 생기는것인지??
		/* new 연산자로 생성된 객체는 메모리 힙 영역에 생성된다. 그리고 객체의 번지를 리턴하도록 되어있다.
		 참조타입 변수는 메모리의 번지를 변수 안에 저장한다.
		 참조변수를 선언만 했다고 주소값이 생길 수 없다. 셧다운 될듯하다.
		 선언한 참조변수std1에 생성된 객체의 주소값이 대입된다.
		*/
		/*
		 * 학생객체 2명생성
		 */
		std1.name = "김경호"; // Student 객체에 String타입 리터럴 대입
		std1.number = 1; // Student 객체의 멤버변수에 int타입 값 대입
		std1.kor = 100; // Student 객체의 멤버변수에 int타입 값 대입
		std1.eng = 90; // Student 객체의 멤버변수에 int타입 값 대입
		std1.math = 78; // Student 객체의 멤버변수에 int타입 값 대입 

		std2.name = "김경수";
		std2.number = 2;
		std2.kor = 70;
		std2.eng = 80;
		std2.math = 76;
		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		std1.rank = 1; // 석차는 구하지 마세요. 멤버변수에 값을 대입
		std1.total = std1.kor + std1.eng + std1.math; // 합계 식 입력. 계산 후 int 타입 값 대입
		std1.average = std1.total/3.; // 평균 식 입력. 세 과목을 더한 값을 /3. 함으로서 소숫값도 구한다. double 타입 값 대입.
		if(std1.average >= 90) {
			std1.grade = 'A';
		}else if(std1.average >= 80) {
			std1.grade = 'B';
		}else if(std1.average >= 70) {
			std1.grade = 'C';
		}else if(std1.average >= 60) {
			std1.grade = 'D';
		}else {
			std1.grade = 'F';
		} // 평균값을 비교하여 평점 계산한다.
		
		std2.rank = 2;
		std2.total = std2.kor + std2.eng + std2.math;
		std2.average = std2.total/3.;
		if(std2.average >= 90) {
			std2.grade = 'A';
		}else if(std2.average >=80) {
			std2.grade = 'B';
		}else if(std2.average >=70) {
			std2.grade = 'C';
		}else if(std2.average >=60) {
			std2.grade = 'D';
		}else {
			std2.grade = 'F';
		}
		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */
		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",std1.number,std1.name, std1.kor,std1.eng,std1.math,std1.total,std1.average,std1.grade,std1.rank );
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",std2.number,std2.name, std2.kor,std2.eng,std2.math,std1.total,std2.average,std2.grade,std2.rank );
		/*
		 * 학생 데이타를 출력 2명
		 */
		/*
		- 출력포맷
		- 평균은 소수점이하 첫째자리까지출력(반올림)
		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/

	}

}
