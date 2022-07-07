package com.itwill.member.dao;
/*
 * member table CRUD SQL문을 가지고있는 클래스
 */
public class MemberSQL {
	public static final String INSERT_MEMBER=
	"insert into member(m_id,m_password,m_name,m_address,m_age,m_married,m_regdate) "
	+ "values(?,?,?,?,?,?,sysdate)";
	public static final String UPDATE_MEMBER=
	"update member set m_password=?, m_name=?,m_address=?,m_age=?,m_married=?,m_regdate=? where m_id=?"; 
	public static final String DELETE_MEMBER=
	"delete from member where m_id=?";
	public static final String SELECT_BY_ID=
	"select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate from member where m_id=?";
	public static final String SELECT_ALL=
	"select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate from member";
	
}
