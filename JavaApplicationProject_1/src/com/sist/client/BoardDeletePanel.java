package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.sist.dao.*;

public class BoardDeletePanel extends JPanel implements ActionListener{
	JLabel titleLa, pwdLa;
	JPasswordField pf;
	JButton b1, b2;
	ControllPanel cp;
	BoardDAO dao;
	int no=0;
	
	public BoardDeletePanel(ControllPanel cp) {
		this.cp=cp;
		dao=BoardDAO.newInstance();
		
		titleLa=new JLabel("삭제",JLabel.CENTER); // <table>
		titleLa.setFont(new Font("맑은 고딕",Font.BOLD,30)); // <h3></h3>
		setLayout(null);
		titleLa.setBounds(120,15,620,50);
		add(titleLa);
		
		pwdLa = new JLabel("비밀번호", JLabel.CENTER);
		pwdLa.setBounds(300, 75, 80, 30);
		add(pwdLa);
		
		pf=new JPasswordField();
		pf.setBounds(380, 75, 120, 30);
		add(pf);
		
		b1 = new JButton("삭제");
		b2 = new JButton("취소");
		
		JPanel p = new JPanel();
		p.add(b1); p.add(b2);
		p.setBounds(300, 120, 205, 35);
		add(p);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2) {
			cp.card.show(cp, "DETAIL");
		}
		else if(e.getSource()==b1) {
			// 비밀번호
			String pwd =String.valueOf(pf.getPassword());
			if(pwd.length()<1) {
				pf.requestFocus();
				return;
			}
			boolean bCheck=dao.boardDelete(no, pwd);
			if(bCheck==true) {
				JOptionPane.showMessageDialog(this, "게시물 삭제 완료");
				
				//이동
				cp.bp.print();
				cp.card.show(cp, "LIST");
			}
			else {
				JOptionPane.showMessageDialog(this, "비밀번호 오류");
				pf.setText("");
				pf.requestFocus();
			}
		}
	}
	
}
