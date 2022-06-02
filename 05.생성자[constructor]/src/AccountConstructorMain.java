
public class AccountConstructorMain {

	public static void main(String[] args) {
		Account account1=new Account();
		account1.setAccountData(1111, "KIM", 7800, 2.3);
		
		Account account2=new Account(2222, "LEE", 5600, 3.3);
		
		
		account1.headerPrint();
		account1.print();
		account2.print();
		System.out.println(">>객체의 재사용");
		/*
		 * 객체의 재사용
		 */
		account2.setAccountData(3333, "SAM", 30000, 6.3);
		account2.deposit(5000);
		account2.headerPrint();
		account2.print();
		
		System.out.println("1111번님계좌잔고:"+account1.getBalance());
		

	}

}









