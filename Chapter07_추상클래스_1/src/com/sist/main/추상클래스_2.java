package com.sist.main;
// 이미 => 처리 메소드명은 알고 있다 
// 24 => 메소드 => btn
abstract class Button{
	public abstract void click(); // 버튼이 공통기반 => 선
}
class Login extends Button {

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("로그인 요청 . . .");
	}
	
}
class Join extends Button {

	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	} 
	
}
public class 추상클래스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn=new Login();
		btn.click();
		
		btn=new Join();
		btn.click();
	}

}
