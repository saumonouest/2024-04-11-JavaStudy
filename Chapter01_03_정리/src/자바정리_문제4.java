/*
 * 4. char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식 작성
 */
import java.util.Scanner;
public class 자바정리_문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		System.out.println("숫자:"+(int)ch);
		if(ch>=0 || ch<=9) {
			System.out.println("true");
		}
		else {
			System.out.println(false);
		}
		// 정답
		// ch>=0 ch>=0 && ch<=9
	}

}
