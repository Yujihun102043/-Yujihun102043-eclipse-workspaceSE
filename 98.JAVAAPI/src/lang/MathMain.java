package lang;

public class MathMain {

	public static void main(String[] args) {
		/*
		 * Math 클래스
		 *  - 수학함수를 가지고있는 클래스
		 *  - 모든메쏘드 static이다
		 *  - 객체생성이 불가능하다.(생성자 접근제한자 private)
		 */
		/*
		https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
		Math math=new Math();
		*/
		
		
		double r = Math.abs(-123.564);
		System.out.println(r);
		System.out.println(Math.max(121, 656));
		System.out.println(Math.min(121, 656));
		System.out.println(Math.round(33.55555));
		System.out.println(Math.round(33.55555*10)/10.0);
		System.out.println(Math.round(33.55555*100)/100.0);
		System.out.println(Math.sqrt(2));
		System.out.println(Math.sqrt(3));
		System.out.println(Math.sqrt(4));
		System.out.println(Math.pow(2, 8));
		System.out.println("------------------Math.random()-------------");
		/*
		 << public static double random() >> 
			Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
		 */
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println("1~10사이의 정수5개 랜덤생성");
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println("1~45사이의 정수 6개 랜덤생성");
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
	}

}



















