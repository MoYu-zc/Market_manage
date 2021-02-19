package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

import Link.my_conn;
import Link.revise_Link;



public class p5_7 extends JPanel implements ActionListener {
	
	
	 private JLabel userl,passl,namel,sexl,whl,phl,disl,timl,searchl;
	    private JTextField user,pass,name,sex,wh,ph,dis,tim,search;
	    private JButton Search,update,clear;
	    private Connection conn=null;
	    private Statement stmt=null;
	    private ResultSet rs=null;
	
	public p5_7() {


		        this.setBorder(BorderFactory.createTitledBorder(""));
		        this.setLayout(null);
		        this.setBounds(0, 0, 924, 541);
		        this.setVisible(true);
		        this.setOpaque(false);

		        JPanel p1=new JPanel();
		        p1.setLayout(null);
		        p1.setBounds(0,0,924,90);
		        p1.setOpaque(false);
		        this.add(p1);

		        JLabel bt=new JLabel("VIP�û���Ϣ�޸�");
		        bt.setFont(new Font("����",Font.BOLD,25));
		        bt.setBounds(405, 20, 200, 25);
		        p1.add(bt);

		        //��Ӳ�ѯ��ʾ
		        searchl = new JLabel("��������Ҫ��ѯ���û��˺�:");
		        searchl.setFont(new Font("���ķ���",Font.BOLD,20));
		        searchl.setBounds(120, 60, 315, 25);
		        p1.add(searchl);

		        //��Ӳ�ѯ����
		        search=new JTextField();
		        search.setFont(new Font("���ķ���",Font.PLAIN,20));
		        search.setBounds(382,60, 180, 29);
		        p1.add(search);

		        //��Ӳ�ѯ��ť
		        Search=new JButton("��ѯ");
		        Search.setFont(new Font("���ķ���",Font.BOLD,15));
		        Search.addActionListener(this);
		        Search.setBounds(600,59,75,30);

		        p1.add(Search);

		        JPanel p2=new JPanel();
		        p2.setLayout(null);
		        p2.setOpaque(false);
		        p2.setBounds(0,85,924,450);
//		        p2.setBorder(BorderFactory.createTitledBorder(""));
		        this.add(p2);
		    
		        userl = new JLabel("��    ����");
		        userl.setFont(new Font("���ķ���",Font.BOLD,22));
		        userl.setBounds(95,50,100,28);
		        p2.add(userl);

		        
		        user=new JTextField();
		        user.setFont(new Font("���ķ���",Font.BOLD,22));
		        user.setBounds(205,50,200,28);
		        p2.add(user);

	            passl=new JLabel("��    �룺");
	            passl.setBounds(525, 50, 100, 28);
	            passl.setFont(new Font("���ķ���",Font.BOLD,22));
		        p2.add(passl);
		        
		        
		        pass=new JTextField ();
		        pass.setFont(new Font("���ķ���",Font.BOLD,22));
		        pass.setBounds(630,50,200,28);
		        p2.add(pass);
		        
		        namel=new JLabel("��    ����");
	            namel.setBounds(95, 115, 100, 28);
	            namel.setFont(new Font("���ķ���",Font.BOLD,22));
		        p2.add(namel);
		        
		        name=new JTextField();
		        name.setFont(new Font("���ķ���",Font.BOLD,22));
		        name.setBounds(205,115,200,28);
		        p2.add(name);
		        
		        sexl=new JLabel("��    ��");
	            sexl.setBounds(525, 115, 100, 28);
	            sexl.setFont(new Font("���ķ���",Font.BOLD,22));
		        p2.add(sexl);
		        
		        
		        sex=new JTextField ();
		        sex.setFont(new Font("���ķ���",Font.BOLD,22));
		        sex.setBounds(630,115,200,28);
		        p2.add(sex);
		        
		        whl=new JLabel("��    ַ��");
	            whl.setBounds(95, 180, 100, 28);
	            whl.setFont(new Font("���ķ���",Font.BOLD,22));
		        p2.add(whl);
		        
		        wh=new JTextField();
		        wh.setFont(new Font("���ķ���",Font.BOLD,22));
		        wh.setBounds(205,180,200,28);
		        p2.add(wh);
		        
		        phl=new JLabel("��    ����");
	            phl.setBounds(525, 180, 100, 28);
	            phl.setFont(new Font("���ķ���",Font.BOLD,22));
		        p2.add(phl);
		        
		        
		        ph=new JTextField ();
		        ph.setFont(new Font("���ķ���",Font.BOLD,22));
		        ph.setBounds(630,180,200,28);
		        p2.add(ph);
		        
		        disl=new JLabel("��    �ۣ�");
	            disl.setBounds(95, 245, 100, 28);
	            disl.setFont(new Font("���ķ���",Font.BOLD,22));
		        p2.add(disl);
		        
		        dis=new JTextField();
		        dis.setFont(new Font("���ķ���",Font.BOLD,22));
		        dis.setBounds(205,245,200,28);
		        p2.add(dis);
		        
		        timl=new JLabel("ʱ    �䣺");
	            timl.setBounds(525, 245, 100, 28);
	            timl.setFont(new Font("���ķ���",Font.BOLD,22));
		        p2.add(timl);
		        
		        
		        tim=new JTextField ();
		        tim.setFont(new Font("���ķ���",Font.BOLD,22));
		        tim.setBounds(630,245,200,28);
		        p2.add(tim);
		        
		        
		        update=new JButton("�޸�");
		        update.setFont(new Font("���ķ���",Font.BOLD,20));
		        update.setBounds(345,340,100,40);
		        update.addActionListener(this);
		        p2.add(update);

		        clear=new JButton("���");
		        clear.setFont(new Font("���ķ���",Font.BOLD,20));
		        clear.setBounds(495,340,100,40);
		        clear.addActionListener(this);
		        p2.add(clear);
		
	}
	
