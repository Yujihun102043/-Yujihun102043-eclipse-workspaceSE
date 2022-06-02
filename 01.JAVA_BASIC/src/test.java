
public class test {

	public static void main(String[] args) {
		String name1, name2;
		int number1, number2, kor1, kor2, eng1, eng2, math1, math2, total1, total2, rank1, rank2, i;
		double average1, average2;
		char grade1, grade2;
		boolean result;

		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		i = 1;
		number1 = i;
		name1 = "김경호";
		kor1 = 42;
		eng1 = 1000;
		math1 = 78;

		number2 = ++i;
		name2 = "김경수";
		kor2 = 45;
		eng2 = 53;
		math2 = 76;
		
		while(kor1<0 || kor1 > 100) {
			System.out.println("김경호님의 국어 점수가 올바르지 않은 점수입니다.");
			return;
		}
		while(eng1<0 || eng1 > 100) {
			System.out.println("김경호님의 영어 점수가 올바르지 않은 점수입니다.");
			return;
		}
		while(math1<0 || math1 > 100) {
			System.out.println("김경호님의 수학 점수가 올바르지 않은 점수입니다.");
			return;
		}
		while(kor2<0 || kor2 > 100) {
			System.out.println("김경호님의 국어 점수가 올바르지 않은 점수입니다.");
			return;
		}
		while(eng2<0 || eng2 > 100) {
			System.out.println("김경호님의 영어 점수가 올바르지 않은 점수입니다.");
			return;
		}
		while(math1<0 || math2 > 100) {
			System.out.println("김경호님의 수학 점수가 올바르지 않은 점수입니다.");
			return;
		}

			
		
		
		}
	}


