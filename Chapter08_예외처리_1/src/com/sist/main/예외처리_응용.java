package com.sist.main;
// updown 게임
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // interface
public class 예외처리_응용 extends JFrame implements ActionListener {
	// 예외처리_응용 => 윈도우를 확장 => 상속(단일 상속 기본)
	JTextField tf;
	JButton b1,b2; // 선언, 나중에 초기값 줘도 됨
	JLabel la=new JLabel("",JLabel.CENTER); // 명시적인 초기화
	
	// 클래스 => 변수(객체) => 변수 사용 (기본형, 배열, 클래스) => 멤버변수로 사용 가능
	// 초기화, 화면 UI, 서버 연결 => 생성자에 주로 처리
	
	// 전체 변수
	int com; // 난수 
	int user; // 사용자 입력값
	// 전역변수를 썼다는 건 메소드 두 개 이상에 사용한다는 거임 => 멤버변수 => 1. 입력을 받을 때 / 2. 비교시에 사용한다
	// 메소드 한 개에서만 사용 => 지역변수 (쓰고 버리는 거)
	// 처리는 입력 후 엔터 쳤을 때 => 입력값을 받는다, 비교 => 결과값 출력
	
	
	public 예외처리_응용() {
		tf=new JTextField();
		b1=new JButton("시작");
		b2=new JButton("종료");
		
		// 배치
		setLayout(null);
		tf.setBounds(10,15,150,30);
		tf.setEnabled(false); // 비활성화, 시작부터 눌러야 숫자 입력 가능하게 만드는 거임
		
		// 윈도우에 추가
		add(tf);
		b1.setBounds(165,15,100,30);
		add(b1);
		b2.setBounds(270, 15, 100, 30);
		add(b2);
		
		la.setBounds(10, 55, 360, 30);
		add(la);
		
		// 윈도우창 크기
		setSize(400,130);
		setVisible(true);
		
		// 버튼 클릭을 위해서는 등록을 해야 메소드 자동 호출
		b1.addActionListener(this); // actionPerformed => 어디 있는지 써넣어야 함 => 근데? 어딨음 여기 잇지 그럼 this 
		b2.addActionListener(this);
		tf.addActionListener(this); // this => 자신의 객체
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 호출
		new 예외처리_응용();
	}
	public void getRand() {
		com=(int)(Math.random()*100)+1;
		
	}
	public void compare() {
		if(com>user) {
			la.setText("UP");
			tf.setText("");
			tf.requestFocus();
		}
		else if(com<user) {
			la.setText("DOWN");
			tf.setText("");
			tf.requestFocus();
		}
		else {
			int no=JOptionPane.showConfirmDialog(this,"종료할까요?","종료",JOptionPane.YES_NO_OPTION);
			if(no==JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			}
			else {
				tf.setText("");
				tf.setEnabled(false);
				b1.setEnabled(true); // b1 안 주고 tf 줬더니 게임이 계속 할 수 있기는 한데 같은 정답이었음
				la.setText("");
			}
		}
	}
	// 예외처리는 에러가 발생시 종료하는 목적이 아니라 => 프로그램을 정상상태로 유지하는 목적을 가지고 있다
	// 예외처리는 클래스 블록에서는 사용이 불가능
	// => 초기화 블록, 메소드, 생성자에서만 사용이 가능
	//버튼이나 JTextField 처리 (엔터) => 고정 => 구현을 할 수 없어서 선언만 해서 넘겨준다 => 프로그램에 맞게 구현해서 써라
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2) { // b2번 버튼을 클릭 했다면
			System.exit(0);
		}
		else if(e.getSource()==b1) {
			getRand(); // com에 난수 발생
			JOptionPane.showMessageDialog(this, "게임 시작");
			tf.setEnabled(true);
			tf.requestFocus();
			b1.setEnabled(false);
		}
		else if(e.getSource()==tf) { // 입력 후 엔터라면
			String no=tf.getText(); // 입력 값을 읽어 온다
			// 예외처리
			try {
				user=Integer.parseInt(no);
			}catch (Exception ex) {
				JOptionPane.showMessageDialog(this,"정수만 입력 가능");
				tf.setText("");
				tf.requestFocus();
				
				// 다시 처음부터 동작 하게 만든다
				return; // 메소드에서 return을 사용하면 => 메소드가 종료된다
			}
			// 메소드는 return이 있는 곳에서 종료 => 항상 마지막 줄에 있는 건 아님
			// 비교 
			compare();
			
		}
	}

}
