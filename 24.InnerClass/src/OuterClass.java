
public class OuterClass {
	/*
	 * 인스턴스 멤버필드
	 */
	public int outer_member_field;
	
	/*
	 * 인스턴스 멤버메소드 
	 */
	public void outer_member_method() {
		System.out.println("OuterClass.outer_member_method()");
	}
	/***************OuterClass에서 InnerClass의 객체생성[사용]*****************/
	public void outer_inner_class_use() {
		//OuterClass.InnerClass ic = new OuterClass.InnerClass();
		InnerClass ic = new InnerClass();
		ic.inner_member_field = 84598;
		ic.inner_member_method();
	}
	/*
	 * 인스턴스 멤버 클래스
	 * 	- 작성 이유 : 내부 클래스에서 외부 클래스의 멤버접근을 손쉽게하기 위해서 작성
	 */
	public class InnerClass{
		public int inner_member_field;
		public void inner_member_method() {
			System.out.println("InnerClass.inner_member_method()");
		}
		/**********내부 클래스에서 외부 클래스의 멤버 접근**********/
		public void inner_outer_access() {
			InnerClass.this.inner_member_field = 1111; // this 앞에 클래스 이름이 붙는다.
			OuterClass.this.outer_member_field = 9999; // 근데 보통 클래스 안에서 쓰니까 생략했었음.
			// 근데 이제 다른 클래스에 접근하려고 할 때면 this 앞에 클래스명을 명시해줘야함.
			
			InnerClass.this.inner_member_method();
			OuterClass.this.outer_member_method();
			
			inner_member_field = 1111;
			outer_member_field = 9999;
			inner_member_method();
			outer_member_method();
			// 생략가능
			
		}
		
	}
}
