package com.itwill.shop.test;

import java.sql.Date;
import java.util.ArrayList;

import com.itwill.shop.dao.OrderDao;
import com.itwill.shop.dao.ProductDao;
import com.itwill.shop.dto.Order;
import com.itwill.shop.dto.OrderItem;
import com.itwill.shop.dto.Product;

public class OrderDaoTestMain {

	public static void main(String[] args) throws Exception{
		OrderDao orderDao=new OrderDao();
		System.out.println(orderDao.list("guard1"));
		System.out.println(orderDao.detail("guard1",1));
		
		/*
		 * 1.상품에서직접주문
		 */
		int p_qty=1;
		int p_no=1;
		ProductDao productDao=new ProductDao();
		Product product=productDao.selectByNo(p_no);
		
		ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
		orderItemList.add(new OrderItem(0, p_qty, p_no, product));
		Order newOrder=new Order(0,product.getP_name()+"외 0종" , new Date(0), product.getP_price(), "guard3",orderItemList);
		orderDao.create(newOrder);
		
		System.out.println(orderDao.list("guard3"));
		
		/*
		 * 2.cart에서 주문
		 */
		
		
		
	}

}
