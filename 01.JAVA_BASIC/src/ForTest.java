/*
	for문
	     -형식:
	       	       
	       for(1;2;3){
	       	//1.반복변수(선언,초기화가능)
	       	//2.반복변수의 조건검사(논리형데이타)
	       	//3.반복변수증,감(++,--)
	       }
	       
	       ex>
	       
	       for(int i=0;i<10;i++){
	       	 stmt1;
	       }
	       
	       ex>무한루프
	       for(;;){
	       	
	       }
	
	*/
public class ForTest {

	public static void main(String[] args) {
		
		System.out.println("---while---");
		int k=0;//1.반복변수선언초기화
		while(k<10) {//2.반복변수비교(반복조건)
			System.out.println("k="+k);//3.반복문
			k++;//4.반복변수증감
		}
		System.out.println("---------for i증가-------");
		
		for(int i=0/*1.반복변수선언초기화 */;i<10/*2.반복조건검사*/;i++/*4.반복변수증가*/) {
			System.out.println("i="+i);/*3.반복문실행*/
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("i="+i);
		}
		
		System.out.println("------------for i감소------");
		for(int i=10; i > 0; i-- ) {
			System.out.println("i="+i);
		}
		System.out.println(">>짝수출력[1~10]");
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(">>홀수출력[1~10] continue문");
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				/* 
				- 짝수조건을만족하면 현재 실행중인 for실행블록을 실행하지않는다.
				*/
				continue;
				/*
				 * 1. continue 문이후의 for블록코드를 실행하지않는다
				 * 2. 다음반복을 계속(continue)실행한다
				 */
			}	
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(">>4의배수출력[1~100]");
		
		for(int i=1;i<=100;i++) {
			if(i%4==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(">>3과4의 공배수[1~100]");
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		System.out.println(">>3과4의최소공배수 1개출력[1~100] break문");
		for(int i=1;i<=2147483647;i++) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+ " ");
				break;
				/*
				 * 1.break문이후의 for블록을 실행하지않는다.
				 * 2 다음반복도 실행하지않는다.
				 */
			}
			
		}
		System.out.println();
		System.out.println(">>홀수짝수합[1~100]");
		int tot=0;
		int oddTot=0;
		int evenTot=0;
		
		for(int i=1;i<=100;i++) {
			tot+=i;// tot=tot+i;
			if(i%2==0) {
				evenTot+=i;// evenTot=evenTot+i;
			}else {
				oddTot+=i;//  oddTot=oddTot+i;
			}
		}
		System.out.println("전체합:"+tot);
		System.out.println("홀수합:"+oddTot);
		System.out.println("짝수합:"+evenTot);
		
		System.out.println("----문자출력------");
		for(char c='a';c <= 'z';c++) {
			System.out.print(c);
			if(c=='z') {
				continue;
			}
			System.out.print(",");
			
		}
		System.out.println();
		/*
		 Quiz:알파벳소문자를 아래와같은 형식으로 출력하세요
		  	a,b,c,d,e,
			f,g,h,i,j,
			k,l,m,n,o,
			p,q,r,s,t,
			u,v,w,x,y,
			z
		 */
		System.out.println(">>>>>>1.Quiz ");
		/*
		 * 'a'--> 97
		 * 'z'-->122
		 */
		int count=0;//문자카운트변수
		for(char c='a';c <= 'z';c++) {
			System.out.print(c);
			if(c =='z') {
				continue;
			}	
			System.out.print(",");
			count++;
			if(count%5==0) {
				System.out.print("\n");
			}
		}
		System.out.println(">>>>>>2.Quiz ");
		/*
		 * 'a'--> 97  ==>  c-'a'
		 * 'z'-->122
		 */
		for(char c='a',countChar=1;c <= 'z';c++,countChar++) {
			System.out.print(c);
			if(c =='z') {
				continue;
			}	
			System.out.print(",");
			if(countChar%5==0) {
				System.out.print("\n");
			}
		}
		System.out.println();
		System.out.println(">>>>>>3.Quiz ");
		/*
		 * 'a'--> 97  ==>  c-'a'
		 * 'z'-->122
		 */
		for(char c='a';c <= 'z';c++) {
			System.out.print(c);
			if(c =='z') {
				continue;
			}	
			System.out.print(",");
			if((c-'a'+1)%5==0) {
				System.out.print("\n");
			}
		}
	}//end main
}//end class
















