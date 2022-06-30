package listdao.order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;
import listdtovo.order.Cart;

public class CartDao {
	private DataSource dataSource;
	public CartDao() {
		dataSource = new DataSource();
	}
	
	public int insertCart(Cart cart) throws Exception{
		String cart_insert = 
				"insert into cart values(?,cart_cart_no_seq.nextval,?,?)"; // 고쳐야함
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(cart_insert);
		pstmt.setInt(1, cart.getProduct_no());
		pstmt.setInt(2, cart.getMember_no());
		pstmt.setInt(3, cart.getCart_qty());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int updateCart(Cart cart) throws Exception{
		String cart_delete = 
				"update cart set product_no=?,member_no=?,cart_qty=? where cart_no =?";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(cart_delete);
		pstmt.setInt(1, cart.getProduct_no());
		pstmt.setInt(2, cart.getMember_no());
		pstmt.setInt(3, cart.getCart_qty());
		pstmt.setInt(4, cart.getCart_no());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int deleteCast(int cart_no) throws Exception{
		String cart_delete = "delete from cart where cart_no =?";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(cart_delete);
		pstmt.setInt(1, cart_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public Cart selectByNo(int cart_no) throws Exception{
		Cart findCart = null;
		String cart_select = "select * from cart where cart_no=?";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(cart_select);
		pstmt.setInt(1, cart_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			findCart = new Cart(rs.getInt("product_no"),
								rs.getInt("cart_no"),
								rs.getInt("member_no"),
								rs.getInt("cart_qty"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return findCart;
	}
	
	public List<Cart> selectAll() throws Exception{
		List<Cart> cartList = new ArrayList<Cart>();
		String cart_selectAll = "select * from cart";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(cart_selectAll);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			cartList.add(new Cart(rs.getInt("product_no"),
								  rs.getInt("cart_no"),
								  rs.getInt("member_no"),
								  rs.getInt("cart_qty")));
		}
		rs.close();
		pstmt.close();
		con.close();
		return cartList;
	}
	
	
	
}
