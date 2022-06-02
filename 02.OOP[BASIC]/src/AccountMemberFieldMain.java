
public class AccountMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1 . 1111번계좌 8000원 입금
		 */
		
		/*
		 * - 계좌객체생성
		 * - 계좌데이타대입
		 */
		Account acc1=new Account();
		acc1.no=1111;
		acc1.owner="KIM";
		acc1.balance=30000;
		acc1.iyul=1.2;
		
		/*
		 * - 8000원입금
		 */
		acc1.balance=acc1.balance+8000;
		
		/*
		 * - 계좌정보출력
		 */
		System.out.println("--------------------------");
		System.out.printf("%s %5s %4s %4s \n","번호","이름","잔고","이율");
		System.out.println("--------------------------");
		System.out.printf("%d %6s %8d %5.2f \n",acc1.no,acc1.owner,acc1.balance,acc1.iyul);
		
		
		System.out.println("-----------은행전체계좌3개의 잔고50원증가------------");
		/*
		 *은행계좌 3개생성 
		 */
		Account a1=new Account();
		a1.no=1000;
		a1.owner="HONG";
		a1.balance=70000;
		a1.iyul=0.2;
		
		Account a2=new Account();
		a2.no=2000;
		a2.owner="GONG";
		a2.balance=98000;
		a2.iyul=1.4;
		
		Account a3=new Account();
		a3.no=3000;
		a3.owner="PARK";
		a3.balance=32000;
		a3.iyul=3.2;
		
		
		/*
		 * 계좌3개잔고 50원증가
		 */
		a1.balance+=50;
		a2.balance+=50;
		a2.balance+=50;
		
		/*
		 * 계좌정보출력
		 */
		System.out.println("--------------------------");
		System.out.printf("%s %5s %4s %4s \n","번호","이름","잔고","이율");
		System.out.println("--------------------------");
		System.out.printf("%d %6s %8d %5.2f \n",a1.no,a1.owner,a1.balance,a1.iyul);
		System.out.printf("%d %6s %8d %5.2f \n",a2.no,a2.owner,a2.balance,a2.iyul);
		System.out.printf("%d %6s %8d %5.2f \n",a3.no,a3.owner,a3.balance,a3.iyul);
		
		

	}

}
