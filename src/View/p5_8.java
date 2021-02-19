package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

import Link.delete_Link;
import Link.my_conn;

public class p5_8 extends JPanel implements ActionListener {
	
	 private JLabel userl,passl,namel,sexl,whl,phl,disl,timl,searchl;
	    private JTextField user,pass,name,sex,wh,ph,dis,tim,search;
	    private JButton Search,delete,clear;
	    private Connection conn=null;
	    private Statement stmt=null;
	    private ResultSet rs=null;
	
	public p5_8()  {
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

	        JLabel bt=new JLabel("VIP用户注销");
	        bt.setFont(new Font("楷书",Font.BOLD,25));
	        bt.setBounds(405, 20, 200, 25);
	        p1.add(bt);

	        //添加查询提示
	        searchl = new JLabel("请输入您要查询的用户账号:");
	        searchl.setFont(new Font("华文仿宋",Font.BOLD,20));
	        searchl.setBounds(120, 60, 315, 25);
	        p1.add(searchl);

	        //添加查询窗口
	        search=new JTextField();
	        search.setFont(new Font("华文仿宋",Font.PLAIN,20));
	        search.setBounds(382,60, 180, 29);
	        p1.add(search);

	        //添加查询按钮
	        Search=new JButton("查询");
	        Search.setFont(new Font("华文仿宋",Font.BOLD,15));
	        Search.addActionListener(this);
	        Search.setBounds(600,59,75,30);

	        p1.add(Search);

	        JPanel p2=new JPanel();
	        p2.setLayout(null);
	        p2.setOpaque(false);
	        p2.setBounds(0,85,924,450);
//	        p2.setBorder(BorderFactory.createTitledBorder(""));
	        this.add(p2);
	    
	        userl = new JLabel("用    户：");
	        userl.setFont(new Font("华文仿宋",Font.BOLD,22));
	        userl.setBounds(95,50,100,28);
	        p2.add(userl);

	        
	        user=new JTextField();
	        user.setFont(new Font("华文仿宋",Font.BOLD,22));
	        user.setBounds(205,50,200,28);
	        p2.add(user);

            passl=new JLabel("密    码：");
            passl.setBounds(525, 50, 100, 28);
            passl.setFont(new Font("华文仿宋",Font.BOLD,22));
	        p2.add(passl);
	        
	        
	        pass=new JTextField ();
	        pass.setFont(new Font("华文仿宋",Font.BOLD,22));
	        pass.setBounds(630,50,200,28);
	        p2.add(pass);
	        
	        namel=new JLabel("姓    名：");
            namel.setBounds(95, 115, 100, 28);
            namel.setFont(new Font("华文仿宋",Font.BOLD,22));
	        p2.add(namel);
	        
	        name=new JTextField();
	        name.setFont(new Font("华文仿宋",Font.BOLD,22));
	        name.setBounds(205,115,200,28);
	        p2.add(name);
	        
	       sexl=new JLabel("性    别：");
           sexl.setBounds(525, 115, 100, 28);
           sexl.setFont(new Font("华文仿宋",Font.BOLD,22));
	        p2.add(sexl);
	        
	        
	        sex=new JTextField ();
	        sex.setFont(new Font("华文仿宋",Font.BOLD,22));
	        sex.setBounds(630,115,200,28);
	        p2.add(sex);
	        
	        whl=new JLabel("地    址：");
            whl.setBounds(95, 180, 100, 28);
            whl.setFont(new Font("华文仿宋",Font.BOLD,22));
	        p2.add(whl);
	        
	        wh=new JTextField();
	        wh.setFont(new Font("华文仿宋",Font.BOLD,22));
	        wh.setBounds(205,180,200,28);
	        p2.add(wh);
	        
	        phl=new JLabel("电    话：");
            phl.setBounds(525, 180, 100, 28);
            phl.setFont(new Font("华文仿宋",Font.BOLD,22));
	        p2.add(phl);
	        
	        
	        ph=new JTextField ();
	        ph.setFont(new Font("华文仿宋",Font.BOLD,22));
	        ph.setBounds(630,180,200,28);
	        p2.add(ph);
	        
	        disl=new JLabel("折    扣：");
            disl.setBounds(95, 245, 100, 28);
            disl.setFont(new Font("华文仿宋",Font.BOLD,22));
	        p2.add(disl);
	        
	        dis=new JTextField();
	        dis.setFont(new Font("华文仿宋",Font.BOLD,22));
	        dis.setBounds(205,245,200,28);
	        p2.add(dis);
	        
	        timl=new JLabel("时    间：");
            timl.setBounds(525, 245, 100, 28);
            timl.setFont(new Font("华文仿宋",Font.BOLD,22));
	        p2.add(timl);
	        
	        
	        tim=new JTextField ();
	        tim.setFont(new Font("华文仿宋",Font.BOLD,22));
	        tim.setBounds(630,245,200,28);
	        p2.add(tim);
	        
	        
	        delete=new JButton("注销");
	        delete.setFont(new Font("华文仿宋",Font.BOLD,20));
	        delete.setBounds(345,340,100,40);
	        delete.addActionListener(this);
	        p2.add(delete);

	        clear=new JButton("清除");
	        clear.setFont(new Font("华文仿宋",Font.BOLD,20));
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
	                    JOptionPane.showMessageDialog(this,"无此VIP信息！");
	                }else{
	                    rs.beforeFirst();
	                    while(rs.next()){
	                        user.setText(rs.getString(1));  user.setEditable(false);
	                        pass.setText(rs.getString(2));   pass.setEditable(false);
	                        name.setText(rs.getString(3));  name.setEditable(false);
	                        sex.setText(rs.getString(4));  sex.setEditable(false);
	                        wh.setText(rs.getString(5));   wh.setEditable(false);
	                        ph.setText(rs.getString(6));   ph.setEditable(false);
	                        dis.setText(rs.getString(7));   dis.setEditable(false);
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
		else if (e.getSource()==delete) {
			
			JOptionPane.showConfirmDialog(this, "请问是否确定注销此用户", "信息", JOptionPane.YES_NO_OPTION);
			 delete_Link D=new delete_Link();
			 D.delete(search.getText());
			 JOptionPane.showMessageDialog(this, "删除成功");
			 this.clear();
			
			
		}





	}

}
