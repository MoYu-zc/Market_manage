package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Link.addVIP_Link;

public class p5_6 extends JPanel implements ActionListener{
	
	private JPanel p6;
	private JButton  en,bu;
	
	private JRadioButton a1,a2;
	private JTextField j1,j2,j3,j5,j6,j7,j8;
	private  JLabel b1,b2,b3,b4,b5,b6,b7,b8,b9;
      String b="";
	
	
	public p5_6() {
		
	
		

			
			this.setBorder(BorderFactory.createTitledBorder(""));
			this.setLayout(null);
			this.setBounds(0, 0, 924, 541);
			this.setVisible(true);
			this.setOpaque(false);
			
			p6=new JPanel();
			p6.setLayout(null);
			p6.setBounds(0,0,924,541);
			p6.setOpaque(false);
			
			
			b1=new JLabel("注册VIP用户");
			b1.setFont(new Font("楷书",Font.BOLD,35));
			b1.setBounds(350, 50,300, 60);
			p6.add(b1);
			
			b2=new JLabel("账号：");
			b2.setFont(new Font("楷书",Font.BOLD,24));
			b2.setBounds(290, 120, 100, 50);
			p6.add(b2);
			
			b3=new JLabel("密码：");
			b3.setFont(new Font("楷书",Font.BOLD,24));
			b3.setBounds(290, 160, 100, 50);
			p6.add(b3);
			
			b4=new JLabel("姓名：");
			b4.setFont(new Font("楷书",Font.BOLD,24));
			b4.setBounds(290, 200, 100, 50);
			p6.add(b4);
			
			
			
			
			
			
			
			b5=new JLabel("性别：");
			b5.setFont(new Font("楷书",Font.BOLD,24));
			b5.setBounds(290, 240, 100, 50);
			p6.add(b5);
			
			b6=new JLabel("住址：");
			b6.setFont(new Font("楷书",Font.BOLD,24));
			b6.setBounds(290, 280, 100, 50);
			p6.add(b6);
			
			b7=new JLabel("电话：");
			b7.setFont(new Font("楷书",Font.BOLD,24));
			b7.setBounds(290, 320, 100, 50);
			p6.add(b7);
			
			b8=new JLabel("折扣：");
			b8.setFont(new Font("楷书",Font.BOLD,24));
			b8.setBounds(290, 360, 100, 50);
			p6.add(b8);
			
			b9=new JLabel("时间：");
			b9.setFont(new Font("楷书",Font.BOLD,24));
			b9.setBounds(290, 400, 100, 50);
			p6.add(b9);
			
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
			j3.setBounds(380, 210, 250,27);
			p6.add(j3);
			
			ButtonGroup bg=new ButtonGroup();
			a1= new JRadioButton("男",true);
			a1.setBounds(400, 240, 70, 40);
			a1.setFont(new Font("楷书",Font.BOLD,25));
			bg.add(a1);
			
			a2= new JRadioButton("女",false);
			a2.setBounds(530, 240, 70, 40);
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
			j5.setBounds(380, 290, 250,27);
			p6.add(j5);
			
			j6=new JTextField();
			j6.setFont(new Font("楷书",Font.BOLD,20));
			j6.setBounds(380, 330, 250,27);
			p6.add(j6);
			
			j7=new JTextField();
			j7.setFont(new Font("楷书",Font.BOLD,20));
			j7.setBounds(380, 370, 250,27);
			p6.add(j7);
			
			j8=new JTextField();
			j8.setFont(new Font("楷书",Font.BOLD,20));
			j8.setBounds(380, 410, 250,27);
			p6.add(j8);
			
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
		
				JOptionPane.showConfirmDialog(this, "请问是否确定注册新的VIP", "信息", JOptionPane.YES_NO_OPTION);
				addVIP_Link A=new addVIP_Link();
				Boolean a;
				a=A.add2(j1.getText());
				if(a==true)
				{
					A.add(j1.getText(), j2.getText(), j3.getText(), b, j5.getText(),j6.getText(),j7.getText(),j8.getText());
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
	


