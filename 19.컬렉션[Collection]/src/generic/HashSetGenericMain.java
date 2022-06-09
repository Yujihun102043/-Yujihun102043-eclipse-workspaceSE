package generic;

import java.util.HashSet;
import java.util.Iterator;

import nogeneric.Account;

public class HashSetGenericMain {

	public static void main(String[] args) {
		Account acc1=new Account(1111, "BING", 33000, 0.5);
		Account acc2=new Account(2222, "KING", 23000, 0.1);
		Account acc3=new Account(3333, "KING", 89000, 0.2);
		Account acc4=new Account(4444, "YONG", 12000, 0.5);
		Account acc5=new Account(5555, "SANG", 99000, 0.8);
		
		HashSet<Account> accountSet = new HashSet<Account>();
		System.out.println("# set size:"+accountSet.size());
		/*
		 * add
		 */
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		System.out.println("# set size:"+accountSet.size());
		System.out.println(accountSet);
		boolean isAdd = accountSet.add(acc5);
		System.out.println("추가여부:"+isAdd);
		System.out.println("# set size:"+accountSet.size());
		System.out.println(accountSet);
		/*
		 * remove
		 */
		boolean isRemove=accountSet.remove(acc1);
		System.out.println("삭제여부:"+isRemove);
		System.out.println("# set size:"+accountSet.size());
		System.out.println(accountSet);
		System.out.println("###################iteration[전체출력]###############");
		/* << Set Iteration >>
		 * 1. set 객체를 사용해서 Iterator 객체를 얻는다.
		 */
		Iterator<Account> accountIterator =  accountSet.iterator();
		while(accountIterator.hasNext()) {
			Account tempAccount=accountIterator.next();
			tempAccount.print();
		}

		
	}

}
