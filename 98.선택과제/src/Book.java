
public class Book {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 */
	/*
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 */
	private int bookNumber;
	private String bookTitle;
	private String bookClass;
	private String bookExplanation;
	
	public Book() {}
	
	public Book(int bookNumber, String bookTitle, String bookClass, String bookExplanation) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		this.bookClass = bookClass;
		this.bookExplanation = bookExplanation;
	}
	
	
	
	/*
	 * <<기능>>
	 *   책정보출력
	 *   
	 */

	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookClass() {
		return bookClass;
	}
	public void setBookClass(String bookClass) {
		this.bookClass = bookClass;
	}
	public String getBookExplanation() {
		return bookExplanation;
	}
	public void setBookExplanation(String bookExplanation) {
		this.bookExplanation = bookExplanation;
	}
	


}

