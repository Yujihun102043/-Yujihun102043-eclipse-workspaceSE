package listdao.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;
import listdtovo.member.Login;
import listsql.member.LoginSQL;

public class LoginDao {
	private DataSource dataSource;
	public LoginDao() {
		dataSource = new DataSource();
	}
	
	public int insertLogin(Login login) throws Exception{
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(LoginSQL.LOGIN_INSERT);
		pstmt.setString(1, login.getMember_id());
		pstmt.setString(2, login.getMember_password());
		pstmt.setInt(3, login.getLogin());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int updateLogin(Login login) throws Exception{
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(LoginSQL.LOGIN_UPDATE);
		pstmt.setString(1, login.getMember_id());
		pstmt.setString(2, login.getMember_password());
		pstmt.setInt(3, login.getLogin());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int deleteLogin(int login) throws Exception{
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(LoginSQL.LOGIN_DELETE);
		pstmt.setInt(1, login);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public Login selectByNo(int login) throws Exception{
		Login findLogin = null;
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(LoginSQL.LOGIN_SELECT_BY_NO);
		pstmt.setInt(1, login);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			findLogin = new Login(rs.getString("member_id"),
								  rs.getString("member_password"),
								  rs.getInt("login"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return findLogin;
	}
	
	public List<Login> selectAll() throws Exception{
		List<Login> loginList = new ArrayList<Login>();
		String login_selectAll = "select * from login";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(LoginSQL.LOGIN_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			loginList.add(new Login(rs.getString("member_id"),
									rs.getString("member_password"),
									rs.getInt("login"))); 
		}
		rs.close();
		pstmt.close();
		con.close();
		return loginList;
	}
}
