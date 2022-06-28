package scanner;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.print("이름을 입력하세요:");
			/*
			 * Thread가 String 을키보드로부터 입력받기위해 blocking(대기)
			 */
			String nameStr = scanner.next();
			System.out.print("국어점수를 입력하세요:");
			int kor=scanner.nextInt();
			System.out.print("영어점수를 입력하세요:");
			int eng=scanner.nextInt();
			System.out.print("수학점수를 입력하세요:");
			int math=scanner.nextInt();
			int tot=kor+eng+math;
			double avg=tot/3.0;
			System.out.println(nameStr+"\t"+kor+"\t"+math+"\t"+eng+"\t"+tot+"\t"+avg);
			
			System.out.println(">>학생정보입력(이름 국어 영어 수학):");
			nameStr=scanner.next();
			String korStr=scanner.next();
			String engStr=scanner.next();
			String mathStr=scanner.next();
			
			kor=Integer.parseInt(korStr);
			eng=Integer.parseInt(engStr);
			math=Integer.parseInt(mathStr);
			tot=kor+eng+math;
			avg=tot/3.0;
			System.out.println(nameStr+"\t"+kor+"\t"+math+"\t"+eng+"\t"+tot+"\t"+avg);
			
			System.out.print("계속할까요?(y/n)");
			String yn=scanner.next();
			if(!yn.equalsIgnoreCase("Y")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
	}

}












