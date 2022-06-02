
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {
		/*
		int a=345;
		Account acc=new Account(8852,"HONG",56000,3.2);
		int[] ia=new int[5];
		ia[0]=67;
		*/
		
		Account[] accArray = new Account[5];
		accArray[0]=new Account(1111, "KIM", 89000, 0.6);
		accArray[1]=new Account(2222, "LIM", 45000, 0.4);
		accArray[2]=new Account(3333, "MIM", 78000, 0.7);
		accArray[3]=new Account(4444, "NIM", 12000, 0.1);
		accArray[4]=new Account(5555, "OIM", 39000, 0.3);
		
		Account.headerPrint();
		for(int i=0;i< accArray.length;i++) {
			accArray[i].print();
		}
		
		
		
		
		

	}

}
