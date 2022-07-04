package com.itwill.shop.dto;
/*
	이름       널?       유형           
	-------- -------- ------------ 
	CART_NO  NOT NULL NUMBER(10)   
	CART_QTY          NUMBER(10)   
	USERID            VARCHAR2(50) 
	P_NO              NUMBER(10)   
 */
public class CartItem {
	private int cart_no;
	
	/******User************/
	private User user;
	
	/****Product**********/
	private Product product;
	
	private int cart_qty;
	
	public CartItem() {
		// TODO Auto-generated constructor stub
	}

	public CartItem(int cart_no, User user, Product product, int cart_qty) {
		super();
		this.cart_no = cart_no;
		this.user = user;
		this.product = product;
		this.cart_qty = cart_qty;
	}

	public int getCart_no() {
		return cart_no;
	}

	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getCart_qty() {
		return cart_qty;
	}

	public void setCart_qty(int cart_qty) {
		this.cart_qty = cart_qty;
	}

	@Override
	public String toString() {
		return "CartItem [cart_no=" + cart_no + ", user=" + user + ", product=" + product + ", cart_qty=" + cart_qty
				+ "]";
	}
	
	
}
