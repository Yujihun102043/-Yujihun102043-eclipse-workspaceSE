/*
 값(데이타)
 	- 문자  : 김 , A , z
 	- 문자열: "김경호", "JAMES" , "Student"
 	- 숫자  : 1, 2 , 3 , 3.14159
 */
/*
		변수의선언
           - 의미:JVM 에게메모리를할당해달라고 요청하는작업
		   - 형태:
		        데이타타입 이름(식별자);
		         ex> int number;


		   - 변수 이름(식별자)규직(클래스이름,변수이름,메쏘드이름)
			   - 영문이나,한글로시작
			   - 특수문자사용불가(_,$ 는 사용가능)
			   - 키워드 사용금지
*/
public class VariableDeclare {

	public static void main(String[] args) {
		
		int score1;//변수의선언
		score1 = 78;//변수에값(정수형리터럴)대입
		System.out.println(score1);//변수값출력
		score1 = 100;//변수에값대입 기존값 78이 100으로 변경됨 
		System.out.println(score1);
		
		int score2= 78;
		System.out.println(score2);
		
		int _number=333;
		int $number=444;
		int 번호=555;
		System.out.println(_number);
		System.out.println($number);
		System.out.println(번호);
		
		int kor,eng,math;
		kor=90;
		eng=89;
		math=99;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
		/*
		<< Duplicate local variable kor >>
		int kor;
		*/
		/*
		<< history cannot be resolved to a variable >>
		history = 100;
		*/
		
		/*
		int 7up;
		int my score;
		int my-score;
		*/
		String name;
		name="김경호";
		System.out.println(name);
		
		
	}

}










