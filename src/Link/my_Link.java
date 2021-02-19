package Link;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class my_Link {

	
	private static Connection conn=null;
	private Statement stmt=null;
	private static ResultSet rs=null;
	
	public  Boolean tf(String user,String password) {
		conn=my_conn.getConn();
		try {
		Statement stmt = conn.createStatement();
		String sql="select *from open";
		 rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			if(user.equals(rs.getString(1))&&password.equals(rs.getString(2))==true)
					{return true;}
			else {return false;}
		}
		
	}catch(SQLException e1)
		{e1.printStackTrace();}finally {
			
			this.close();
		}
		
		return true;//???
		}
	
	
	public  void close(){
		try{
			if(rs!=null){
				rs.close();
			}
			if(stmt!=null){
				stmt.close();
			}
			if(conn!=null){
				conn.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
