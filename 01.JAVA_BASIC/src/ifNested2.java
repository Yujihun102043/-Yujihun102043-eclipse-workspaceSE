
public class ifNested2 {

	public static void main(String[] args) {

		int kor = -86;
		
		/*
		 * - 유효한 점수인지 체크
		 * - 점수는 0~100 사이의 정수이다.
		 */
		
		if(kor<0 || kor > 100) {
			System.out.println(kor+ "은 유효한 점수가 아닙니다.");
			return;
		}
		System.out.println(kor+ "은 유효한 점수입니다.");
		/*
		 * 평점산출 (A,B,C,D,F)
		 */
		kor = 78;
		char hakjum = 'F';

		kor = 100;
		hakjum = ' ';

		if (kor >= 90) {
			hakjum = 'A';
		} else if (kor >= 80) {
			hakjum = 'B';
		} else if (kor >= 70) {
			hakjum = 'C';
		} else if (kor >= 60) {
			hakjum = 'D';
		} else {
			hakjum = 'F';
		}
		System.out.printf("2.학점은 %c 입니다.\n", hakjum);

	}

}
