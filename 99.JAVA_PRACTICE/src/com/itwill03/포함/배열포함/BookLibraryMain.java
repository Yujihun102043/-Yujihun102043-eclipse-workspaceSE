package com.itwill03.포함.배열포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bookMember=new BookMember(1,"김진호","010-5625-9658");
		
		/*
		 * 책객체들생성
		 */
		Book book1=new Book(46372, "책제목1", "문학", "좋은책1");
		Book book2=new Book(21321, "책제목2", "문학", "좋은책2");
		Book[] rentBooks= {book1,book2};
		bookMember.setBooks(rentBooks);
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체들 참조변수를 회원의 멤버변수에대입
		 */
		
		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		bookMember.print();
		
	}
}
