package nogeneric;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		Account acc1=new Account(1111, "BING", 33000, 0.5);
		Account acc2=new Account(2222, "KING", 23000, 0.1);
		Account acc3=new Account(3333, "KING", 89000, 0.2);
		Account acc4=new Account(4444, "YONG", 12000, 0.5);
		Account acc5=new Account(5555, "SANG", 99000, 0.8);
		/*
		 * ArrayList객체생성
		 */
		ArrayList accountList=new ArrayList();
		int size = accountList.size();
		System.out.println("#size:"+size);
		System.out.println("*****************1.add[맨마지막 index 에객체저장]******************");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("****************2.add(index,element)********************************");
		accountList.add(1, new Account(1112, "QUIM", 99999, 9.9));
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("****************3.set(index,element)********************************");
		accountList.set(5, new Account(9999,"LAST",88888,8.8));
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("****************4.get(index)********************************");
		Account getAccount=(Account)accountList.get(1);
		getAccount.print();
		System.out.println("****************5.remove(index)********************************");
		Account removeAccount = (Account)accountList.remove(1);
		removeAccount.print();
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("*****************1.계좌전체출력************************");
		Account.headerPrint();
		for(int i=0;i < accountList.size();i++) {
			Account tempAccount = (Account)accountList.get(i);
			tempAccount.print();
		}
		System.out.println("****************2.계좌번호 3333번한개찾기*************");
		for(int i=0;i<accountList.size();i++) {
			Account tempAccount=(Account)accountList.get(i);
			if(tempAccount.getNo()==3333) {
				tempAccount.print();
				break;
			}
		}
		System.out.println("****************3.계좌주이름 KING인계좌 여러개찾기****");
		for(int i=0;i<accountList.size();i++) {
			Account tempAccount=(Account)accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				tempAccount.print();
			}
		}
		System.out.println("****************4.계좌번호 4444번 한개삭제***********");
		for(int i=0;i<accountList.size();i++) {
			Account tempAccount=(Account)accountList.get(i);
			if(tempAccount.getNo()==4444) {
				System.out.println(">> remove전 size:"+accountList.size());
				Account removeAcc = (Account)accountList.remove(i);
				removeAcc.print();
				System.out.println(">> remove후 size:"+accountList.size());
				break;
			}
		}
		System.out.println("****************5.이름이 KING인계좌 여러개삭제[QUIZ]*****************");
		for(int i=0;i<accountList.size();i++) {
			Account tempAccount=(Account)accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				Account removeAcc = (Account)accountList.remove(i);
				removeAcc.print();
				
			}
		}
		System.out.println("*****************1.계좌전체출력************************");
		Account.headerPrint();
		for(int i=0;i < accountList.size();i++) {
			Account tempAccount = (Account)accountList.get(i);
			tempAccount.print();
		}
	}

}














