/*
 * 2. char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성

 */
import java.util.Scanner;
public class 자바정리_문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("입력:");
		char ch=scan.next().charAt(0);
		if(ch==' '){
			System.out.println("true");
		}
		else if(ch=='\t') {
			System.out.println("false");
		}
		// 정답
		//ch==' ' && ch!=\t
	}

}
