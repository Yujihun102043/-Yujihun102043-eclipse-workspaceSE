/*
반복문
     stmt1;
     while(조건문){
		 //조건문--> 논리형데이타를 반환하는 식(논리형변수,논리형리터럴) 
		stmt2;
	 }
	 stmt3;
     
	 흐름  
	  - 조건식의 데이타가 true인동안실행
      - 조건식의 데이타가 false이면 while블록을 빠져나온다.
*/
public class WhileTest {

	public static void main(String[] args) {
		System.out.println("---- i=0 -----");
		int i=0;
		while(i < 10) {
			System.out.println("stmt:i="+i);
			i++;
		}
		System.out.println("---- i=1 -----");
		i=1;
		while(i<=10) {
			System.out.println("stmt:i="+i);
			i++;
		}
		
		
	}

}
