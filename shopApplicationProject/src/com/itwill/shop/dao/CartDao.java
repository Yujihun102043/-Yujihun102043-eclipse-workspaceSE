package com.itwill.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

import com.itwill.shop.common.DataSource;
import com.itwill.shop.dto.CartItem;
import com.itwill.shop.dto.Product;
import com.itwill.shop.dto.User;
public class CartDao {
	private DataSource dataSource;
	public CartDao() throws Exception{
		dataSource = new DataSource();
	}
	/*
	 * cart제품 존재여부
	 */
	public int  selectProductCount(String sUserId,int p_no) throws Exception{
		int count=0;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String selectQuery="select count(*)  as p_count from cart c join userinfo u on c.userid=u.userid where u.userid=? and c.p_no=?";
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(selectQuery);
			pstmt.setString(1, sUserId);
			pstmt.setInt(2, p_no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				count=rs.getInt(1);
			}
			
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return count;
	}
	
	
	/*
	 * cart insert
	 */
	public int add(CartItem cartItem) throws Exception {
		String insertQuery="insert into cart(cart_no,userId,p_no,cart_qty) values (cart_cart_no_SEQ.nextval,?,?,?)";
		Connection con=null;
		PreparedStatement pstmt=null;
		int insertRowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(insertQuery);
			pstmt.setString(1, cartItem.getUser().getUserId());
			pstmt.setInt(2, cartItem.getProduct().getP_no());
			pstmt.setInt(3, cartItem.getCart_qty());
			insertRowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return insertRowCount;
		
	}
	/*
	 * cart insert
	 */
	public int add(String sUserId,int p_no,int cart_qty) throws Exception {
		String insertQuery="insert into cart(cart_no,userId,p_no,cart_qty) values (cart_cart_no_SEQ.nextval,?,?,?)";
		Connection con=null;
		PreparedStatement pstmt=null;
		int insertRowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(insertQuery);
			pstmt.setString(1, sUserId);
			pstmt.setInt(2, p_no);
			pstmt.setInt(3, cart_qty);
			insertRowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return insertRowCount;
		
	}
	/*
	 * cart add update(카트추가시update)
	 */
	public int update(String sUserId,int p_no,int cart_qty) throws Exception{
		String updateQuery="update cart set cart_qty=cart_qty + ? where userid=? and p_no=?";
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(updateQuery);
			pstmt.setInt(1, cart_qty);
			pstmt.setString(2, sUserId);
			pstmt.setInt(3, p_no);
			rowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return rowCount;
	}
	/*
	 * cart update(카트리스트에서 수정)
	 * 
	 */
	public int update(int cart_no,int cart_qty) throws Exception{
		String updateQuery="update cart set cart_qty=? where cart_no=?";
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(updateQuery);
			pstmt.setInt(1, cart_qty);
			pstmt.setInt(2, cart_no);
			rowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return rowCount;
	}
	/*
	 * cart list
	 */
	public ArrayList<CartItem> getCartList(String sUserId) throws Exception{
		ArrayList<CartItem> cartList=new ArrayList<CartItem>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String selectQuery="select * from cart c join userinfo u on c.userid=u.userid  "
				        + "join product p on p.p_no=c.p_no "
				        + "where u.userid=?";
		
		con=dataSource.getConnection();
		pstmt=con.prepareStatement(selectQuery);
		pstmt.setString(1,sUserId);
		rs=pstmt.executeQuery();
		//int p_no, String p_name, int p_price, String p_image, String p_desc, int p_click_count
		while(rs.next()) {
			cartList.add(
					new CartItem(rs.getInt("cart_no"),
								 new User(rs.getString("userId"),"","",""),
								 new Product(rs.getInt("p_no"),
											rs.getString("p_name"),
											rs.getInt("p_price"),
											rs.getString("p_image"),
											rs.getString("p_desc"),
											rs.getInt("p_click_count")),
								 rs.getInt("cart_qty")
								 )
					);
		}
		
		return cartList;
	}
	
	/*
	 * cart pk delete
	 */
	public int deleteCartByNo(int cart_no) throws Exception{
		String deleteQuery="delete from cart where cart_no=?";
		Connection con=null;
		PreparedStatement pstmt=null;
		int deleteRowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(deleteQuery);
			pstmt.setInt(1, cart_no);
			deleteRowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return deleteRowCount;
	}
	/*
	 * cart  delete
	 */
	public int deleteCart(String sUserId) throws Exception{
		String deleteQuery="delete from cart where userid=?";
		Connection con=null;
		PreparedStatement pstmt=null;
		int deleteRowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(deleteQuery);
			pstmt.setString(1, sUserId);
			deleteRowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return deleteRowCount;
	}
	
	public CartItem getCartItemByCartNo(int cart_no)throws Exception {
		CartItem cartItem=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String selectQuery="select * from cart c join product p on c.p_no=p.p_no where cart_no=?";
		
		return cartItem;
	}
	
}
