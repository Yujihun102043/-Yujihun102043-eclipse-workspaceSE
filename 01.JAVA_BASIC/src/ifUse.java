
public class ifUse {

	public static void main(String[] args) {
		int no1 = 55;

		/*
		 * 짝수홀수판별
		 */
		if (no1 % 2 == 0) {
			/*
			System.out.print(no1 + " 은 짝수입니다.");
			System.out.println();
			*/
			System.out.printf("%d 은 %s입니다.\n ", no1, "짝수");
		} else {
			/*
			System.out.print(no1 + " 은 홀수입니다.");
			System.out.println();
			*/
			System.out.printf("%d 는 %s입니다.\n", no1, "홀수");
		}
		/*
		 * 4의 배수 판별
		 */
		int no2 = 4000;
		if (no2 % 4 == 0) {
			System.out.printf("%d 는 4의 배수\n", no2);
		} else {
			System.out.printf("%d 는 4의 배수아님\n", no2);
		}
		/*
		 * 점수의 유효성 체크
		 */
		int kor = 100;
		if (kor >= 0 && kor <= 100) {
			System.out.printf("%d 는 유효한 점수입니다.\n", kor);
		} else {
			System.out.printf("%d 는 유효한 점수가 아닙니다.\n", kor);
		}
		/*
		 * 윤년 여부 출력
		 */
		int year = 2022;
		String msg = "";
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			msg = "윤년";
		} else {
			msg = "평년";
		}
		System.out.printf("%d 는 %s 입니다.\n", year, msg);
		
		/*
		 * 공배수
		 */
		int no3 = 45;
		if(no3%3 == 0 && no3%4 == 0) {
			System.out.printf("%-10d 는 3과4의 공배수입니다.\n", no3);
		}else {
			System.out.printf("%10d 는 3과4의 \t공배수가 아닙니다.\n", no3);
		}
		
		/*
		 * 문자판단
		 */
		char c = 'A';
		if(c>= 'a' && c<='Z') {
			System.out.printf("%c 는 알파벳대문자입니다.\n", c);
		}
		if(c>='0' && c<='9') {
		System.out.println(c+ " 는 숫자형태 문자입니다.");
		}
		
		c= '김';
		if(c>='가' && c<= '힣') {
			System.out.println(c+ "는(은) 한글입니다.");
		}
		
		char idFirstLetter = '&';
		
		
		
	}// end main

}// end class
