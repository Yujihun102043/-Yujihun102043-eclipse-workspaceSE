package com.itwill.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.common.DataSource;


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
	public int insertGuest(Guest guest)throws Exception {
		
		PreparedStatement pstmt = dataSource.getConnection().prepareStatement(GuestSQL.GUEST_INSERT);
		
		pstmt.setString(1,guest.getGuest_name());
		pstmt.setString(2,"guest.email()");
		pstmt.setString(3,"guest.homepage()");
		pstmt.setString(4,"guest.title()");
		pstmt.setString(5,"guest.content()");
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.getConnection().close();
		return rowCount;
	}
	
	public int updateGuest(Guest guest) throws Exception{

		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_UPDATE);
		pstmt.setString(1, guest.getGuest_name());
		pstmt.setString(2, guest.getGuest_email());
		pstmt.setString(3, guest.getGuest_homepage());
		pstmt.setString(4, guest.getGuset_title());
		pstmt.setString(5, guest.getGuest_content());
		pstmt.setInt(6, guest.getGuest_no());
		int rowCount = pstmt.executeUpdate();
		return rowCount;
	}
	
	public int deleteGuest(int guest_no)throws Exception {
		
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_DELETE);
		pstmt.setInt(1, guest_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public Guest selectByNo(int guest_no)throws Exception {
		
		
		Guest findGuest = null;
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_SELECT);
		pstmt.setInt(1, guest_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			findGuest = new Guest(rs.getInt("guest_no"),
									rs.getString("guest_name"),
									rs.getDate("guest_date"),
									rs.getString("guest_email"),
									rs.getString("guest_homepage"),
									rs.getString("guest_title"),
									rs.getString("guest_content"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return findGuest;
	}
	
	public List<Guest> selectAll() throws Exception{

		List<Guest> guestList = new ArrayList<Guest>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.GUEST_SELECTALL);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			guestList.add(new Guest(rs.getInt("guest_no"),
									rs.getString("guest_name"),
									rs.getDate("guest_date"),
									rs.getString("guest_email"),
									rs.getString("guest_homepage"),
									rs.getString("guest_title"),
									rs.getString("guest_content")));
		}
		rs.close();
		pstmt.close();
		con.close();
		return guestList;
	}
	
}