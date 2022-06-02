package com.itwill03.포함;


public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	*/
	private int no;
	private String name;
	private String phoneNumber;
	private Book rentBook;
	
	public BookMember() {
		// TODO Auto-generated constructor stub
	}
	public BookMember(int no, String name, String phoneNumber) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public BookMember(int no, String name, String phoneNumber, Book rentBook) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.rentBook = rentBook;
	}
	/*
	<<기능>>
	  회원정보출력 
	 */
	
	public void print() {
		System.out.println(no+"\t"+name+"\t"+phoneNumber);
		if(this.rentBook!=null) {
			this.rentBook.print();
		}else {
			System.out.println("빌린책없다.~~~");
		}
	}
	
	public Book getRentBook() {
		return rentBook;
	}
	public void setRentBook(Book rentBook) {
		this.rentBook = rentBook;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
