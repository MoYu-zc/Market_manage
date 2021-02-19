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
    //p1 ��       p2 ��  p3 ��   p4 ��   p5 �� 

 public static void main(String [] args) {
    	
    	new mainsee();
    	
 }
 
    		public mainsee() {
	
	app=new JFrame();
	app.setTitle("�̳ǹ���ϵͳ");
	Container c=app.getContentPane();
	c.setLayout(new BorderLayout());
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	app.setSize(1235, 800);
	app.setLocationRelativeTo(null);
	app.setVisible(true);
	
	JPanel p1=new JPanel();
	p1.setLayout(null);
	
	//ͼ��
	Image img0 = new ImageIcon("icon_001.png").getImage();
	app.setIconImage(img0);
	
	p2=new JPanel();
	p2.setBorder(BorderFactory.createTitledBorder(""));
	p2.setLayout(null);
	p2.setBounds(400, 10, 500, 80);
	
	//����ʺ���
			String Welcome=null;
			Date date =new Date();
			SimpleDateFormat sdf =new SimpleDateFormat("HH");//ֻ��ʱ
			String time=sdf.format(date);
			if(Integer.valueOf(time)>=0&&Integer.valueOf(time)<8)
				Welcome="�𾴵Ĺ���Ա\n���Ϻã�";
			else if(Integer.valueOf(time)>=8&&Integer.valueOf(time)<12)
				Welcome="�𾴵Ĺ���Ա\n����ã�";
			else if(Integer.valueOf(time)>=12&&Integer.valueOf(time)<20)
				Welcome="�𾴵Ĺ���Ա\n����ã�";
			else if(Integer.valueOf(time)>=20&&Integer.valueOf(time)<24)
				Welcome="�𾴵Ĺ���Ա\n���Ϻã�";
			JLabel  welcome=new JLabel(Welcome);
			    welcome.setFont(new Font("���ķ���", Font.BOLD, 15));
			    welcome.setForeground(Color.BLACK);
			    welcome.setBounds(35, 20, 180, 20);
			    p2.add(welcome);
	//���ϵͳʱ��
			JLabel timel = new JLabel();
				timel.setFont(new Font("���ķ���", Font.BOLD, 16));
				timel.setForeground(Color.BLACK);
				timel.setBounds(300, 12, 162, 25);
				p2.add(timel);
			JLabel week=new JLabel();
				week.setFont(new Font("���ķ���", Font.BOLD, 14));
				week.setForeground(Color.BLACK);
				week.setBounds(300, 32, 164, 30);
				p2.add(week);
				TimerTask task = new TimerTask(){
		        	public void run(){
		        		String sdate,tdate;
			        	sdate = (new SimpleDateFormat("yyyy "+"��"+" MM "+"��"+" dd "+"��")).format(new Date());
			        	timel.setText(sdate);
			        	tdate = (new SimpleDateFormat("HH : mm : ss     EEEE")).format(new Date());
			        	week.setText(tdate);
		        	}
		        };
				Timer t = new Timer();
		        t.scheduleAtFixedRate(task, new Date(), 1000);
	//�˳�
		        exit=new JButton("ע��");
		        exit.setForeground(Color.BLACK);
		        exit.setFont(new Font("���ķ���",Font.BOLD,15));
		        exit.setBounds(1130, 22, 67, 42);
		        exit.addActionListener(this);
		        p1.add(exit);
         
	        //��������
            p3=new JPanel();
		    p3.setBounds(-5, 120, 260, 650);	  
	        //������
	      	DefaultMutableTreeNode root=new DefaultMutableTreeNode("�̳ǹ���ϵͳ");
	      	DefaultMutableTreeNode node1=new DefaultMutableTreeNode("��Ʒ��Ϣ");
	      	DefaultMutableTreeNode node2=new DefaultMutableTreeNode("VIP��Ϣ");
	      	DefaultMutableTreeNode node3=new DefaultMutableTreeNode("���¹���");
	      	DefaultMutableTreeNode node4=new DefaultMutableTreeNode("���۹���");

	      	DefaultTreeModel treeModel=new DefaultTreeModel(root);
	      	treeModel.insertNodeInto(node1, root, root.getChildCount());
	      	treeModel.insertNodeInto(node2, root, root.getChildCount());
	      	treeModel.insertNodeInto(node3, root, root.getChildCount());
	      	treeModel.insertNodeInto(node4, root, root.getChildCount());

	      	
	      	DefaultMutableTreeNode n1=new DefaultMutableTreeNode("�����Ʒ");
	      	DefaultMutableTreeNode n2=new DefaultMutableTreeNode("��ѯ��Ʒ");
	      	DefaultMutableTreeNode n3=new DefaultMutableTreeNode("�½���Ʒ");
	      	DefaultMutableTreeNode n4=new DefaultMutableTreeNode("������Ʒ");
	      	DefaultMutableTreeNode n5=new DefaultMutableTreeNode("������Ʒ");
	      	treeModel.insertNodeInto(n1, node1, node1.getChildCount());
	      	treeModel.insertNodeInto(n2, node1, node1.getChildCount());
	      	treeModel.insertNodeInto(n3, node1, node1.getChildCount());
	      	treeModel.insertNodeInto(n4, node1, node1.getChildCount());
	      	treeModel.insertNodeInto(n5, node1, node1.getChildCount());
	      	
	      	DefaultMutableTreeNode n6=new DefaultMutableTreeNode("���VIP");
	      	DefaultMutableTreeNode n7=new DefaultMutableTreeNode("�����¼");
	      	DefaultMutableTreeNode n8=new DefaultMutableTreeNode("ע��VIP");
	    	DefaultMutableTreeNode n9=new DefaultMutableTreeNode("�鿴�޸�");
	    	DefaultMutableTreeNode n10=new DefaultMutableTreeNode("ע��VIP");
	    	treeModel.insertNodeInto(n6, node2, node2.getChildCount());
	      	treeModel.insertNodeInto(n7, node2, node2.getChildCount());
	      	treeModel.insertNodeInto(n8, node2, node2.getChildCount());
	      	treeModel.insertNodeInto(n9, node2, node2.getChildCount());
	      	treeModel.insertNodeInto(n10, node2, node2.getChildCount());
	      	
	      	DefaultMutableTreeNode n11=new DefaultMutableTreeNode("���Ա��");
	      	DefaultMutableTreeNode n12=new DefaultMutableTreeNode("��ѯԱ��");
	      	DefaultMutableTreeNode n13=new DefaultMutableTreeNode("ע��Ա��");
	    	DefaultMutableTreeNode n14=new DefaultMutableTreeNode("�޸�Ա��");
	    	DefaultMutableTreeNode n15=new DefaultMutableTreeNode("ע��Ա��");
	      	treeModel.insertNodeInto(n11, node3,node3.getChildCount());
	      	treeModel.insertNodeInto(n12, node3, node3.getChildCount());
	      	treeModel.insertNodeInto(n13,node3,node3.getChildCount());
	      	treeModel.insertNodeInto(n14, node3,node3.getChildCount());
	      	treeModel.insertNodeInto(n15,node3, node3.getChildCount());

	      	
	      	DefaultMutableTreeNode n16=new DefaultMutableTreeNode("���ղ�ѯ");
	      	DefaultMutableTreeNode n17=new DefaultMutableTreeNode("���²�ѯ");
	      	DefaultMutableTreeNode n18=new DefaultMutableTreeNode("��ݲ�ѯ");
	      	DefaultMutableTreeNode n19=new DefaultMutableTreeNode("�����ѯ");
	    	DefaultMutableTreeNode n20=new DefaultMutableTreeNode("�ܶ��ѯ");

	      	treeModel.insertNodeInto(n16, node4,node4.getChildCount());
	      	treeModel.insertNodeInto(n17, node4, node4.getChildCount());
	      	treeModel.insertNodeInto(n18, node4, node4.getChildCount());
	      	treeModel.insertNodeInto(n19, node4, node4.getChildCount());
	      	treeModel.insertNodeInto(n20, node4, node4.getChildCount());
	      	
	      	JTree tree=new JTree(treeModel);
	      	tree.addTreeSelectionListener(this);
	      	tree.setFont(new Font("���ķ���",0,20));
	      	//�ı�JTree�����
	      	tree.putClientProperty("JTree.lineStyle", "Angled");
	      	JScrollPane scrollPane=new JScrollPane();
	      	scrollPane.setViewportView(tree);
	      	scrollPane.setBounds(60, 160, 140, 450);
	        p3.add(scrollPane);

	        p5=new JPanel();
	        p5.setLayout(null);
	        p5.setBounds(258, 125, 924, 541);
	        p5.setOpaque(false); //�������͸��
	        
	        //���͸��ͼƬ
           	 bd=new JLabel();
           	Image in=new ImageIcon("res/����.png").getImage();
           	bd.setIcon(new ImageIcon(in));
           	bd.setBounds(240,0,920,540);
           	p5.add(bd);
           	
           	//��ӭ��
           	JLabel wel=new JLabel("��ӭʹ���̳ǹ���ϵͳ");
            wel.setBounds(210, 0, 920, 540);
            wel.setFont(new Font("���ķ���",0,50));
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
		   if(nodeName.equals("�����Ʒ")) {
			   p5.setVisible(false);
			   p5.removeAll();
                p5.add(new p5_1());               //	�����´���
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("��ѯ��Ʒ")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_2());               //	�����´���
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("�½���Ʒ")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_3());               //	�����´���
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("������Ʒ")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_4());               //	�����´���
			   p5.add(bd);
			   p5.setVisible(true);
		   }
	 else  if(nodeName.equals("������Ʒ")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   JOptionPane.showConfirmDialog(this, "����ȷ��������Ʒ��Ϣ��", "��Ϣ", JOptionPane.YES_NO_OPTION);   
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("���VIP")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_5());  
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("�����¼")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   JOptionPane.showMessageDialog(this, "���û���û�й����¼", "��Ϣ",JOptionPane.WARNING_MESSAGE);
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   
		   else  if(nodeName.equals("ע��VIP")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_6());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   
		   else  if(nodeName.equals("�鿴�޸�")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_7());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("ע��VIP")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_8());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("���Ա��")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_9());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("��ѯԱ��")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_10());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("ע��Ա��")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_11());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("�޸�Ա��")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_12());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("ע��Ա��")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_13());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("���ղ�ѯ")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_14());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("���²�ѯ")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_14());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("��ݲ�ѯ")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_14());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("���ȫ��")) {
			   p5.setVisible(false);
			   p5.removeAll();
			   p5.add(new p5_14());
			   p5.add(bd);
			   p5.setVisible(true);
		   }
		   else  if(nodeName.equals("�ܶ��ѯ")) {
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
		JOptionPane.showMessageDialog(this,"�Ƿ�ȷ��ע��");
		app.setVisible(false);
		new open();
		
	}
}

	
}