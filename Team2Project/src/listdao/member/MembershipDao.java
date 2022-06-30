package listdao.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;
import listdtovo.member.Membership;

public class MembershipDao {
	private DataSource dataSource;

	public MembershipDao() {
		dataSource = new DataSource();

	}
	
	public int insertMembership(Membership membership) throws Exception{
		String membership_insert = 
				"insert into memvership values(membership_member_no_seq_nextval,?,?,?,sysdate,?,?,?,?)";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(membership_insert);
		pstmt.setString(1, membership.getMember_id());
		pstmt.setString(2, membership.getMember_password());
		pstmt.setString(3, membership.getMember_phone());
		pstmt.setDate(4, membership.getMember_birthday());
		pstmt.setString(5, membership.getMember_email());
		pstmt.setString(6, membership.getMember_nickname());
		pstmt.setString(7, membership.getMember_loc());
		pstmt.setInt(8, membership.getMember_PAgree());
		pstmt.setInt(9, membership.getMember_EAgree());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int updateMembership(Membership membership) throws Exception{
		String membership_update = 
				"update membership set member_id = ?, member_password = ?, member_phone = ?, member_birthday = ?, member_email = ?, member_nickname = ?, member_loc = ?, member_pagree = ?, member_eagree = ? where member_no = ?";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(membership_update);
		pstmt.setString(1, membership.getMember_id());
		pstmt.setString(2, membership.getMember_password());
		pstmt.setString(3, membership.getMember_phone());
		pstmt.setDate(4, membership.getMember_birthday());
		pstmt.setString(5, membership.getMember_email());
		pstmt.setString(6, membership.getMember_nickname());
		pstmt.setString(7, membership.getMember_loc());
		pstmt.setInt(8, membership.getMember_PAgree());
		pstmt.setInt(9, membership.getMember_EAgree());
		pstmt.setInt(10, membership.getMember_no());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int deleteMembership(int member_no) throws Exception{
		String membership_delete = "delete from membership where member_no = ?";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(membership_delete);
		pstmt.setInt(1, member_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public Membership selectByNo(int member_no) throws Exception{
		Membership findMembership = null;
		String membership_select = "select * from membership where member_no = ?";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(membership_select);
		pstmt.setInt(1, member_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			findMembership = new Membership(rs.getInt("member_no"),
											rs.getString("member_id"),
											rs.getString("member_password"),
											rs.getString("member_phone"),
											rs.getDate("meeber_birthday"),
											rs.getString("member_email"),
											rs.getString("member_nickname"),
											rs.getString("member.loc"),
											rs.getInt("member_pagree"),
											rs.getInt("member.eagree"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return findMembership;
	}
	
	public List<Membership> selectAll() throws Exception{
		List<Membership> membershipList = new ArrayList<Membership>();
		String membership_selectAll = "select * from membership";
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(membership_selectAll);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			membershipList.add(new Membership(rs.getInt("member_no"),
											  rs.getString("member_id"),
											  rs.getString("member_password"),
											  rs.getString("member_phone"),
											  rs.getDate("meeber_birthday"),
											  rs.getString("member_email"),
											  rs.getString("member_nickname"),
											  rs.getString("member.loc"),
											  rs.getInt("member_pagree"),
											  rs.getInt("member.eagree")));
		}
		rs.close();
		pstmt.close();
		con.close();
		return membershipList;
	}
}
