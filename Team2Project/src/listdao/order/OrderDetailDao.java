package listdao.order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;
import listdtovo.order.OrderDetail;

public class OrderDetailDao {
	private DataSource dataSource;
	public OrderDetailDao() {
		dataSource = new DataSource();
	}
	
	public int insertOrderDetail(OrderDetail orderDetail) throws Exception{
		String orderDetail_insert = 
				"insert into orderdetail values(orderdetail_order_no_seq.nextval,sysdate,?,?,?)";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(orderDetail_insert);
		pstmt.setInt(1, orderDetail.getMember_no());
		pstmt.setInt(2, orderDetail.getOrder_price());
		pstmt.setInt(3, orderDetail.getOrder_qty());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int updateOrderDetail(OrderDetail orderDetail) throws Exception{
		String orderDetail_update = 
				"update orderDetail set order_date = ?, memeber_no = ?, order_price = ?, order_qty = ? where order_no =?";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(orderDetail_update);
		pstmt.setDate(1, orderDetail.getOrder_date()); // Date 손봐야함 수정예약
		pstmt.setInt(2, orderDetail.getMember_no());
		pstmt.setInt(3, orderDetail.getOrder_price());
		pstmt.setInt(4, orderDetail.getOrder_qty());
		pstmt.setInt(5, orderDetail.getOrder_no());
		int rowCount = pstmt.executeUpdate();
		return rowCount;
	}
	
	public int deleteOrderDetail(int order_no) throws Exception{
		String orderDetail_delete =
				"delete from orderDetail where order_no = ?";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(orderDetail_delete);
		pstmt.setInt(1, order_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public OrderDetail selectByNo(int order_no) throws Exception{
		OrderDetail findOrderDetail = null;
		String orderDetail_select = "select * from orderdetail where order_no = ? ";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(orderDetail_select);
		pstmt.setInt(1, order_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			findOrderDetail = new OrderDetail(rs.getInt("order_no"),
											  rs.getDate("order_date"),
											  rs.getInt("member_no"),
											  rs.getInt("order_price"),
											  rs.getInt("order_qty"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return findOrderDetail;
	}
	
	public List<OrderDetail> selectAll() throws Exception{
		List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();
		String orderDetail_selectAll = "select * from orderdetail";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(orderDetail_selectAll);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			orderDetailList.add(new OrderDetail(rs.getInt("order_no"),
												rs.getDate("order_date"),
												rs.getInt("member_no"),
												rs.getInt("order_price"),
												rs.getInt("order_qty")));
		}
		rs.close();
		pstmt.close();
		con.close();
		return orderDetailList;
	}
}
