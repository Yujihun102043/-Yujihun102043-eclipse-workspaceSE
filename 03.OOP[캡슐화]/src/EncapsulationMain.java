
public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation encapsulation=new Encapsulation();
		/*
		 * The field Encapsulation.memberField1 is not visible
		 */
		/*
		encapsulation.memberField1=1;
		encapsulation.memberField2=true;
		encapsulation.memberField3='김';
		encapsulation.memberField4=0.3;
		
		System.out.println(encapsulation.memberField1);
		System.out.println(encapsulation.memberField2);
		System.out.println(encapsulation.memberField3);
		System.out.println(encapsulation.memberField4);
		*/
		encapsulation.setMemberField1(1);
		encapsulation.setMemberField2(true);
		encapsulation.setMemberField3('김');
		encapsulation.setMemberField4(0.3);
		
		int returnMemberField1=encapsulation.getMemberField1();
		boolean returnMemberField2=encapsulation.getMemberField2();
		char returnMemberField3=encapsulation.getMemberField3();
		double returnMemberField4=encapsulation.getMemberField4();
		System.out.println(returnMemberField1);
		System.out.println(returnMemberField2);
		System.out.println(returnMemberField3);
		System.out.println(returnMemberField4);
		
		
		
	}

}
