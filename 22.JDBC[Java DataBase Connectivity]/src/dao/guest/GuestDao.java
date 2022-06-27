package dao.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import dao.common.DataSource;

/*
 * Dao(Data[DataBase] Access Object)객체(클래스)
 *   - guest테이블에 CRUD(Create,Read,Update,Delete)작업을 하는 
 *     단위메쏘드를 가지고있는 객체(클래스)
 */
public class GuestDao {
	/*
	 * Dao 객체는멤버변수로 Connection을 생성하는 DataSource객체를 가짐
	 */
	private DataSource dataSource;
	public GuestDao() {
		dataSource = new DataSource();
	}
	public int insertGuest() {
		return 0;
	}
	
	public int updateGuest() {
		return 0;
	}
	
	public int deleteGuest(int guest_no)throws Exception {
		String deleteSql="delete from guest where guest_no=?";
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(deleteSql);
		pstmt.setInt(1, guest_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public Guest selectByNo() {
		return null;
	}
	
	public List<Guest> selectAll() {
		return null;
	}
	
}