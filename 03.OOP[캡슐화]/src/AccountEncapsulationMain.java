
public class AccountEncapsulationMain {

	public static void main(String[] args) {
		/*
		 * 계좌생성
		 */
		Account account1=new Account();
		account1.setAccountData(1111, "KIM",89000, 0.5);
		/*
		 * 입금
		 */
		account1.deposit(333);
		/*
		 * account1 잔고값얻기
		 */
		int account1Balance = account1.getBalance();
		System.out.println("account1 balance get:"+account1Balance);
		
		/*
		 * 출금
		 */
		account1.withDraw(897);
		/*
		 * account1 잔고값얻기
		 */
		System.out.println("account1 balance get:"+account1.getBalance());
		
		/*
		 * account1객체의 이율변경
		 */
		account1.setIyul(3.0);
		/*
		 * 계좌출력
		 */
		account1.headerPrint();
		account1.print();
		
		

	}

}
