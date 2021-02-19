package Link;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class addVIP_Link {

	private Connection conn=null;
	private Statement stmt=null;
	private ResultSet rs=null;
	private Boolean a=null;

	
	public void add(String user,String pass,String name,String sex,String wh,String ph,String dis,String tim) 
	{
		conn=my_conn.getConn();
		try {
			stmt=conn.createStatement();
			String sql="insert into vip values("+"'"+user+"',"+"'"+pass+"',"+"'"+name+"',"+"'"+sex+"',"+"'"+wh+"',"+"'"+ph+"',"+"'"+dis+"',"+"'"+tim+"')";
			stmt.executeUpdate(sql);
			
		}catch(SQLException e1) {
			e1.printStackTrace();
		}finally {
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
		
		
	}
	public  Boolean add2(String user){
		  
		  conn=my_conn.getConn();
		  try {
			  stmt=conn.createStatement();
			  String sql="select *from vip where user =" +user;
			  rs=stmt.executeQuery(sql);
					int m=0;
					rs.last();
					m=rs.getRow();
					rs.beforeFirst();
					if(m==0){
						a=true;
					}else{
						while(rs.next()){
						if(user.equals(rs.getString(1))){
					          a=false;
						}else{
							a=true;
						}
					}		}
					
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}finally{
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
		    	return a;
		    }
	
	
}
