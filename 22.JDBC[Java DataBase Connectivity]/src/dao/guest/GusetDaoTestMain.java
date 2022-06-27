package dao.guest;

public class GusetDaoTestMain {

	public static void main(String[] args) throws Exception{
		GuestDao guestDao = new GuestDao();
		System.out.println("1.insertGuest");
		
		System.out.println("2.deleteGuest");
		System.out.println("delete row count: "+guestDao.deleteGuest(1));
		
		System.out.println("1.insertGuest");
		System.out.println("1.insertGuest");
		System.out.println("1.insertGuest");
		System.out.println("1.insertGuest");
		
	}

}
