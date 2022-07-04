package com.itwill.shop.test;

import com.itwill.shop.dao.UserDao;
import com.itwill.shop.dto.User;

public class UserDaoTestMain {

	public static void main(String[] args) throws Exception{
		UserDao userDao=new UserDao();
		System.out.println("1.create:"+
		userDao.create(new User("tomato", "1111", "토마토", "tomato@gmail.com")));
		System.out.println("2.findUser:"+userDao.findUser("tomato"));
		System.out.println("3.update:"+userDao.update(
				new User("tomato", "1111","난오이", "cucum@gmail.com")));
		System.out.println(userDao.findUser("tomato"));
		System.out.println("4.remove:"+userDao.remove("tomato"));
		System.out.println("5.existedUser:"+userDao.existedUser("tomato"));

	}

}
