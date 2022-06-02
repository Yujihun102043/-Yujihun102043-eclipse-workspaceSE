

public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	*/
	private int memberNumber;
	private String memberName;
	private int memberPhone;
	private Book rentBook;
	
	
	/*
	<<기능>>
	  회원정보출력 
	 */
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(int memberPhone) {
		this.memberPhone = memberPhone;
	}
	public Book getRentBook() {
		return rentBook;
	}
	public void setRentBook(Book rentBook) {
		this.rentBook = rentBook;
	}
	
}
