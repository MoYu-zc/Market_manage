package View;


import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import Link.my_conn;



public class p5_1 extends JPanel  {
	
	private JPanel p1;
	
public p5_1() {
	this.setBorder(BorderFactory.createTitledBorder(""));
	this.setLayout(null);
	this.setBounds(0, 0, 924, 541);
	this.setVisible(true);
	this.setOpaque(false);
	
	p1=new JPanel();
	p1.setLayout(null);
	p1.setBounds(0,0,924,541);
	p1.setOpaque(false);
	
	
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	conn=my_conn.getConn();
	try {
		stmt=conn.createStatement();
		String sql="select *from shop1";
		rs=stmt.executeQuery(sql); 
		while(rs.next()){
			rs.last();
			int n=rs.getRow();
			if(n==0){
				JOptionPane.showMessageDialog(this, "������");
			}
			rs.beforeFirst();
			String ob[][]=new String[n][10];
			for(int i=0;i<n&&rs.next();i++){
	            ob[i][0]=rs.getString(1);
				ob[i][1]=rs.getString(2);
				ob[i][2]=rs.getString(3);
				ob[i][3]=rs.getString(4);
				ob[i][4]=rs.getString(5);
				ob[i][5]=rs.getString(6);
				ob[i][6]=rs.getString(7);
				ob[i][7]=rs.getString(8);


				
			}
			String s[]={"���","��Ʒ","����","���","����","����","�ۼ�","����ʱ��"};
			JTable stock=new JTable(ob,s);
			stock.setSize(900, 400);
			stock.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			stock.setRowHeight(25);               //�����и�
			JScrollPane jspane=new JScrollPane(stock);
			jspane.setBounds(0, 80, 916, 400);
			//�����п�
			this.setColumnSize(stock,0,90);
			this.setColumnSize(stock,1,150);
			this.setColumnSize(stock,2,100);
			this.setColumnSize(stock,3,95);
			this.setColumnSize(stock,4,80);
			this.setColumnSize(stock,5,80);
			this.setColumnSize(stock,6,80);
			this.setColumnSize(stock,7,80);


		
		
		   p1.add(jspane);
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




	this.add(p1);

}
private void setColumnSize(JTable stock, int i, int j) {
	// TODO Auto-generated method stub
	//������ģ��
			
			TableColumnModel cm = stock.getColumnModel();
			//�õ���i���ж��� 
			TableColumn column = cm.getColumn(i);  
			column.setPreferredWidth(j);
}




}

