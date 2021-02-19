package View;

import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

import Link.my_Link;



public class open extends JFrame implements ActionListener {

	private JLabel userlb,passwordlb;
	private JButton p1,p2;
	private static JTextField user;
	private JPasswordField password;
	private Connection conn=null;
	private Statement stmt=null;
	private ResultSet rs=null;
	
	public open(){
		this.setTitle("商城管理系统");
		this.setSize(450, 326);
		this.setVisible(true);
		this.setLocationRelativeTo(null);//??
		this.setLayout(null);
		
		Container c=this.getContentPane();
		
		JLabel back=new JLabel();
		//登录窗口背景
		Image bg=new ImageIcon("res/纯色背景.gif").getImage();
		back.setIcon(new ImageIcon(bg));
		back.setBounds(0, 0,450,325);
	    
		c.add(back);
	
		//账号
		userlb=new JLabel("账号:");
		userlb.setBounds(80,100,100,50);
		userlb.setFont(new Font("宋体",Font.BOLD,20));
		back.add(userlb);
		
		//账号窗口
		user=new JTextField();
		user.setBounds(150,110,200,30);
		user.setFont(new Font("宋体",Font.BOLD,20));
		user.setToolTipText("此处输入账号");
		back.add(user);
		
		//密码
		passwordlb=new JLabel("密码:");
		passwordlb.setBounds(80,140,100,50);
		passwordlb.setFont(new Font("宋体",Font.BOLD,20));
		back.add(passwordlb);
		
		//密码窗口
		password=new JPasswordField();
		password.setBounds(150,150,200,30);
		password.setFont(new Font("宋体",Font.BOLD,20));
		password.setToolTipText("此处输入密码");
		back.add(password);
		
		//登录按钮
		p1=new JButton("登录");
		p1.setBounds(80, 230, 100, 30);
		p1.setFont(new Font("宋体",Font.BOLD,20));
		p1.addActionListener( this);
		back.add(p1);
		
		//取消按钮
		p2=new JButton("取消");
		p2.setBounds(240, 230,100,30);	
		p2.setFont(new Font("宋体",Font.BOLD,20));
		p2.addActionListener(this);
		back.add(p2);
		
	    //登录小图标
		Image icon=new ImageIcon("icon_001.png").getImage();
		this.setIconImage(icon);
		
		this.setResizable(false);//用户不能随意更换窗口大小		
		
	}
	
	public static void main(String[] args1) {
		
		new open();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==p1)
		{
			my_Link A=new my_Link();
	       Boolean a;
	       a=A.tf(user.getText(), String.valueOf(password.getPassword()));
	       if(a==true) {
	    	   
	    	   JOptionPane.showMessageDialog(this,"密码正确，欢迎进入");
	    	   this.setVisible(false);
	    		new mainsee();
	       }
	          else {JOptionPane.showMessageDialog(this, "账号或者密码错误，请重新输入");
	          user.setText("");
	          password.setText("");
	    	   
	       }
	}
		else if(e.getSource()==p2)
		{
			this.setVisible(false);
	       }
	      
	}	

	
 

}