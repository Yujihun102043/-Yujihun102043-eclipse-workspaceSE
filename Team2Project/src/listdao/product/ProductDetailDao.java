package listdao.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;
import listdtovo.product.ProductDetail;

public class ProductDetailDao {
	private DataSource dataSource;
	public ProductDetailDao() {
		dataSource = new DataSource();
	}
	
	public int insertProuductdetail(ProductDetail productDetail) throws Exception{
		String productdetail_insert = 
				"insert into productdetail values(?,?,?,?)";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(productdetail_insert);
		pstmt.setInt(1, productDetail.getProduct_no());
		pstmt.setInt(2, productDetail.getKal());
		pstmt.setInt(3, productDetail.getCaffeine());
		pstmt.setInt(4, productDetail.getNa());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int updateProuductDetail(ProductDetail productDetail) throws Exception{
		String productdetail_update = 
				"update productdetail set kal = ?, caffeine = ?, na = ? where product_no = ?";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(productdetail_update);
		pstmt.setInt(1, productDetail.getKal());
		pstmt.setInt(2, productDetail.getCaffeine());
		pstmt.setInt(3, productDetail.getNa());
		pstmt.setInt(4, productDetail.getProduct_no());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int deleteProuductDetail(int product_no) throws Exception{
		String productdetail_delete = "delete from productdetail where product_no =?"; 
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(productdetail_delete);
		pstmt.setInt(1, product_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public ProductDetail selectByNo(int product_no) throws Exception{
		ProductDetail findProductDetail = null;
		String productDetail_select = "select * from productdetail where product_no = ?";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(productDetail_select);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			findProductDetail = new ProductDetail(rs.getInt("product_no"),
												  rs.getInt("kal"),
												  rs.getInt("caffeine"),
												  rs.getInt("na"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return findProductDetail;
		
	}
	
	public List<ProductDetail> insertProuductDetail() throws Exception{
		List<ProductDetail> productDetailList = new ArrayList<ProductDetail>();
		String productDetail_selectAll = "select * from productdetail";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(productDetail_selectAll);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			productDetailList.add(new ProductDetail(rs.getInt("product_no"),
													rs.getInt("kal"),
													rs.getInt("caffeine"),
													rs.getInt("na")));
		}
		rs.close();
		pstmt.close();
		con.close();
		return productDetailList;
	}
	
}
