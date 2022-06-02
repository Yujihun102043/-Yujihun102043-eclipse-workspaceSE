public class StudentPrint {

	public static void main(String[] args) {
		String name1, name2;
		int i, number1, number2, kor1, kor2, eng1, eng2, math1, math2, totalscore1, totalscore2, rank1, rank2;
		double average1, average2;
		char grade1, grade2;
		i= 1;
		
		name1 = "김경호"; 
		number1 = i;
		kor1 = 56; 
		eng1  = 77; 
		math1 = 80; 
		rank1 = 0; 
		grade1 = 'F';
		
		name2 = "김경수";
		number2 = ++i;
		kor2 = 71;
		eng2  = 60;
		math2 = 57;
		rank2 = 0;
		grade2 = 'F';
		
		totalscore1 = kor1 + eng1 + math1;
		average1 = (totalscore1/3.0);
		
		totalscore2 = kor2 + eng2 + math2;
		average2 = (totalscore2/3.0);
		
		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번  이름   국어 영어 수학 총점  평균 평점 석차");
		System.out.println("-----------------------------------------------");
		System.out.println(" "+ number1+"   "+name1+"   " +kor1+"   "+eng1+"   " +math1+"   "+ totalscore1+"  "+ (int)average1 +"   "+ grade1+"    "+rank1 );
		System.out.println(" "+ number2+"   "+name2+"   " +kor2+"   "+eng2+"   " +math2+"   "+ totalscore2+"  "+ (int)average2 +"   "+ grade2+"    "+rank2 );
		System.out.println("-----------------------------------------------");
	
	}

}
