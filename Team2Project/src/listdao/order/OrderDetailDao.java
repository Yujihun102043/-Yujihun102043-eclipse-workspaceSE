package listdao.order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;
import listdtovo.order.OrderDetail;
import listsql.order.OrderDetailSQL;

public class OrderDetailDao {
	private DataSource dataSource;
	public OrderDetailDao() {
		dataSource = new DataSource();
	}
	
	public int insertOrderDetail(OrderDetail orderDetail) throws Exception{
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(OrderDetailSQL.ORDERDETAIL_INSERT);
		pstmt.setInt(1, orderDetail.getOrder_no());
		pstmt.setInt(2, orderDetail.getOrder_qty());
		pstmt.setInt(3, orderDetail.getOrder_stmt());
		pstmt.setInt(4, orderDetail.getProduct_no());
		pstmt.setInt(5, orderDetail.getProduct_espresso());
		pstmt.setInt(6, orderDetail.getProdut_syrup());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int updateOrderDetail(OrderDetail orderDetail) throws Exception{
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(OrderDetailSQL.ORDERDETAIL_UPDATE);
		pstmt.setInt(1, orderDetail.getOrder_no());
		pstmt.setInt(2, orderDetail.getOrder_qty());
		pstmt.setInt(3, orderDetail.getOrder_stmt());
		pstmt.setInt(4, orderDetail.getProduct_no());
		pstmt.setInt(5, orderDetail.getProduct_espresso());
		pstmt.setInt(6, orderDetail.getProdut_syrup());
		pstmt.setInt(7, orderDetail.getOrderDetail_no());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int deleteOrderDetail(int orderdetail_no) throws Exception{
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(OrderDetailSQL.ORDERDETAIL_DELETE);
		pstmt.setInt(1, orderdetail_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public OrderDetail selectByNo(int orderdetail_no) throws Exception{
		OrderDetail findOrderDetail = null;
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(OrderDetailSQL.ORDERDETAIL_SELECT_BY_NO);
		pstmt.setInt(1, orderdetail_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) { 
			findOrderDetail = new OrderDetail(rs.getInt("orderdetail_no"),
										  	  rs.getInt("order_no"),
										  	  rs.getInt("order_qty"),
										  	  rs.getInt("order_stmt"),
										  	  rs.getInt("product_no"),
										  	  rs.getInt("product_espresso"),
										  	  rs.getInt("product_syrup"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return findOrderDetail;
	}
	
	public List<OrderDetail> selectAll() throws Exception{
		List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(OrderDetailSQL.ORDERDETAIL_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			orderDetailList.add(new OrderDetail(rs.getInt("orderdetail_no"),
												rs.getInt("order_no"),
												rs.getInt("order_qty"),
												rs.getInt("order_stmt"),
												rs.getInt("product_no"),
												rs.getInt("product_espresso"),
												rs.getInt("product_syrup")));
		}
		rs.close();
		pstmt.close();
		con.close();
		return orderDetailList;
	}
}
