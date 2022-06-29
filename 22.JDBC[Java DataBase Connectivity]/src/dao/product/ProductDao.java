package dao.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dao.common.DataSource;

public class ProductDao {
	// 연결객체 멤버필드로 가져오기
	DataSource dataSource;
	
	public ProductDao() {
		dataSource = new DataSource();
	}
	
	public int insertProduct(Product product) throws Exception {
		String insertSQL = "insert into product values(product_no_seq.nextval,?,?,?,?)";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(insertSQL);
		pstmt.setString(1, product.getProduct_name());
		pstmt.setString(2, product.getProduct_short_desc());
		pstmt.setDouble(3, product.getProduct_price());
		pstmt.setDate(4, product.getProduct_ipgo_date());
		int rowCount = pstmt.executeUpdate();
		return rowCount;
	}
	
	public int updateProduct(Product product) throws Exception{
		String updateSQL = "update product set prouduct_name=?,product_short_desc=?,product_price=?,product_ipgo_date=? where product_no = ?";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(updateSQL);
		pstmt.setString(1, product.getProduct_name());
		pstmt.setString(2, product.getProduct_short_desc());
		pstmt.setDouble(3, product.getProduct_price());
		pstmt.setDate(4, product.getProduct_ipgo_date());
		pstmt.setInt(5, product.getProduct_no());
		int rowCount = pstmt.executeUpdate();
		return rowCount;
	}
	
	public int deleteProduct(int product_no) throws Exception{
		String deleteSQL = "delete from product where product_no=?";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(deleteSQL);
		pstmt.setInt(1, product_no);
		int rowCount = pstmt.executeUpdate();
		return rowCount;
	}
	
	public Product selectByNo(Product product) throws Exception{
		Product findProduct = null;
		String selectByNo = "select * from product where product_no=?";
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectByNo);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			findProduct = new Product();
		}
		
		return null;
	}
	
	public int selectAll(Product product) {
		
		
		return 0;
	}
	
	
}
