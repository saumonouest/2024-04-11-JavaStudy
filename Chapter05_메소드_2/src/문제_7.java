//문자열을 거꾸로 출력하는 메소드를 구현하시오
import java.util.Scanner;
public class 문제_7 {
	static void munje7(String msg) {
		for(int i=msg.length()-1;i>=0;i--) {
			System.out.println(msg.charAt(i));
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열 입력:");
		
	}

}
