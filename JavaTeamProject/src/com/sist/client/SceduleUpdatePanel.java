package com.sist.client;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sist.dao.BoardDAO;
import com.sist.dao.BoardVO;

public class SceduleUpdatePanel extends JPanel implements ActionListener{
	 JLabel titleLa,nameLa,subLa,contLa,pwdLa;
	    JTextField nameTf,subTf;
	    JPasswordField pwdPf;
	    JTextArea ta;
	    JButton b1,b2;
	    ControllPanel cp;
	    BoardDAO dao;
	    int no = 0;
	    
	    public SceduleUpdatePanel(ControllPanel cp)
	    {
	    	this.cp=cp;
	    	dao = BoardDAO.newInstance();
	    	
	    	titleLa=new JLabel("수정하기",JLabel.CENTER);// <table>
	    	titleLa.setFont(new Font("맑은 고딕",Font.BOLD,30)); //<h3></h3>
	    	setLayout(null);
	    	titleLa.setBounds(120, 15, 620, 50);
	    	add(titleLa);
	    	
	    	nameLa=new JLabel("이름",JLabel.CENTER);
	    	nameTf=new JTextField();
	    	nameLa.setBounds(120, 70, 80, 30);
	    	nameTf.setBounds(205, 70, 150, 30);
	    	add(nameLa);add(nameTf);
	    	
	    	subLa=new JLabel("제목",JLabel.CENTER);
	    	subTf=new JTextField();
	    	subLa.setBounds(120, 105, 80, 30);
	    	subTf.setBounds(205, 105, 450, 30);
	    	add(subLa);add(subTf);
	    	
	    	
	    	contLa=new JLabel("내용",JLabel.CENTER);
	    	ta=new JTextArea();
	    	JScrollPane js=new JScrollPane(ta);
	    	contLa.setBounds(120, 140, 80, 30);
	    	js.setBounds(205, 140, 450, 250);
	    	add(contLa);add(js);
	 
	    	pwdLa=new JLabel("비밀번호",JLabel.CENTER);
	    	pwdPf=new JPasswordField();
	    	//             Top  Right Bottom Left ==> CSS
	    	pwdLa.setBounds(120, 395, 80, 30);
	    	//             x  y width heigth
	    	pwdPf.setBounds(205, 395, 150, 30);
	    	add(pwdLa);add(pwdPf);
	    	
	    	b1=new JButton("수정");
	    	b2=new JButton("취소");
	    	
	    	JPanel p=new JPanel();
	    	p.add(b1);p.add(b2);
	    	p.setBounds(120, 435, 535, 35);
	    	add(p);
	    	
	    	b1.addActionListener(this);
	    	b2.addActionListener(this);
	    }

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b2) {
				cp.card.show(cp, "DETAIL");
			}
			else if(e.getSource() == b1) {
				String name = nameTf.getText();
				if(name.length() < 1) {
					nameTf.requestFocus();
					return;
				}
				String subject = subTf.getText(); 
				if(subject.length() < 1) {
					subTf.requestFocus();
					return;
				}
				String content = ta.getText(); 
				if(content.length() < 1) {
					ta.requestFocus();
					return;
				}
				String pwd = String.valueOf(pwdPf.getPassword());
				if(pwd.length()<1) {
					pwdPf.requestFocus();
					return;
				}
				// 데이터를 모아서 DAO 로 전송
				BoardVO vo = new BoardVO();
				vo.setName(name);
				vo.setSubject(subject);
				vo.setContent(content);
				vo.setPwd(pwd);
				vo.setNo(no);
				
				//데이터베이스 연동
				boolean bCheck = dao.boardUpdate(vo);
				//이동
				if(bCheck == true) {
					JOptionPane.showMessageDialog(this, "수정이 완료되었습니다");
					cp.bdp.print(no);
					cp.card.show(cp, "DETAIL");
				}else {
					JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다 \n 다시 입력하세요");
					pwdPf.setText("");
					pwdPf.requestFocus();
				}
					
				
				
			}
		}
}