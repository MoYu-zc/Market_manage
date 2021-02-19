package Link;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class delete_Link {
	
	

	private  Connection conn=null;
	private Statement stmt=null;
	private  ResultSet rs=null;
	  
	 public void delete(String user) {
		 
		 conn=my_conn.getConn();
		try {
			stmt=conn.createStatement();
			String sql="delete from vip where user="+user;
			stmt.executeUpdate(sql);
		}catch(SQLException e)
		{e.printStackTrace();}
		finally {
			 try {
					if(rs!=null)
					{rs.close();}
					if(stmt!=null)
					{stmt.close();}
					if(conn!=null)
					{conn.close();}
					
				}catch(SQLException e1)
				{e1.printStackTrace();}
			
		}
		 

	 }}
