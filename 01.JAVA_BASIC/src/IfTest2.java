
public class IfTest2 {

	public static void main(String[] args) {
		
		int x=21;
		int y=30;
		
		if(x > y) {
			System.out.println("x > y-->true");
		}else {
			System.out.println("x > y-->false");
		}
		if(x<y) {
			System.out.println("x < y-->true");
		}else {
			System.out.println("x < y-->false");
		}
		if(x==y) {
			System.out.println("x==y --> true");
		}
		
		if(x!=y) {
			System.out.println("x!=y --> true");
		}
		/*
		 * 블록안에서선언된 변수의범위(scope) 
		 */
		int kor=90;
		if(kor>=90) {
			char grade='A';
			String msg="참잘했어요!!";
			System.out.println("kor="+kor);		
			System.out.println("grade="+grade);		
			System.out.println("msg="+msg);	
			/*
			 * if블록안에서 선언된 변수는 if블록밖에서는 사용할수없다.
			 */
		}
		
		System.out.println("kor="+kor);		
		//System.out.println("grade="+grade);		
		//System.out.println("msg="+msg);	
	}

}
