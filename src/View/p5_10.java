 package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import Link.my_conn;

public class p5_10 extends JPanel implements ActionListener{
    private  JPanel p2;
	private  JTextField j1;
	private  JButton  search;
	private  JLabel search1;
	
	public p5_10() {
		this.setBorder(BorderFactory.createTitledBorder(""));
		this.setLayout(null);
		this.setBounds(0, 0, 924, 541);
		this.setVisible(true);
		this.setOpaque(false);
		
		p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(0,0,924,541);
		p2.setOpaque(false);
		
		       //添加查询提示
				search1 = new JLabel("请输入您要查询的员工工号:");
				search1.setFont(new Font("华文仿宋",Font.BOLD,20));
				search1.setBounds(120, 40, 315, 25);
				p2.add(search1);
				
				//添加查询窗口
				j1=new JTextField();
				j1.setFont(new Font("华文仿宋",Font.PLAIN,20));
				j1.setBounds(382, 40, 180, 29);
				p2.add(j1);
			
			    //添加查询按钮
				search=new JButton("查询");
				search.setFont(new Font("华文仿宋",Font.BOLD,15));
				search.setBounds(600,39,75,30);
				search.addActionListener(this);
				p2.add(search);
	
	
				this.add(p2);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==search) {
			Connection conn=null;
			Statement stmt=null;
			ResultSet rs=null;
			conn=my_conn.getConn();
			try {
				stmt=conn.createStatement();
				String sql="select *from peo where num="+"'"+j1.getText()+"'";
				rs=stmt.executeQuery(sql); 
				while(rs.next()){
					rs.last();
					int n=rs.getRow();
					if(n==0){
						JOptionPane.showMessageDialog(this,"无此员工信息！");
					}
					rs.beforeFirst();
					String ob[][]=new String[n][15];
					for(int i=0;i<n&&rs.next();i++){
						   ob[i][0]=rs.getString(1);
							ob[i][1]=rs.getString(2);
							ob[i][2]=rs.getString(3);
							ob[i][3]=rs.getString(4);
							ob[i][4]=rs.getString(5);
							ob[i][5]=rs.getString(6);
							ob[i][6]=rs.getString(7);
							ob[i][7]=rs.getString(8);
							ob[i][8]=rs.getString(9);
							ob[i][9]=rs.getString(10);
							ob[i][10]=rs.getString(11);


						
					}
					String s[]={"工号","姓名","性别","年龄","部门","职务","电话","月薪","住址","状态","注册时间"};
					JTable stock=new JTable(ob,s);
					stock.setSize(900, 400);
					stock.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					stock.setRowHeight(25);               //设置行高
					JScrollPane jspane=new JScrollPane(stock);
					jspane.setBounds(0,80, 916, 400);
					//设置列宽
					this.setColumnSize(stock,0,90);
					this.setColumnSize(stock,1,150);
					this.setColumnSize(stock,2,100);
					this.setColumnSize(stock,3,95);
					this.setColumnSize(stock,4,80);
					this.setColumnSize(stock,5,80);
					this.setColumnSize(stock,6,80);
					this.setColumnSize(stock,7,80);
					this.setColumnSize(stock,8,80);
					this.setColumnSize(stock,9,80);
					this.setColumnSize(stock,10,80);

				
				   p2.add(jspane);
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
		}}
			private void setColumnSize(JTable stock, int i, int j) {
				// TODO Auto-generated method stub
				//表格的列模型
						
						TableColumnModel cm = stock.getColumnModel();
						//得到第i个列对象 
						TableColumn column = cm.getColumn(i);  
						column.setPreferredWidth(j);
			}}