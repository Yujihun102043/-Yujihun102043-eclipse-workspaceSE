package com.itwill.shop.test;

import java.util.List;


import com.itwill.shop.dto.CartItem;
import com.itwill.shop.dto.Product;
import com.itwill.shop.dto.User;
import com.itwill.shop.service.CartService;

public class CartServiceTestMain {

	public static void main(String[] args)throws Exception {
		CartService cartService=new CartService();
		
		System.out.println("1.add");
		int rowCount=cartService.addCart("guard1",8,1);
		System.out.println(">>"+rowCount);
		
		System.out.println("2.update");
		rowCount=cartService.updateCart(3,3);
		System.out.println(">>"+rowCount);
		System.out.println("3.deleteCartByCartNo");
		rowCount = cartService.deleteCartItem(3);
		System.out.println(">>"+rowCount);
		System.out.println("4.cartList");
		List<CartItem> cartList1=cartService.getCartList("guard1");
		System.out.println("guard1-->"+cartList1);
		List<CartItem> cartList2=cartService.getCartList("guard2");
		System.out.println("guard2-->"+cartList2);
		List<CartItem> cartList3=cartService.getCartList("guard3");
		System.out.println("guard3-->"+cartList3);
		
		
	}

}
