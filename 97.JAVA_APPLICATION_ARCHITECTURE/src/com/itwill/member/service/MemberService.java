package com.itwill.member.service;
/*
 * - 회원관리 비즈니스로직(업무)을 수행하는 클래스
 * - GUI객체(스윙,서블릿,JSP)에서 직접접근(메쏘드호출)하는 클래스
 * - Dao객체 를 이용해서 데이타에 접근하는 클래스
 */

import java.util.List;

import com.itwill.member.dao.MemberDao;
import com.itwill.member.dto.Member;



public class MemberService {
	private MemberDao memberDao;
	public MemberService() {
		memberDao=new MemberDao();
	}
	
	/*
	 * 회원가입
	 *   - 아이디가 중복된경우에는 메세지를 띄운다.
	 */
	public boolean addMember(Member newMember) throws Exception{
		System.out.println("2.MemberService ");
		boolean isSuccess=false;
		/*
		 * 아이디존재여부체크
		 *    - 존재하면 메세지
		 *    - 존재안하면 가입
		 */
		Member findMember= memberDao.selectById(newMember.getM_id());
		if(findMember==null) {
			int rowCount=memberDao.insert(newMember);
			isSuccess=true;
		}else {
			isSuccess=false;
		}
		
		return isSuccess;
		
	}
	/*
	 * 회원로그인
	 */
	public int login(String id,String password) throws Exception{
		/*
		 * 0:성공
		 * 1:아이디없다
		 * 2:패쓰워드불일치
		 */
		int loginResult=-999;
		Member findMember = memberDao.selectById(id);
		if(findMember==null) {
			//아이디존재안함
			loginResult=1;
		} else {
			//아이디존재
			if(findMember.getM_password().equals(password)) {
				//로그인성공
				loginResult=0;
			}else {
				//패쓰워드 불일치
				loginResult=2;
			}
		}
		
		return loginResult;
	}
	
	
	/*
	 회원아이디로검색
	 */
	public Member findById(String m_id) throws Exception{
		return memberDao.selectById(m_id);
	}
	
	/* 
	 회원전체검색
	*/
	public List<Member> findAll() throws Exception{
		return memberDao.selectAll();
	}
	
	/*
	 * 회원이름으로검색
	 * 회원주소로검색
	 * 회원나이로검색
	 * 회원결혼여부로검색
	 * 회원가입일로검색
	 */
	
	
	
	
	/*
	 * 회원번호로수정
	 */
	
	/*
	 * 회원번호로삭제
	 */
	public int deleteById(String m_id)throws Exception{
		return memberDao.deleteById(m_id);
	}
	
	
	
	
}
