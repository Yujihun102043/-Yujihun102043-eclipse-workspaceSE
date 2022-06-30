package listdao.order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;
import listdtovo.order.OrderList;

public class OrderListDao {
	private DataSource dataSource;
	public OrderListDao() {
		dataSource = new DataSource();
	}
	
	public int insertOrderList(OrderList orderList) throws Exception{
		String orderList_insert = 
				"insert into orderlist values(orderlist_orderdetail_no_seq_nextval,?,?,?,?)";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(orderList_insert);
		pstmt.setInt(1, orderList.getOrder_no());
		pstmt.setInt(2, orderList.getOrder_qty());
		pstmt.setInt(3, orderList.getOrder_stmt());
		pstmt.setInt(4, orderList.getProduct_no());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int updateOrderList(OrderList orderList) throws Exception{
		String orderList_update =
				"update orderlist set order_no = ?,order_qty = ?, order_stmt = ?, product_no = ? where orderdetail_no =?";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(orderList_update);
		pstmt.setInt(1, orderList.getOrder_no());
		pstmt.setInt(2, orderList.getOrder_qty());
		pstmt.setInt(3, orderList.getOrder_stmt());
		pstmt.setInt(4, orderList.getProduct_no());
		pstmt.setInt(5, orderList.getOrderDetail_no());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int deleteOrderList(int orderdetail_no) throws Exception{
		String orderList_delete = "delete from orderList where orderdetail_no =?";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(orderList_delete);
		pstmt.setInt(1, orderdetail_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public OrderList selectByNo(int orderdetail_no) throws Exception{
		OrderList findOrderList = null;
		String orderList_select = "select * from orderlist where orderdetail_no = ?";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(orderList_select);
		pstmt.setInt(1, orderdetail_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) { 
			findOrderList = new OrderList(rs.getInt("orderdetail_no"),
										  rs.getInt("order_no"),
										  rs.getInt("order_qty"),
										  rs.getInt("order_stmt"),
										  rs.getInt("product_no"));
		
		}
		rs.close();
		pstmt.close();
		con.close();
		return findOrderList;
	}
	
	public List<OrderList> selectAll() throws Exception{
		List<OrderList> orderListList = new ArrayList<OrderList>();
		String orderList_selectAll = "select * from orderlist";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(orderList_selectAll);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			orderListList.add(new OrderList(rs.getInt("orderdetail_no"),
											rs.getInt("order_no"),
											rs.getInt("order_qty"),
											rs.getInt("order_stmt"),
											rs.getInt("product_no")));
		}
		rs.close();
		pstmt.close();
		con.close();
		return orderListList;
	}
}
