
public class MemberField {
	/*
	 * 1-1. 인스턴스 멤버필드(기본형변수)는 객체생성시 기본값으로 자동 초기화
	 */
	public int member1;		//0
	public double member2;	//0.0
	public char member3;	//0
	public boolean member4;	//false
	
	/*
	 * 인스턴스 멤버필드(참조변수) 는 null값으로 초기화된다.
	 */
	public String member5;
	public String member6;
	/*
	 * 1-2.멤버필드는 선언시 초기값을줄수있다.
	 */
	public int member7=99999;
	public double member8=9.999;
	public char member9='힣';
	public boolean member10=true;
	public String member11="금요일";
	
	public MemberField() {
	}

	public MemberField(int member7, double member8, char member9, boolean member10, String member11) {
		
		this.member7 = member7;
		this.member8 = member8;
		this.member9 = member9;
		this.member10 = member10;
		this.member11 = member11;
	}
	
	
	
	
	
	
	
}
