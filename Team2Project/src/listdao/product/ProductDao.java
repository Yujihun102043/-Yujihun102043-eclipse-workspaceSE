package listdao.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;
import listdtovo.product.Product;
import listsql.product.ProductSQL;

public class ProductDao {
	private DataSource dataSource;
	public ProductDao() {
		dataSource = new DataSource();
	}
	
	public int insertProduct(Product product) throws Exception{
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_INSERT);
		pstmt.setString(1, product.getProduct_name());
		pstmt.setInt(2, product.getProduct_price());
		pstmt.setString(3, product.getProduct_allergy());
		pstmt.setString(4, product.getProduct_content());
		pstmt.setInt(5, product.getProduct_espresso());
		pstmt.setInt(6, product.getProduct_syrup());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int updateProduct(Product product) throws Exception{
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_UPDATE);
		pstmt.setString(1, product.getProduct_name());
		pstmt.setInt(2, product.getProduct_price());
		pstmt.setString(3, product.getProduct_allergy());
		pstmt.setString(4, product.getProduct_content());
		pstmt.setInt(5, product.getProduct_espresso());
		pstmt.setInt(6, product.getProduct_syrup());
		pstmt.setInt(7, product.getProduct_no());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int deleteProduct(int product_no) throws Exception{
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_DELETE);
		pstmt.setInt(1, product_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public Product selectByNo(int product_no) throws Exception{
		Product findProduct = null;
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_SELECT_BY_NO);
		pstmt.setInt(1, product_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			findProduct = new Product(rs.getInt("product_no"),
									  rs.getString("product_name"),
									  rs.getInt("product_price"),
									  rs.getString("product_allergy"),
									  rs.getString("product_content"),
									  rs.getInt("product_espresso"),
									  rs.getInt("product_syrup"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return findProduct;
	}
	
	public List<Product> selectAll() throws Exception{
		List<Product> productList = new ArrayList<Product>();
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			productList.add(new Product(rs.getInt("product_no"),
										rs.getString("product_name"),
										rs.getInt("product_price"),
										rs.getString("product_allergy"),
										rs.getString("product_content"),
										rs.getInt("product_espresso"),
										rs.getInt("product_syrup")));
		}
		rs.close();
		pstmt.close();
		con.close();
		return productList;
	}
}
