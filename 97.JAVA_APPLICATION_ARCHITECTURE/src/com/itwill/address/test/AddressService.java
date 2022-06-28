package com.itwill.address.test;

import java.util.List;

import com.itwill.address.Address;
import com.itwill.address.AddressDao;

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

	/*
	 * 주소록 쓰기
	 */
	public int insert(Address newAddress) throws Exception {
		int result = 0; // 중복:0, 성공:1
		/*
		 * 1. 아이디 중복체크
		 * 2-1.중복아니면 insert (o)
		 * 2-2.중복이면 insert	 (x)
		 */
		Address findAddress = addressDao.selectById(newAddress.getId());
		if (findAddress == null) {
			System.out.println("아이디 중복안됨");
			addressDao.insert(newAddress);
			result = 1;
		} else {
			System.out.println("아이디 중복됨");
			result = 0;
		}
		return result;
	}

	/*
	 * 주소록 삭제(한개)
	 */
	public int deleteByNo(int no) throws Exception {
		return addressDao.deleteByNo(no);
	}

	/*
	 * 주소록 수정(한개)
	 */
	public int updateByNo(Address updateAddress) throws Exception{
		return addressDao.updateByNo(updateAddress);
	}

	/*
	 * 주소록 검색(번호)
	 */
	public Address selectByNo(int no) throws Exception{
		return addressDao.selectByNo(no);
	}

	/*
	 * 모든주소록 검색
	 */
	public List<Address> selectAll() throws Exception {
		return addressDao.selectAll();
	}
}
