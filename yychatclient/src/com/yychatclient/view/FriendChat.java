package com.yychatclient.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FriendChat  extends JFrame implements ActionListener{

	//Center部分
	JScrollPane jsp;
	JTextArea jta;
	
	//南部
	JPanel jp;
	JTextField jtf;//一行文本
	JButton jb;
	
	 public FriendChat(String sender,String receiver){
		jta=new JTextArea();//文本区域（多行文本）
		jta.setEditable(false);
		jta.setForeground(Color.red);
		jsp=new JScrollPane(jta);
		this.add(jsp,"Center");
		
		jp=new JPanel();
		jtf=new JTextField(15);
		jb=new  JButton("发送");
		jb.addActionListener(this);
		jp.add(jtf);
		jp.add(jb);
		this.add(jp,"South");
		
		this.setSize(350,240);
		this.setTitle(sender+"正在和"+receiver+"聊天");
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);//居中显示
		this.setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		//FriendChat  friendChat =new   FriendChat();

	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==jb)  jta.append(jtf.getText()+"\r\n");
	}

}
