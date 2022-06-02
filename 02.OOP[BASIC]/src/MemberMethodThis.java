
public class MemberMethodThis {
	
	int memberField1;
	char memberField2;
	double memberField3;
	/*
	 * 객체의멤버필드에 데이타를 대입
	 */
	void setMemberField(int memberField1,char memberField2,double memberField3) {
		/*
		 * this:
		 *   - self참조(주소)변수
		 *   - void setMemberField()메쏘드를 가지고있는 객체의 주소값
		 *   - this는 생략이가능
		 */
		System.out.println("setMemberField메쏘드안에서 this의주소값:"+this);
		this.memberField1=memberField1;
		this.memberField2=memberField2;
		this.memberField3=memberField3;
		return;
	}
	/*
	 * 객체의 멤버필드의 내용을출력하는메쏘드
	 */
	void print() {
		/*
		 * this:
		 *   - self참조(주소)변수
		 *   - void print()메쏘드를 가지고있는 객체의 주소값
		 *   - this는 생략이가능
		 */
		System.out.println(this.memberField1);
		System.out.println(this.memberField2);
		System.out.println(this.memberField3);
	}
	
	
	
}
