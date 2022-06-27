package dao.address.fourth;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
public class AddressDao4TestMain {
	public static void main(String[] args) throws Exception{
		/*
		 *  AddressDao4에서 AddressDao4TestMain으로 데이타 리턴
		 */
		AddressDao4 addressDao=
				new AddressDao4();
		System.out.println("1.insert");
		try {
			Address insertAddress=
					new Address(0,"cherry","체리","222-5656","미쿡");
			int insertRowCount=addressDao.insert(insertAddress);
			System.out.println(">>insertRowCount:"+insertRowCount);
		}catch (SQLIntegrityConstraintViolationException e) {
			System.out.println(">>이미존재하는 아이디입니다.");
		}
		System.out.println("2.selectByNo");
		Address findAddress=addressDao.selectByNo(7);
		System.out.println(findAddress);
		System.out.println(addressDao.selectByNo(8));
		findAddress = addressDao.selectByNo(2134213);
		System.out.println(findAddress);
		System.out.println(addressDao.selectByNo(2));
		System.out.println("3.selectByAll");
		List<Address> addressList =
				addressDao.selectAll();
		System.out.println(addressList);
		System.out.println("4.update");
		Address updateAddress=new Address(3,null,"김변경","888-8888", "경남 산청");
		int updateRowCount = addressDao.updateByNo(updateAddress);
		System.out.println("updateRowCount:"+updateRowCount);
		System.out.println("5.delete");
		int deleteRowCount=addressDao.deleteByNo(30);
		System.out.println("deleteRowCount:"+deleteRowCount);
		deleteRowCount=addressDao.deleteByNo(31);
		System.out.println("deleteRowCount:"+deleteRowCount);
		deleteRowCount=addressDao.deleteByNo(32);
		System.out.println("deleteRowCount:"+deleteRowCount);
	}
}