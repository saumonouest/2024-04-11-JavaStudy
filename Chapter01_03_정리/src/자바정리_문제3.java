/*
 * 3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식 작성
 */
import java.util.Scanner;
public class 자바정리_문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("입력:");
		char ch=scan.next().charAt(0);
		if(ch=='x' || ch=='X') {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		// 정답
		// ch=='x' || ch=='X'
	}

}
