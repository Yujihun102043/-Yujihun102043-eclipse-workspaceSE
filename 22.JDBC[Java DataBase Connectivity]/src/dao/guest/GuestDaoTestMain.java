package dao.guest;

import java.util.List;

public class GuestDaoTestMain {

	public static void main(String[] args)throws Exception {
				
		GuestDao guestDao=new GuestDao();
		System.out.println("1.insertGuest");
		Guest insertGuest=
				new Guest(0,"김수한",null,
						"guard@gmail.com","http://www.kim.co.kr",
						"제목","내용");
		System.out.println(">>insert row count:"+guestDao.insertGuest(insertGuest));
		System.out.println("2.deleteGuest");
		System.out.println(">>delete row count:"+guestDao.deleteGuest(6));
		System.out.println("3.updateGuest");
		Guest updateGuest=
				new Guest(29, "열여덟", null, 
						"eight@google.co.kr", "http://www.naver.com",
						"타이틀", "컨텐트");
		System.out.println(">>update row count:"+guestDao.updateGuest(updateGuest));
		System.out.println("4.selectByNo");
		Guest findGuest=guestDao.selectByNo(29);
		System.out.println(findGuest);
		System.out.println("5.selectAll");
		List<Guest> guestList=guestDao.selectAll();
		for (Guest guest : guestList) {
			System.out.println(guest);
		}
		
	}

}
