package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


import Link.addpeo_Link;

public class p5_11 extends JPanel implements ActionListener{
	
	private JPanel p6;
	private JButton  en,bu;
	
	private JRadioButton a1,a2;
	private JTextField j1,j2,j3,j5,j6,j7,j8,j9,j10,j11;
	private  JLabel b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
      String b="";
	
	
	public p5_11() {
		
	
		

			
			this.setBorder(BorderFactory.createTitledBorder(""));
			this.setLayout(null);
			this.setBounds(0, 0, 924, 541);
			this.setVisible(true);
			this.setOpaque(false);
			
			p6=new JPanel();
			p6.setLayout(null);
			p6.setBounds(0,0,924,541);
			p6.setOpaque(false);
			
			
			b1=new JLabel("注册新员工");
			b1.setFont(new Font("楷书",Font.BOLD,35));
			b1.setBounds(350, 50,300, 60);
			p6.add(b1);
			
			b2=new JLabel("工号：");
			b2.setFont(new Font("楷书",Font.BOLD,24));
			b2.setBounds(290, 120, 100, 50);
			p6.add(b2);
			
			b3=new JLabel("姓名：");
			b3.setFont(new Font("楷书",Font.BOLD,24));
			b3.setBounds(290, 160, 100, 50);
			p6.add(b3);
			
			b4=new JLabel("年龄：");
			b4.setFont(new Font("楷书",Font.BOLD,24));
			b4.setBounds(290, 240, 100, 50);
			p6.add(b4);
			
			b5=new JLabel("性别：");
			b5.setFont(new Font("楷书",Font.BOLD,24));
			b5.setBounds(290, 200, 100, 50);
			p6.add(b5);
			
			b6=new JLabel("部门：");
			b6.setFont(new Font("楷书",Font.BOLD,24));
			b6.setBounds(470, 238, 100, 50);
			p6.add(b6);
			
			b7=new JLabel("职务：");
			b7.setFont(new Font("楷书",Font.BOLD,24));
			b7.setBounds(290, 285, 100, 50);
			p6.add(b7);
			
			b8=new JLabel("月薪：");
			b8.setFont(new Font("楷书",Font.BOLD,24));
			b8.setBounds(470, 285, 100, 50);
			p6.add(b8);
			
			b9=new JLabel("时间：");
			b9.setFont(new Font("楷书",Font.BOLD,24));
			b9.setBounds(290, 410, 100, 50);
			p6.add(b9);
			
			b10=new JLabel("电话：");
			b10.setFont(new Font("楷书",Font.BOLD,24));
			b10.setBounds(290, 325, 100, 50);
			p6.add(b10);
			
			b11=new JLabel("地址：");
			b11.setFont(new Font("楷书",Font.BOLD,24));
			b11.setBounds(290, 365, 100, 50);
			p6.add(b11);
			
			b12=new JLabel("状态：");
			b12.setFont(new Font("楷书",Font.BOLD,24));
			b12.setBounds(635, 240, 100, 50);
			p6.add(b12);
			
			j1=new JTextField();
			j1.setFont(new Font("楷书",Font.BOLD,20));
			j1.setBounds(380, 130, 250,27);
			p6.add(j1);
			
			j2=new JTextField();
			j2.setFont(new Font("楷书",Font.BOLD,20));
			j2.setBounds(380, 170, 250,27);
			p6.add(j2);
			
			j3=new JTextField();
			j3.setFont(new Font("楷书",Font.BOLD,20));
			j3.setBounds(380, 250, 70,27);
			p6.add(j3);
			
			ButtonGroup bg=new ButtonGroup();
			a1= new JRadioButton("男",true);
			a1.setBounds(400, 200, 70, 40);
			a1.setFont(new Font("楷书",Font.BOLD,25));
			bg.add(a1);
			
			a2= new JRadioButton("女",false);
			a2.setBounds(530, 200, 70, 40);
			a2.setFont(new Font("楷书",Font.BOLD,25));
			bg.add(a2);
			
			p6.add(a1);p6.add(a2);
			
			
			
			
		/*	j4=new JTextField();
			j4.setFont(new Font("楷书",Font.BOLD,20));
			j4.setBounds(380, 250, 250,27);
			p6.add(j4);
			*/
			j5=new JTextField();
			j5.setFont(new Font("楷书",Font.BOLD,20));
			j5.setBounds(545, 250, 80,27);
			p6.add(j5);
			
			j6=new JTextField();
			j6.setFont(new Font("楷书",Font.BOLD,20));
			j6.setBounds(380, 295, 70,27);
			p6.add(j6);
			
			j7=new JTextField();
			j7.setFont(new Font("楷书",Font.BOLD,20));
			j7.setBounds(545, 295, 80,27);
			p6.add(j7);
			
			j8=new JTextField();
			j8.setFont(new Font("楷书",Font.BOLD,20));
			j8.setBounds(380, 420, 250,27);
			p6.add(j8);
			
			j9=new JTextField();
			j9.setFont(new Font("楷书",Font.BOLD,20));
			j9.setBounds(380, 335, 250,27);
			p6.add(j9);
			
			j10=new JTextField();
			j10.setFont(new Font("楷书",Font.BOLD,20));
			j10.setBounds(380, 375, 250,27);
			p6.add(j10);
			
			j11=new JTextField();
			j11.setFont(new Font("楷书",Font.BOLD,20));
			j11.setBounds(700, 250, 75,27);
			p6.add(j11);
			
			en=new JButton("确定");
			en.setFont(new Font("楷书",Font.BOLD,20));
			en.setBounds(300, 470, 100, 40);
			en.addActionListener( this);
	        p6.add(en);
			
	        bu=new JButton("取消");
	 	    bu.setFont(new Font("楷书",Font.BOLD,20));
	 		bu.setBounds(530, 470, 100, 40);
	 		bu.addActionListener(this);
	        p6.add(bu);
	         
	         
			
			this.add(p6);
			
			
	
		
			
		}

		
		public void clean() {
			
			j1.setText("");
			j2.setText("");
			j3.setText("");
			j5.setText("");
			j6.setText("");
			j7.setText("");
			j8.setText("");
			j9.setText("");
			j10.setText("");
			j11.setText("");
		}


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==bu) {
				this.clean();
			}
			else if (e.getSource()==en) {
				
				if(a1.isSelected()) {
					 b=a1.getText();
				
				}
				 if(a2.isSelected()) {
					b=a2.getText();

				}
		
				JOptionPane.showConfirmDialog(this, "请问是否确定加入新的员工", "信息", JOptionPane.YES_NO_OPTION);
				addpeo_Link A=new addpeo_Link();
				Boolean a;
				a=A.add2(j1.getText());
				if(a==true)
				{
					A.add(j1.getText(), j2.getText(),  b,j3.getText(), j5.getText(),j6.getText(),j9.getText(),Double.parseDouble(j7.getText()),j11.getText(),j10.getText(),j8.getText());
					JOptionPane.showMessageDialog(this,"数据已添加");
					this.clean();
					
				}
				else {
					JOptionPane.showMessageDialog(this,"已经存在该账号");
					this.clean();
				}
				
				
			}
		}
}
