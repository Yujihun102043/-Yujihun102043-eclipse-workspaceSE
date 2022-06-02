
public class ifNested {

	public static void main(String[] args) {

		/*
		 * 평점 산출 (A,B,C,D,F)
		 */
		int kor = 78;
		char hakjum = 'F';
		/*
		 * 점수는 0~100 사이의 정수이다.
		 */
		if (kor >= 90) {
			hakjum = 'A';
		} else {
			if (kor >= 80) {
				hakjum = 'B';
			} else {
				if (kor >= 70) {
					hakjum = 'C';
				} else {
					if (kor >= 60) {
						hakjum = 'D';
					} else {
						hakjum = 'F';
					}
				}

			}

		}
		System.out.printf("1.학점은 %c 입니다.\n", hakjum);


	}
}