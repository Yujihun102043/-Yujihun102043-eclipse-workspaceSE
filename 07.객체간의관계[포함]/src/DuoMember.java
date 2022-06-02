
public class DuoMember {
	private int no;		//회원번호
	private String name;//회원이름
	public DuoMember() {
	}
	public DuoMember(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public void print() {
		System.out.println(this+"-->"+this.no+" , "+this.name);
	}
	
	
	
	
	
	
	
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
