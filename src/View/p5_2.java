package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import Link.my_conn;


public class p5_2 extends JPanel implements ActionListener{
	
	private  JPanel p2;
	private  JTextField j1;
	private  JButton  search;
	private  JLabel search1;
	
	public p5_2() {
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
				search1 = new JLabel("请输入您要查询的物品名称:");
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
				String sql="select *from shop1 where name="+"'"+j1.getText()+"'";
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
						ob[i][1]=rs.getString(2);
						ob[i][2]=rs.getString(3);
						ob[i][3]=rs.getString(4);
						ob[i][4]=rs.getString(5);
						ob[i][5]=rs.getString(6);
						ob[i][6]=rs.getString(7);
						ob[i][7]=rs.getString(8);

						
					}
					String s[]={"编号","商品","厂商","类别","进价","数量","售价","进货时间"};
					JTable stock=new JTable(ob,s);
					stock.setSize(900, 400);
					stock.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
					stock.setRowHeight(25);               //设置行高
					JScrollPane jspane=new JScrollPane(stock);
					jspane.setBounds(0, 90, 916, 400);
					//设置列宽
					this.setColumnSize(stock,0,100);
					this.setColumnSize(stock,1,150);
					this.setColumnSize(stock,2,150);
					this.setColumnSize(stock,3,100);
					this.setColumnSize(stock,4,95);
					this.setColumnSize(stock,5,95);
					this.setColumnSize(stock,6,95);
					this.setColumnSize(stock,7,95);

				
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
			}

	}
	

