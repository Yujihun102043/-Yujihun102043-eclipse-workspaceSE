package dao.address.second;

import java.sql.SQLIntegrityConstraintViolationException;

public class AddressDao2TestMain {

	public static void main(String[] args) throws Exception{
		/*
		 * AddressDao2TestMain에서 
		 * AddressDao2로 파라메타를 전달
		 */
		AddressDao2 addressDao=
				new AddressDao2();
		System.out.println("1.insert");
		try {
			addressDao.insert("guard","강경호","023-561-9084","서울시민");
		}catch (SQLIntegrityConstraintViolationException e) {
			System.out.println(">>이미존재하는 아이디입니다.");
		}
	
		System.out.println("2.selectByNo");
		addressDao.selectByNo(7);
		addressDao.selectByNo(8);
		addressDao.selectByNo(2134213);
		
		System.out.println("3.selectByAll");
		addressDao.selectAll();
		
		
		System.out.println("4.update");
		addressDao.updateByNo(100,"김변경","888-8888","경남 산청");
		addressDao.updateByNo(101,"이변경","999-7878","경기 분당");
		
		System.out.println("5.delete");
		addressDao.deleteByNo(30);
		addressDao.deleteByNo(31);
		addressDao.deleteByNo(32);
		
		

	}

}
