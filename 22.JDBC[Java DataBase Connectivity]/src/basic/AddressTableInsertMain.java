package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressTableInsertMain {

	public static void main(String[] args) throws Exception{
		/***********************************************
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="java";
		String password="java";
		***********************************************/
		/***********************************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		/**********************************************/
		
		
		String insertSQL="insert into address values(address_no_seq.nextval,'orange'||address_no_seq.nextval,'오렌지','890-9090','서울시민')";
		/*
		 1.Driver Class loading
		 2.Connection객체생성(DBServer에연결)
		 3.Statement객체생성(SQL 전송객체)
		 4.Statement객체를 사용해 SQL문전송(DML)
		 5.실행결과(영향받은 행의수)
		 6.연결객체 닫기
		 */
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		/*
	    Statement를 사용한SQL문전송
	     int executeUpdate(String sql)throws SQLException
	     	- executes the given SQL statement, which may be an INSERT, UPDATE, or DELETE statement or an SQL statement 
	     	  that returns nothing, such as an SQL DDL statement.
	     Parameters:
			sql - an SQL Data Manipulation Language (DML) statement, such as INSERT, UPDATE or DELETE;
			 	  or an SQL statement that returns nothing, such as a DDL statement.
	     Returns:
	       영향받은 행의수
			either (1) the row count for SQL Data Manipulation Language (DML) statements 
			or (2) 0 for SQL statements that return nothing
	 */
		int insertRowCount=stmt.executeUpdate(insertSQL);
		System.out.println(">>"+insertRowCount+"행 insert");
		stmt.close();
		con.close();
		
		
	}

}
