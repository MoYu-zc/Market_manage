package View;

import java.awt.Button;
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
import javax.swing.JTextField;

import Link.my_conn;
import Link.up_Link;

public class p5_3 extends JPanel implements  ActionListener {
	
	private  JPanel p3;
	private  JTextField j1,j2;
	private  JButton  b1;
	private  JLabel jp1,jp2;
	
	
	public p5_3() {
		this.setBorder(BorderFactory.createTitledBorder(""));
		this.setLayout(null);
		this.setBounds(0, 0, 924, 541);
		this.setVisible(true);
		this.setOpaque(false);
		
		p3=new JPanel();
		p3.setLayout(null);
		p3.setBounds(0,0,924,541);
		p3.setOpaque(false);
		
		jp1=new JLabel("��Ʒ��");
		jp1.setFont(new Font("����",Font.BOLD,25));
		jp1.setBounds(210, 150, 100, 100);
		p3.add(jp1);
		
		jp2=new JLabel("������");
		jp2.setFont(new Font("����",Font.BOLD,25));
		jp2.setBounds(210, 220, 100, 100);
		p3.add(jp2);
		
		j1=new JTextField();
		j1.setFont(new Font("����",Font.CENTER_BASELINE,20));
		j1.setBounds(300, 185, 250, 30);
		j1.setToolTipText("��������Ʒ����");
		p3.add(j1);
		
		j2=new JTextField();
		j2.setFont(new Font("����",Font.CENTER_BASELINE,20));
		j2.setBounds(300, 255, 250, 30);
		j2.setToolTipText("�������½���Ʒ����");
		p3.add(j2);
		
		b1=new JButton("ȷ��");
		b1.setFont(new Font("����",Font.BOLD,20));
		b1.setBounds(350, 330, 100, 40);
		b1.addActionListener(this);
		p3.add(b1);
		
		
		this.add(p3);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			
			  up_Link U=new up_Link();
	         int isDelete = JOptionPane.showConfirmDialog(null, "ȷ���½�"+j1.getText()+"��"+j2.getText()+"����", "��ʾ", JOptionPane.YES_NO_CANCEL_OPTION);
	         if(isDelete == JOptionPane.YES_OPTION){
	         int a = 0,b,c;
		    String num;
			Connection conn=null;
			Statement stmt=null;
			ResultSet rs=null;
			conn=my_conn.getConn();
			try {
				stmt=conn.createStatement();
				String sql="select *from shop1 where name="+"'"+j1.getText()+"'";
				rs=stmt.executeQuery(sql); 
				while(rs.next()) {
				a=Integer.valueOf(rs.getString(6)).intValue();}
				b=Integer.valueOf(j2.getText()).intValue();
				c=a+b;
				num=Integer.toString(c);
				 U.updatescore(num,j1.getText());
	                JOptionPane.showMessageDialog(null, "�޸ĳɹ���");
	                JOptionPane.showMessageDialog(this,j1.getText()+"���У�"+num);
	
		}catch(SQLException e1) {e1.printStackTrace();}
			}

	}

}}
