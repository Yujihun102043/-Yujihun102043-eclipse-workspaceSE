package com.itwill.guest;

import java.util.List;

public class GusetDaoTestMain {

	public static void main(String[] args) throws Exception{
		GuestDao guestDao = new GuestDao();
		System.out.println("1.insertGuest");
		Guest insertGuest = 
				new Guest(0,"김수한",null,"guard@gmail.com","http://www.kim.co.kr","제목","제목");
		guestDao.insertGuest(insertGuest);
		
		System.out.println("2.deleteGuest");
		System.out.println("delete row count: "+guestDao.deleteGuest(1));
		
		System.out.println("3.updateGuest");
		Guest updateGuest = 
				new Guest(18, "열어덟",null,"eight@google.com",
						"http://www.naver.com","타이틀","타이틀내용");
		System.out.println(">>update row count :" +guestDao.updateGuest(updateGuest));
		
		System.out.println("4.selectByNo");
		Guest findGuest = guestDao.selectByNo(20);
		System.out.println(findGuest);
		
		
		System.out.println("5.selectAll");
		List<Guest> guestList = guestDao.selectAll();
		for (Guest guest : guestList) {
			System.out.println(guest);
		}
		
		
	}

}
