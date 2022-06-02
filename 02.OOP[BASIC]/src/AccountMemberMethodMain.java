
public class AccountMemberMethodMain {

	public static void main(String[] args) {
		/*
		 * 계좌객체생성
		 */
		Account account1=new Account();
		/*
		 * 계좌데이타 대입
		 */
		account1.setAccountData(1111, "KIM", 70000, 1.5);
		/*
		 *  900원 입금
		 */
		System.out.println("----입금전----");
		account1.print();
		
		account1.deposit(900);
		
		System.out.println("----입금후----");
		account1.print();
		
		/*
		 * 300원출금
		 */
		
		System.out.println("----출금전----");
		account1.print();
		
		System.out.println("----출금후----");
		account1.withDraw(300);
		account1.print();
		System.out.println();
		System.out.println();
		/*
		 * 계좌출력
		 */
		account1.headerPrint();
		account1.print();
		
		/*???????????????
		 * 1.account1계좌잔고만조회
		 * 2.account1계좌이율변경
		 * 3.account1계좌이름변경(개명)
		 */
		
		System.out.println("---은행전체계좌 50원증가---");
		
		Account a1=new Account();
		Account a2=new Account();
		Account a3=new Account();
		
		a1.setAccountData(1234, "KIM", 56000, 2.3);
		a2.setAccountData(7668, "LEE", 78000, 1.4);
		a3.setAccountData(9078, "PARK", 12000, 3.7);
		
		a1.deposit(50);
		a2.deposit(50);
		a3.deposit(50);
		
		a3.headerPrint();
		a1.print();
		a2.print();
		a3.print();
		
		
	}

}
