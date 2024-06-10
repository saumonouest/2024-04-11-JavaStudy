package com.sist.client;
import javax.swing.*;
import java.awt.*;
public class LoginPanel extends JPanel {
	Image back;
	JLabel idLa, pwdLa;
	JTextField tf;
	JPasswordField pf;
	JButton loginBtn, joinBtn, cancleBtn;
	
	public LoginPanel() {
		back=Toolkit.getDefaultToolkit().getImage("C:\\Project_image\\청룡의해.png");
		idLa = new JLabel("아이디",JLabel.RIGHT);
		pwdLa = new JLabel("비밀번호",JLabel.RIGHT);
		
		tf = new JTextField();
		pf = new JPasswordField();
		
		loginBtn = new JButton("로그인");
		joinBtn = new JButton("회원가입");
		cancleBtn = new JButton("종료");
		
		// 배치
		setLayout(null); // 사용자 정의
		idLa.setBounds(250, 740, 45, 30);
		tf.setBounds(310, 740, 180, 30);
		add(idLa); add(tf);
		
		pwdLa.setBounds(250, 790, 55, 30);
		pf.setBounds(310, 790, 180, 30);
		add(pwdLa); add(pf);
		
		JPanel p = new JPanel();
		p.add(loginBtn);
		p.add(joinBtn);
		p.add(cancleBtn);
		p.setOpaque(false);
		p.setBounds(250,830,275,35);
		add(p);
	}

	// 스킨
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
	
		
	}
	
}
