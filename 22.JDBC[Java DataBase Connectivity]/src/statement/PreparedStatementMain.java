package statement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/*
<<PreparedStatement>>
- PrepareStatement를 사용하면  sql파싱이 한번만 이루어지므로 성능향상이된다.
- PrepareStatement를 사용하면  sql을 작성할때 편리하다

1. sql문작성
- ?(파라메타) 를 사용해서 나중에 외부에서 데이타(리터럴)를 받을수있게한다.
  ex> insert into emp(empno,ename,job,manager,hiredate,sal,comm,deptno) values(?,?,?,?,?,?,?,?)	
- 테이블이름,컬럼이름등은 ? 를 사용해서 외부에서 입력받을수없다.
  ex> select * from ? 
      select ?,? from emp    
2. PreparedStatement 객체생성시 인자로 sql문을 넣어서생성한다
ex> PreparedStatement pstmt = con.prepareStatement(sql);
3. 생성된 PreparedStatement 객체에 파라메타를 setting(binding) 한다
- sql 좌측 ? 부터 1,2,3...
ex> 	pstmt.setInt(1,1234);              
	   	pstmt.setString(2,"KIM");              
		pstmt.setString(3,"MANAGER");              
		pstmt.setInt(4,7839);              
		pstmt.setDate(5,new Date());              
		pstmt.setDouble(6,1000.12);              
		pstmt.setInt(7,0);              
		pstmt.setInt(8,10);              
4.  실행
- 실행시 sql문을 인자로 넣지안는다.
ex> pstmt.executeUpdate();         
    pstmt.executeQuery();         
*/
public class PreparedStatementMain {

	public static void main(String[] args) throws Exception{
		/*******************************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		/*******************************************/
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		System.out.println("----select pk------");
		
		String selectOneSql="select* from guest where guest_no=?";
		PreparedStatement pstmt = con.prepareStatement(selectOneSql);
		pstmt.setInt(1, 20);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			int guest_no = rs.getInt("guest_no");
			String guest_name=rs.getString("guest_name");
			Date guest_date=rs.getDate("guest_date");
			String guest_email=rs.getString("guest_email");
			String guest_homepage=rs.getString("guest_homepage");
			String guest_title=rs.getString("guest_title");
			String guest_content=rs.getString("guest_content");
			System.out.println(guest_no+"\t"+guest_name+"\t"+guest_date+"\t"+guest_email+"\t"+guest_homepage+"\t"+guest_title+"\t"+guest_content);
		}
		rs.close();
		pstmt.close();
		
		System.out.println("----select all------");
		String selectAllSql="select * from guest";
		pstmt = con.prepareStatement(selectAllSql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			int guest_no = rs.getInt("guest_no");
			String guest_name=rs.getString("guest_name");
			Date guest_date=rs.getDate("guest_date");
			String guest_email=rs.getString("guest_email");
			String guest_homepage=rs.getString("guest_homepage");
			String guest_title=rs.getString("guest_title");
			String guest_content=rs.getString("guest_content");
			System.out.println(guest_no+"\t"+guest_name+"\t"+guest_date+"\t"+guest_email+"\t"+guest_homepage+"\t"+guest_title+"\t"+guest_content);
		}
		rs.close();
		pstmt.close();
		System.out.println("----delete------");
		String deleteSql="delete from guest where guest_no=?";
		pstmt=con.prepareStatement(deleteSql);
		pstmt.setInt(1, 3);
		int rowCount=pstmt.executeUpdate();
		System.out.println(rowCount+" 행 delete..");
		pstmt.close();
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
		String insertSql="insert into guest values(guest_guest_no_seq.nextval,?,sysdate,?,?,?,?)";
		pstmt=con.prepareStatement(insertSql);
		pstmt.setString(1, "김유라");
	
		java.util.Date utilBirthDay=new SimpleDateFormat("yyyy/MM/dd").parse("1998/05/05");
		Date sqlBirthDay=new Date(utilBirthDay.getTime());
		pstmt.setDate(2,sqlBirthDay);
		
		pstmt.setString(3,"guard00@gmail.com");
		pstmt.setString(4,"http://www.google.com");
		pstmt.setString(5,"dao연습");
		pstmt.setString(6,"dao객체연습해주세요");
		rowCount=pstmt.executeUpdate();
		System.out.println(rowCount+" 행 insert..");
		pstmt.close();
		
		String updateSql="update guest set guest_name=?,guest_date=?,guest_email=?,guest_homepage=?,guest_title=?,guest_content=? where guest_no=?";
		pstmt=con.prepareStatement(updateSql);
		pstmt.setString(1, "김수박");
		pstmt.setDate(2, new Date(System.currentTimeMillis()));
		pstmt.setString(3,"water@naver.com");
		pstmt.setString(4,"http://melon.com");
		pstmt.setString(5,"수박먹고싶어요");
		pstmt.setString(6,"많이드세요 장마오기전에~~~~");
		pstmt.setInt(7,10);
		rowCount=pstmt.executeUpdate();
		System.out.println(rowCount+ "행 update..");
		
		
		pstmt.close();
		con.close();
		
		
	}

}
