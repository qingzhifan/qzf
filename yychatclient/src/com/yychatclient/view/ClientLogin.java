package com.yychatclient.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.yychat.model.User;
import com.yychatclient.control.ClientConnect;

public class ClientLogin extends  JFrame implements ActionListener {//类名：ClientLogin，模板，对象的模板
       //定义北部组件
	    JLabel   jlbl1;//定义标签
	    
	    //定义中部组建
	    JTabbedPane   jtp1;//选项卡
	    JPanel jp2,jp3,jp4;
	    JLabel   jlbl2,jlbl3,jlbl4,jlbl5;
	    JTextField jtf1;
	    JPasswordField jpf1;
	    JButton jb4;
	    JCheckBox jcb1,jcb2;
	    
	    //定义南部组建
	    JButton jb1,jb2,jb3;
	    JPanel jp1;//面板，容器；
	    
	     public  ClientLogin(){//构造方法
	    	 //创建北部组建
	    	 jlbl1=new JLabel(new ImageIcon("images/tou.gif"));
	         this.add(jlbl1,"North");
	         
	         //创建中部组建
	         jp2=new JPanel(new GridLayout(3,3)); //布局问题
	         jp3=new JPanel();  jp4=new JPanel();
	         jlbl2=new JLabel("YY号码",JLabel.CENTER); jlbl3=new JLabel("YY密码",JLabel.CENTER);
	         jlbl4=new JLabel("忘记密码",JLabel.CENTER); 
	         jlbl4.setForeground(Color.blue);
	         jlbl5=new JLabel("申请密码保护",JLabel.CENTER);
	         jtf1=new JTextField();
	         jpf1=new JPasswordField();
	         jb4=new JButton(new ImageIcon("images/clear.gif"));
	         jcb1=new  JCheckBox("隐身密码");  jcb2=new  JCheckBox("记住密码");
	         jp2.add(jlbl2);  jp2.add(jtf1);  jp2.add(jb4);
	         jp2.add(jlbl3);  jp2.add(jpf1);  jp2.add(jlbl4);
	         jp2.add(jcb1);  jp2.add(jcb2);  jp2.add(jlbl5);
	        
	        
	         jtp1=new  JTabbedPane();
	         jtp1.add(jp2,"YY号码");  jtp1.add(jp3,"电话号码");  jtp1.add(jp4,"电子邮箱");
	         this.add(jtp1);
	         
	         //创建南部组建
	         jb1=new JButton(new ImageIcon("images/denglu.gif"));
	     	 jb1.addActionListener(this);
	         jb2=new JButton(new ImageIcon("images/zhuce.gif"));
	         jb3=new JButton(new ImageIcon("images/quxiao.gif"));
	         jp1=new JPanel();
	         jp1.add(jb1); jp1.add(jb2); jp1.add(jb3);
	         this.add(jp1,"South");
	         
	         
	         this.setSize(350,240);//设置窗口大小
	         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//使程序停止运行
	         this.setVisible(true);
	     
	     }
	public static void main(String[] args) {
		ClientLogin  clientLogin=new ClientLogin(); //创建对象， 构造   
	    
	
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	 if(e.getSource()==jb1) {
		String  userName  = jtf1.getText().trim();
		String passWord =new String(jpf1.getPassword());
		//创建User对象
		User user =new User();//对象放在堆内存，引用变量放在栈内存
		user.setUserName(userName);
		user.setPassWord(passWord);
		
		new ClientConnect().loginValidate(user);
		 new FriendList();
		 
		 this.dispose();
		
	}

	}
}
