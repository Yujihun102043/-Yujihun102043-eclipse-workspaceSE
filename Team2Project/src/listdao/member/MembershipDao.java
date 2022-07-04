package listdao.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;
import listdtovo.member.Membership;
import listsql.member.MembershipSQL;

public class MembershipDao {
	private DataSource dataSource;

	public MembershipDao() {
		dataSource = new DataSource();

	}
	
	public int insertMembership(Membership membership) throws Exception{
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(MembershipSQL.MEMBERSHIP_INSERT);
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
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(MembershipSQL.MEMBERSHIP_UPDATE);
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
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(MembershipSQL.MEMBERSHIP_DELETE);
		pstmt.setInt(1, member_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public Membership selectByNo(int member_no) throws Exception{
		Membership findMembership = null;
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(MembershipSQL.MEMBERSHIP_SELECT_BY_NO);
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
		Connection con = dataSource.getConncetion();
		PreparedStatement pstmt = con.prepareStatement(MembershipSQL.MEMBERSHIP_SELECT_ALL);
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
