package listsql.member;

public class MembershipSQL {
	public static final String MEMBERSHIP_INSERT
	="insert into memvership values(membership_member_no_seq.nextval,?,?,?,sysdate,?,?,?,?)";
	public static final String MEMBERSHIP_UPDATE
	="update membership set member_id = ?, member_password = ?, member_phone = ?, member_birthday = ?, member_email = ?, member_nickname = ?, member_loc = ?, member_pagree = ?, member_eagree = ? where member_no = ?";
	public static final String MEMBERSHIP_DELETE
	="delete from membership where member_no = ?";
	public static final String MEMBERSHIP_SELECT_BY_NO
	="select * from membership where member_no = ?";
	public static final String MEMBERSHIP_SELECT_ALL
	="select * from membership";
}
