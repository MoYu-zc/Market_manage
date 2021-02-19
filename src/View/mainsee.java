package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class mainsee extends JFrame implements ActionListener,TreeSelectionListener {
	
    private JFrame app;
    private JButton exit;
    private JLabel bd;
    private JPanel p1,p2,p3,p4,p5;
    //p1 主       p2 上  p3 左   p4 下   p5 右 

 public static void main(String [] args) {
    	
    	new mainsee();
    	
 }
 
    		public mainsee() {
	
	app=new JFrame();
	app.setTitle("商城管理系统");
	Container c=app.getContentPane();
	c.setLayout(new BorderLayout());
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	app.setSize(1235, 800);
	app.setLocationRelativeTo(null);
	app.setVisible(true);
	
	JPanel p1=new JPanel();
	p1.setLayout(null);
	
	//图标
	Image img0 = new ImageIcon("icon_001.png").getImage();
	app.setIconImage(img0);
	
	p2=new JPanel();
	p2.setBorder(BorderFactory.createTitledBorder(""));
	p2.setLayout(null);
	p2.setBounds(400, 10, 500, 80);
	
	//添加问候语
			String Welcome=null;
			Date date =new Date();
			SimpleDateFormat sdf =new SimpleDateFormat("HH");//只有时
			String time=sdf.format(date);
			if(Integer.valueOf(time)>=0&&Integer.valueOf(time)<8)
				Welcome="尊敬的管理员\n早上好！";
			else if(Integer.valueOf(time)>=8&&Integer.valueOf(time)<12)
				Welcome="尊敬的管理员\n上午好！";
			else if(Integer.valueOf(time)>=12&&Integer.valueOf(time)<20)
				Welcome="尊敬的管理员\n下午好！";
			else if(Integer.valueOf(time)>=20&&Integer.valueOf(time)<24)
				Welcome="尊敬的管理员\n晚上好！";
			JLabel  welcome=new JLabel(Welcome);
			    welcome.setFont(new Font("华文仿宋", Font.BOLD, 15));
			    welcome.setForeground(Color.BLACK);
			    welcome.setBounds(35, 20, 180, 20);
			    p2.add(welcome);
	//添加系统时间
			JLabel timel = new JLabel();
				timel.setFont(new Font("华文仿宋", Font.BOLD, 16));
				timel.setForeground(Color.BLACK);
				timel.setBounds(300, 12, 162, 25);
				p2.add(timel);
			JLabel week=new JLabel();
				week.setFont(new Font("华文仿宋", Font.BOLD, 14));
				week.setForeground(Color.BLACK);
				week.setBounds(300, 32, 164, 30);
				p2.add(week);
				TimerTask task = new TimerTask(){
		        	public void run(){
		        		String sdate,tdate;
			        	sdate = (new SimpleDateFormat("yyyy "+"年"+" MM "+"月"+" dd "+"日")).format(new Date());
			        	timel.setText(sdate);
			        	tdate = (new SimpleDateFormat("HH : mm : ss     EEEE")).format(new Date());
			        	week.setText(tdate);
		        	}
		        };
				Timer t = new Timer();
		        t.scheduleAtFixedRate(task, new Date(), 1000);
	//退出
		        exit=new JButton("注销");
		        exit.setForeground(Color.BLACK);
		        exit.setFont(new Font("华文仿宋",Font.BOLD,15));
		        exit.setBounds(1130, 22, 67, 42);
		        exit.addActionListener(this);
		        p1.add(exit);
         
	        //添加树面板
            p3=new JPanel();
		    p3.setBounds(-5, 120, 260, 650);	  
	        //创建树
	      	DefaultMutableTreeNode root=new DefaultMutableTreeNode("商城管理系统");
	      	DefaultMutableTreeNode node1=new DefaultMutableTreeNode("商品信息");
	      	DefaultMutableTreeNode node2=new DefaultMutableTreeNode("VIP信息");
	      	DefaultMutableTreeNode node3=new DefaultMutableTreeNode("人事管理");
	      	DefaultMutableTreeNode node4=new DefaultMutableTreeNode("销售管理");

	      	DefaultTreeModel treeModel=new DefaultTreeModel(root);
	      	treeModel.insertNodeInto(node1, root, root.getChildCount());
	      	treeModel.insertNodeInto(node2, root, root.getChildCount());
	      	treeModel.insertNodeInto(node3, root, root.getChildCount());
	      	treeModel.insertNodeInto(node4, root, root.getChildCount());

	      	
	      	DefaultMutableTreeNode n1=new DefaultMutableTreeNode("浏览商品");
	      	DefaultMutableTreeNode n2=new DefaultMutableTreeNode("查询商品");
	      	DefaultMutableTreeNode n3=new DefaultMutableTreeNode("新进商品");
	      	DefaultMutableTreeNode n4=new DefaultMutableTreeNode("新增商品");
	      	DefaultMutableTreeNode n5=new DefaultMutableTreeNode("更新商品");
	      	treeModel.insertNodeInto(n1, node1, node1.getChildCount());
	      	treeModel.insertNodeInto(n2, node1, node1.getChildCount());
	      	treeModel.insertNodeInto(n3, node1, node1.getChildCount());
	      	treeModel.insertNodeInto(n4, node1, node1.getChildCount());
	      	treeModel.insertNodeInto(n5, node1, node1.getChildCount());
	      	
	      	DefaultMutableTreeNode n6=new DefaultMutableTreeNode("浏览VIP");
	      	DefaultMutableTreeNode n7=new DefaultMutableTreeNode("购物记录");
	      	DefaultMutableTreeNode n8=new DefaultMutableTreeNode("注册VIP");
	    	DefaultMutableTreeNode n9=new DefaultMutableTreeNode("查看修改");
	    	DefaultMutableTreeNode n10=new DefaultMutableTreeNode("注销VIP");
	    	treeModel.insertNodeInto(n6, node2, node2.getChildCount());
	      	treeModel.insertNodeInto(n7, node2, node2.getChildCount());
	      	treeModel.insertNodeInto(n8, node2, node2.getChildCount());
	      	treeModel.insertNodeInto(n9, node2, node2.getChildCount());
	      	treeModel.insertNodeInto(n10, node2, node2.getChildCount());
	      	
	      	DefaultMutableTreeNode n11=new DefaultMutableTreeNode("浏览员工");
	      	DefaultMutableTreeNode n12=new DefaultMutableTreeNode("查询员工");
	      	DefaultMutableTreeNode n13=new DefaultMutableTreeNode("注册员工");
	    	DefaultMutableTreeNode n14=new DefaultMutableTreeNode("修改员工");
	    	DefaultMutableTreeNode n15=new DefaultMutableTreeNode("注销员工");
	      	treeModel.insertNodeInto(n11, node3,node3.getChildCount());
	      	treeModel.insertNodeInto(n12, node3, node3.getChildCount());
	      	treeModel.insertNodeInto(n13,node3,node3.getChildCount());
	      	treeModel.insertNodeInto(n14, node3,node3.getChildCount());
	      	treeModel.insertNodeInto(n15,node3, node3.getChildCount());

	      	
	      	DefaultMutableTreeNode n16=new DefaultMutableTreeNode("单日查询");
	      	DefaultMutableTreeNode n17=new DefaultMutableTreeNode("单月查询");
	      	DefaultMutableTreeNode n18=new DefaultMutableTreeNode("年份查询");
	      	DefaultMutableTreeNode n19=new DefaultMutableTreeNode("浏览查询");
	    	DefaultMutableTreeNode n20=new DefaultMutableTreeNode("总额查询");

	      	treeModel.insertNodeInto(n16, node4,node4.getChildCount());
	      	treeModel.insertNodeInto(n17, node4, node4.getChildCount());
	      	treeModel.insertNodeInto(n18, node4, node4.getChildCount());
	      	treeModel.insertNodeInto(n19, node4, node4.getChildCount());
	      	treeModel.insertNodeInto(n20, node4, node4.getChildCount());
	      	
	      	JTree tree=new JTree(treeModel);
	      	tree.addTreeSelectionListener(this);
	      	tree.setFont(new Font("华文仿宋",0,20));
	      	//改变JTree的外观
	      	tree.putClientProperty("JTree.lineStyle", "Angled");
	      	JScrollPane scrollPane=new JScrollPane();
	      	scrollPane.setViewportView(tree);
	      	scrollPane.setBounds(60, 160, 140, 450);
	        p3.add(scrollPane);

	        p5=new JPanel();
	        p5.setLayout(null);
	        p5.setBounds(258, 125, 924, 541);
	        p5.setOpaque(false); //设置面板透明
	        
	        //添加透明图片
           	 bd=new JLabel();
           	Image in=new ImageIcon("res/背景.png").getImage();
           	bd.setIcon(new ImageIcon(in));
           	bd.setBounds(240,0,920,540);
           	p5.add(bd);
           	
           	//欢迎语
           	JLabel wel=new JLabel("欢迎使用商城管理系统");
            wel.setBounds(210, 0, 920, 540);
            wel.setFont(new Font("华文仿宋",0,50));
            wel.setOpaque(false);
            p5.add(wel);
           	
          p1.add(p2);
          p1.add(p3);
          p1.add(p5);
          c.add(p1);
          app.setResizable(false);
           	
           	
}



@Override
public void valueChanged(TreeSelectionEvent e) {
	// TODO Auto-generated method stub
	JTree tree=(JTree)e.getSource();
	if(e.getSource()==tree){
	DefaultMutableTreeNode selectionNode=(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
	   if(selectionNode.isLeaf()){ 
		   String nodeName=selectionNode.toString();
		   if(nodeName.equals("浏览商品")) {
			   p5.setVisible(false);
			   p5.removeAll();
                p5.add(new p5_1());               //	加入新窗口
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("查询商品")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_2());               //	加入新窗口
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("新进商品")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_3());               //	加入新窗口
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("新增商品")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_4());               //	加入新窗口
			   p5.add(bd);
			   p5.setVisible(true);
		   }
	 else  if(nodeName.equals("更新商品")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   JOptionPane.showConfirmDialog(this, "请问确定更新商品信息？", "信息", JOptionPane.YES_NO_OPTION);   
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("浏览VIP")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_5());  
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("购物记录")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   JOptionPane.showMessageDialog(this, "此用户还没有购物记录", "信息",JOptionPane.WARNING_MESSAGE);
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   
		   else  if(nodeName.equals("注册VIP")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_6());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   
		   else  if(nodeName.equals("查看修改")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_7());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("注销VIP")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_8());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("浏览员工")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_9());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("查询员工")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_10());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("注册员工")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_11());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("修改员工")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_12());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("注销员工")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_13());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("单日查询")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_14());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("单月查询")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_14());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("年份查询")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_14());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("浏览全部")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_14());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("总额查询")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_14());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   
		   
		   
		   
		   
		   
			   }
		   }
	
}
      
 
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==exit){
		JOptionPane.showMessageDialog(this,"是否确定注销");
		app.setVisible(false);
		new open();
		
	}
}

	
}