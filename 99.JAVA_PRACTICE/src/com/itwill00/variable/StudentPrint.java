package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		/*
		 * 1.출력할 데이타를 담을 변수선언
		 * << 학번, 이름, 국어, 영어, 수학, 총점, 평균, 평점, 석차 >>
		 */
		int no1;
		String name1;
		int kor1;
		int eng1;
		int math1;
		int tot1;
		double avg1;
		char grade1;
		int rank1;
		
		int no2;
		String name2;
		int kor2;
		int eng2;
		int math2;
		int tot2;
		double avg2;
		char grade2;
		int rank2;
		
		/*
		 2.변수에 데이타 대입
		 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		no1=1;
		name1="김경미";
		kor1=67;
		eng1=89;
		math1=98;
		
		no2=1;
		name2="김경수";
		kor2=90;
		eng2=97;
		math2=99;
		
		
		/* 
		 * 3.학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 *  총점, 평균 연산후 대입 (평점은 F , 석차는 0을 대입)
		 */
		tot1 = kor1+eng1+math1;
		avg1 = tot1/3.0;
		grade1='F';
		rank1=0;
		
		tot2 = kor2+eng2+math2;
		avg2 = tot2/3.0;
		grade2='F';
		rank2=0;
		
		/*
		- 출력포맷
 		- 평균은 소수점이하 0 자리수까지 출력하세요
 		- 석차,평점은 구하지마세요
 		
 		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  89   A    3  
		 2   김경수   45   53   76   334  78   A    2  
		-----------------------------------------------
		*/
		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
		System.out.println("-----------------------------------------------");
		System.out.println(no1+"   "+name1+" "+kor1+" "+eng1+" "+math1+" "+tot1+" "+avg1+" "+grade1+" "+rank1);
		System.out.println(no2+"   "+name2+" "+kor2+" "+eng2+" "+math2+" "+tot2+" "+avg2+" "+grade2+" "+rank2);
		System.out.println("-----------------------------------------------");
	}

}
