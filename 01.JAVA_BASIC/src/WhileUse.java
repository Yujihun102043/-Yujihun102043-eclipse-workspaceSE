
public class WhileUse {

	public static void main(String[] args) {
		System.out.println(">> 1~10 사이의 정수출력(10회출력)");
		int i=0;
		while (i<10) {
			System.out.print((i+1)+",");
			i++;
		}
		System.out.println();
		System.out.println(">> 1~10 사이의 정수출력(10회출력)");
		i=1;
		while(i<=10) {
			System.out.print(i+",");
			i++;
		}
		System.out.println();
		System.out.println(">> 1~10사이의 정수중에서 홀수출력");
		i=1;
		while(i<=10) {
			if(i%2 == 1) {
				System.out.print(i+",");
			}
			i++;
		}
		System.out.println();
		System.out.println(">> 1~100사이의 정수중에서 4의배수출력");
		i=1;
		while(i<=100) {
			if(i%4==0) {
				System.out.print(i+",");
			}
			i++;
		}
		System.out.println();
		System.out.println(">> 1~100사이의 정수중에서 3의배수이면서 4의배수출력");
		i=1;
		while(i<=100) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+",");
			}
			i++;
		}
		System.out.println();
		System.out.println(">> 1~100사이의정수(짝수,홀수)들의 합");
		int tot=0;
		int evenTot=0;
		int oddTot=0;
		i=1;
		while(i<=100) {
			tot = tot+i;
			//tot+=i;//연산후 대입연산자
			if(i%2==0) {
				evenTot=evenTot+i;
				//evenTot+=i;
			}else {
				oddTot=oddTot+i;
				//oddTot+=i;
			}
			
			i++;
		}
		System.out.println("1~100사이의 정수합: "+tot);
		System.out.println("1~100사이의 짝수합: "+evenTot);
		System.out.println("1~100사이의 홀수합: "+oddTot);
		
		/*
		 * 문자출력
		 */
		char c1=0;
		while(c1 < 65535) {
			System.out.print(c1+ " ");
			c1++;
			if(c1%100==0) {
				System.out.print("\n");
			}
		}
		System.out.println();
		/*
		 * 영문소문자출력
		 */
		char c2='a';
		while(c2 <= 'z') {
			System.out.print(c2+" ");
			c2++;
		}
		System.out.println();
		
		/*Quiz
		 * 1.한글출력
		 * 2.영문대문자출력
		 * 3.숫자형문자(0 ~ 9)출력
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
