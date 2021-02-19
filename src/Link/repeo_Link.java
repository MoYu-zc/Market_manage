package Link;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class repeo_Link {

	
	  private Connection conn=null;
		    private Statement stmt=null;
		    private ResultSet rs=null;

		    //创建修改方法
		    public void up( String name,String sex,String age,String dep,String post,String ph,double mon,String wh,String stat,String num){
		        conn=my_conn.getConn();
		        try{
		            stmt=conn.createStatement();
		            String sql="update peo set name='"+name+"',sex='"+sex+"',age='"+age+"',dep='"+dep+"',post='"+post+"',ph='"+ph+"',mon='"+mon+"',wh='"+wh+"',stat='"+stat+"' where num='"+num+"'";
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
