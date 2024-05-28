package com.sist.user;
import java.awt.Font;

import javax.swing.*;
public class BoardInsert extends JPanel	{
	JLabel titleLa, nameLa, subLa, conLa, pwLa;
	JTextField nameTf, subTf;
	JPasswordField pwPF;
	JTextArea ta;
	JButton b1, b2;
	public BoardInsert() {
		titleLa=new JLabel("글쓰기",JLabel.CENTER); // <table>
		titleLa.setFont(new Font("맑은 고딕",Font.BOLD,30)); // <h3></h3>
		setLayout(null);
		titleLa.setBounds(10,15,620,50);
		add(titleLa);
		
		nameLa = new JLabel("이름",JLabel.CENTER);
		nameTf=new JTextField();
		nameLa.setBounds(10,70,80,30);
		nameTf.setBounds(95,70,150,30);
		add(nameLa);add(nameTf);
		
		subLa = new JLabel("제목",JLabel.CENTER);
		subTf=new JTextField();
		subLa.setBounds(10,105,80,30);
		subTf.setBounds(95,105,450,30);
		add(subLa);add(subTf);
		
		conLa = new JLabel("내용",JLabel.CENTER);
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		conLa.setBounds(10,140,80,30);
		js.setBounds(95,140,450,250);
		add(conLa);add(js);
		
		pwLa = new JLabel("비밀번호",JLabel.CENTER);
		pwPF=new JPasswordField();
		// 			   top,right,bottom,left ==> CSS
		pwLa.setBounds(10,395,80,30);
		//			   x,y,width,height
		pwPF.setBounds(95,395,150,30);
		add(pwLa);add(pwPF);
		
		b1=new JButton("등록");
		b2=new JButton("취소");
		
		JPanel p=new JPanel();
		p.add(b1); p.add(b2);
		p.setBounds(10,435,535,35);;
		add(p);
	}
}
