package statement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementMain {

	public static void main(String[] args)throws Exception {
		/*******************************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper11";
		String password="jdeveloper11";
		/*******************************************/
		// 오라클 정보
		
		
		
		Class.forName(driverClass); // 드라이버 연동
		Connection con=DriverManager.getConnection(url,user,password); // 연결객체 생성
		Statement stmt=con.createStatement(); // 전송객체 생성
		/*
		이름             널?       유형             
		-------------- -------- -------------- 
		GUEST_NO       NOT NULL NUMBER(10)     
		GUEST_NAME              VARCHAR2(50)   
		GUEST_DATE              DATE           
		GUEST_EMAIL             VARCHAR2(50)   
		GUEST_HOMEPAGE          VARCHAR2(50)   
		GUEST_TITLE             VARCHAR2(100)  
		GUEST_CONTENT           VARCHAR2(4000) 
		*/
		System.out.println("----------stmt.executeQuery(select)------"); // 실행결과로 ResultSet 객체에 값을 반환한다.
		int guest_number=6; // 정수형 변수에 6 대입
		String selectOneSql=
				"select* from guest where guest_no="+guest_number; // Sql문 선언.
		ResultSet rs=stmt.executeQuery(selectOneSql); // select Sql문 전송 후 ResultSet 타입 변수 rs에 값을 반환한다.
		if(rs.next()) {
			int guest_no = rs.getInt("guest_no"); // 반환값들 받을 변수들 선언하고 대입.
			String guest_name=rs.getString("guest_name");
			Date guest_date=rs.getDate("guest_date");
			String guest_email=rs.getString("guest_email");
			String guest_homepage=rs.getString("guest_homepage");
			String guest_title=rs.getString("guest_title");
			String guest_content=rs.getString("guest_content");
			System.out.println(guest_no+"\t"+guest_name+"\t"+guest_date+"\t"+guest_email+"\t"+guest_homepage+"\t"+guest_title+"\t"+guest_content); //콘솔에 출력.
		}
		
		rs.close(); // 외부자원 다 썻습니다. 연결 해제. <?> 연결해제 안하면 안에 값이 남아있는지
		
		String selectAllSql=
				"select * from guest"; //select sql문 선언
		rs=stmt.executeQuery(selectAllSql); // 연결객체는 닫지 않았음. 바로 전송객체로 sql문 전송 결과값 반환받기.
		
		while(rs.next()) { // next() = 커서의 개념이 등장. 커서를 현재 위치에서 한 행 앞으로 이동. 값이 존재하면 true 없으면 false.
			int guest_no = rs.getInt("guest_no"); //true면 그 행에 있는 값들 받을 변수들 선언하고 대입
			String guest_name=rs.getString("guest_name");
			Date guest_date=rs.getDate("guest_date");
			String guest_email=rs.getString("guest_email");
			String guest_homepage=rs.getString("guest_homepage");
			String guest_title=rs.getString("guest_title");
			String guest_content=rs.getString("guest_content");
			System.out.println(guest_no+"\t"+guest_name+"\t"+guest_date+"\t"+guest_email+"\t"+guest_homepage+"\t"+guest_title+"\t"+guest_content); //콘솔 출력.
		}
		rs.close(); // 전송객체 외부자원 닫기.
		System.out.println("----------stmt.executeUpdate(dml)--------"); // ㅁㄴ이ㅏㅎㅌ
		
		guest_number = 6; // 정수형 변수에 6 대입
		String deleteSql="delete from guest where guest_no="+guest_number; // deletesql문 선언
		int rowCount = stmt.executeUpdate(deleteSql); // executeUpdate는 실행 결과로 Int 값 반환한다. Int값 반환받을 변수 선언하고 대입.
		System.out.println(rowCount+" 행 delete..");
		rs.close();
		
		int guest_no=0; 
		String guest_name="김변수2";
		Date guest_date=null;
		String guest_email="change2@naver.com";
		String guest_homepage="http://www.itwill2.co.kr";
		String guest_title="타이틀2";
		String guest_content="내용2";
		
		String insertSql=
		"insert into guest values(guest_guest_no_seq.nextval,'"+guest_name+"',sysdate,'"+guest_email+"','"+guest_homepage+"','"+guest_title+"','"+guest_content+"')";                
		System.out.println(">> insertSql:"+insertSql); // insertSql문 선언
		rowCount=stmt.executeUpdate(insertSql); // executeUpdate는 실행 결과로 Int 값 반환한다.
		System.out.println(rowCount+ " 행 insert..");
		rs.close();
		
		guest_no=15;
		guest_name="체인지";
		guest_date=new Date(System.currentTimeMillis());//????
		guest_email="change2@naver.com";
		guest_homepage="http://www.chnage.co.kr";
		guest_title="타이틀change";
		guest_content="내용change";
		
		String updateSql=
				"update guest set guest_name='"+guest_name+"',guest_date=sysdate,guest_email='"+guest_email+"',guest_homepage='"+guest_homepage+"',guest_title='"+guest_title+"',guest_content='"+guest_content+"' where guest_no="+guest_no;
		rowCount = stmt.executeUpdate(updateSql);
		System.out.println(rowCount + " 행 update..");
		rs.close();
		con.close();
		
		
	}

}