package com.sist.main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class 숫자야구게임 extends JFrame implements ActionListener {
	JTextField tf;
	JButton b1,b2;
	JTextArea ta=new JTextArea();
	
	
	// 전체 변수
	int [] com=new int [3]; // 난수
	int [] user=new int [3]; // 사용자 입력값
	int s;
	int b;
			
	public 숫자야구게임 () {
		tf=new JTextField();
		b1=new JButton("시작");
		b2=new JButton("종료");
		
		// 배치
		setLayout(null);
		tf.setBounds(10, 15, 150, 30);
		tf.setEnabled(false);
		
		// 윈도우에 추가
		add(tf);
		b1.setBounds(165,15,100,30);
		add(b1);
		b2.setBounds(270, 15, 100, 30);
		add(b2);
		
		ta.setEditable(false);
		JScrollPane js = new JScrollPane(ta);
		js.setBounds(10, 55, 360, 300);
		add(js);
		
		// 윈도우창 크기
		setSize(400,130);
		setVisible(true);
				
		// 버튼 클릭을 위해서는 등록을 해야 메소드 자동 호출
		b1.addActionListener(this);
		b2.addActionListener(this);
		tf.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 예외처리_응용();
	}	
	public void getRand() {
		for(int i=0;i<3;i++) {
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++) {
				if(com[j]==com[i]) {
					i--;
					break;
				}
			}
		}	
	}	
	public void compare () { 
		s=0;
		b=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if (com[i]==user[j]) {
					if(i==j)
						s++;
					else
						b++;
				}
			}		
		}
		
	}
	
	String msg ="Input Number: "+user[0]+""+user[1]+""+user[2]+",Result:"+s+"S-"+b+"B\n";
	ta.append(msg);
	
	if (s==3) {
		int no=JOptionPane.showConfirmDialog(this,"종료?","종료",JOptionPane.YES_NO_OPTION);
		if(no==JOptionPane.YES_OPTION) {
			System.exit(0);
		}
		else {
			tf.setText("");
			tf.setEnabled(false);
			b1.setEnabled(true);
			ta.setText("");
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String no=tf.getText();
		try {
		int [] user=Integer.parseInt(no);
		}catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "3자리 정수 입력");
			tf.setText("");
			tf.requestFocus();
		}
	}
	
	

}
