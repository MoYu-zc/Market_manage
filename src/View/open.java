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
		this.setTitle("�̳ǹ���ϵͳ");
		this.setSize(450, 326);
		this.setVisible(true);
		this.setLocationRelativeTo(null);//??
		this.setLayout(null);
		
		Container c=this.getContentPane();
		
		JLabel back=new JLabel();
		//��¼���ڱ���
		Image bg=new ImageIcon("res/��ɫ����.gif").getImage();
		back.setIcon(new ImageIcon(bg));
		back.setBounds(0, 0,450,325);
	    
		c.add(back);
	
		//�˺�
		userlb=new JLabel("�˺�:");
		userlb.setBounds(80,100,100,50);
		userlb.setFont(new Font("����",Font.BOLD,20));
		back.add(userlb);
		
		//�˺Ŵ���
		user=new JTextField();
		user.setBounds(150,110,200,30);
		user.setFont(new Font("����",Font.BOLD,20));
		user.setToolTipText("�˴������˺�");
		back.add(user);
		
		//����
		passwordlb=new JLabel("����:");
		passwordlb.setBounds(80,140,100,50);
		passwordlb.setFont(new Font("����",Font.BOLD,20));
		back.add(passwordlb);
		
		//���봰��
		password=new JPasswordField();
		password.setBounds(150,150,200,30);
		password.setFont(new Font("����",Font.BOLD,20));
		password.setToolTipText("�˴���������");
		back.add(password);
		
		//��¼��ť
		p1=new JButton("��¼");
		p1.setBounds(80, 230, 100, 30);
		p1.setFont(new Font("����",Font.BOLD,20));
		p1.addActionListener( this);
		back.add(p1);
		
		//ȡ����ť
		p2=new JButton("ȡ��");
		p2.setBounds(240, 230,100,30);	
		p2.setFont(new Font("����",Font.BOLD,20));
		p2.addActionListener(this);
		back.add(p2);
		
	    //��¼Сͼ��
		Image icon=new ImageIcon("icon_001.png").getImage();
		this.setIconImage(icon);
		
		this.setResizable(false);//�û���������������ڴ�С		
		
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
	    	   
	    	   JOptionPane.showMessageDialog(this,"������ȷ����ӭ����");
	    	   this.setVisible(false);
	    		new mainsee();
	       }
	          else {JOptionPane.showMessageDialog(this, "�˺Ż��������������������");
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