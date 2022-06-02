
public class MemberMethodThisMain {

	public static void main(String[] args) {
		System.out.println("----mmt1----");
		MemberMethodThis  mmt1=new MemberMethodThis();
		System.out.println("mmt1객체주소값:"+mmt1);
		/*
		mmt1.memberField1=1;
		mmt1.memberField2='가';
		mmt1.memberField3=3.14159;
		*/
		mmt1.setMemberField(1,'가',3.14159);
		/*
		System.out.println(mmt1.memberField1);
		System.out.println(mmt1.memberField2);
		System.out.println(mmt1.memberField3);
		*/
		mmt1.print();
		System.out.println("---mmt2----");
		MemberMethodThis mmt2=new MemberMethodThis();
		System.out.println("mmt2객체주소값:"+mmt2);
		/*
		mmt2.memberField1=2;
		mmt2.memberField2='힣';
		mmt2.memberField3=1.21219;
		*/
		mmt2.setMemberField(2,'힣',1.21219);
		/*
		System.out.println(mmt2.memberField1);
		System.out.println(mmt2.memberField2);
		System.out.println(mmt2.memberField3);
		*/
		mmt2.print();
		
		
	}

}
