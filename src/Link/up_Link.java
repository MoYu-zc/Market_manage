package Link;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class up_Link {



	    private Connection conn=null;
	    private Statement stmt=null;
	    private ResultSet rs=null;

	    //创建修改方法
	    public void updatescore(String num,String name){
	        conn=my_conn.getConn();
	        try{
	            stmt=conn.createStatement();
	            String sql="update shop1 set number='"+num+"' where name='"+name+"'";
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
