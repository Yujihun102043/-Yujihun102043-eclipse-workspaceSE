package com.itwill.shop.test;

import com.itwill.shop.dao.ProductDao;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception{
		ProductDao productDao=new ProductDao();
		System.out.println("1.selectAll:");
		System.out.println("  "+productDao.selectAll());
		System.out.println("2.selectByNo:"+productDao.selectByNo(8));
		System.out.println("2.selectByNo:"+productDao.selectByNo(9));

	}

}
