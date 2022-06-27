package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressTableSelectAllMain {

	public static void main(String[] args) throws Exception{
		/***********************************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		/**********************************************/
		String selectSQL="select no,id,name,phone,address from address";
		/*
		 1.Driver Class loading
		 2.Connection객체생성(DBServer에연결)
		 3.Statement객체생성(SQL 전송객체)
		 4.Statement객체를 사용해 SQL문전송(SELECT)
		 5.실행결과(Resultset)
		 6.연결객체 닫기
		 */
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSQL);
		/*
		<<ResultSet>>
		boolean next() throws SQLException
			- Moves the cursor forward one row from its current position. 
			- A ResultSet cursor is initially positioned before the first row; 
			  	the first call to the method next makes the first row the current row; 
			  	the second call makes the second row the current row, and so on.
			- When a call to the next method returns false, 
				the cursor is positioned after the last row.
		 */
		if(rs.next()) {
			 do{
				/*
					DB타입 		  | 	자바타입
					----------------------------
					number 		  | 	int,double(float)
					varchar2,char | 	String
					Date		  | 	Date
					
					XXX data=rs.getXXX("컬럼이름");
					
				 */
				int no=rs.getInt("no");
				String id=rs.getString("id");
				String name=rs.getString("name");
				String phone=rs.getString("phone");
				String address=rs.getString("address");
				System.out.println(no+"\t"+name+"\t"+phone+"\t"+address);
			}while(rs.next());
			 
		}else {
			System.out.println("조건에 만족하는 주소록없네요!!!");
		}
		
		rs.close();
		stmt.close();
		con.close();
		

	}

}
