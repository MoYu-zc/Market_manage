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
import javax.swing.JTextField;

import Link.depeo;
import Link.my_conn;

public class p5_13 extends JPanel implements ActionListener{
	 private JLabel  numl, namel,sexl,agel, depl, postl, phl, monl, whl,statl, timl,searchl;
	    private JTextField  num, name,sex,age, dep, post, ph, mon, wh,stat, tim,search;
	    private JButton Search,delete,clear;
	    private Connection conn=null;
	    private Statement stmt=null;
	    private ResultSet rs=null;
	
	public p5_13(){
	
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

			        JLabel bt=new JLabel("员工信息注销");
			        bt.setFont(new Font("楷书",Font.BOLD,25));
			        bt.setBounds(405, 20, 200, 25);
			        p1.add(bt);

			        //添加查询提示
			        searchl = new JLabel("请输入您要查询的员工工号:");
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
//			        p2.setBorder(BorderFactory.createTitledBorder(""));
			        this.add(p2);
			    
			        numl = new JLabel("工    号：");
			        numl.setFont(new Font("华文仿宋",Font.BOLD,22));
			        numl.setBounds(95,50,100,28);
			        p2.add(numl);

			        
			        num=new JTextField();
			        num.setFont(new Font("华文仿宋",Font.BOLD,22));
			        num.setBounds(205,50,200,28);
			        p2.add(num);
			        
			        namel=new JLabel("姓    名：");
		            namel.setBounds(95, 115, 100, 28);
		            namel.setFont(new Font("华文仿宋",Font.BOLD,22));
			        p2.add(namel);
			        
			        name=new JTextField();
			        name.setFont(new Font("华文仿宋",Font.BOLD,22));
			        name.setBounds(205,115,200,28);
			        p2.add(name);
			        
			        sexl=new JLabel("性    别：");
		            sexl.setBounds(525, 50, 100, 28);
		            sexl.setFont(new Font("华文仿宋",Font.BOLD,22));
			        p2.add(sexl);
			        
			        
			        sex=new JTextField ();
			        sex.setFont(new Font("华文仿宋",Font.BOLD,22));
			        sex.setBounds(630,50,40,28);
			        p2.add(sex);
			        
			        agel=new JLabel("年    龄：");
		            agel.setBounds(690, 50, 100, 28);
		            agel.setFont(new Font("华文仿宋",Font.BOLD,22));
			        p2.add(agel);
			        
			        
			        age=new JTextField ();
			        age.setFont(new Font("华文仿宋",Font.BOLD,22));
			        age.setBounds(790,50,50,28);
			        p2.add(age);
			        
			        depl=new JLabel("部   门：");
		            depl.setBounds(525, 115, 100, 28);
		            depl.setFont(new Font("华文仿宋",Font.BOLD,22));
			        p2.add(depl);
			        
			        dep=new JTextField();
			        dep.setFont(new Font("华文仿宋",Font.BOLD,22));
			        dep.setBounds(630,115,200,28);
			        p2.add(dep);
			        
			         postl=new JLabel("职    务：");
		            postl.setBounds(95, 180, 100, 28);
		            postl.setFont(new Font("华文仿宋",Font.BOLD,22));
			        p2.add(postl);
			        
			        post=new JTextField();
			        post.setFont(new Font("华文仿宋",Font.BOLD,22));
			        post.setBounds(205,180,200,28);
			        p2.add(post);
			        
			        phl=new JLabel("电    话：");
		            phl.setBounds(525, 180, 100, 28);
		            phl.setFont(new Font("华文仿宋",Font.BOLD,22));
			        p2.add(phl);
			        
			        
			        ph=new JTextField ();
			        ph.setFont(new Font("华文仿宋",Font.BOLD,22));
			        ph.setBounds(630,180,200,28);
			        p2.add(ph);
			        
			        monl=new JLabel("工    资：");
		            monl.setBounds(95, 245, 100, 28);
		            monl.setFont(new Font("华文仿宋",Font.BOLD,22));
			        p2.add(monl);
			        
			        mon=new JTextField();
			        mon.setFont(new Font("华文仿宋",Font.BOLD,22));
			        mon.setBounds(205,245,200,28);
			        p2.add(mon);
			        
			        whl=new JLabel("住    址：");
		            whl.setBounds(525, 245, 100, 28);
		            whl.setFont(new Font("华文仿宋",Font.BOLD,22));
			        p2.add(whl);
			        
			        
			        wh=new JTextField ();
			        wh.setFont(new Font("华文仿宋",Font.BOLD,22));
			        wh.setBounds(630,245,200,28);
			        p2.add(wh);
			        
			        statl=new JLabel("状    态：");
			        statl.setBounds(95, 310, 100, 28);
			        statl.setFont(new Font("华文仿宋",Font.BOLD,22));
			        p2.add(statl);
			        
			        
			        stat=new JTextField ();
			        stat.setFont(new Font("华文仿宋",Font.BOLD,22));
			        stat.setBounds(205,310,200,28);
			        p2.add(stat);
			        
			        timl=new JLabel("时    间：");
		            timl.setBounds(525, 310, 100, 28);
		            timl.setFont(new Font("华文仿宋",Font.BOLD,22));
			        p2.add(timl);
			        
			        
			        tim=new JTextField ();
			        tim.setFont(new Font("华文仿宋",Font.BOLD,22));
			        tim.setBounds(630,310,200,28);
			        p2.add(tim);
			        

			        delete=new JButton("注销");
			        delete.setFont(new Font("华文仿宋",Font.BOLD,20));
			        delete.setBounds(345,370,100,40);
			        delete.addActionListener(this);
			        p2.add(delete);

			        clear=new JButton("清除");
			        clear.setFont(new Font("华文仿宋",Font.BOLD,20));
			        clear.setBounds(495,370,100,40);
			        clear.addActionListener(this);
			        p2.add(clear);
			        
					
					}
					
					public void clear() {
						num.setText("");
						stat.setText("");
						name.setText("");
						sex.setText("");
						wh.setText("");
						ph.setText("");
						post.setText("");
						tim.setText("");
						age.setText("");
						dep.setText("");
						mon.setText("");
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
					                String sql="select * from peo where num='"+search.getText()+"'";
					                rs=stmt.executeQuery(sql);
					                rs.last();
					                int m=rs.getRow();
					                if(m==0){
					                    JOptionPane.showMessageDialog(this,"无此员工信息！");
					                }else{
					                    rs.beforeFirst();
					                    while(rs.next()){
					                        num.setText(rs.getString(1));  num.setEditable(false);
					                        name.setText(rs.getString(2));   name.setEditable(false);
					                        sex.setText(rs.getString(3)); sex.setEditable(false);
					                        age.setText(rs.getString(4)); age.setEditable(false);
					                        dep.setText(rs.getString(5)); dep.setEditable(false);
					                        post.setText(rs.getString(6)); post.setEditable(false);
					                        ph.setText(rs.getString(7));ph.setEditable(false);
					                        mon.setText(rs.getString(8)); mon.setEditable(false);
					                        wh.setText(rs.getString(9)); wh.setEditable(false);
					                        stat.setText(rs.getString(10)); stat.setEditable(false);
					                        tim.setText(rs.getString(11));     tim.setEditable(false);
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
						
						if(e.getSource()==delete) {
						JOptionPane.showConfirmDialog(this, "请问是否确定注销此用户", "信息", JOptionPane.YES_NO_OPTION);
						 depeo D=new depeo();
						 D.delete(search.getText());
						 JOptionPane.showMessageDialog(this, "删除成功");
						 this.clear();}
						
					}

}
