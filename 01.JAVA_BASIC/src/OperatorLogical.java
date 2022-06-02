/*
		논리연산자
		   - 형태:   || (Logical OR) , && (Logical AND) 
		   - 좌우측의항이 논리형변수(or 리터럴) 이다.
           - 결과도 논리형데이타이다.
		    ex> true || false, false && false
*/
public class OperatorLogical {

	public static void main(String[] args) {
		boolean b1,b2,b3,b4;
		boolean result;
		b1=true;
		b2=true;
		b3=false;
		b4=false;
		
		/*
		 * 논리합(logical or) ||
		 *   --> false || false 인경우에만 false반환
		 * 
		 */
		result = b1||b2;
		System.out.println("true||true -->"+result);
		result = b1||b3;
		System.out.println("true||false -->"+result);
		result = b3||b1;
		System.out.println("false||true -->"+result);
		result = b3||b4;
		System.out.println("false||false -->"+result);
		/*
		 * 논리곱(logical and) &&
		 *   --> true && true 인경우에만 true를 반환
		 */
		result = b1 && b2;
		System.out.println("true && true -->"+result);
		result = b1 && b3;
		System.out.println("true && false -->"+result);
		result = b3 && b1;
		System.out.println("false && true -->"+result);
		result = b3 && b4;
		System.out.println("false && false -->"+result);
		
		int kor = 99;
		int eng = 67;
		
		System.out.println("---A대학 국어점수가 90점이상 이거나  영어점수가 90점이상이면 합격---");
		boolean condition1 = kor >= 90;
		boolean condition2 = eng >= 90;
		boolean isPass1 = condition1 || condition2;
		System.out.println("A대학 합격여부( || ):"+isPass1);
		System.out.println("---B대학 국어 영어 점수가 모두 90점이상 이면 합격---");
		boolean isPass2 =  (kor>=90) && (eng>=90) ;
		System.out.println("B대학합격여부(&&):"+isPass2);
		
		
		/*
		 * math 점수가 유효한점수인지판단[ 0 ~ 100사이의 정수]
		 */
		int math=89;
		
		boolean isValidScore = math>=0 && math<=100 ;
		System.out.println("유효한점수여부:"+isValidScore);
		
		boolean isInValidScore = math< 0 || math > 100 ;
		System.out.println("유효하지않은점수여부:"+isInValidScore);
		System.out.println("-----------배수판별--------------");
		
		int number=12;
		boolean isMutiple3 = number%3 == 0 ;
		System.out.println("3의배수여부:"+isMutiple3);
		boolean isMultiple4= number%4==0;
		System.out.println("4의배수여부:"+isMultiple4);
		
		boolean isMultiple34 = isMutiple3 && isMultiple4;
		System.out.println("3의배수이면서 4의배수여부(공배수):"+isMultiple34);
		
		/*
		 * Quiz: 윤년여부판단
		 *    - 4의배수(4로나누어떨어지는수)이면서 100의배수가아닌수(100로나누어떨어지는않는수) 이거나
		 *    - 400의배수(400로나누어떨어지는수)
		 */
		int year = 2022;
		boolean isLeapYear = true;
		System.out.println(year+ " 의 윤년여부:"+isLeapYear);
		
	}

}








