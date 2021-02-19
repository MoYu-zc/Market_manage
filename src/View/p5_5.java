package View;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import Link.my_conn;

public class p5_5 extends JPanel {
	
	private JPanel p5;

	public p5_5() {
		this.setBorder(BorderFactory.createTitledBorder(""));
		this.setLayout(null);
		this.setBounds(0, 0, 924, 541);
		this.setVisible(true);
		this.setOpaque(false);
		
		p5=new JPanel();
		p5.setLayout(null);
		p5.setBounds(0,0,924,541);
		p5.setOpaque(false);
		

		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		conn=my_conn.getConn();
		try {
			stmt=conn.createStatement();
			String sql="select *from vip";
			rs=stmt.executeQuery(sql); 
			while(rs.next()){
				rs.last();
				int n=rs.getRow();
				if(n==0){
					JOptionPane.showMessageDialog(this, "无数据");
				}
				rs.beforeFirst();
				String ob[][]=new String[n][10];
				for(int i=0;i<n&&rs.next();i++){
		            ob[i][0]=rs.getString(1);
					ob[i][1]=rs.getString(3);
					ob[i][2]=rs.getString(4);
					ob[i][3]=rs.getString(5);
					ob[i][4]=rs.getString(6);
					ob[i][5]=rs.getString(7);
					ob[i][6]=rs.getString(8);
	}
				String s[]={"账号","姓名","性别","住址","电话","折扣","注册时间"};
				JTable stock=new JTable(ob,s);
				stock.setSize(900, 500);
				stock.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				stock.setRowHeight(25);               //设置行高
				JScrollPane jspane=new JScrollPane(stock);
				jspane.setBounds(0, 20, 916, 400);
				//设置列宽
				this.setColumnSize(stock,0,90);
				this.setColumnSize(stock,1,150);
				this.setColumnSize(stock,2,100);
				this.setColumnSize(stock,3,95);
				this.setColumnSize(stock,4,80);
				this.setColumnSize(stock,5,80);
				this.setColumnSize(stock,6,80);
	
			   p5.add(jspane);
		}
		
		
	}catch(SQLException e1) {
		e1.printStackTrace();
	} 
		try {
			if(rs!=null)
			{rs.close();}
			if(stmt!=null)
			{stmt.close();}
			if(conn!=null)
			{conn.close();}
			
		}catch(SQLException e1)
		{e1.printStackTrace();}




		this.add(p5);

		
		
		
	}
	private void setColumnSize(JTable stock, int i, int j) {
		// TODO Auto-generated method stub
		//表格的列模型
				
				TableColumnModel cm = stock.getColumnModel();
				//得到第i个列对象 
				TableColumn column = cm.getColumn(i);  
				column.setPreferredWidth(j);
	}



	
}
