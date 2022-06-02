class AccountMany{
	public Account acc0;
	public Account acc1;
	public Account acc2;
	public Account acc3;
	public Account acc4;
	
	
}


public class AccountManyMain {

	public static void main(String[] args) {
		AccountMany accountMany=new AccountMany();
		accountMany.acc0 = new Account(1, "KIM", 4000, 0.4);
		accountMany.acc1 = new Account(2, "LIM", 6000, 0.5);
		accountMany.acc2 = new Account(3, "MIM", 8000, 0.8);
		accountMany.acc3 = new Account(4, "NIM", 9000, 0.9);
		accountMany.acc4 = new Account(5, "OIM", 2000, 0.2);
		Account.headerPrint();
		accountMany.acc0.print();
		accountMany.acc1.print();
		accountMany.acc2.print();
		accountMany.acc3.print();
		accountMany.acc4.print();
		
	}

}
