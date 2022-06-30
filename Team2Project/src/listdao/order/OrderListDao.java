package listdao.order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;
import listdtovo.order.OrderList;
import listsql.order.OrderListSQL;

public class OrderListDao {
	private DataSource dataSource;
	public OrderListDao() {
		dataSource = new DataSource();
	}
	
	public int insertOrderList(OrderList orderList) throws Exception{
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(OrderListSQL.ORDERLIST_INSERT);
		pstmt.setInt(1, orderList.getMember_no());
		pstmt.setInt(2, orderList.getOrder_price());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int updateOrderList(OrderList orderList) throws Exception{
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(OrderListSQL.ORDERLIST_UPDATE);
		pstmt.setDate(1, orderList.getOrder_date()); // Date 손봐야함 수정예약
		pstmt.setInt(2, orderList.getMember_no());
		pstmt.setInt(3, orderList.getOrder_price());
		pstmt.setInt(4, orderList.getOrder_no());
		int rowCount = pstmt.executeUpdate();
		return rowCount;
	}
	
	public int deleteOrderList(int order_no) throws Exception{
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(OrderListSQL.ORDERLIST_DELETE);
		pstmt.setInt(1, order_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public OrderList selectByNo(int order_no) throws Exception{
		OrderList findOrderList = null;
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(OrderListSQL.ORDERLIST_SELECT_BY_NO);
		pstmt.setInt(1, order_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			findOrderList = new OrderList(rs.getInt("order_no"),
										  rs.getDate("order_date"),
										  rs.getInt("member_no"),
										  rs.getInt("order_price"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return findOrderList;
	}
	
	public List<OrderList> selectAll() throws Exception{
		List<OrderList> orderListList = new ArrayList<OrderList>();
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(OrderListSQL.ORDERLIST_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			orderListList.add(new OrderList(rs.getInt("order_no"),
											rs.getDate("order_date"),
											rs.getInt("member_no"),
											rs.getInt("order_price")));
		}
		rs.close();
		pstmt.close();
		con.close();
		return orderListList;
	}
}
