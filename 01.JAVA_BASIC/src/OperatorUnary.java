
public class OperatorUnary {

	public static void main(String[] args) {
		int a= 1;
		int b= 2;
		
		int ar = -a;
		int br = +b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(ar);
		System.out.println(br);
		
		boolean isPlay = true;
		System.out.println(isPlay);
		isPlay = !isPlay;
		System.out.println(isPlay);
		
		int kor=-90;
		
		boolean isNotValid = kor < 0 || kor>100;
		System.out.println("유효하지않은점수여부:"+isNotValid);
		boolean isValid = !(kor < 0 || kor>100);
		System.out.println("유효한점수여부:"+isValid);
		
		/*
		 * 증가,감소연산자
		 *   - 항은 반드시 변수이어야한다.
		 *   - 형태: ++,--
		 *     
		 *     int a=5;
		 *     a++;
		 *     a--;
		 *     ++a;
		 *     --a;
		 */     
		System.out.println("-----------------[i++,j--]-----------------");
		int i=5;
		int j=5;
		
		i++;// i = i+1;
		j--;// j = j-1;
		System.out.println("i="+i);
		System.out.println("j="+j);
		
		
		System.out.println("-----------------[++i,--j]-----------------");
		i=5;
		j=5;
		++i;// i = i+1;
		--j;// j = j-1;
		System.out.println("i="+i);
		System.out.println("j="+j);
		
		/*
		System.out.println("--- 연산자를 앞에기술할때와 뒤에 기술할경우 달라지는경우[대입,출력] ---");
		System.out.println("-----------------[i++,j--]-----------------");
		i=5;
		j=5;
		int ir = i++;
		int jr = j--;
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("ir="+ir);
		System.out.println("jr="+jr);
		
		System.out.println("-----------------[++i,--j]-----------------");
		i=5;
		j=5;
		ir = ++i;
		jr = --j;
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("ir="+ir);
		System.out.println("jr="+jr);
		
		
		System.out.println("**********************************************");
		i=5;
		j=5;
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println(++i);
		System.out.println(j++);
		System.out.println("i="+i);
		System.out.println("j="+j);
		*/
		
		
		
		
	}

}
