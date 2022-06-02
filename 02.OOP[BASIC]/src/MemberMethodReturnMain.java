
public class MemberMethodReturnMain {

	public static void main(String[] args) {
		MemberMethodReturn mmr = new MemberMethodReturn();
		/*
		mmr.memberField1=777;
		mmr.memberField2=888;
		mmr.memberField3=999;
		*/
		System.out.println("-----------setter메쏘드호출-----------");
		// setter 메쏘드호출
		mmr.setMemberField1(777);
		mmr.setMemberField2(888);
		mmr.setMemberField3(999);

		// getter 메쏘드호출

		System.out.println("-----------getter메쏘드호출-----------");
		int returnMemberField1 = mmr.getMemberField1();
		int returnMemberField2 = mmr.getMemberField2();
		int returnMemberField3 = mmr.getMemberField3();
		System.out.println("returnMemberField1:"+returnMemberField1);
		System.out.println("returnMemberField2:"+returnMemberField2);
		System.out.println("returnMemberField3:"+returnMemberField3);
		
		

		int returnData1 = mmr.method1();
		System.out.println("main block-->returnData1:" + returnData1);

		boolean returnData2 = mmr.method2();
		System.out.println("main block-->returnData2:" + returnData2);

		int addResult1 = mmr.add(231434, 34234);
		System.out.println("main block-->addResult1:" + addResult1);

		int addResult2 = mmr.add(3, 3);
		System.out.println("main block-->addResult2:" + addResult2);

		String returnMessage1 = mmr.hello("이효리");
		System.out.println("main block-->returnMessage1:" + returnMessage1);

		String returnMessage2 = mmr.hello("고소영");
		System.out.println("main block-->returnMessage2:" + returnMessage2);

	}

}
