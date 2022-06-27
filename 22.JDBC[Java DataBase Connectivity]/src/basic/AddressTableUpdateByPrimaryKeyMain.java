package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressTableUpdateByPrimaryKeyMain {

	public static void main(String[] args) throws Exception{
		/***********************************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		/**********************************************/
		String updateSQL="update address set name='제임스',phone='333-3333',address='서울시 강남구' where no = 1";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int updateRowCount=stmt.executeUpdate(updateSQL);
		System.out.println(">>"+updateRowCount+"행 update");
		stmt.close();
		con.close();
	}

}
