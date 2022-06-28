package com.itwill.address;
/*
 * - 주소록(address) 관리 비즈니스로직(업무)를 수행하는 클래스
 * - GUI(스윙, 서블릿, JSP)에서 직접 접근(메소드 호출)하는 클래스
 * - AddressDao객체를 이용해서 데이터베이스에 접근하는 클래스
 * - AddressDao객체를 멤버필드로 가진다.
 */
public class AddressService {
	/*
	 * AddressDao객체를 멤버필드로 가진다.
	 */
	private AddressDao addressDao;
	public AddressService() {
		addressDao = new AddressDao();
	}
}
