package View;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Link.add_Link;

public class p5_4 extends JPanel implements ActionListener{
	
	private JPanel p4;
	private JButton  en,bu;
	private JTextField j1,j2,j3,j4,j5,j6,j7,j8;
	private  JLabel b1,b2,b3,b4,b5,b6,b7,b8,b9;
	
	public p5_4() {
		
		this.setBorder(BorderFactory.createTitledBorder(""));
		this.setLayout(null);
		this.setBounds(0, 0, 924, 541);
		this.setVisible(true);
		this.setOpaque(false);
		
		p4=new JPanel();
		p4.setLayout(null);
		p4.setBounds(0,0,924,541);
		p4.setOpaque(false);
		
		
		b1=new JLabel("商城新增商品");
		b1.setFont(new Font("楷书",Font.BOLD,35));
		b1.setBounds(350, 50,300, 60);
		p4.add(b1);
		
		b2=new JLabel("编号：");
		b2.setFont(new Font("楷书",Font.BOLD,24));
		b2.setBounds(290, 120, 100, 50);
		p4.add(b2);
		
		b3=new JLabel("商品：");
		b3.setFont(new Font("楷书",Font.BOLD,24));
		b3.setBounds(290, 160, 100, 50);
		p4.add(b3);
		
		b4=new JLabel("厂商：");
		b4.setFont(new Font("楷书",Font.BOLD,24));
		b4.setBounds(290, 200, 100, 50);
		p4.add(b4);
		
		b5=new JLabel("类别：");
		b5.setFont(new Font("楷书",Font.BOLD,24));
		b5.setBounds(290, 240, 100, 50);
		p4.add(b5);
		
		b6=new JLabel("进价：");
		b6.setFont(new Font("楷书",Font.BOLD,24));
		b6.setBounds(290, 280, 100, 50);
		p4.add(b6);
		
		b7=new JLabel("数量：");
		b7.setFont(new Font("楷书",Font.BOLD,24));
		b7.setBounds(290, 320, 100, 50);
		p4.add(b7);
		
		b8=new JLabel("售价：");
		b8.setFont(new Font("楷书",Font.BOLD,24));
		b8.setBounds(290, 360, 100, 50);
		p4.add(b8);
		
		b9=new JLabel("时间：");
		b9.setFont(new Font("楷书",Font.BOLD,24));
		b9.setBounds(290, 400, 100, 50);
		p4.add(b9);
		
		j1=new JTextField();
		j1.setFont(new Font("楷书",Font.BOLD,20));
		j1.setBounds(380, 130, 250,27);
		p4.add(j1);
		
		j2=new JTextField();
		j2.setFont(new Font("楷书",Font.BOLD,20));
		j2.setBounds(380, 170, 250,27);
		p4.add(j2);
		
		j3=new JTextField();
		j3.setFont(new Font("楷书",Font.BOLD,20));
		j3.setBounds(380, 210, 250,27);
		p4.add(j3);
		
		j4=new JTextField();
		j4.setFont(new Font("楷书",Font.BOLD,20));
		j4.setBounds(380, 250, 250,27);
		p4.add(j4);
		
		j5=new JTextField();
		j5.setFont(new Font("楷书",Font.BOLD,20));
		j5.setBounds(380, 290, 250,27);
		p4.add(j5);
		
		j6=new JTextField();
		j6.setFont(new Font("楷书",Font.BOLD,20));
		j6.setBounds(380, 330, 250,27);
		p4.add(j6);
		
		j7=new JTextField();
		j7.setFont(new Font("楷书",Font.BOLD,20));
		j7.setBounds(380, 370, 250,27);
		p4.add(j7);
		
		j8=new JTextField();
		j8.setFont(new Font("楷书",Font.BOLD,20));
		j8.setBounds(380, 410, 250,27);
		p4.add(j8);
		
		en=new JButton("确定");
		en.setFont(new Font("楷书",Font.BOLD,20));
		en.setBounds(300, 470, 100, 40);
		en.addActionListener(this);
        p4.add(en);
		
        bu=new JButton("取消");
 	    bu.setFont(new Font("楷书",Font.BOLD,20));
 		bu.setBounds(530, 470, 100, 40);
 		bu.addActionListener(this);
        p4.add(bu);
         
         
		
		this.add(p4);
		
		
	}
	
	
	
	public void clean() {
		
		j1.setText("");
		j2.setText("");
		j3.setText("");
		j4.setText("");
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
		else if(e.getSource()==en) {
			JOptionPane.showConfirmDialog(this, "请问是否确定新增商品信息", "信息", JOptionPane.YES_NO_OPTION);
			add_Link A=new add_Link();
			Boolean a;
			a=A.add2(j1.getText());
				if(a==true)
				{
					A.add(j1.getText(), j2.getText(), j3.getText(), j4.getText(), Double.parseDouble( j5.getText()),Integer.valueOf(j6.getText()).intValue(),Double.parseDouble(j7.getText()), j8.getText());
					JOptionPane.showMessageDialog(this,"数据已添加");
					this.clean();
					
				}
				else {
					JOptionPane.showMessageDialog(this,"已经存在该商品编号");
					this.clean();
				}
				
			}
			
			
			
			
			
		
		
		
	}

}