	public void clear() {
		user.setText("");
		pass.setText("");
		name.setText("");
		sex.setText("");
		wh.setText("");
		ph.setText("");
		dis.setText("");
		tim.setText("");
		search.setText("");
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==clear) {
			
			this.clear();
			
		}
		else if(e.getSource()==Search) {
			
			 conn= my_conn.getConn();
	            try{
	                stmt=conn.createStatement();
	                String sql="select * from vip where user='"+search.getText()+"'";
	                rs=stmt.executeQuery(sql);
	                rs.last();
	                int m=rs.getRow();
	                if(m==0){
	                    JOptionPane.showMessageDialog(this,"�޴�VIP��Ϣ��");
	                }else{
	                    rs.beforeFirst();
	                    while(rs.next()){
	                        user.setText(rs.getString(1));  user.setEditable(false);
	                        pass.setText(rs.getString(2)); 
	                        name.setText(rs.getString(3));  
	                        sex.setText(rs.getString(4));
	                        wh.setText(rs.getString(5));
	                        ph.setText(rs.getString(6));
	                        dis.setText(rs.getString(7));
	                        tim.setText(rs.getString(8));     tim.setEditable(false);

	                    }
	                }
	            }catch(SQLException e1){
	                e1.printStackTrace();
	            }finally {
	                try{
	                    if(rs!=null) rs.close();
	                    if(stmt!=null) stmt.close();
	                    if(conn!=null) conn.close();
	                }catch(SQLException e2){
	                    e2.printStackTrace();
	                }
	            }
		     }
		else if(e.getSource()==update)	{
			
			   revise_Link U=new revise_Link();
	            int isDelete = JOptionPane.showConfirmDialog(null, "ȷ�������"+user.getText()+"�������޸�Ϊ��"+pass.getText()+";�û������޸�Ϊ��"+name.getText()+";�Ա��޸�Ϊ��"+sex.getText()+";�û���ַ�޸�Ϊ��"+wh.getText()+";�û��绰�޸�Ϊ��"+ph.getText()+";�û��ۿ��޸�Ϊ��"+dis.getText(), "��ʾ", JOptionPane.YES_NO_CANCEL_OPTION);
	            if(isDelete == JOptionPane.YES_OPTION){
	                U.up(pass.getText(),name.getText(),sex.getText(),wh.getText(),ph.getText(),dis.getText(),user.getText());
	                JOptionPane.showMessageDialog(null, "�޸ĳɹ���");
	                this.clear();
	                user.setEditable(false);
	                tim.setEditable(false);
			
			
		}
			
			
			
		
		
		
		
		
	}}}
