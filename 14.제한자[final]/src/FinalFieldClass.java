/*
제한자(final)
	1. 클래스앞에 붙일경우
	   상속금지 
       ex> public final class Test{}
           public class TestChild extens Test{}// error
           
    2. 멤버 메쏘드앞에 붙일경우 
       오버라이딩 금지
       ex> public final void print(){}
       
    3. 멤버필드(변수) 앞에붙일경우--> 상수
       ex> public final int PORT_NUMBER=80;
       상수화된다.    
       변경금지
*/
public class FinalFieldClass {
	public final int PORT_NUMBER=80;
	public final double INCENTIVE_RATE;
	/*
	 The blank final field INCENTIVE_RATE may not have been initialized 
	 */
	public static final double PI=3.141592;
	public static final double EARTH_RADIUS=6400;
	
	public FinalFieldClass() {
		this.INCENTIVE_RATE=0.1;
		
		/*
		The final field FinalFieldClass.XXX cannot be assigned
		this.PORT_NUMBER=90;
		this.INCENTIVE_RATE=0.3;
		FinalFieldClass.PI=3.12;
		FinalFieldClass.EARTH_RADIUS=6500;
		*/
		System.out.println(this.PORT_NUMBER);
		System.out.println(this.INCENTIVE_RATE);
		System.out.println(FinalFieldClass.PI);
		System.out.println(FinalFieldClass.EARTH_RADIUS);
		
	}
	
	
	
}













