package wrapper;

public class WrapperClassMain {

	public static void main(String[] args) {
		System.out.println("----------Boxing UnBoxing----------");
		/*
		 * Boxing[기본형-->Wrapper객체]
		 */
		Character wc = new Character('김');
		Integer wi = new Integer(12315);
		Double wd = new Double(3.14159);
		Boolean wb = new Boolean(true);
		/*
		 * UnBoxing[Wrapper객체-->기본형]
		 */
		char c1 = wc.charValue();
		double d1 = wd.doubleValue();
		boolean b1 = wb.booleanValue();
		System.out.println("----------Auto Boxing Auto UnBoxing---------");
		/*
		 * Auto Boxing [기본형 --> Wrapper객체]
		 */
		Character  wc2 = '김';
		Integer wi2 = 12135;
		Double wd2 = 3.14159;
		Boolean wb2 = true;
		/*
		 * Auto UnBoxing[Wrapper객체 --> 기본형]
		 */
		char c2 = wc2;
		int i2 = wi2;
		double d2 = wd2;
		boolean b2 = wb2;
		System.out.println("*******************AUTO BOXING*****************");
		int a = 89;
		int b = 45;
		int c = 78;
		int d = 90;
		int e = 99;
		
		Integer ia = a;
		Integer ib = b;
		Integer ic = c;
		Integer id = d;
		Integer ie = e;
		
		System.out.println("*******************자동 형변환*****************");
		Object oa = ia;
		Object ob = ib;
		Object oc = ic;
		Object od = id;
		Object oe = ie;
		
		System.out.println("************AUTO BOXING, 자동형변환***************");
		Object ooa = 89;
		Object oob = 45;
		Object ooc = 78;
		Object ood = 90;
		Object ooe = 99;
		
		System.out.println("**********Object[]***********");
		Object[] scoreArray = new Object[5];
		scoreArray[0] = 89;
		scoreArray[1] = 45;
		scoreArray[2] = 78;
		scoreArray[3] = 90;
		scoreArray[4] = 99;
		
		for(int i=0;i<scoreArray.length;i++) {
			/*
			Integer tempScore = (Integer)scoreArray[i];
			int Score = tempScore.intValue();
			System.out.println(Score);
			*/
			int score = (Integer)scoreArray[i];
			System.out.print(score + " ");
		}
		System.out.println();
		
		
		
	}

}
