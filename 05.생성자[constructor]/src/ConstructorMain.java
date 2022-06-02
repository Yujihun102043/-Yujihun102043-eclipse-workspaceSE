
public class ConstructorMain {

	public static void main(String[] args) {
		System.out.println("-----------c1--------------");
		Constructor c1 = new Constructor();
		System.out.println("c1객체주소:"+c1);
		
		/*
		 * << new Constructor(); >>
		 *   1. Constructor클래스(틀)로객체생성
		 *   2. 생성자호출
		 *   3. 객체의 주소반환
		 */
		c1.print();
		
		System.out.println("-----------c2--------------");
		Constructor c2=new Constructor(1, 2);
		c2.print();
		System.out.println("-----------c3--------------");
		Constructor c3=new Constructor(3000, 4000);
		c3.print();
		
	}

}
