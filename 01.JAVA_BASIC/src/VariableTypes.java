/*
 리터럴(값,데이타)
 	- 문자  : 김 , A , z
 	- 문자열: "김경호", "JAMES" , "Student"
 	- 숫자  : 1, 2 , 3 , 3.14159
 */
public class VariableTypes {

	public static void main(String[] args) {
		/*
		 * 논리형(1 byte)
		 *   - 논리형변수
		 *   - 논리형리터럴:true,false
		 */
		boolean bool1;
		boolean bool2;
		boolean bool3;
		boolean bool4;
		
		bool1= true;
		bool2=false;
		bool3=true;
		bool4 = bool3;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		System.out.println(bool4);
		/*
		 * 문자형(한문자)(2 byte)
		 *   - 문자형변수
		 *   - 문자형리터럴: 'A','힣','a','1'
		 */
		char munja1,munja2,munja3,munja4,munja5,munja6;
		munja1='A';
		munja2='B';
		munja3='김';
		munja4='경';
		munja5='1';
		munja6=munja1;
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja4);
		System.out.println(munja5);
		System.out.println(munja6);
		
		char munja7 = 65;//??
		System.out.println(munja7);
		char munja8 = 66;//??
		System.out.println(munja8);
		
		
		/*
		 * 숫자형
		 *   1.정수형변수(byte,short,int,long)
		 *     - 정수형 리터럴: 1,2,3,45,-90,10000
		 *   2.실수형변수(float,double)
		 *     - 실수형 리터럴: 0.1 , .1 , 3.141592 , 10000.0    
		 */
		
		byte b1 = 3;
		byte b2 = -128;
		byte b3 = 127;
		byte b4 = 0b01111111;
		System.out.println(b4);
		
		short s1=767;
		short s2=-32768;
		short s3=32767;
		short s4=0b0111111111111111;
		System.out.println(s4);
		
		int i1,i2,i3,i4,i5,i6;
		i1=90;
		i2=-2147483648;
		i3=2147483647;
		i4=0b01111111111111111111111111111111;
		i5=0b10000000000000000000000000000000;
		i6=i1;
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		/*
			- 정수형리터럴의 타입은 int(4byte) 이다
			- 정수형리터럴의 범위는 int(4byte) 범위로 기술하여야한다.
			- 정수형리터럴이 int 범위보다 큰리터럴이 기술되면 에러가발생
		 */
		long l1 = 232;
		long l2 = 2147483648L;
		System.out.println(l1);
		System.out.println(l2);
		/*
		 *   - 실수형리터럴은 double(8byte) 이다.
		 *    
		 */
		float f1,f2,f3;
		f1 = 0.1F;
		f2 = 3.14F;
		f3 = 10000.0F;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		double d1,d2,d3;
		d1 = 3.141592;
		d2 = 12345678912345678.0;
		System.out.println(d2);
		d3 = 1.2345678912345675;
		System.out.println(d3);
		
		System.out.println("---------------------문자열형----------------------");
		
		String str1="오늘은";
		String str2="수요일";
		String str3="변수를 공부합니다.";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		/*
		 * 문자열 접합연산 ( + )
		 */
		String str4 = str1+str2+str3;
		System.out.println(str4);
		String str5=str1+" "+str2+" "+str3;
		System.out.println(str5);
		
		String name="김경호";
		int age=34;
		char gender='M';
		double height=189.3;
		double weight=62.56;
		String myInfo = name+ " "+age+" "+gender+" "+ weight+" "+height;
		System.out.println(myInfo);
		
		System.out.println(name+ " "+age+" "+gender+" "+ weight+" "+height);
	}

}














