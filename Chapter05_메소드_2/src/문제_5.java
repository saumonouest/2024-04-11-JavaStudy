// 문자열의 소문자를 대문자로 바꾸는 메소드를 구현
import java.util.Scanner;
public class 문제_5 {
	char c;
	static void upper(char c) {
		System.out.println((char)(c+32));
	}
	static void lower(char c) {
		System.out.println((char)(c-32));
	}
	
	static String munje5(String str) {
		return str.toUpperCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열 입력 :");
		//String str
		upper('C');
		lower('c');
	}

}
