package Link;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class addpeo_Link {
	
	private Connection conn=null;
	private Statement stmt=null;
	private ResultSet rs=null;
	private Boolean a=null;

	
	public void add(String num,String name,String sex,String age,String dep,String post,String ph,double mon,String wh,String stat,String tim) 
	{
		conn=my_conn.getConn();
		try {
			stmt=conn.createStatement();
			String sql="insert into peo values("+"'"+num+"',"+"'"+name+"',"+"'"+sex+"',"+"'"+age+"',"+"'"+dep+"',"+"'"+post+"',"+"'"+ph+"',"+"'"+mon+"',"+"'"+wh+"',"+"'"+stat+"',"+"'"+tim+"')";
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
	public  Boolean add2(String num){
		  
		  conn=my_conn.getConn();
		  try {
			  stmt=conn.createStatement();
			  String sql="select *from peo where num =" +num;
			  rs=stmt.executeQuery(sql);
					int m=0;
					rs.last();
					m=rs.getRow();
					rs.beforeFirst();
					if(m==0){
						a=true;
					}else{
						while(rs.next()){
						if(num.equals(rs.getString(1))){
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
