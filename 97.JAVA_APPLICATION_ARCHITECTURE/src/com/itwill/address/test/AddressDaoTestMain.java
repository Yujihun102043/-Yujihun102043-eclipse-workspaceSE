package com.itwill.address.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import javax.swing.JOptionPane;

import com.itwill.address.Address;
import com.itwill.address.AddressDao;

public class AddressDaoTestMain {
	public static void main(String[] args) throws Exception{
		AddressDao addressDao=new AddressDao();
		System.out.println("1.insert");
		Address insertAddress=
				new Address(0, "apple2", "김사과", "333-3333", "서울시 관악구");
		//System.out.println(">> "+addressDao.insert(insertAddress));
		System.out.println("2.deleteByNo");
		System.out.println(">>row count:"+addressDao.deleteByNo(3));
		System.out.println("3.updateByNo");
		Address updateAddress=
				new Address(13,"","김애플","999-9999","경북대구");
		System.out.println(">>row count:"+addressDao.updateByNo(updateAddress));
		System.out.println("4.selectByNo");
		Address findAddress=
				addressDao.selectByNo(4);
		System.out.println(findAddress);
		System.out.println(addressDao.selectByNo(7));
		
		System.out.println("5.selectById");
		findAddress=addressDao.selectById("guard88");
		if(findAddress==null) {
			System.out.println("null --> 아이디중복안됨");
		}else {
			System.out.println("아이디중복됨");
			
		}
		System.out.println("5.selectAll");
		List<Address> addressList = 
				addressDao.selectAll();
		System.out.println(addressList);
		
	}
}





