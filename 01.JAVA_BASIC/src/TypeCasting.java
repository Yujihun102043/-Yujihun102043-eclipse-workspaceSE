/*
		형변환--> 숫자형변수,데이타간에만 가능
		    - 형식 :  (데이타타입)변수 or 리터럴;
		    - 자동형변환(작은데이타-->큰데이타타입변수):promotion
			     byte-->short-->int-->long-->float-->double
		    - 자동형변환안됨(큰데이타-->작은데이타타입변수):casting
			     double-->float-->long-->int-->short-->byte     
       */
public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * 자동형변환
		 */
		int i1=56;
		long l1= i1;
		double d1 = i1;
		System.out.println(d1);
		
		/*
		 * 강제형변환
		 */
		double avgd = 85.78;
		int avgi=(int)avgd;
		System.out.println(avgd);
		System.out.println(avgi);
		
		
		
		
		/*
		 * char문자형
		 *  - 2 byte( 0 ~ 65535)
		 */
		char munja1='A';
		/*
		 'A' ==> 00000000|01000001
		 */
		/*
		 * 정수형리터럴(int) 은 대입되는 변수(char,byte,short)의 범위안에 포함될때는 자동형변환해줌(형변환예외)
		 * 정수형 변수(int)  는 대입되는 변수(char,byte,short)의 범위안에 포함될때도 자동형변환안해줌
		 */
		/*
		  65==> 00000000|00000000|00000000|01000001
		 */
		char munja2 = 65;
		char munja3 = 0b0000000001000001;
		
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		
		byte  b = 127;  //  127 ==> 00000000|00000000|00000000|011111111
		short s = 32767;//32767 ==> 00000000|00000000|01111111|111111111
		
		/*
		 * 연산시의형변환
		 *   - 연산항들중에 가장큰 타입으로 모든항이 자동으로 형변환된다.
		 */
		int ii=100;
		long ll=45;
		double dd=0.12;
		double result = ii+ll+dd;
		System.out.println(result);
	
		
		
		
	}

}












