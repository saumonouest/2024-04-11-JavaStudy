/*
 *	if ~ else
 */
import java.util.Scanner;
import javax.swing.*;
public class 자바제어문_조건문_4 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String ID=JOptionPane.showInputDialog("ID입력:");
		String PW=JOptionPane.showInputDialog("비밀번호 입력:");
		final String id="seoeonu";
		final String pw="1234";
	
		if(id.equals(ID) && pw.equals(PW)) {
			//로그인
			JOptionPane.showMessageDialog(null, ID+"님이 로그인 되었습니다!\n메인으로 이동합니다.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "아이디나 비밀번호가 틀립니다\n다시 입력하세요");
		}
	}

}
