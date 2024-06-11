package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import com.sist.dao.*;

public class ClientMain extends JFrame implements ActionListener{
    CardLayout card=new CardLayout();
    LoginPanel lp=new LoginPanel();
    MainPanel mp=new MainPanel();
    JoinPanel jp = new JoinPanel();
    PostFindFrame post = new PostFindFrame(); // 우편번호 검색
    
    public ClientMain()
    {
    	setLayout(card);
    	add("LOGIN",lp);
    	add("MP",mp);
    	add("JP",jp);
    	setSize(800, 1000);
    	//setResizable(false);
    	setVisible(true);
    	
    	//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    	
    	lp.loginBtn.addActionListener(this);// 로그인 
    	lp.joinBtn.addActionListener(this);// 회원가입 
    	lp.cancleBtn.addActionListener(this);// 종료
    	
    	jp.b4.addActionListener(this); // 취소
    	jp.b2.addActionListener(this); // 우편번호 검색
    	
    	post.b1.addActionListener(this); // 우편번호 검색 버튼
    	post.b2.addActionListener(this); // 취소
    	post.tf.addActionListener(this); // 우편번호 입력 창   
    	
    	
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
        new ClientMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==lp.cancleBtn)
		{
			dispose();// window 메모리 해제 
			System.exit(0);// 프로그램 종료
		}
		else if(e.getSource()==post.b2) {
			post.setVisible(false);
		}
		else if(e.getSource()==post.b1 || e.getSource()==post.tf) {
			String dong = post.tf.getText();
			if(dong.length()<1) { // 입력이 안 된 경우
				JOptionPane.showMessageDialog(this, "동 / 읍 / 면을 입력하세요");
				post.tf.requestFocus();
				return;
			}
			MemberDAO dao = MemberDAO.newInstance();
			ArrayList<ZipcodeVO> list = dao.postFindData(dong);
			if(list.size()==0) {
				JOptionPane.showMessageDialog(this, "결과 없음");
				post.tf.setText(" ");
				post.tf.requestFocus();
			}
			else {
				for(int i=post.model.getRowCount()-1; i>=0;i--) {
					post.model.removeRow(i);
				}
				for(ZipcodeVO vo:list) {
					String [] data = {vo.getZipcode(),vo.getAddress()};
					post.model.addRow(data);
				}
			}
		}
		
		else if(e.getSource()==jp.b2) {
			for(int i=post.model.getRowCount()-1; i>=0;i--) {
				post.model.removeRow(i);
			}
			post.tf.setText("");
			post.setVisible(true);
		}
		else if(e.getSource()==jp.b4) {
			card.show(getContentPane(), "LOGIN");
		}
		else if(e.getSource()==lp.joinBtn) {
			card.show(getContentPane(), "JP");
		}
		else if(e.getSource()==lp.loginBtn)
		{
			//1. 입력한 사번 / 이름을 가지고 온다 
			try
			{
				// 유효성 검색 => 오라클 
				String id=lp.tf.getText();
				if(id.length()<1)
				{
					JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
					lp.tf.requestFocus();
					return;
				}
				String pwd=String.valueOf(lp.pf.getPassword());
				if(pwd.length()<1)
				{
					JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
					lp.pf.requestFocus();
					return;
				}
				
				// 오라클 연결 
				MemberDAO dao=MemberDAO.newInstance();
				String result=dao.memberLogin(id, pwd);
				// 웹 => 자바스크립트로 처리 
				if(result.equals("NOID"))
				{
					// 사번이 없는 경우 
					JOptionPane.showMessageDialog(this, "아이디가 존재하지 않습니다");
					lp.tf.setText("");
					lp.pf.setText("");
					lp.tf.requestFocus();
				}
				else if(result.equals("NOPWD"))
				{
					// 이름이 틀린 경우
					JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
					lp.pf.setText("");
					lp.pf.requestFocus();
				}
				else
				{
					// 로그인 
					System.out.println("로그인 완료");
					card.show(getContentPane(),"MP"); // 화면 변경 
				}
			}catch(Exception ex)
			{
				ex.printStackTrace();
				JOptionPane.showMessageDialog(this, "사번은 정수여야 합니다..");
				return; // 메소드 종료 
			}
		}
	}

}