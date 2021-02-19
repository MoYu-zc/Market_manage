package Link;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class revise_Link {
	
  private Connection conn=null;
	    private Statement stmt=null;
	    private ResultSet rs=null;

	    //创建修改方法
	    public void up( String pass, String name, String sex, String wh, String ph, String dis,String user){
	        conn=my_conn.getConn();
	        try{
	            stmt=conn.createStatement();
	            String sql="update vip set pass='"+pass+"',name='"+name+"',sex='"+sex+"',wh='"+wh+"',ph='"+ph+"',dis='"+dis+"' where user='"+user+"'";
	            stmt.executeUpdate(sql);
	        }catch(SQLException e){
	            e.printStackTrace();
	        }finally {
	            try{
	                if(rs!=null) rs.close();
	                if(stmt!=null)  stmt.close();
	                if(conn!=null)  conn.close();
	            }catch(SQLException e1) {
	                e1.printStackTrace();
	            }
	        }

	    
	}



}
