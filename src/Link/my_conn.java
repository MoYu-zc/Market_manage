package Link;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class my_conn {


	private static Connection conn=null;
	
	public static Connection getConn() {
	
		try {
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","148729");
	}catch(SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return conn;
	

}
}
