/*
 *계좌객체를 생성하기위한클래스(틀,타입)
 */
public class Account {
	/*
	 * 1.속성[멤버필드]
	 */
	int no;			//계좌번호
	String owner;	//계좌주이름
	int balance;	//잔고
	double iyul;    //이율
	/*
	 * 2. 멤버메쏘드[기능](계좌 객체가 가지고있는 기능 )
	 */
	
	/*
	 * 계좌데이타를 대입하는메쏘드
	 */
	
	void setAccountData(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	
	/*
	 * 입금
	 */
	void deposit(int m) {
		this.balance+=m;
	}
	/*
	 * 출금
	 */
	void withDraw(int m) {
		this.balance-=m;
	}
	/*
	 * 계좌헤더출력메쏘드(?????)
	 */
	void headerPrint() {
		System.out.println("--------------------------");
		System.out.printf("%s %5s %4s %4s \n","번호","이름","잔고","이율");
		System.out.println("--------------------------");
	}
	/*
	 * 계좌객체정보출력
	 */
	void print() {
		System.out.printf("%d %6s %8d %5.2f \n",this.no,this.owner,this.balance,this.iyul);
	}
}














