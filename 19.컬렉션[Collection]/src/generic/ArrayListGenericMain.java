package generic;

import java.util.ArrayList;
import java.util.Iterator;

import nogeneric.Account;

public class ArrayListGenericMain {

	public static void main(String[] args) {
		ArrayList<Account>  accountList=new ArrayList<Account>();
		System.out.println("#list size:"+accountList.size());
		accountList.add(new Account(1111, "ZIM", 89000, 2.3));
		accountList.add(new Account(2222, "JIM", 77000, 3.4));
		accountList.add(new Account(3333, "KIM", 45000, 1.8));
		accountList.add(new Account(4444, "SIM", 69000, 4.7));
		accountList.add(new Account(5555, "KIM", 99000, 1.0));
		System.out.println("#list size:"+accountList.size());
		System.out.println(accountList);
		
		accountList.add(1,new Account(1112, "NEW", 52000, 1.1));
		System.out.println("#list size:"+accountList.size());
		System.out.println(accountList);
		
		accountList.set(0, new Account(1000, "FIRST", 11000, 10));
		System.out.println("#list size:"+accountList.size());
		System.out.println(accountList);
		
		Account removeAccount = accountList.remove(0);
		removeAccount.print();
		
		Account getAccount=accountList.get(0);
		getAccount.print();
		System.out.println("###################iteration[전체출력]###############");
		Iterator<Account> accountIterator = accountList.iterator();
		while(accountIterator.hasNext()) {
			accountIterator.next().print();;
		}
		
		System.out.println("%%%%%%%%%%%업무실행%%%%%%%%%%%%%");
		
		System.out.println("********1.계좌전체출력*************");
		for(int i=0;i<accountList.size();i++) {
			/*Account tempAccount = accountList.get(i);
			tempAccount.print();*/
			accountList.get(i).print();
			
		}
		System.out.println("--------enhanced for----------");
		for (Account account : accountList) {
			account.print();
		}
		System.out.println("*********2.계좌번호 3333번계좌1개찾기***************");
		for (Account account : accountList) {
			if(account.getNo()==3333) {
				account.print();
				break;
			}
		}
		System.out.println("*********3.계좌주이름  KIM 계좌여러개찾기***********");
		for (Account account : accountList) {
			if(account.getOwner().equals("KIM")) {
				account.print();
			}
		}
		System.out.println("*********4.계좌번호  4444번 계좌1개삭제***********");
		for (Account account : accountList) {
			if(account.getNo()==4444) {
				boolean isRemove=accountList.remove(account);
				if(isRemove) {
					account.print();
				}
				break;
			}
		}
		System.out.println("*********5.계좌주이름  KIM인 계좌여러개삭제***********");
		for(int i=0;i<accountList.size();i++) {
			if(accountList.get(i).getOwner().equals("KIM")) {
				accountList.remove(i).print();;
				i--;
			}
		}
		System.out.println("********계좌전체출력*************");
		for (Account account : accountList) {
			account.print();
		}
		
		
		
		
		
		
		
	}

}
